package moe.luther.demo.data.api;

import android.database.Observable;

import moe.luther.demo.data.bean.GankTodayBean;
import retrofit2.http.GET;

public interface GankAPI {

    @GET("/today")
    Observable<GankTodayBean> getToday();

}
