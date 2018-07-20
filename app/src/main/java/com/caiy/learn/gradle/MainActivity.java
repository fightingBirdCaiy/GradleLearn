package com.caiy.learn.gradle;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import com.caiy.learn.gradle.presenter.MainPresenter;

public class MainActivity extends AppCompatActivity {

    private MainPresenter mainPresenter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        mainPresenter = new MainPresenter(this);
        mainPresenter.method1("测试11");
        mainPresenter.method2("测试21","测试22");
        mainPresenter.method3("测试31","测试32","测试33");
    }
}
