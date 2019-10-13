package com.t795.zki.common.bo.message;

public class BlockMessage extends AbstractMessage {
    private char[][] content;
    private int rows;
    private int cols;

    public BlockMessage() { }

    public BlockMessage(char[][] content, int rows, int cols) {
        this.content = content;
        this.rows = rows;
        this.cols = cols;
    }

    public char[][] getContent() {
        return content;
    }

    public void setContent(char[][] content) {
        this.content = content;
    }

    public int getRows() {
        return rows;
    }

    public void setRows(int rows) {
        this.rows = rows;
    }

    public int getCols() {
        return cols;
    }

    public void setCols(int cols) {
        this.cols = cols;
    }
}
