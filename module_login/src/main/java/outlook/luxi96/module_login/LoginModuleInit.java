package outlook.luxi96.module_login;

import android.app.Application;

import me.goldze.mvvmhabit.utils.KLog;
import moe.luther.library.base.base.IModuleInit;

public class LoginModuleInit implements IModuleInit {

    @Override
    public boolean onInitAhead(Application application) {
        KLog.e("登录模块初始化 -- onInitAhead");
        return false;
    }

    @Override
    public boolean onInitLow(Application application) {
        KLog.e("登录模块初始化 -- onInitAhead");
        return false;
    }
}
