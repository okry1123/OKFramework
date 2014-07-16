package com.okry.okframework.base;

import android.os.Bundle;
import android.support.v4.app.FragmentActivity;

import com.okry.okframework.log.L;

/**
 * Created by mr on 14-7-16.
 */
public class BaseActivity extends FragmentActivity{
    protected final String LIFE_CYCLE_TAG = "lifecycle" + "[%s]";
    protected final String CLASS_TAG = getClass().getSimpleName();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        L.d(LIFE_CYCLE_TAG, CLASS_TAG + ":onCreate");
    }

    @Override
    protected void onStart() {
        super.onStart();
        L.d(LIFE_CYCLE_TAG, CLASS_TAG + ":onStart");
    }

    @Override
    protected void onResume() {
        super.onResume();
        L.d(LIFE_CYCLE_TAG, CLASS_TAG + ":onResume");
    }

    @Override
    protected void onPause() {
        super.onPause();
        L.d(LIFE_CYCLE_TAG, CLASS_TAG + ":onPause");
    }

    @Override
    protected void onStop() {
        super.onStop();
        L.d(LIFE_CYCLE_TAG, CLASS_TAG + ":onStop");
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        L.d(LIFE_CYCLE_TAG, CLASS_TAG + ":onDestroy");
    }
}
