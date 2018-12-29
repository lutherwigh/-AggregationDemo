package outlook.luxi96.module_gank.model.retrofitance;

import java.util.concurrent.TimeUnit;

import io.reactivex.Observable;
import io.reactivex.Observer;
import io.reactivex.android.schedulers.AndroidSchedulers;
import io.reactivex.schedulers.Schedulers;
import okhttp3.OkHttpClient;
import retrofit2.Retrofit;

public class BaseRetrofitance {

    Retrofit retrofit;
    OkHttpClient mOkHttpClient;

    static final int DEFAULT_TIMEOUT = 5;

    BaseRetrofitance() {
        // 手动创建一个OkHttpClient并设置超时时间
        OkHttpClient.Builder httpClientBuilder = new OkHttpClient.Builder();
        httpClientBuilder.connectTimeout(DEFAULT_TIMEOUT, TimeUnit.SECONDS);
        mOkHttpClient = httpClientBuilder.build();
    }

    void commonOp(Observable observable, Observer subscriber) {
        observable.subscribeOn(Schedulers.io())
                .unsubscribeOn(Schedulers.io())
                .observeOn(AndroidSchedulers.mainThread())
                .subscribe(subscriber);
    }

}
