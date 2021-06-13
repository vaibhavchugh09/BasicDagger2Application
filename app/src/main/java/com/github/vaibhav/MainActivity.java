package com.github.vaibhav;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

import com.github.vaibhav.component.DaggerMobileComponent;
import com.github.vaibhav.component.MobileComponent;
import com.github.vaibhav.model.Mobile;

import javax.inject.Inject;
/*                           Mobile
*                 |------------|-------------|
*               Battery                   Processor
* Mobile has two child class.
*  */

public class MainActivity extends AppCompatActivity {

    // field Injector
    @Inject
    Mobile mobile;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        // when we call Component interface please see the logs sequence. How sequence will created.
        MobileComponent mobileComponent = DaggerMobileComponent.create();
        mobileComponent.inject(this);
        mobile.run();
    }
}