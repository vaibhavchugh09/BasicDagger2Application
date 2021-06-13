package com.github.vaibhav.model;

import android.util.Log;

import javax.inject.Inject;

/* Basically idea is if the class is created by ourself then and only we can use @Inject otherwise we
 * have to use Module class and @Provider which means if we can't change parent class like we are using retrofit
 * 3rd party app so we will use Module and @provider in it.
 * */

public class Battery {

    @Inject
    public Battery() {
        Log.i("MyMobile", "Battery : ");

    }

}
