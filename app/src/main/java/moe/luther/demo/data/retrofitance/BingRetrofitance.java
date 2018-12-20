package moe.luther.demo.data.retrofitance;


import com.jakewharton.retrofit2.adapter.rxjava2.RxJava2CallAdapterFactory;

import io.reactivex.Observer;
import moe.luther.demo.util.Constant;
import moe.luther.demo.data.api.BingAPI;
import moe.luther.demo.data.bean.BingBean;
import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;

public class BingRetrofitance extends BaseRetrofitance{

    BingAPI api;

    private static volatile BingRetrofitance instance;

    public static synchronized BingRetrofitance getInstance(){
        if(instance == null){
            synchronized (BingRetrofitance.class){
                if(instance == null){
                    instance = new BingRetrofitance();
                }
            }
        }
        return instance;
    }

    private BingRetrofitance(){
        super();

        Retrofit retrofit = new Retrofit.Builder()
                .client(mOkHttpClient)
                .addConverterFactory(GsonConverterFactory.create())
                .addCallAdapterFactory(RxJava2CallAdapterFactory.create())
                .baseUrl(Constant.BING_BASE_URL)
                .build();

        api = retrofit.create(BingAPI.class);
    }

    // getPicUrl
    public void getRandomPic(Observer<BingBean> observer, int width, int height){
        commonOp(api.getRandImage(width,height,"json"),observer);
    }

}
