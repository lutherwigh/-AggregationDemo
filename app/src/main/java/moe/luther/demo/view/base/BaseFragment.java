package moe.luther.demo.view.base;

import android.content.Context;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import javax.annotation.Nullable;

import butterknife.ButterKnife;
import butterknife.Unbinder;

public abstract class BaseFragment extends android.support.v4.app.Fragment {

    Unbinder unbinder;

    public View rootView;

    @Override
    public void onCreate(@Nullable Bundle bundle){
        super.onCreate(bundle);
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup parent,Bundle bundle){
        rootView = LayoutInflater.from(this.getContext()).inflate(getLayoutId(),parent,false);
        unbinder = ButterKnife.bind(this,rootView);
        return rootView;
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

    @Override
    public void onDestroyView(){
        super.onDestroyView();
        unbinder.unbind();
    }

    protected abstract int  getLayoutId();

}
