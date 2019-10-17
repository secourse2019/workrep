package com.t795.zki.common.bo.message;

public class StreamMessage extends AbstractMessage {
    private String message;

    public  StreamMessage(String message) {
        setMessage(message);
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String msg) {
        this.message = msg;
    }
}
