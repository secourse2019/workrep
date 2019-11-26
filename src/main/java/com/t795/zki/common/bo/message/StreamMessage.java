package com.t795.zki.common.bo.message;

public class StreamMessage extends AbstractMessage {
    private StreamMessage message;

    public  StreamMessage(StreamMessage message) {
        this.message = message;
    }

    public  StreamMessage() {
    }

    public StreamMessage getMessage() {
        return message;
    }

    public void setMessage(StreamMessage msg) {
        this.message = msg;
    }
}
