package com.springannotation;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

/**
 * Created by pigeneral on 2017/1/12.
 */

@Component
public class Sanji implements Person {

    @Autowired
    // @Autowired需要指定Bean实例
//    private Axe axe;
    private StoneAxe axe;

//    public void setAxe(Axe axe) {
//        this.axe = axe;
//    }

    public void useAxe() {
        System.out.println("sanji:" + axe.chop());
    }
}
