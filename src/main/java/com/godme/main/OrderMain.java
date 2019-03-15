package com.godme.main;

import com.godme.bean.Data;
import com.godme.context.Context;
import com.godme.inter.DivTwo;
import com.godme.inter.MultTen;
import com.godme.inter.PlusFive;

public class OrderMain {
    public static void main(String[] args) {
        Context context = new Context();
        new PlusFive(context);
        new DivTwo(context);
        new MultTen(context);
//        new Data(context, 3);
//        new Data(context, 5);
        context.deal();
        System.out.println(context.datas.toString());
    }
}
