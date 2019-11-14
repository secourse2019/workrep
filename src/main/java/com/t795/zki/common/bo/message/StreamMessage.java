package com.t795.zki.common.bo.message;

public class StreamMessage extends AbstractMessage {
    private String message;

    public  StreamMessage(String message) {
        this.message = message;
    }

    public String getMessage() {
        return message;
    }

    public void setMessageByString(String message) { this.message = message; }

}
