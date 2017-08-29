package com.example.mfahad.rxjava;

import android.content.Context;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.ListView;
import android.widget.TextView;
import android.widget.Toast;

import java.util.ArrayList;

import io.reactivex.disposables.CompositeDisposable;

public class MainActivity extends AppCompatActivity implements View.OnClickListener{
    public static Context context;
    public static TextView tvMain;
    public static Button button;
    public static CompositeDisposable disposable;
    public   ListView list;
    public static ArrayList<Integer> arrayList;
    public static ArrayAdapter<Integer> arrayAdapter;

    @Override
    protected void onStop() {
        Toast.makeText(context, "Activity Stop", Toast.LENGTH_SHORT).show();
        super.onStop();
        disposable.clear(); // Don;t send the events after the activity has been stopped
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        context = this;
        disposable = new CompositeDisposable();

        tvMain = (TextView) findViewById(R.id.t1Main);
        button = (Button) findViewById(R.id.button);
        list = (ListView) findViewById(R.id.list);

//        simple listView for integers
        arrayList = new ArrayList<Integer>();
        arrayAdapter = new ArrayAdapter<Integer>(this, android.R.layout.simple_list_item_1, arrayList);
        list.setAdapter(arrayAdapter);

        button.setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {
//        new Subscribe().GetSubscribe();
//        new Subjectt().getPublishSubject();
//        new Subjectt().getReplaySubject();
//        new Subjectt().getBehaviourSubject();
//        new Subjectt().getAsyncSubject();
//        new Subscribe().getSubjectSubscribe();
//        new Subscribe().getDisposable();
//        new Subscribe().getZipOperatorSubscribe();
        new Subscribe().getFlatMapOperatorSubscribe();
    }


}
