package com.godme.node;

import com.godme.bean.Data;
import com.godme.bean.Event;

public class PrintNode extends Node{

    @Override
    public Event exec(Data data) {
        System.out.println(data.value);
        return null;
    }
}
