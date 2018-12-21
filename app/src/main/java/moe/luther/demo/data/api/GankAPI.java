package moe.luther.demo.data.api;


import io.reactivex.Observable;
import moe.luther.demo.data.bean.gank.GankBean;
import moe.luther.demo.data.bean.gank.GankSearchBean;
import moe.luther.demo.data.bean.gank.GankTodayBean;
import moe.luther.demo.data.bean.gank.XianduBean;
import moe.luther.demo.data.bean.gank.XianduCategoryBean;
import moe.luther.demo.data.bean.gank.XianduSubCategoryBean;
import moe.luther.demo.util.Constant;
import retrofit2.http.GET;
import retrofit2.http.Path;

public interface GankAPI {


    /**
     * 今日干货
     * @return
     */
    @GET("/today")
    Observable<GankTodayBean> getToday();

    /**
     * @param type 类别
     * @param page 页数
     * @return
     */
    // 搜索
    @GET("/search/query/listview/category/{type}/count/" + Constant.PAGE_SIZE +"/page/{page} ")
    Observable<GankSearchBean> search(@Path("type") String type,
                                      @Path("page") int page);

    /**
     * 获取分类数据
     * @param type 福利 | Android | iOS | 休息视频 | 拓展资源 | 前端 | all
     * @param page > 0
     * @return
     */
    @GET("/data/{type}/"+ Constant.PAGE_SIZE +"/{page}")
    Observable<GankBean> getData(@Path("type") String type,
                                 @Path("page") String page);

    // 获取 闲读 主分类
    @GET("/xiandu/categories")
    Observable<XianduCategoryBean> getCategories();

    // 获取 闲读 子分类
    @GET("/xiandu/category/{type}")
    Observable<XianduSubCategoryBean> getSubCategory(@Path("type") String type);

    // 获取闲读数据
    @GET("/xiandu/data/id/{sub}/count/" + Constant.PAGE_SIZE +"/page/{page}")
    Observable<XianduBean> getXianduData(@Path("sub") String sub,
                                         @Path("page") String page);

}
