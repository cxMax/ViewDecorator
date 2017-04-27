package com.cxmax.library;

import android.support.annotation.NonNull;

/**
 * @param <V> target which will be decorated
 * @param <P> necessary params
 * @describe :
 * @usage :
 * <p>
 * </p>
 * Created by caixi on 17-4-24.
 *
 */
public abstract class AbsViewDecorator<V , P extends BaseParam> {

    public static final String TAG = AbsViewDecorator.class.getSimpleName();

    public V init(@NonNull P p, @NonNull V v) {
        paramIsReady(p);
        return v;
    }

    protected abstract void paramIsReady(@NonNull P p);
}
