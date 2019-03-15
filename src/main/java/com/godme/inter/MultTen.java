package com.godme.inter;

import com.godme.bean.Data;
import com.godme.context.Context;

public class MultTen extends ExecutorAdapter {
    public MultTen(Context context) {
        super(context);
    }

    @Override
    public void exec(Data data) {
        data.value *= 10;
    }
}
