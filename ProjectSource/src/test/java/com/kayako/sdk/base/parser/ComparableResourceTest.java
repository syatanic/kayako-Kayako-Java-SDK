package com.kayako.sdk.base.parser;

import com.diffblue.deeptestutils.Reflector;
import com.kayako.sdk.helpcenter.articles.Article;
import com.kayako.sdk.helpcenter.section.Section;
import com.kayako.sdk.helpcenter.user.UserMinimal;
import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.ExpectedException;

import static org.junit.Assert.assertEquals;

public class ComparableResourceTest {

    @Rule
    public ExpectedException thrown = ExpectedException.none();

    /*
     * Test generated by Diffblue Deeptest.
     * This test case covers:
     * conditional line 19 branch to line 19
     * conditional line 19 branch to line 21
     */
    @Test
    public void equals() throws Throwable {
        boolean retval;
        {
            /* Arrange */
            Long param11 = (Long) Reflector.getInstance("java.lang.Long");
            Reflector.setField(param11, "value", 0L);
            String param9 = "??????????????????";
            UserMinimal param8 = (UserMinimal) Reflector.getInstance("com.kayako.sdk.helpcenter.user.UserMinimal");
            Reflector.setField(param8, "presenceChannel", null);
            param8.setFullName(param9);
            param8.setLastSeenAt(null);
            param8.setId(null);
            param8.setAvatarUrl(null);
            param8.setLastActiveAt(null);
            String param6 = "??????????????????";
            String param4 = "";
            String param2 = "";
            Article param1 = new Article();
            param1.setLastPosted(param11);
            param1.setLastUpdated(null);
            param1.setAuthor(param8);
            param1.setSection(null);
            param1.setId(null);
            param1.setTitle(param4);
            param1.setUuid(param2);
            param1.setContents(param6);
            Object obj = null;
            /* Act */
            retval = param1.equals(obj);
        }
        {
            /* Assert result */
            assertEquals(false, retval);
        }
    }

    /*
     * Test generated by Diffblue Deeptest.
     * This test case covers:
     * conditional line 19 branch to line 19
     */
    @Test
    public void equals1() throws Throwable {
        boolean retval;
        {
            /* Arrange */
            Long param13 = (Long) Reflector.getInstance("java.lang.Long");
            Reflector.setField(param13, "value", 0L);
            String param11 = "";
            String param9 = "";
            Long param8 = (Long) Reflector.getInstance("java.lang.Long");
            Reflector.setField(param8, "value", 0L);
            Section param7 = new Section();
            param7.setDisplay_order(null);
            param7.setCategory(null);
            param7.setId(param8);
            param7.setTitle(param9);
            param7.setVisibility(null);
            param7.setDescription(param11);
            String param5 = "";
            String param3 = "";
            Article param2 = new Article();
            param2.setLastPosted(param13);
            param2.setLastUpdated(null);
            param2.setAuthor(null);
            param2.setSection(param7);
            param2.setId(null);
            param2.setTitle(param3);
            param2.setUuid(null);
            param2.setContents(param5);
            Object param0 = new Object();
            Object obj = param0;
            /* Act */
            retval = param2.equals(obj);
        }
        {
            /* Assert result */
            assertEquals(false, retval);
        }
    }
}