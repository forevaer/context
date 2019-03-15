package com.godme.node;

import com.godme.bean.Data;
import com.godme.bean.Event;

public class PlusTwoNode extends Node {
    @Override
    public Event exec(Data data) {
        data.value += 2;
        return null;
    }
}
