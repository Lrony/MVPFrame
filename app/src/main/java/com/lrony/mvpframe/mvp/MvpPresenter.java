package com.lrony.mvpframe.mvp;

import android.support.annotation.UiThread;

/**
 * Created by lrony on 2018/4/9.
 */
public interface MvpPresenter<V extends MvpView> {

    /**
     * After the method is invoked, it shows that the binding View has been initialized
     * , and it can safely use getView () to call every way of View.
     * <p>
     * Before each presenter performs other business methods, start () must call at least once.
     */
    @UiThread
    void start();

    @UiThread
    void attachView(V view);

    @UiThread
    void detachView();

    @UiThread
    void destroy();
}
