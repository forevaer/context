
package com.godme.bean;

import com.godme.context.Context;
import com.godme.context.NodeContext;

public class Data {
    public Integer value;
    public Data(NodeContext context, Integer value){
        this.value = value;
        context.datas.add(this);
    }

    @Override
    public String toString() {
        return String.valueOf(value);
    }
}
