package com.junittest;

import com.springannotation.Sanji;
import com.springannotation.SteelAxe;
import com.springannotation.StoneAxe;
import com.springannotation.Zoro;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.ContextHierarchy;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

/**
 * Created by pigeneral on 2017/1/15.
 */
@RunWith(SpringJUnit4ClassRunner.class)
//@ComponentScan(basePackages = "com.springannotation")
@ContextConfiguration(classes = {StoneAxe.class, Sanji.class, Zoro.class, SteelAxe.class})
public class ContextTest {
    @Autowired
    private StoneAxe stoneAxe;
    @Autowired
    private Zoro zoro;

    @Test
    public void autowireTest() throws Exception {
        System.out.println(stoneAxe.chop());

    }

    @Test
    public void autowireTest2() throws Exception {
        zoro.useAxe();

    }
}
