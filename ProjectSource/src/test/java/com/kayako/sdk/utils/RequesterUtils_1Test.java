package com.kayako.sdk.utils;

import com.diffblue.deeptestutils.Reflector;
import org.junit.Assert;
import org.junit.Test;
import org.junit.rules.ExpectedException;
import java.lang.reflect.Array;
import java.lang.reflect.Constructor;
import java.lang.reflect.Method;

@org.junit.runner.RunWith(org.powermock.modules.junit4.PowerMockRunner.class)
public class RequesterUtils_1Test {

    @org.junit.Rule
    public ExpectedException thrown = ExpectedException.none();

    /* testedClasses: RequesterUtils_1 */
    /*
     * Test generated by Diffblue Deeptest.
     * This test case covers:
     * conditional line 184 branch to line 184
     * conditional line 184 branch to line 185
     * conditional line 185 branch to line 185
     */
    /*
     * Test generated by Diffblue Deeptest.
     * This test case covers:
     * conditional line 184 branch to line 187
     */
    /*
     * Test generated by Diffblue Deeptest.
     * This test case covers:
     * conditional line 190 branch to line 193
     */
    /*
     * Test generated by Diffblue Deeptest.
     * This test case covers the entire function.
     */
    /*
     * Test generated by Diffblue Deeptest.
     * This test case covers the entire function.
     */
    @Test
    public void com_kayako_sdk_utils_RequesterUtils_combineUrl_000_513ca4d08e42bfc0() throws Throwable {
        String retval;
        {
            /* Arrange */
            String param_4 = "/MM------";
            String helpDeskUrl = param_4;
            String param_1 = ".nn";
            String apiEndpoint = param_1;
            /* Act */
            Class<?> c = Reflector.forName("com.kayako.sdk.utils.RequesterUtils");
            Method m = c.getDeclaredMethod("combineUrl", Reflector.forName("java.lang.String"), Reflector.forName("java.lang.String"));
            m.setAccessible(true);
            retval = (String) m.invoke(null, helpDeskUrl, apiEndpoint);
        }
        {
            /* Assert result */
            Assert.assertNotNull(retval);
            Assert.assertEquals("/MM------/.nn", retval);
        }
    }
    /*
     * Test generated by Diffblue Deeptest.
     * This test case covers:
     * conditional line 164 branch to line 168
     */
}
