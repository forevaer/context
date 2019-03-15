package com.godme.node;

import com.godme.bean.Data;
import com.godme.bean.Event;

public class AbsNode  extends Node{
    @Override
    public Event exec(Data data) {
        if(data.value < 0){
            return Event.MINUS;
        }
        return Event.PLUS;
    }
}
