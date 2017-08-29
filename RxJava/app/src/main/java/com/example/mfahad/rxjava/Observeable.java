package com.example.mfahad.rxjava;


import android.os.SystemClock;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.Callable;

import io.reactivex.Observable;
import io.reactivex.ObservableSource;
import io.reactivex.Observer;

/**
 * Created by M.FAHAD on 8/23/2017.
 */

public class Observeable {

    public Observable observable;
    //Constructor
    public Observeable(){

    }

    public Observable<String> getObserveable(){
        return Observable.just("Data From Observable");
    }

//    Integer observeable for the subjectObserver
    public Observable<Integer> getSubjectObserveable(){
        return Observable.just(1,2,3,4,5);
    }

    public Observable<Integer> getDisposibleObservable(){
        return  Observable.defer(new Callable<ObservableSource<? extends Integer>>() {
            @Override
            public ObservableSource<? extends Integer> call() throws Exception {
                SystemClock.sleep(2000);
                return Observable.just(10,20,30,40,50);
            }
        });
    }

    public Observable<Integer> getIntegerObservable(){
        return Observable.just(10,20,30,40,50);
    }

    public Observable<String> getStringObservable(){
        return Observable.just("1","2","3","4","5");
    }

    public List<Integer> getMixedObservableData(Integer t1 , Integer t2){
        List<Integer> list = new ArrayList<Integer>();
        list.add(t1);
        list.add(t2);
        return list;
    }

    public Observable<List<Integer>> getFlatMapObserveable(){
        List<Integer> list = new ArrayList<Integer>();
        list.add(1);
        list.add(12);
        list.add(14);
        list.add(15);
        list.add(17);

        List<Integer> list2 = new ArrayList<Integer>();
        list.add(21);
        list.add(212);
        list.add(214);
        list.add(215);
        list.add(217);
        return Observable.just(list ,list2 );
    }
}
