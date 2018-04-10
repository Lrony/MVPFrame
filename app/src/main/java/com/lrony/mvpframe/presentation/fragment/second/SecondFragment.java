package com.lrony.mvpframe.presentation.fragment.second;

import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.support.v4.widget.SwipeRefreshLayout;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.View;

import com.lrony.mvpframe.R;
import com.lrony.mvpframe.mvp.MvpFragment;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by Lrony on 18-4-10.
 */
public class SecondFragment extends MvpFragment<SecondContract.Presenter> implements SecondContract.View, SwipeRefreshLayout.OnRefreshListener {

    private SwipeRefreshLayout mRefreshView;
    private RecyclerView mRecyclerView;

    private SecondAdapter mAdapter;

    private List<String> mdatas = new ArrayList<>();

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
        // Must use
        getPresenter().start();

        initView(view);

        getPresenter().getDatas();
    }

    private void initView(View view) {
        mRefreshView = view.findViewById(R.id.refresh);
        mRecyclerView = view.findViewById(R.id.recycler);

        mRecyclerView.setLayoutManager(new LinearLayoutManager(getContext()
                , LinearLayoutManager.VERTICAL, false));
        mAdapter = new SecondAdapter(getContext(), mdatas);
        mRecyclerView.setAdapter(mAdapter);

        mRefreshView.setOnRefreshListener(this);
    }

    @Override
    public void setRefresh(boolean refresh) {
        mRefreshView.setRefreshing(refresh);
    }

    @Override
    public void showDatas(List<String> datas) {
        mdatas.addAll(datas);
        mAdapter.notifyDataSetChanged();
    }

    @Override
    public void onRefresh() {
        getPresenter().getDatas();
    }
}
