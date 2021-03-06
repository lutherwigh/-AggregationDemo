package moe.luther.demo;

import android.app.Activity;


import java.util.ArrayList;
import java.util.List;

import me.goldze.mvvmhabit.base.BaseApplication;
import moe.luther.demo.page.login.LoginManager;
import moe.luther.library.base.config.ModuleLifecycleConfig;

public class App extends BaseApplication {


    // todo 计划在这里初始化登录模块、数据模块、可能还要设置 refreshLayout header

    private static  App instance;
    private List<Activity> activityList;

    @Override
    public void onCreate(){

        ModuleLifecycleConfig.getInstance().initModuleAhead(this);
        //....
        //初始化组件(靠后)
        ModuleLifecycleConfig.getInstance().initModuleLow(this);

        super.onCreate();
        instance = App.this;
        init();
    }

    void init(){
        activityList = new ArrayList<>();
        // 登录模块初始化
        LoginManager.init();

        // RichText.initCacheDir(this);
    }

    public static App getInstance(){
        return instance;
    }

    /**
     * 添加Activity
     */
    public void addActivity(Activity activity) {
// 判断当前集合中不存在该Activity
        if (!activityList.contains(activity)) {
            activityList.add(activity);//把当前Activity添加到集合中
        }
    }

    /**
     * 销毁单个Activity
     */
    public void removeActivity(Activity activity) {
//判断当前集合中存在该Activity
        if (activityList.contains(activity)) {
            activityList.remove(activity);//从集合中移除
            activity.finish();//销毁当前Activity
        }
    }

    /**
     * 销毁所有的Activity
     */
    public void removeALLActivity() {
        //通过循环，把集合中的所有Activity销毁
        for (Activity activity : activityList) {
            activity.finish();
        }
    }

}
