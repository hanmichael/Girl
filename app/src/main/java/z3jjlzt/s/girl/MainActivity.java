package z3jjlzt.s.girl;

import android.os.AsyncTask;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;

import java.util.ArrayList;
import java.util.List;

import butterknife.Bind;
import butterknife.ButterKnife;
import z3jjlzt.s.girl.z3jjlzt.s.girl.acitivity.BaseActivity;
import z3jjlzt.s.girl.z3jjlzt.s.girl.adapter.MyRecycleViewAdapter;
import z3jjlzt.s.girl.z3jjlzt.s.girl.entity.GirlEntity;
import z3jjlzt.s.girl.z3jjlzt.s.girl.utils.NetUtils;

public class MainActivity extends BaseActivity {
    @Bind(R.id.rv_main)
    RecyclerView recyclerView;
    private List<GirlEntity> girlEntityList ;
    private MyRecycleViewAdapter myRecycleViewAdapter;
    @Override
    protected void initVariables() {
        girlEntityList = new ArrayList<>();
    }

    @Override
    protected void initView(Bundle savedInstanceState) {
        setContentView(R.layout.activity_main);
        ButterKnife.bind(this);


    }

    @Override
    public void loadData() {
        new getImageTask().execute();
        LinearLayoutManager layoutManager = new LinearLayoutManager(this);
         myRecycleViewAdapter = new MyRecycleViewAdapter(this,girlEntityList);
        recyclerView.setAdapter(myRecycleViewAdapter);
        recyclerView.setLayoutManager(layoutManager);
    }
   class getImageTask extends AsyncTask<Integer,Void,Void>{
       @Override
       protected Void doInBackground(Integer... params) {

           NetUtils.getImage(girlEntityList,10,2);
           return null;
       }
       @Override
       protected void onPostExecute(Void aVoid) {
           super.onPostExecute(aVoid);
           myRecycleViewAdapter.notifyDataSetChanged();
       }
   }
}
