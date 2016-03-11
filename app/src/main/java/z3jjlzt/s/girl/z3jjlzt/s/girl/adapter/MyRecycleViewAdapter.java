package z3jjlzt.s.girl.z3jjlzt.s.girl.adapter;

import android.content.Context;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;

import com.bumptech.glide.Glide;
import com.bumptech.glide.load.engine.DiskCacheStrategy;

import java.util.List;

import butterknife.Bind;
import butterknife.ButterKnife;
import z3jjlzt.s.girl.R;
import z3jjlzt.s.girl.z3jjlzt.s.girl.entity.GirlEntity;

/**
 * Created by s on 2016/3/9.
 * recycleview的适配器
 */
public class MyRecycleViewAdapter extends RecyclerView.Adapter<MyRecycleViewAdapter.VH> {
    private List<GirlEntity> girlEntities = null;
    private Context context;
    public MyRecycleViewAdapter(Context context,List<GirlEntity> girlEntities){
        super();
        this.context=context;
        this.girlEntities=girlEntities;
    }


    @Override
    public VH onCreateViewHolder(ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.item_pic,parent,false);
        return new VH(view);
    }

    @Override
    public void onBindViewHolder(VH holder, int position) {
        GirlEntity girlEntity= girlEntities.get(position);
        Glide.with(context)
                .load(girlEntity.getUrl())
                .diskCacheStrategy(DiskCacheStrategy.ALL)
                .fitCenter()
                .into(holder.imageView);

    }

    @Override
    public int getItemCount() {
        return girlEntities.size();
    }

    class VH extends RecyclerView.ViewHolder {
        @Bind(R.id.iv_pic)
        ImageView imageView;

        public VH(View itemView) {
            super(itemView);
            //butterknife使用vh必要。
            ButterKnife.bind(this,itemView);
        }
    }
}


