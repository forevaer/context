package com.godme.context;

import com.godme.bean.Data;
import com.godme.inter.Executor;

import java.util.ArrayList;
import java.util.Iterator;

public class Context {
    public ArrayList<Executor> executors = new ArrayList<>();
    public ArrayList<Data> datas = new ArrayList<>();
    public void deal(){
        Iterator<Data> dataIt = datas.iterator();
        Iterator<Executor> executorIt;
        Data data;
        while (dataIt.hasNext()){
            data = dataIt.next();
            executorIt = executors.iterator();
            while (executorIt.hasNext()){
                executorIt.next().exec(data);
            }
        }
    }
}
