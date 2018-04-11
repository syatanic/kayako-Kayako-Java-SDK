package com.kayako.sdk.messenger.message;

import com.diffblue.deeptestutils.Reflector;
import com.kayako.sdk.auth.FingerprintAuth;
import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.ExpectedException;

import java.util.HashMap;
import java.util.Map;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;

public class GetMessageRequesterTest {

    @Rule
    public ExpectedException thrown = ExpectedException.none();

    /* testedClasses: GetMessageRequester */
    /*
     * Test generated by Diffblue Deeptest.
     * This test case covers the entire function.
     */
    @Test
    public void init() throws Throwable {
        GetMessageRequester instance;
        {
            /* Arrange */
            String helpdeskUrl = null;
            FingerprintAuth fingerprintAuth = null;
            long conversationId = 0L;
            long messageId = 0L;
            /* Act */
            /* Creating object to test constructor */
            instance = new GetMessageRequester(helpdeskUrl, fingerprintAuth, conversationId, messageId);
            assertNotNull(instance);
        /* Method return type is void, or not expected to return */
        }
    }

    /*
     * Test generated by Diffblue Deeptest.
     * This test case covers the entire function.
     */
    @Test
    public void getEndpointUrl() throws Throwable {
        String retval;
        {
            /* Arrange */
            Long param0 = (Long) Reflector.getInstance("java.lang.Long");
            Reflector.setField(param0, "value", 0L);
            Long param1 = (Long) Reflector.getInstance("java.lang.Long");
            Reflector.setField(param1, "value", 8L);
            String param3 = "!!!!!!!!";
            GetMessageRequester param4 = (GetMessageRequester) Reflector.getInstance("com.kayako.sdk.messenger.message.GetMessageRequester");
            Reflector.setField(param4, "mMessageId", param0);
            Reflector.setField(param4, "mConversationId", param1);
            Reflector.setField(param4, "mFingerprintAuth", null);
            Reflector.setField(param4, "mHelpDeskUrl", param3);
            /* Act */
            retval = param4.getEndpointUrl();
        }
        {
            /* Assert result */
            assertNotNull(retval);
            assertEquals("api/v1/conversations/8/messages/0", retval);
        }
    }

    /*
     * Test generated by Diffblue Deeptest.
     * This test case covers the entire function.
     */
    @Test
    public void getHeaders() throws Throwable {
        Map<String, String> retval;
        {
            /* Arrange */
            FingerprintAuth param0 = (FingerprintAuth) Reflector.getInstance("com.kayako.sdk.auth.FingerprintAuth");
            param0.setFingerprintId(null);
            String param2 = "";
            GetMessageRequester param3 = (GetMessageRequester) Reflector.getInstance("com.kayako.sdk.messenger.message.GetMessageRequester");
            Reflector.setField(param3, "mMessageId", null);
            Reflector.setField(param3, "mConversationId", null);
            Reflector.setField(param3, "mFingerprintAuth", param0);
            Reflector.setField(param3, "mHelpDeskUrl", param2);
            /* Act */
            retval = param3.getHeaders();
        }
        {
            /* Assert result */
            assertNotNull(retval);
            HashMap hashMap = new HashMap();
            hashMap.put("X-Fingerprint-ID", null);
            assertEquals(hashMap, retval);
        }
    }

    /*
     * Test generated by Diffblue Deeptest.
     * This test case covers the entire function.
     */
    @Test
    public void getHelpCenterUrl() throws Throwable {
        String retval;
        {
            /* Arrange */
            GetMessageRequester param0 = (GetMessageRequester) Reflector.getInstance("com.kayako.sdk.messenger.message.GetMessageRequester");
            Reflector.setField(param0, "mMessageId", null);
            Reflector.setField(param0, "mConversationId", null);
            Reflector.setField(param0, "mFingerprintAuth", null);
            Reflector.setField(param0, "mHelpDeskUrl", null);
            /* Act */
            retval = param0.getHelpCenterUrl();
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
    public void getQueryParameters() throws Throwable {
        Map<String, String> retval;
        {
            /* Arrange */
            String param1 = "";
            GetMessageRequester param2 = (GetMessageRequester) Reflector.getInstance("com.kayako.sdk.messenger.message.GetMessageRequester");
            Reflector.setField(param2, "mMessageId", null);
            Reflector.setField(param2, "mConversationId", null);
            Reflector.setField(param2, "mFingerprintAuth", null);
            Reflector.setField(param2, "mHelpDeskUrl", param1);
            /* Act */
            retval = param2.getQueryParameters();
        }
        {
            /* Assert result */
            assertEquals(null, retval);
        }
    }
}