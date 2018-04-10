package com.lrony.mvpframe;

import android.content.Context;

import com.lrony.mvpframe.presentation.fragment.FragmentActivity;

/**
 * Created by Lrony on 18-4-10.
 * App Router
 */
public class AppRouter {

    public static void showFragmentActivity(Context context) {
        showFragmentActivity(context, null);
    }

    public static void showFragmentActivity(Context context, String data) {
        context.startActivity(FragmentActivity.newIntent(context, data));
    }
}
