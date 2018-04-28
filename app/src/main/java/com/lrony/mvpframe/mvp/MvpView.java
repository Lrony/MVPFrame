package com.lrony.mvpframe.mvp;

import android.content.Context;
import android.support.annotation.StringRes;

/**
 * Created by lrony on 2018/4/9.
 */
public interface MvpView {

    void showToast(String message);

    void showToast(@StringRes int id);

    Context provideContext();

    void loading();

    void succeed();

    void error();

    void empty();

    void complete();
}
