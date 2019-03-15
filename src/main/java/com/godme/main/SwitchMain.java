package com.godme.main;

import com.godme.bean.Data;
import com.godme.bean.Event;
import com.godme.context.NodeContext;
import com.godme.node.*;
import com.sun.media.sound.ModelConnectionBlock;

public class SwitchMain {
    public static void main(String[] args) {
        Node printNode = new PrintNode();
        Node divThreeNode = new DivThreeNode();
        Node plusTwoNode = new PlusTwoNode();
        Node mulEightNode = new MulEightNode();
        divThreeNode.addNode(null, printNode);
        plusTwoNode.addNode(null, printNode);
        mulEightNode.addNode(null, printNode);
        Node moreTenNode = new MoreTenNode();
        moreTenNode.addNode(Event.MORETEN, divThreeNode);
        moreTenNode.addNode(Event.LESSTEN, plusTwoNode);
        Node moreThreeNode = new MoreThreeNode();
        moreThreeNode.addNode(Event.MORETHREE, moreTenNode);
        moreThreeNode.addNode(Event.LESSTHREE, mulEightNode);
        Node absNode = new AbsNode();
        Node transnode = new TransNode();
        absNode.addNode(Event.MINUS, transnode);
        absNode.addNode(Event.PLUS, moreThreeNode);
        ///////////////////////////////////////////
        NodeContext context = new NodeContext(absNode);
        new Data(context, 4);
        context.deal();
    }
}
