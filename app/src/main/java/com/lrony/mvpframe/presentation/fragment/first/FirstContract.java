package com.lrony.mvpframe.presentation.fragment.first;

import com.lrony.mvpframe.mvp.MvpPresenter;
import com.lrony.mvpframe.mvp.MvpView;

/**
 * Created by Lrony on 18-4-10.
 */
public interface FirstContract {

    interface View extends MvpView {

        void setBtnGetDataEnabled(boolean enabled);

        void showData(String data);
    }

    interface Presenter extends MvpPresenter<View> {

        void getData();
    }
}
