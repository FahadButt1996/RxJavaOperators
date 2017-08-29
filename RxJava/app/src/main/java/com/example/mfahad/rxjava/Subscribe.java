package com.example.mfahad.rxjava;

import java.util.List;

import io.reactivex.Observable;
import io.reactivex.ObservableSource;
import io.reactivex.Scheduler;
import io.reactivex.android.schedulers.AndroidSchedulers;
import io.reactivex.annotations.NonNull;
import io.reactivex.disposables.Disposable;
import io.reactivex.functions.BiFunction;
import io.reactivex.functions.Consumer;
import io.reactivex.functions.Function;
import io.reactivex.functions.Predicate;
import io.reactivex.schedulers.Schedulers;

/**
 * Created by M.FAHAD on 8/23/2017.
 */

public class Subscribe {
    //Constructor
    public Subscribe(){

    }

    public void GetSubscribe() {
        Observeable observeable = new Observeable();
            observeable.getObserveable()
//                    .subscribeOn(Schedulers.io())
//                    .observeOn(AndroidSchedulers.)
                    .subscribe(new Observerr().getObserver());
        }

    public void getSubjectSubscribe(){
            Observeable observeable = new Observeable();
            observeable.getSubjectObserveable()
                    .subscribe(new Subjectt().getIntegerSubject());
        }

    public void getDisposable(){
        MainActivity.disposable
                        .add((Disposable) new Observeable().getDisposibleObservable()
                        .subscribeWith(new Observerr().getDisposableObserver()));
    }

    //Map converts the DataType from one to another
    public void getMapOperatorSubscriber(){
        new Observeable().getStringObservable()
                .map(new Function<String, Integer>() {
                    @Override
                    public Integer apply(@NonNull String s) throws Exception {
                        return Integer.parseInt(s);
                    }
                })
                .subscribe(new Observerr().getMapObserver());
    }

    //Zip converts the Two Observeable data into single data
    public void getZipOperatorSubscribe(){
        Observable.zip(new Observeable().getSubjectObserveable(), new Observeable().getIntegerObservable(),
                new BiFunction<Integer, Integer, List<Integer>>() {
                    @Override
                    public List<Integer> apply(@NonNull Integer integer, @NonNull Integer integer2) throws Exception {
                        return new Observeable().getMixedObservableData(integer , integer2);
                    }
                }).subscribe(new Observerr().getZipObserver());
    }


    //FlatMap converts Observeable into observeables and predicate is a test that is used which value is return or not
    public void getFlatMapAndPredicateOperatorSubscribe(){
        new Observeable().getFlatMapObserveable().flatMap(new Function<List<Integer>, ObservableSource<Integer>>() {
            @Override
            public ObservableSource<Integer> apply(@NonNull List<Integer> integers) throws Exception {
                return Observable.fromIterable(integers);
            }
        }).filter(new Predicate<Integer>() {
            @Override
            public boolean test(@NonNull Integer integer) throws Exception {
                return true;
            }
        }).subscribe( new Observerr().getFlatMapAndPredicateObserver());
    }
}


