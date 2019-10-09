package com.company;

import java.lang.reflect.Array;

public class BlockMessage {
    private char[][] content;
    private int cols;
    private int rows;

    public BlockMessage(){}

    public BlockMessage(char[][] content, int cols, int rows) {
        this.setContent(content);
        this.setCols(cols);
        this.setRows(rows);
    }

    public char[][] getContent() {
        return content;
    }

    public void setContent(char[][] content) {
        this.content = content;
    }

    public int getCols() {
        return cols;
    }

    public void setCols(int cols) {
        this.cols = cols;
    }

    public int getRows() {
        return rows;
    }

    public void setRows(int rows) {
        this.rows = rows;
    }

    public char getContentEntryByIndex(int col, int row) {
        return this.content[col][row];
    }

    public char[] getColumnByIndex(int index) {
        char[] column = new char[this.rows];
        for(int i = 0; i != this.rows; ++i) {
            column[i] = this.content[index][i];
        }
        return column;
    }

    public char[] getRowByIndex(int index) {
        char[] row = new char[this.cols];
        for(int i = 0; i != this.cols; ++i) {
            row[i] = this.content[i][index];
        }
        return row;
    }

    public void setRowByIndex(char[] row, int index) {
        for(int i = 0; i != this.cols; ++i) {
            this.content[i][index] = row[i];
        }
    }

    public void setColByIndex(char[] col, int index) {
        for(int i = 0; i != this.cols; ++i) {
            this.content[index][i] = col[i];
        }
    }
}
