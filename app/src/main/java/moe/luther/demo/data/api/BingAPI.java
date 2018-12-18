package moe.luther.demo.data.api;

import moe.luther.demo.data.bean.BingBean;
import retrofit2.http.GET;
import retrofit2.http.Query;

public interface BingAPI {

    @GET("/v1/rand")
    io.reactivex.Observable<BingBean> getRandImage(@Query("w") int width,
                                                   @Query("h") int height,
                                                   @Query("type") String json);

}
