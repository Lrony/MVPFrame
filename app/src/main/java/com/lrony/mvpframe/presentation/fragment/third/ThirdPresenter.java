package com.lrony.mvpframe.presentation.fragment.third;

import android.os.Handler;

import com.lrony.mvpframe.mvp.MvpBasePresenter;
import com.lrony.mvpframe.presentation.fragment.second.SecondContract;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by Lrony on 18-4-10.
 */
public class ThirdPresenter extends MvpBasePresenter<ThirdContract.View> implements ThirdContract.Presenter {

    private static final String TAG = "SecondPresenter";

    @Override
    public void start() {
        super.start();
        // You can init action here
    }
}
