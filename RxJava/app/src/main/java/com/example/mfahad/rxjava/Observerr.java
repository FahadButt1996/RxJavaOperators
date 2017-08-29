package com.example.mfahad.rxjava;

import java.util.List;

import io.reactivex.Observer;
import io.reactivex.annotations.NonNull;
import io.reactivex.disposables.Disposable;
import io.reactivex.observers.DisposableObserver;


/**
 * Created by M.FAHAD on 8/23/2017.
 */

public class Observerr {

    //Constructor
    public Observerr() {

    }

    public Observer<String> getObserver() {
        return new Observer<String>() {
            @Override
            public void onSubscribe(@NonNull Disposable d) {
            }

            @Override
            public void onNext(@NonNull String s) {
                MainActivity.tvMain.setText(s);
            }

            @Override
            public void onError(@NonNull Throwable e) {

            }

            @Override
            public void onComplete() {

            }
        };
    }

    public Observer<Integer> getSubjectObserver() {
        return new Observer<Integer>() {
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

    public Observer<Integer> getSubjectSecondObserver() {
        return new Observer<Integer>() {
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

    public Observer<Integer> getReplayObserver() {
        return new Observer<Integer>() {
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

    public Observer<Integer> getReplaySecondObserver() {
        return new Observer<Integer>() {
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

    public Observer<Integer> getBehaviourObserver() {
        return new Observer<Integer>() {
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

    public Observer<Integer> getBehaviourSecondObserver() {
        return new Observer<Integer>() {
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

    public Observer<Integer> getAsyncObserver() {
        return new Observer<Integer>() {
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

    public Observer<Integer> getAsyncSecondObserver() {
        return new Observer<Integer>() {
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

    public DisposableObserver<Integer> getDisposableObserver(){
        return new DisposableObserver<Integer>() {
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

    //Map converts the DataType from one to another
    public Observer<Integer> getMapObserver(){
        return new Observer<Integer>() {
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

    public Observer<List<Integer>> getZipObserver(){
        return new Observer<List<Integer>>() {
            @Override
            public void onSubscribe(@NonNull Disposable d) {

            }

            @Override
            public void onNext(@NonNull List<Integer> integers) {
                for(int i =0 ; i < integers.size() ; i++)
                {
                    MainActivity.arrayList.add(integers.get(i).intValue());
                    MainActivity.arrayAdapter.notifyDataSetChanged();
                }
            }

            @Override
            public void onError(@NonNull Throwable e) {

            }

            @Override
            public void onComplete() {

            }
        };
    }

    public Observer<Integer> getFlatMapAndPredicateObserver(){
        return new Observer<Integer>() {
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
