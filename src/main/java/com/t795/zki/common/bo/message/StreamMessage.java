package com.t795.zki.common.bo.message;

public class StreamMessage extends AbstractMessage {
    private String message;

    public  StreamMessage(String message) {
        this.message = message;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) { this.message = message; }

}
