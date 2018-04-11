package com.kayako.sdk.error.response;

import com.diffblue.deeptestutils.Reflector;
import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.ExpectedException;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;

public class Type_1Test {

    @Rule
    public ExpectedException thrown = ExpectedException.none();

    /* testedClasses: Type_1 */
    /*
   * Test generated by Diffblue Deeptest.
   * This test case covers the entire function.
   */
    @Test
    public void clinit() throws Throwable {
        Object constructed;
        {
            /* Act */
            /* Using constructor to test static initializer */
            constructed = Reflector.getInstance("com.kayako.sdk.error.response.Type$1");
            assertNotNull(constructed);
        /* Method return type is void, or not expected to return */
        }
    }

    /*
   * Test generated by Diffblue Deeptest.
   * This test case covers the entire function.
   */
    @Test
    public void comkayakosdkerrorresponseTypeclinit() throws Throwable {
        Object constructed;
        {
            /* Act */
            /* Using constructor to test static initializer */
            constructed = Reflector.getInstance("com.kayako.sdk.error.response.Type");
            assertNotNull(constructed);
        /* Method return type is void, or not expected to return */
        }
    }


    /*
   * Test generated by Diffblue Deeptest.
   * This test case covers:
   * case 2 of switch on line 14
   */
    @Test
    public void toString1() throws Throwable {
        String retval;
        {
            /* Arrange */
            Type param0 = (Type) Reflector.getInstance("com.kayako.sdk.error.response.Type");
            Reflector.setField(param0, "name", null);
            Reflector.setField(param0, "ordinal", 1);
            /* Act */
            retval = param0.toString();
        }
        {
            /* Assert result */
            assertNotNull(retval);
            assertEquals("Notification", retval);
        }
    }

    /*
   * Test generated by Diffblue Deeptest.
   * This test case covers:
   * case 1 of switch on line 14
   */
    @Test
    public void toString2() throws Throwable {
        String retval;
        {
            /* Arrange */
            Type param0 = (Type) Reflector.getInstance("com.kayako.sdk.error.response.Type");
            Reflector.setField(param0, "name", null);
            Reflector.setField(param0, "ordinal", 0);
            /* Act */
            retval = param0.toString();
        }
        {
            /* Assert result */
            assertNotNull(retval);
            assertEquals("Error", retval);
        }
    }

    /*
   * Test generated by Diffblue Deeptest.
   * This test case covers:
   * case 3 of switch on line 14
   */
    @Test
    public void toString3() throws Throwable {
        String retval;
        {
            /* Arrange */
            String param1 = "";
            Type param2 = (Type) Reflector.getInstance("com.kayako.sdk.error.response.Type");
            Reflector.setField(param2, "name", param1);
            Reflector.setField(param2, "ordinal", 2);
            /* Act */
            retval = param2.toString();
        }
        {
            /* Assert result */
            assertNotNull(retval);
            assertEquals("Log", retval);
        }
    }

}
