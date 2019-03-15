package com.godme.inter;

import com.godme.bean.Data;
import com.godme.context.Context;

public class PlusFive extends ExecutorAdapter {
    public PlusFive(Context context) {
        super(context);
    }

    @Override
    public void exec(Data data) {
         data.value += 5;
    }
}
