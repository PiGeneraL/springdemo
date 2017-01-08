package com.springdemo;

import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

/**
 * Created by pigeneral on 2017/1/5.
 */
public class ByeMessageService implements MessageService {
    public String getMessage() {
        return "Good Bye!";
    }
}
