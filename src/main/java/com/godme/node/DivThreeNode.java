package com.godme.node;

import com.godme.bean.Data;
import com.godme.bean.Event;

public class DivThreeNode extends Node {
    @Override
    public Event exec(Data data) {
        data.value /= 3;
        return null;
    }
}
