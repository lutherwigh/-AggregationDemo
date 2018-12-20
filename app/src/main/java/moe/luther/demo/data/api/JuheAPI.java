package moe.luther.demo.data.api;


import io.reactivex.Observable;
import moe.luther.demo.data.bean.NewsBean;
import retrofit2.http.GET;
import retrofit2.http.Url;

public interface JuheAPI {

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
