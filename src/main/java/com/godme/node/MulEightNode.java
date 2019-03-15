package com.godme.node;

import com.godme.bean.Data;
import com.godme.bean.Event;

public class MulEightNode extends Node {
    @Override
    public Event exec(Data data) {
        data.value *= 8;
        return null;
    }
}
