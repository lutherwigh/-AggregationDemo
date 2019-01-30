package outlook.luxi96.module_navi;

import android.app.Application;

import com.zzhoujay.richtext.RichText;

import me.goldze.mvvmhabit.utils.KLog;
import moe.luther.library.base.base.IModuleInit;

public class NaviInit implements IModuleInit {

    @Override
    public boolean onInitAhead(Application application) {
        KLog.e("navi模块初始化 -- onInitAhead");
        RichText.initCacheDir(application);
        return false;
    }

    @Override
    public boolean onInitLow(Application application) {
        KLog.e("navi模块初始化 -- onInitLow");
        return false;
    }
}
