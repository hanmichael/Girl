# Girl
## **项目建立**
- 建立一个完备的目录结构。
- BaseActivit的建立。所有Activity继承它。

## *retrofit* & **Rxjava**
- retrofit 默认使用okhttp。引用GSON解析。
- retrofit 4步，建立接口，实例化rerotfit,retrofit.create, api.method().execute().body();
- rxjava 方便  observeOn()可多次调用， subscribeOn() 只能调用一次。
- rxjava 与retrofit结合，添加addCallAdapterFactory(RxJavaCallAdapterFactory.create())方法

## 解决context内存泄露一个方法
- 在对于传入的参数context，使用context.getApplicationContext()。确保不关系context来源

[我的主页](https://github.com/z3jjlzt)
