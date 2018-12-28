package outlook.luxi96.module_home.model.api;

import outlook.luxi96.module_home.model.bean.BingBean;
import retrofit2.http.GET;
import retrofit2.http.Query;

public interface BingAPI {

    @GET("/v1/rand")
    io.reactivex.Observable<BingBean> getRandImage(@Query("w") int width,
                                                   @Query("h") int height,
                                                   @Query("type") String json);

}
