package com.witmergers.loginrobo.test;

import android.test.ActivityInstrumentationTestCase2;

import com.robotium.solo.Solo;
import com.witmergers.loginrobo.MainActivity;

import junit.framework.Assert;

/**
 * Created by WP8Dev on 21-01-2015.
 */
public class TestDemo extends ActivityInstrumentationTestCase2<MainActivity> {
    
    
    private Solo solo;
   public  TestDemo()
    {
        
        super(MainActivity.class);
        
    }

    @Override
    protected void setUp() throws Exception {
      //  super.setUp();
        solo = new Solo(getInstrumentation(),getActivity());
    }

    @Override
    protected void tearDown() throws Exception {
      //  super.tearDown();
        solo.finishOpenedActivities();
    }
    
    public void test_CheckLogin()throws Exception
    {
        solo.assertCurrentActivity("wrong activity", com.witmergers.loginrobo.MainActivity.class);



        // First EditTtext
        solo.clearEditText(0);
        Assert.assertTrue(solo.searchText(""));
        solo.enterText(0, "Pramod");

        // Second EditTtext
        solo.clearEditText(1);
        Assert.assertTrue(solo.searchText(""));
        solo.enterText(1, "Ppass");

        solo.clickOnButton("Login");
        
        // Check Menu
        solo.sendKey(Solo.MENU);
        solo.clickOnText("Settings");


    }
}
