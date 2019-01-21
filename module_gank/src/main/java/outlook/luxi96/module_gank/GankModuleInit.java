package outlook.luxi96.module_gank;

import android.app.Application;

import me.goldze.mvvmhabit.utils.KLog;
import moe.luther.library.base.base.IModuleInit;

public class GankModuleInit implements IModuleInit {
    @Override
    public boolean onInitAhead(Application application) {
        KLog.e("gank模块初始化 -- onInitAhead");
        return false;
    }

    @Override
    public boolean onInitLow(Application application) {
        KLog.e("gank模块初始化 -- onInitAhead");
        return false;
    }
}
