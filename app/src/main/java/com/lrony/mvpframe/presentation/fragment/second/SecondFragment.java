package com.lrony.mvpframe.presentation.fragment.second;

import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.view.View;

import com.lrony.mvpframe.R;
import com.lrony.mvpframe.mvp.MvpFragment;

/**
 * Created by Lrony on 18-4-10.
 */
public class SecondFragment extends MvpFragment<SecondContract.Presenter> implements SecondContract.View {

    public static SecondFragment newInstance() {
        Bundle args = new Bundle();
        SecondFragment fragment = new SecondFragment();
        fragment.setArguments(args);
        return fragment;
    }

    @NonNull
    @Override
    public SecondContract.Presenter createPresenter() {
        return new SecondPresenter();
    }

    @Override
    public int getLayoutId() {
        return R.layout.fragment_second;
    }

    @Override
    public void onViewCreated(View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);
        getPresenter().start();
    }
}
