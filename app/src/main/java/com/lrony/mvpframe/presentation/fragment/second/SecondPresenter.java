package com.lrony.mvpframe.presentation.fragment.second;

import com.lrony.mvpframe.mvp.MvpBasePresenter;
import com.lrony.mvpframe.presentation.fragment.first.FirstContract;

/**
 * Created by Lrony on 18-4-10.
 */
public class SecondPresenter extends MvpBasePresenter<SecondContract.View> implements SecondContract.Presenter {

    private static final String TAG = "SecondPresenter";

    @Override
    public void start() {
        super.start();
        // You can init action here
    }
}
