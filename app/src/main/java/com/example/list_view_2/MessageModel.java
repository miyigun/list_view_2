package com.example.list_view_2;

public class MessageModel {

    private String messageContent;
    private String person;
    private int pictureId;

    public MessageModel(String messageContent, String person, int pictureId) {
        this.messageContent = messageContent;
        this.person = person;
        this.pictureId = pictureId;
    }

    public String getMessageContent() {
        return messageContent;
    }

    public void setMessageContent(String messageContent) {
        this.messageContent = messageContent;
    }

    public String getPerson() {
        return person;
    }

    public void setPerson(String person) {
        this.person = person;
    }

    public int getPictureId() {
        return pictureId;
    }

    public void setPictureId(int pictureId) {
        this.pictureId = pictureId;
    }
}
