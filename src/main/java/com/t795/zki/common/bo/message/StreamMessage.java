package com.t795.zki.common.bo.message;

public class StreamMessage extends AbstractMessage {
    private String message;

    public  StreamMessage(StreamMessage message) {
        this.message = String.valueOf(message);
    }

    public StreamMessage(String message) {

    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String msg) {
        this.message = msg;
    }
}
