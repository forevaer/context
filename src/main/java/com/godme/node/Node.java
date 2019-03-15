package com.godme.node;

import com.godme.bean.Event;
import com.godme.inter.NodeExecutor;

import java.util.HashMap;


public abstract  class Node implements NodeExecutor {
    public HashMap<Event,Node> nodes = new HashMap<>();

    public Node nextNode(Event event){
        if (nodes.size() <= 0){
            return null;
        }
        if(nodes.size() == 1){
            return nodes.values().iterator().next();
        }
        if(nodes.containsKey(event)){
            return nodes.get(event);
        }
        return null;
    }
    public void addNode(Event event, Node node){
        nodes.put(event, node);
    }
    public boolean hasNext(){
        return this.nodes.size() > 0;
    }
}
