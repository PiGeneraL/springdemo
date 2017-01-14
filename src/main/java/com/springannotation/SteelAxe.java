package com.springannotation;

import org.springframework.context.annotation.Configuration;
import org.springframework.stereotype.Component;

/**
 * Created by pigeneral on 2017/1/12.
 */
@Component("steelAxe")
public class SteelAxe implements Axe {
    public String chop() {
        return "Steel Axe chop!";
    }
}
