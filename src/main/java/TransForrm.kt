class TransForrm { //
    //    1.使用新创建的MediatorLiveData 对象,对入参source进行观察;
    //    2.当source变化(setValue()时).将新变化的值应用onChange()传出等待处理
    //
    //    3.switchMapFunction.apply(x) 应用后返回新的LiveData包装，可能为null
    //    4.如果获取到通过apply（x）应用之后新的包装对象，首先对result进行更新，移除相同的source。
    //    5.将获取到的LiveData<>最为新的源缓存.
    //    6.观察新生成的源的变化。将变化的值应用Onchange(),将更新的值存入 MediatorLiveData
    //
    //
    //
    //    public static <X, Y> LiveData<Y> switchMap(
    //            @NonNull LiveData<X> source,
    //            @NonNull final Function<X, LiveData<Y>> switchMapFunction) {
    //        final MediatorLiveData<Y> result = new MediatorLiveData<>();
    //        result.addSource(source, new Observer<X>() {
    //            LiveData<Y> mSource;
    //
    //            @Override
    //            public void onChanged(@Nullable X x) {
    //                LiveData<Y> newLiveData = switchMapFunction.apply(x);
    //                if (mSource == newLiveData) {
    //                    return;
    //                }
    //                if (mSource != null) {
    //                    result.removeSource(mSource);
    //                }
    //                mSource = newLiveData;
    //                if (mSource != null) {
    //                    result.addSource(mSource, new Observer<Y>() {
    //                        @Override
    //                        public void onChanged(@Nullable Y y) {
    //                            result.setValue(y);
    //                        }
    //                    });
    //                }
    //            }
    //        });
    //        return result;
    //    }
}