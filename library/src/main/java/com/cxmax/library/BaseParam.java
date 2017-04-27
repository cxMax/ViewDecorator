package com.cxmax.library;

import android.content.Context;

/**
 * @describe :
 * @usage :
 * <p>
 * </p>
 * Created by caixi on 17-4-24.
 */

public class BaseParam {
    public Context context;

    public Context getContext() {
        return context;
    }

    public BaseParam context(Context context) {
        this.context = context;
        return this;
    }

}
