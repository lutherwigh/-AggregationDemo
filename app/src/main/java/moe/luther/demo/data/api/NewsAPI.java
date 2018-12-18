package moe.luther.demo.data.api;

import com.luxi96.cardviewdemo.bean.NewsBean;

import io.reactivex.Observable;
import retrofit2.http.GET;
import retrofit2.http.Url;

public interface NewsAPI {

    @GET
    Observable<NewsBean> getNews(@Url String url);

//    @GET
//    Observable<FunnyBean> getFunny(@Url String url);
//
//    @GET
//    Observable<JokeBean> getJoke(@Url String url);
//
//    @GET
//    Observable<HistoryBean> getTodayInHistory(@Url String url);
//
//    @GET
//    Observable<QueryNewsBean> getQueryNews(@Url String url);
}
