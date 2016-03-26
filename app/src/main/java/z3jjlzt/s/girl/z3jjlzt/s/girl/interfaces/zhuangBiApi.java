package z3jjlzt.s.girl.z3jjlzt.s.girl.interfaces;

import java.util.List;

import retrofit2.http.GET;
import retrofit2.http.Query;
import rx.Observable;
import z3jjlzt.s.girl.z3jjlzt.s.girl.entity.ZhuangbiImg;

/**
 * Created by kkk on 2016/3/26.
 */
public interface zhuangBiApi {
    @GET("search")
    Observable<List<ZhuangbiImg>> getZhuanbBiImg(@Query("q")String query);
}
