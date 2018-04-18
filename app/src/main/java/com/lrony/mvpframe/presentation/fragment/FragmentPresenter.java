package com.lrony.mvpframe.presentation.fragment;

import com.lrony.mvpframe.mvp.MvpBasePresenter;

/**
 * Created by Lrony on 18-4-10.
 */
public class FragmentPresenter extends MvpBasePresenter<FragmentContract.View> implements FragmentContract.Presenter {

    private static final String TAG = "FragmentPresenter";

    @Override
    public void start() {
        super.start();
        /**
         * You can init action here
         *
         * 你可以在这里进行一些初始操作
         */
    }
}
