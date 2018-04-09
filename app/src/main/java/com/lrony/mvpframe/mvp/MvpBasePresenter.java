package com.lrony.mvpframe.mvp;

import android.support.annotation.Nullable;
import android.support.annotation.UiThread;

import java.lang.ref.WeakReference;

/**
 * Created by lrony on 2018/4/9.
 */
public class MvpBasePresenter<V extends MvpView> implements MvpPresenter<V> {

    private WeakReference<V> viewRef;

    /**
     * A connection between Presenter and View
     */
    @UiThread
    @Override
    public void attachView(V view) {
        viewRef = new WeakReference<>(view);
    }

    @UiThread
    @Override
    public void start() {
    }

    @UiThread
    @Nullable
    public V getView() {
        return viewRef == null ? null : viewRef.get();
    }


    /**
     * Each time the business request is invoked, is getView ().ShowXxx ().
     * Please first call the method to check whether to establish connection with View, or no null pointer exception.
     */
    @UiThread
    public final boolean isViewAttached() {
        return viewRef != null && viewRef.get() != null;
    }

    /**
     * Presenter and View connection disconnect
     */
    @UiThread
    @Override
    public void detachView() {
        if (viewRef != null) {
            viewRef.clear();
            viewRef = null;
        }
    }

    @UiThread
    @Override
    public void destroy() {
        if (isViewAttached()) {
            detachView();
        }
    }
}
