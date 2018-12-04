package moe.luther.demo;

import android.app.Application;

import moe.luther.demo.page.login.LoginManager;

public class App extends Application {


    // todo 计划在这里初始化登录模块、数据模块、可能还要设置 refreshLayout header

    @Override
    public void onCreate(){
        super.onCreate();
        LoginManager.init();
    }

}
