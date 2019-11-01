package com.t795.zki.common.bo.message;

public class StreamMessage extends AbstractMessage {
    private String message;

    public  StreamMessage(String message) {
        this.message = message;
    }

    public String getMessage(String message) {
        return message;
    }

    public void setMessage(String msg) {
        this.message = msg;
    }

}
