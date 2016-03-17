1 建立一个完备的目录结构。
2 BaseActivit的建立。所有Activity继承它。
3retrofit 默认使用okhttp。引用GSON解析。
4retrofit 4步，建立接口，实例化rerotfit,retrofit.create, api.method().execute().body();

1 rxjava 方便  observeOn()可多次调用， subscribeOn() 只能调用一次。
2 rxjava 与retrofit结合，添加addCallAdapterFactory(RxJavaCallAdapterFactory.create())方法