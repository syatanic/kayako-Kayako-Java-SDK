package com.kayako.sdk.helpcenter.category;

import com.diffblue.deeptestutils.Reflector;
import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.ExpectedException;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;

public class CategoryTest {

    @Rule
    public ExpectedException thrown = ExpectedException.none();

    /* testedClasses: Category */
    /*
   * Test generated by Diffblue Deeptest.
   * This test case covers the entire function.
   */
    @Test
    public void init() throws Throwable {
        Category instance;
        {
            /* Act */
            /* Creating object to test constructor */
            instance = new Category();
            assertNotNull(instance);
        /* Method return type is void, or not expected to return */
        }
    }

    /*
   * Test generated by Diffblue Deeptest.
   * This test case covers the entire function.
   */
    @Test
    public void getDescription() throws Throwable {
        String retval;
        {
            /* Arrange */
            String param1 = "";
            Category param2 = new Category();
            Reflector.setField(param2, "description", null);
            Reflector.setField(param2, "title", param1);
            Reflector.setField(param2, "displayOrder", null);
            Reflector.setField(param2, "id", null);
            /* Act */
            retval = param2.getDescription();
        }
        {
            /* Assert result */
            assertEquals(null, retval);
        }
    }

    /*
   * Test generated by Diffblue Deeptest.
   * This test case covers the entire function.
   */
    @Test
    public void getDisplayOrder() throws Throwable {
        Long retval;
        {
            /* Arrange */
            String param1 = "";
            String param3 = "";
            Category param4 = new Category();
            Reflector.setField(param4, "description", param1);
            Reflector.setField(param4, "title", param3);
            Reflector.setField(param4, "displayOrder", null);
            Reflector.setField(param4, "id", null);
            /* Act */
            retval = param4.getDisplayOrder();
        }
        {
            /* Assert result */
            assertEquals(null, retval);
        }
    }

    /*
   * Test generated by Diffblue Deeptest.
   * This test case covers the entire function.
   */
    @Test
    public void getId() throws Throwable {
        Long retval;
        {
            /* Arrange */
            String param1 = "";
            String param3 = "";
            Category param4 = new Category();
            Reflector.setField(param4, "description", param1);
            Reflector.setField(param4, "title", param3);
            Reflector.setField(param4, "displayOrder", null);
            Reflector.setField(param4, "id", null);
            /* Act */
            retval = param4.getId();
        }
        {
            /* Assert result */
            assertEquals(null, retval);
        }
    }

    /*
   * Test generated by Diffblue Deeptest.
   * This test case covers the entire function.
   */
    @Test
    public void getTitle() throws Throwable {
        String retval;
        {
            /* Arrange */
            String param1 = "";
            Category param2 = new Category();
            Reflector.setField(param2, "description", param1);
            Reflector.setField(param2, "title", null);
            Reflector.setField(param2, "displayOrder", null);
            Reflector.setField(param2, "id", null);
            /* Act */
            retval = param2.getTitle();
        }
        {
            /* Assert result */
            assertEquals(null, retval);
        }
    }
    /*
   * Test generated by Diffblue Deeptest.
   * This test case covers the entire function.
   */
    /*
   * Test generated by Diffblue Deeptest.
   * This test case covers the entire function.
   */
    /*
   * Test generated by Diffblue Deeptest.
   * This test case covers the entire function.
   */
    /*
   * Test generated by Diffblue Deeptest.
   * This test case covers the entire function.
   */
}
