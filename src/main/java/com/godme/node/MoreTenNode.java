package com.godme.node;

import com.godme.bean.Data;
import com.godme.bean.Event;

public class MoreTenNode extends Node {
    @Override
    public Event exec(Data data) {
        if(data.value > 10){
            return Event.MORETEN;
        }
        return Event.LESSTEN;
    }
}
