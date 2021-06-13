package com.github.vaibhav.component;

import com.github.vaibhav.MainActivity;
import com.github.vaibhav.model.Mobile;

import dagger.Component;


@Component
public interface MobileComponent {


    Mobile getmobile();

    void inject(MainActivity activity);

}
