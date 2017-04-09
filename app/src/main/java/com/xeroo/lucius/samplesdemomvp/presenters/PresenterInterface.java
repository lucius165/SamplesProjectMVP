package com.xeroo.lucius.samplesdemomvp.presenters;

import android.content.Context;

/**
 * Created by lucius on 09/04/2017.
 */

public interface PresenterInterface {
    void onCreate();

    void onPause();

    void onResume();

    void onDestroy();
}
