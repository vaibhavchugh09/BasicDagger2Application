package com.github.vaibhav.model;

import android.util.Log;

import javax.inject.Inject;

/*
 * Question- Why we use Dependency Injection ?
 * - See every language is based on OOPS and on solid principle.
 * so Dependency injection will help us to create an object with proper adherence to the solid principles.
 * it will also reduce boiler code.
 * */

public class Mobile {
    // field Injector - This injection we will use when we don't have constructor.
    @Inject // 3) - then Battery object will create
    public Battery battery;

    private Processor processor;


    // Constructor Injector - This Injector is most preferable injection if we have constructor.
    @Inject
    public Mobile(Processor processor) {    // after MainActivty Call Processor abject will create first
        this.processor = processor; // 1)
        Log.i("MyMobile", "Mobile : "); // 2) - then Mobile object will create
    }

    public void run() {
        Log.i("MyMobile", "Run : ");
    }

    // Method Injector - This injection is not much used but we have to know about it.
    @Inject // 4) - then Connection object will create.
    public void connection() {
        Log.i("MyMobile", "Connection : ");
    }
}
