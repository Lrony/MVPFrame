package com.lrony.mvpframe.presentation.main;

import android.support.annotation.NonNull;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import com.lrony.mvpframe.R;
import com.lrony.mvpframe.mvp.MvpActivity;

public class MainActivity extends MvpActivity<MainContract.Presenter> implements MainContract.View {

    private static final String TAG = "MainActivity";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        getPresenter().start();
        getPresenter().getData();
    }

    @NonNull
    @Override
    public MainContract.Presenter createPresenter() {
        return new MainPresenter();
    }

    @Override
    public void showData(String data) {
        showToast(data);
    }
}
