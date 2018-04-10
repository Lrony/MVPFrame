package com.lrony.mvpframe.presentation.main;

import com.lrony.mvpframe.mvp.MvpPresenter;
import com.lrony.mvpframe.mvp.MvpView;

/**
 * Created by lrony on 2018/4/9.
 */
public interface MainContract {

    interface View extends MvpView {

        void setBtnGetDataEnabled(boolean enabled);

        void showData(String data);
    }

    interface Presenter extends MvpPresenter<View> {

        void getData();
    }
}
