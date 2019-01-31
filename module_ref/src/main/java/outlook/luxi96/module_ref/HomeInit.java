package outlook.luxi96.module_ref;

import android.app.Application;

import moe.luther.library.base.base.IModuleInit;

public class HomeInit implements IModuleInit {

    @Override
    public boolean onInitAhead(Application application) {
        return false;
    }

    @Override
    public boolean onInitLow(Application application) {
        return false;
    }
}
