package z3jjlzt.s.girl.z3jjlzt.s.girl.utils;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import okhttp3.OkHttpClient;
import retrofit2.Retrofit;
import retrofit2.adapter.rxjava.RxJavaCallAdapterFactory;
import retrofit2.converter.gson.GsonConverterFactory;
import z3jjlzt.s.girl.z3jjlzt.s.girl.entity.GirlEntity;
import z3jjlzt.s.girl.z3jjlzt.s.girl.entity.GirlJsonData;
import z3jjlzt.s.girl.z3jjlzt.s.girl.interfaces.IgankApi;

/**
 * Created by s on 2016/3/10.
 */
public class NetUtils {
    public static void getImage(List<GirlEntity> girlEntityList,int num,int page){
        OkHttpClient okHttpClient = new OkHttpClient();
        //实例化retrofit并且创建api
        Retrofit retrofit = new Retrofit.Builder().baseUrl("http://gank.io/api/")
                .addConverterFactory(GsonConverterFactory.create())
                .client(okHttpClient)
                .addCallAdapterFactory(RxJavaCallAdapterFactory.create())
                .build();
        IgankApi igankApi = retrofit.create(IgankApi.class);
        try {
            //请求返回json数据
            final GirlJsonData girlJsonData=  igankApi.getGirl(num,page).execute().body();
       ;
            //提取img url
            ArrayList<GirlEntity> girlEntityArrayList = (ArrayList<GirlEntity>) girlJsonData.getResults();
            for(GirlEntity girlEntity:girlEntityArrayList) {
                girlEntityList.add(girlEntity);
            }

        } catch (IOException e) {
            e.printStackTrace();
        }

    }
}
