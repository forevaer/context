package com.godme.inter;

import com.godme.bean.Data;
import com.godme.bean.Event;

public interface NodeExecutor {
    Event exec(Data data);
}
