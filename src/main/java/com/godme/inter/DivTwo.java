package com.godme.inter;

import com.godme.bean.Data;
import com.godme.context.Context;

public class DivTwo extends ExecutorAdapter {
    public DivTwo(Context context) {
        super(context);
    }

    @Override
    public void exec(Data data) {
        data.value /= 2;
    }
}
