package com.qa;


import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Listeners;


public class BaseTest {

    protected static Logger log= LogManager.getLogger(BaseTest.class.getName());

    @BeforeTest
    public void m3(){


    }
}
