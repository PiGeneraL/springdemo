package com.springannotation;

import org.springframework.context.annotation.Configuration;
import org.springframework.stereotype.Component;

/**
 * Created by pigeneral on 2017/1/12.
 */
@Component
public class StoneAxe implements Axe {

    public String chop() {
        return "Stone Axe chop!";
    }
}
