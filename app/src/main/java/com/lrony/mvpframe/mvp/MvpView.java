package com.lrony.mvpframe.mvp;

import android.content.Context;

/**
 * Created by lrony on 2018/4/9.
 */
public interface MvpView {

    void showToast(String message);

    Context provideContext();
}
