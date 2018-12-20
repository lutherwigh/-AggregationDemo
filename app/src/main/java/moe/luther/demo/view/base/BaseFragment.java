package moe.luther.demo.view.base;

import android.content.Context;
import android.os.Bundle;

import javax.annotation.Nullable;

public abstract class BaseFragment extends android.support.v4.app.Fragment {



//    public void BaseFragment newInstance(){
//        BaseFragment fragment = new BaseFragment();
//
//    }

    @Override
    public void onCreate(@Nullable Bundle bundle){
        super.onCreate(bundle);
    }

    @Override
    public void onAttach(Context context){
        super.onAttach(context);
        if(context instanceof BaseActivity){
            // register eventbus
        }
    }

    @Override
    public void onDetach(){
        super.onDetach();
        // unregister eventbus 销毁持有对象 防止内存泄漏
    }

}
