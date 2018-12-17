package moe.luther.demo.page.main.fragment;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import butterknife.ButterKnife;
import butterknife.Unbinder;
import moe.luther.demo.R;
import moe.luther.demo.base.BaseFragment;

public class HomeFragment extends BaseFragment {

    Unbinder unbinder;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup parent, Bundle bundle){
        View root = LayoutInflater.from(parent.getContext()).inflate(R.layout.fragment_home,null,false);
        unbinder = ButterKnife.bind(this,root);
        return root;
    }

    @Override
    public void onDestroyView(){
        super.onDestroyView();
        unbinder.unbind();
    }

    // todo 考虑在toolbar中放入横向list 栏目
    // 但是不建议嵌套fragment 性能有问题

}
