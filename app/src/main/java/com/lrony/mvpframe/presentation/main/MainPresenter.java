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
        /**
         * You can check software updates here
         *
         * 你可以在这里检查软件更新或者进行一些初始化的操作
         */
    }

    @Override
    public void getData() {
        /**
         * set button status
         *
         * 设置UI按钮的状态
         */
        getView().setBtnGetDataEnabled(false);

        /**
         * Analog network request data
         *
         * 模拟网络请求数据
         */
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
