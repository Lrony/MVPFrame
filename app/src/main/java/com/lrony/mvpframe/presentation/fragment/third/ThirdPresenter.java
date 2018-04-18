package com.lrony.mvpframe.presentation.fragment.third;

import android.os.Handler;

import com.lrony.mvpframe.mvp.MvpBasePresenter;
import com.lrony.mvpframe.presentation.fragment.second.SecondContract;

import java.util.ArrayList;
import java.util.List;

import me.yokeyword.fragmentation.SupportFragment;

/**
 * Created by Lrony on 18-4-10.
 */
public class ThirdPresenter extends MvpBasePresenter<ThirdContract.View> implements ThirdContract.Presenter {

    private static final String TAG = "SecondPresenter";

    @Override
    public void start() {
        super.start();
        /**
         * You can init action here
         *
         * 你可以在这里进行一些初始操作
         */
    }

    @Override
    public void loadData() {
        new Handler().postDelayed(new Runnable() {
            @Override
            public void run() {
                if (!isViewAttached()) return;

                // mData.size()
                int valueCount = 9;

                SupportFragment[] fragments = null;
                String[] titles = null;
                fragments = new SupportFragment[valueCount];
                titles = new String[valueCount];
                for (int i = 0; i < valueCount; i++) {
                    String title = "" + i;
                    fragments[i] = ContentFragment.newInstance(title);
                    titles[i] = title;
                }

                getView().setTabContent(fragments, titles);
            }
        }, 2000);
    }
}
