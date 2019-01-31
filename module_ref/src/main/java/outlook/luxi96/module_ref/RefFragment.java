package outlook.luxi96.module_ref;

import android.os.Bundle;

import com.alibaba.android.arouter.facade.annotation.Route;

import moe.luther.library.base.base.BaseFragment;
import moe.luther.library.base.router.RouterFragmentPath;

@Route(path = RouterFragmentPath.Test.PAGE_TEST)
public class RefFragment extends BaseFragment {

    @Override
    public int getResId() {
        return R.layout.fragment_ref;
    }

    @Override
    public void init(Bundle savedInstanceState) {

    }
}
