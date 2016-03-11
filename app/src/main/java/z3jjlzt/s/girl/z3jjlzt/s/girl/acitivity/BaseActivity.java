package z3jjlzt.s.girl.z3jjlzt.s.girl.acitivity;

import android.app.Activity;
import android.os.Bundle;

/**
 * Created by s on 2016/3/9.
 */
public abstract class BaseActivity extends Activity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        initVariables();
        initView(savedInstanceState);
        loadData();
    }

    protected abstract void loadData();

    protected abstract void initView(Bundle savedInstanceState);

    protected abstract void initVariables();
}
