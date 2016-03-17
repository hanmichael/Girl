package z3jjlzt.s.girl.z3jjlzt.s.girl.interfaces;


import java.util.List;

import retrofit2.Call;
import retrofit2.http.GET;
import retrofit2.http.Path;
import rx.Observable;
import z3jjlzt.s.girl.z3jjlzt.s.girl.entity.GirlEntity;
import z3jjlzt.s.girl.z3jjlzt.s.girl.entity.GirlJsonData;

/**
 * Created by s on 2016/3/10.
 * retrofit的接口
 */
public interface IgankApi {
    @GET("a.json")
    Call<List<GirlEntity>> getGirl();

    @GET("data/%E7%A6%8F%E5%88%A9/{count}/{page}")
    Call<GirlJsonData> getGirl(@Path("count") int count, @Path("page") int page);
//与rxjava结合api
    @GET("data/%E7%A6%8F%E5%88%A9/{count}/{page}")
   Observable<GirlJsonData> getG(@Path("count") int count, @Path("page") int page);

}
