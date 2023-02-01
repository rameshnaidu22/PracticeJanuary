package com.qa.test;



import org.testng.Assert;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

import java.io.IOException;


public class Practice22 {

    @Test
    public void m3() throws IOException {
        int a=10;
        int b=10;
        Assert.assertEquals(a,b);
    }
    @Test
    public void m4() throws IOException {
        int a=10;
        int b=10;

        Assert.assertEquals(a,b);
    }
    @Test
    public void m5() throws IOException {
        int a=10;
        int b=10;
        Assert.assertEquals(a,b);
    }
    @Test
    public void m6() throws IOException {
        int a=10;
        int b=15;
        Assert.assertEquals(a,b);
    }


}