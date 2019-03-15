package com.godme.context;

import com.godme.bean.Data;
import com.godme.bean.Event;
import com.godme.node.Node;

import java.util.ArrayList;
import java.util.Iterator;

public class NodeContext {
    private Node tree;
    public NodeContext(Node node){
        this.tree = node;
    }
    public ArrayList<Data> datas = new ArrayList<>();
    public void addData(){

    }
    public void deal(){
        Iterator<Data> dataIt = datas.iterator();
        Data data;
        while(dataIt.hasNext()){
            data = dataIt.next();
            Node cursor = tree;
            while(cursor != null){
                Event event = cursor.exec(data);
                cursor = cursor.nextNode(event);
            }
        }
    }
}
