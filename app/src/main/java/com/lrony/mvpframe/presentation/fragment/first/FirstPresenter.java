package com.lrony.mvpframe.presentation.fragment.first;

import android.os.Handler;

import com.lrony.mvpframe.mvp.MvpBasePresenter;
import com.lrony.mvpframe.presentation.fragment.FragmentContract;

/**
 * Created by Lrony on 18-4-10.
 */
public class FirstPresenter extends MvpBasePresenter<FirstContract.View> implements FirstContract.Presenter {

    private static final String TAG = "FirstPresenter";

    @Override
    public void start() {
        super.start();
        // You can init action here
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

                getView().showData("Hello MVPFrame FirstFragment");
                getView().setBtnGetDataEnabled(true);
            }
        }, 2000);
    }
}
