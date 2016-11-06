package com.mycompany.spring;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

/**
 * Unit test for simple Application.
 */
public class ApplicationTest {

    private Application application;

    @Before
    public void setUp() {
        application = new Application();
    }

    @Test
    public void testHome() {
        Assert.assertEquals(Application.HOME_DISPLAY_STRING, application.home());
    }

}
