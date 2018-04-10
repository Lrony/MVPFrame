package com.lrony.mvpframe.presentation.fragment;

import com.lrony.mvpframe.mvp.MvpPresenter;
import com.lrony.mvpframe.mvp.MvpView;

/**
 * Created by Lrony on 18-4-10.
 */
public interface FragmentContract {

    interface View extends MvpView {

    }

    interface Presenter extends MvpPresenter<View> {

    }
}
