package com.example.mfahad.rxjava;

import android.widget.Toast;

import io.reactivex.Observer;
import io.reactivex.annotations.NonNull;
import io.reactivex.disposables.Disposable;
import io.reactivex.subjects.AsyncSubject;
import io.reactivex.subjects.BehaviorSubject;
import io.reactivex.subjects.PublishSubject;
import io.reactivex.subjects.ReplaySubject;
import io.reactivex.subjects.Subject;

/**
 * Created by M.FAHAD on 8/23/2017.
 */

public class Subjectt {

//  this subject is used as a observeable
    public void getPublishSubject(){
//        It emits all the subsequent items of the source Observable at the time of subscription.
        PublishSubject<Integer> source = PublishSubject.create();
        source.subscribe( new Observerr().getSubjectObserver());
        source.onNext(1);
        source.onNext(10);
        source.onNext(100);
        source.onNext(1000);
        source.onNext(10000);
        // the second observerr
        source.subscribe(new Observerr().getSubjectSecondObserver());
        source.onNext(2);
        source.onNext(20);
        source.onNext(200);
        source.onComplete();
    }

    public void getReplaySubject(){
        //Emit all the items regardless wwhen the observerr is subscribe
        ReplaySubject<Integer> replaySubject = ReplaySubject.create();
        replaySubject.onNext(10);
        replaySubject.subscribe(new Observerr().getReplayObserver());
        replaySubject.onNext(20);
        replaySubject.onNext(200);
//        when the second observer is subsccribe all the data(THE DATA SEND TO OTHER SUBSCRIBER) is send to new observer
//        replaySubject.subscribe(new Observerr().getReplaySecondObserver());
        replaySubject.onNext(2000);
        replaySubject.onNext(200000);
        replaySubject.onComplete();
        replaySubject.subscribe(new Observerr().getReplaySecondObserver());

    }

    public void getBehaviourSubject(){
//        it emits the most recent value and all the subsequent(menas the values after the observer subscription) values
        BehaviorSubject<Integer> behaviorSubject = BehaviorSubject.create();
        behaviorSubject.onNext(1);
        behaviorSubject.onNext(10);
        behaviorSubject.onNext(100);
        behaviorSubject.subscribe(new Observerr().getBehaviourObserver());
        behaviorSubject.onNext(1000);
        behaviorSubject.onNext(10000);
        behaviorSubject.subscribe(new Observerr().getBehaviourSecondObserver());
        behaviorSubject.onNext(100000);
        behaviorSubject.onNext(1000000);
        behaviorSubject.onComplete();



    }

    public void getAsyncSubject(){
//        AsyncSubject only emits the last value regardless when the observer is subscribe
        AsyncSubject<Integer> source = AsyncSubject.create();
        source.subscribe(new Observerr().getAsyncObserver());
        source.onNext(1);
        source.onNext(10);
        source.onNext(100);
        source.onNext(1000);
        source.subscribe(new Observerr().getAsyncSecondObserver());
        source.onNext(323);
        source.onComplete();
    }

//    this subject is used as a observer
    public Subject<Integer> getIntegerSubject(){
        return new Subject<Integer>() {
            @Override
            public boolean hasObservers() {
                return false;
            }

            @Override
            public boolean hasThrowable() {
                return false;
            }

            @Override
            public boolean hasComplete() {
                return false;
            }

            @Override
            public Throwable getThrowable() {
                return null;
            }

            @Override
            protected void subscribeActual(Observer<? super Integer> observer) {
            }

            @Override
            public void onSubscribe(@NonNull Disposable d) {
            }

            @Override
            public void onNext(@NonNull Integer integer) {
                MainActivity.arrayList.add(integer);
                MainActivity.arrayAdapter.notifyDataSetChanged();
            }

            @Override
            public void onError(@NonNull Throwable e) {

            }

            @Override
            public void onComplete() {

            }
        };
    }

}
