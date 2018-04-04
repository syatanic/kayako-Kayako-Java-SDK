package com.kayako.sdk.messenger.message;

import com.diffblue.deeptestutils.Reflector;
import org.junit.Assert;
import org.junit.Test;
import org.junit.rules.ExpectedException;

public class MessageTest {

    @org.junit.Rule
    public ExpectedException thrown = ExpectedException.none();

    /* testedClasses: Message */
    /*
     * Test generated by Diffblue Deeptest.
     * This test case covers the entire function.
     */
    /*
     * Test generated by Diffblue Deeptest.
     * This test case covers the entire function.
     */
    @Test
    public void com_kayako_sdk_messenger_message_Message_getAttachments_000_458877812dfd87d5() throws Throwable {
        java.util.List<com.kayako.sdk.messenger.attachment.Attachment> retval;
        {
            /* Arrange */
            String param_1 = "";
            String param_3 = "";
            String param_5 = "";
            String param_7 = "";
            String param_9 = "";
            Message param_10 = (Message) Reflector.getInstance("com.kayako.sdk.messenger.message.Message");
            Reflector.setField(param_10, "updatedAt", null);
            Reflector.setField(param_10, "createdAt", null);
            Reflector.setField(param_10, "messageStatusUpdatedAt", null);
            Reflector.setField(param_10, "clientId", param_7);
            Reflector.setField(param_10, "creator", null);
            Reflector.setField(param_10, "uuid", param_9);
            Reflector.setField(param_10, "id", null);
            Reflector.setField(param_10, "subject", param_5);
            Reflector.setField(param_10, "channel", null);
            Reflector.setField(param_10, "contentText", param_3);
            Reflector.setField(param_10, "contentHtml", param_1);
            Reflector.setField(param_10, "attachments", null);
            Reflector.setField(param_10, "messageStatus", null);
            /* Act */
            retval = param_10.getAttachments();
        }
        {
            /* Assert result */
            Assert.assertEquals(null, retval);
        }
    }

    /*
     * Test generated by Diffblue Deeptest.
     * This test case covers the entire function.
     */
    @Test
    public void com_kayako_sdk_messenger_message_Message_getChannel_000_a440bc196b514098() throws Throwable {
        com.kayako.sdk.messenger.conversation.fields.ChannelType retval;
        {
            /* Arrange */
            String param_1 = "";
            String param_3 = "";
            String param_5 = "";
            String param_7 = "";
            String param_9 = "";
            Message param_10 = (Message) Reflector.getInstance("com.kayako.sdk.messenger.message.Message");
            Reflector.setField(param_10, "updatedAt", null);
            Reflector.setField(param_10, "createdAt", null);
            Reflector.setField(param_10, "messageStatusUpdatedAt", null);
            Reflector.setField(param_10, "clientId", param_7);
            Reflector.setField(param_10, "creator", null);
            Reflector.setField(param_10, "uuid", param_9);
            Reflector.setField(param_10, "id", null);
            Reflector.setField(param_10, "subject", param_5);
            Reflector.setField(param_10, "channel", null);
            Reflector.setField(param_10, "contentText", param_3);
            Reflector.setField(param_10, "contentHtml", param_1);
            Reflector.setField(param_10, "attachments", null);
            Reflector.setField(param_10, "messageStatus", null);
            /* Act */
            retval = param_10.getChannel();
        }
        {
            /* Assert result */
            Assert.assertEquals(null, retval);
        }
    }

    /*
     * Test generated by Diffblue Deeptest.
     * This test case covers the entire function.
     */
    @Test
    public void com_kayako_sdk_messenger_message_Message_getClientId_000_25b1a6470f5ab58c() throws Throwable {
        String retval;
        {
            /* Arrange */
            String param_1 = "";
            String param_3 = "";
            String param_5 = "";
            String param_7 = "";
            Message param_8 = (Message) Reflector.getInstance("com.kayako.sdk.messenger.message.Message");
            Reflector.setField(param_8, "updatedAt", null);
            Reflector.setField(param_8, "createdAt", null);
            Reflector.setField(param_8, "messageStatusUpdatedAt", null);
            Reflector.setField(param_8, "clientId", null);
            Reflector.setField(param_8, "creator", null);
            Reflector.setField(param_8, "uuid", param_7);
            Reflector.setField(param_8, "id", null);
            Reflector.setField(param_8, "subject", param_5);
            Reflector.setField(param_8, "channel", null);
            Reflector.setField(param_8, "contentText", param_3);
            Reflector.setField(param_8, "contentHtml", param_1);
            Reflector.setField(param_8, "attachments", null);
            Reflector.setField(param_8, "messageStatus", null);
            /* Act */
            retval = param_8.getClientId();
        }
        {
            /* Assert result */
            Assert.assertEquals(null, retval);
        }
    }

    /*
     * Test generated by Diffblue Deeptest.
     * This test case covers the entire function.
     */
    @Test
    public void com_kayako_sdk_messenger_message_Message_getContentHtml_000_71e7da769e72a6c5() throws Throwable {
        String retval;
        {
            /* Arrange */
            String param_1 = "";
            String param_3 = "";
            String param_5 = "";
            String param_7 = "";
            Message param_8 = (Message) Reflector.getInstance("com.kayako.sdk.messenger.message.Message");
            Reflector.setField(param_8, "updatedAt", null);
            Reflector.setField(param_8, "createdAt", null);
            Reflector.setField(param_8, "messageStatusUpdatedAt", null);
            Reflector.setField(param_8, "clientId", param_5);
            Reflector.setField(param_8, "creator", null);
            Reflector.setField(param_8, "uuid", param_7);
            Reflector.setField(param_8, "id", null);
            Reflector.setField(param_8, "subject", param_3);
            Reflector.setField(param_8, "channel", null);
            Reflector.setField(param_8, "contentText", param_1);
            Reflector.setField(param_8, "contentHtml", null);
            Reflector.setField(param_8, "attachments", null);
            Reflector.setField(param_8, "messageStatus", null);
            /* Act */
            retval = param_8.getContentHtml();
        }
        {
            /* Assert result */
            Assert.assertEquals(null, retval);
        }
    }

    /*
     * Test generated by Diffblue Deeptest.
     * This test case covers the entire function.
     */
    @Test
    public void com_kayako_sdk_messenger_message_Message_getContentText_000_16c502aff8dbd40f() throws Throwable {
        String retval;
        {
            /* Arrange */
            String param_1 = "";
            String param_3 = "";
            String param_5 = "";
            String param_7 = "";
            Message param_8 = (Message) Reflector.getInstance("com.kayako.sdk.messenger.message.Message");
            Reflector.setField(param_8, "updatedAt", null);
            Reflector.setField(param_8, "createdAt", null);
            Reflector.setField(param_8, "messageStatusUpdatedAt", null);
            Reflector.setField(param_8, "clientId", param_5);
            Reflector.setField(param_8, "creator", null);
            Reflector.setField(param_8, "uuid", param_7);
            Reflector.setField(param_8, "id", null);
            Reflector.setField(param_8, "subject", param_3);
            Reflector.setField(param_8, "channel", null);
            Reflector.setField(param_8, "contentText", null);
            Reflector.setField(param_8, "contentHtml", param_1);
            Reflector.setField(param_8, "attachments", null);
            Reflector.setField(param_8, "messageStatus", null);
            /* Act */
            retval = param_8.getContentText();
        }
        {
            /* Assert result */
            Assert.assertEquals(null, retval);
        }
    }

    /*
     * Test generated by Diffblue Deeptest.
     * This test case covers the entire function.
     */
    @Test
    public void com_kayako_sdk_messenger_message_Message_getCreatedAt_000_3074f8d89255cd42() throws Throwable {
        Long retval;
        {
            /* Arrange */
            String param_1 = "";
            String param_3 = "";
            String param_5 = "";
            String param_7 = "";
            String param_9 = "";
            Message param_10 = (Message) Reflector.getInstance("com.kayako.sdk.messenger.message.Message");
            Reflector.setField(param_10, "updatedAt", null);
            Reflector.setField(param_10, "createdAt", null);
            Reflector.setField(param_10, "messageStatusUpdatedAt", null);
            Reflector.setField(param_10, "clientId", param_7);
            Reflector.setField(param_10, "creator", null);
            Reflector.setField(param_10, "uuid", param_9);
            Reflector.setField(param_10, "id", null);
            Reflector.setField(param_10, "subject", param_5);
            Reflector.setField(param_10, "channel", null);
            Reflector.setField(param_10, "contentText", param_3);
            Reflector.setField(param_10, "contentHtml", param_1);
            Reflector.setField(param_10, "attachments", null);
            Reflector.setField(param_10, "messageStatus", null);
            /* Act */
            retval = param_10.getCreatedAt();
        }
        {
            /* Assert result */
            Assert.assertEquals(null, retval);
        }
    }

    /*
     * Test generated by Diffblue Deeptest.
     * This test case covers the entire function.
     */
    @Test
    public void com_kayako_sdk_messenger_message_Message_getCreator_000_10b222f5655d5ffc() throws Throwable {
        com.kayako.sdk.helpcenter.user.UserMinimal retval;
        {
            /* Arrange */
            String param_1 = "";
            String param_3 = "";
            String param_5 = "";
            String param_7 = "";
            String param_9 = "";
            Message param_10 = (Message) Reflector.getInstance("com.kayako.sdk.messenger.message.Message");
            Reflector.setField(param_10, "updatedAt", null);
            Reflector.setField(param_10, "createdAt", null);
            Reflector.setField(param_10, "messageStatusUpdatedAt", null);
            Reflector.setField(param_10, "clientId", param_7);
            Reflector.setField(param_10, "creator", null);
            Reflector.setField(param_10, "uuid", param_9);
            Reflector.setField(param_10, "id", null);
            Reflector.setField(param_10, "subject", param_5);
            Reflector.setField(param_10, "channel", null);
            Reflector.setField(param_10, "contentText", param_3);
            Reflector.setField(param_10, "contentHtml", param_1);
            Reflector.setField(param_10, "attachments", null);
            Reflector.setField(param_10, "messageStatus", null);
            /* Act */
            retval = param_10.getCreator();
        }
        {
            /* Assert result */
            Assert.assertEquals(null, retval);
        }
    }

    /*
     * Test generated by Diffblue Deeptest.
     * This test case covers the entire function.
     */
    @Test
    public void com_kayako_sdk_messenger_message_Message_getId_000_bda7df1093af7323() throws Throwable {
        Long retval;
        {
            /* Arrange */
            String param_1 = "";
            String param_3 = "";
            String param_5 = "";
            String param_7 = "";
            String param_9 = "";
            Message param_10 = (Message) Reflector.getInstance("com.kayako.sdk.messenger.message.Message");
            Reflector.setField(param_10, "updatedAt", null);
            Reflector.setField(param_10, "createdAt", null);
            Reflector.setField(param_10, "messageStatusUpdatedAt", null);
            Reflector.setField(param_10, "clientId", param_7);
            Reflector.setField(param_10, "creator", null);
            Reflector.setField(param_10, "uuid", param_9);
            Reflector.setField(param_10, "id", null);
            Reflector.setField(param_10, "subject", param_5);
            Reflector.setField(param_10, "channel", null);
            Reflector.setField(param_10, "contentText", param_3);
            Reflector.setField(param_10, "contentHtml", param_1);
            Reflector.setField(param_10, "attachments", null);
            Reflector.setField(param_10, "messageStatus", null);
            /* Act */
            retval = param_10.getId();
        }
        {
            /* Assert result */
            Assert.assertEquals(null, retval);
        }
    }

    /*
     * Test generated by Diffblue Deeptest.
     * This test case covers the entire function.
     */
    @Test
    public void com_kayako_sdk_messenger_message_Message_getMessageStatusUpdatedAt_000_1b0dfda28c085ee() throws Throwable {
        Long retval;
        {
            /* Arrange */
            String param_1 = "";
            String param_3 = "";
            String param_5 = "";
            String param_7 = "";
            String param_9 = "";
            Message param_10 = (Message) Reflector.getInstance("com.kayako.sdk.messenger.message.Message");
            Reflector.setField(param_10, "updatedAt", null);
            Reflector.setField(param_10, "createdAt", null);
            Reflector.setField(param_10, "messageStatusUpdatedAt", null);
            Reflector.setField(param_10, "clientId", param_7);
            Reflector.setField(param_10, "creator", null);
            Reflector.setField(param_10, "uuid", param_9);
            Reflector.setField(param_10, "id", null);
            Reflector.setField(param_10, "subject", param_5);
            Reflector.setField(param_10, "channel", null);
            Reflector.setField(param_10, "contentText", param_3);
            Reflector.setField(param_10, "contentHtml", param_1);
            Reflector.setField(param_10, "attachments", null);
            Reflector.setField(param_10, "messageStatus", null);
            /* Act */
            retval = param_10.getMessageStatusUpdatedAt();
        }
        {
            /* Assert result */
            Assert.assertEquals(null, retval);
        }
    }

    /*
     * Test generated by Diffblue Deeptest.
     * This test case covers the entire function.
     */
    @Test
    public void com_kayako_sdk_messenger_message_Message_getMessageStatus_000_22e9c5dc41d33e50() throws Throwable {
        MessageStatus retval;
        {
            /* Arrange */
            String param_1 = "";
            String param_3 = "";
            String param_5 = "";
            String param_7 = "";
            String param_9 = "";
            Message param_10 = (Message) Reflector.getInstance("com.kayako.sdk.messenger.message.Message");
            Reflector.setField(param_10, "updatedAt", null);
            Reflector.setField(param_10, "createdAt", null);
            Reflector.setField(param_10, "messageStatusUpdatedAt", null);
            Reflector.setField(param_10, "clientId", param_7);
            Reflector.setField(param_10, "creator", null);
            Reflector.setField(param_10, "uuid", param_9);
            Reflector.setField(param_10, "id", null);
            Reflector.setField(param_10, "subject", param_5);
            Reflector.setField(param_10, "channel", null);
            Reflector.setField(param_10, "contentText", param_3);
            Reflector.setField(param_10, "contentHtml", param_1);
            Reflector.setField(param_10, "attachments", null);
            Reflector.setField(param_10, "messageStatus", null);
            /* Act */
            retval = param_10.getMessageStatus();
        }
        {
            /* Assert result */
            Assert.assertEquals(null, retval);
        }
    }

    /*
     * Test generated by Diffblue Deeptest.
     * This test case covers the entire function.
     */
    @Test
    public void com_kayako_sdk_messenger_message_Message_getSubject_000_4ef1d9d1736ef209() throws Throwable {
        String retval;
        {
            /* Arrange */
            String param_1 = "";
            String param_3 = "";
            String param_5 = "";
            String param_7 = "";
            Message param_8 = (Message) Reflector.getInstance("com.kayako.sdk.messenger.message.Message");
            Reflector.setField(param_8, "updatedAt", null);
            Reflector.setField(param_8, "createdAt", null);
            Reflector.setField(param_8, "messageStatusUpdatedAt", null);
            Reflector.setField(param_8, "clientId", param_5);
            Reflector.setField(param_8, "creator", null);
            Reflector.setField(param_8, "uuid", param_7);
            Reflector.setField(param_8, "id", null);
            Reflector.setField(param_8, "subject", null);
            Reflector.setField(param_8, "channel", null);
            Reflector.setField(param_8, "contentText", param_3);
            Reflector.setField(param_8, "contentHtml", param_1);
            Reflector.setField(param_8, "attachments", null);
            Reflector.setField(param_8, "messageStatus", null);
            /* Act */
            retval = param_8.getSubject();
        }
        {
            /* Assert result */
            Assert.assertEquals(null, retval);
        }
    }

    /*
     * Test generated by Diffblue Deeptest.
     * This test case covers the entire function.
     */
    @Test
    public void com_kayako_sdk_messenger_message_Message_getUpdatedAt_000_c2ed5830a4c485eb() throws Throwable {
        Long retval;
        {
            /* Arrange */
            String param_1 = "";
            String param_3 = "";
            String param_5 = "";
            String param_7 = "";
            String param_9 = "";
            Message param_10 = (Message) Reflector.getInstance("com.kayako.sdk.messenger.message.Message");
            Reflector.setField(param_10, "updatedAt", null);
            Reflector.setField(param_10, "createdAt", null);
            Reflector.setField(param_10, "messageStatusUpdatedAt", null);
            Reflector.setField(param_10, "clientId", param_7);
            Reflector.setField(param_10, "creator", null);
            Reflector.setField(param_10, "uuid", param_9);
            Reflector.setField(param_10, "id", null);
            Reflector.setField(param_10, "subject", param_5);
            Reflector.setField(param_10, "channel", null);
            Reflector.setField(param_10, "contentText", param_3);
            Reflector.setField(param_10, "contentHtml", param_1);
            Reflector.setField(param_10, "attachments", null);
            Reflector.setField(param_10, "messageStatus", null);
            /* Act */
            retval = param_10.getUpdatedAt();
        }
        {
            /* Assert result */
            Assert.assertEquals(null, retval);
        }
    }

    /*
     * Test generated by Diffblue Deeptest.
     * This test case covers the entire function.
     */
    @Test
    public void com_kayako_sdk_messenger_message_Message_getUuid_000_4fa13a07b5385b43() throws Throwable {
        String retval;
        {
            /* Arrange */
            String param_1 = "";
            String param_3 = "";
            String param_5 = "";
            String param_7 = "";
            Message param_8 = (Message) Reflector.getInstance("com.kayako.sdk.messenger.message.Message");
            Reflector.setField(param_8, "updatedAt", null);
            Reflector.setField(param_8, "createdAt", null);
            Reflector.setField(param_8, "messageStatusUpdatedAt", null);
            Reflector.setField(param_8, "clientId", param_7);
            Reflector.setField(param_8, "creator", null);
            Reflector.setField(param_8, "uuid", null);
            Reflector.setField(param_8, "id", null);
            Reflector.setField(param_8, "subject", param_5);
            Reflector.setField(param_8, "channel", null);
            Reflector.setField(param_8, "contentText", param_3);
            Reflector.setField(param_8, "contentHtml", param_1);
            Reflector.setField(param_8, "attachments", null);
            Reflector.setField(param_8, "messageStatus", null);
            /* Act */
            retval = param_8.getUuid();
        }
        {
            /* Assert result */
            Assert.assertEquals(null, retval);
        }
    }
}
