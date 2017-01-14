package com.springannotation;

import org.springframework.context.annotation.Configuration;
import org.springframework.stereotype.Component;

import javax.annotation.Resource;

/**
 * Created by pigeneral on 2017/1/12.
 */
@Component
public class Zoro implements Person {
    private Axe axe;

    // @Resource标注name时，Spring会自动注入名为 name 的bean
    @Resource(name = "steelAxe")
    public void setAxe(Axe axe) {
        this.axe = axe;
    }

    public void useAxe() {
        System.out.println("zoro:" + axe.chop());
    }
}
