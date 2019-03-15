package com.godme.node;

import com.godme.bean.Data;
import com.godme.bean.Event;

public class TransNode extends Node {
    @Override
    public Event exec(Data data) {
        data.value = -data.value;
        return null;
    }
}
