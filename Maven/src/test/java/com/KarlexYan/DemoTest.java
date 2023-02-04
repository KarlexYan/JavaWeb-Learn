package com.KarlexYan;

import org.junit.Assert;
import org.junit.Test;

public class DemoTest {
    @Test
    public void testSay() {
        Demo demo = new Demo();
        String ret = demo.say("KarlexYan");
        Assert.assertEquals("hello KarlexYan", ret);
    }
}
