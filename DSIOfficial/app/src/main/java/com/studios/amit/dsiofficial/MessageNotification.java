package com.studios.amit.dsiofficial;

/**
 * Created by Amit on 10-08-2017.
 */

public class MessageNotification{

    private String notificationTitle;
    private String getNotificationBody;
    private String dateUploaded;
    private String hasAttachment, attachmentName, attachmentType;

    public void setGetNotificationBody(String getNotificationBody) {
        this.getNotificationBody = getNotificationBody;
    }

    public String getHasAttachment() {
        return hasAttachment;
    }

    public void setHasAttachment(String hasAttachment) {
        this.hasAttachment = hasAttachment;
    }

    public String getAttachmentName() {
        return attachmentName;
    }

    public void setAttachmentName(String attachmentName) {
        this.attachmentName = attachmentName;
    }

    public String getAttachmentType() {
        return attachmentType;
    }

    public void setAttachmentType(String attachmentType) {
        this.attachmentType = attachmentType;
    }

    public String getNotificationTitle() {
        return notificationTitle;
    }

    public void setNotificationTitle(String notificationTitle) {
        this.notificationTitle = notificationTitle;
    }

    public String getGetNotificationBody() {
        return getNotificationBody;
    }

    public void setNotificationBody(String getNotificationBody) {
        this.getNotificationBody = getNotificationBody;
    }

    public String getDateUploaded() {
        return dateUploaded;
    }

    public void setDateUploaded(String dateUploaded) {
        this.dateUploaded = dateUploaded;
    }
}
