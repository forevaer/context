
package com.godme.inter;

import com.godme.context.Context;

public abstract  class ExecutorAdapter implements Executor{
    public ExecutorAdapter(Context context){
        context.executors.add(this);
    }
}
