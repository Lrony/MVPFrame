package com.lrony.mvpframe.presentation.main;

import android.os.Handler;
import android.util.Log;

import com.lrony.mvpframe.mvp.MvpBasePresenter;

/**
 * Created by lrony on 2018/4/9.
 */
public class MainPresenter extends MvpBasePresenter<MainContract.View> implements MainContract.Presenter {

    @Override
    public void start() {
        super.start();
        // You can check software updates here
    }

    @Override
    public void getData() {
        // set button status
        getView().setBtnGetDataEnabled(false);

        // Analog network request data
        new Handler().postDelayed(new Runnable() {
            @Override
            public void run() {
                if (!isViewAttached()) return;

                getView().showData("Hello MVPFrame");
                getView().setBtnGetDataEnabled(true);
            }
        }, 2000);
    }
}
