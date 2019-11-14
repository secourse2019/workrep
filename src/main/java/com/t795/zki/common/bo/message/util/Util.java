package com.t795.zki.common.bo.message.util;

import com.t795.zki.common.bo.message.BlockMessage;

public class Util {

    public BlockMessage transposeMatrix(BlockMessage message) {
        BlockMessage result = new BlockMessage(message.getContent());
        for(int i = 0; i != message.getRows(); ++i) {
            result.setRowByIndex(i, message.getColumnByIndex(i));
        }
        return result;
    }

    public void SwapColumnsByIndex(BlockMessage message, int firstIndex, int secondIndex) {
        char[] temp = message.getColumnByIndex(firstIndex);
        message.setColumnByIndex(firstIndex, message.getColumnByIndex(secondIndex));
        message.setColumnByIndex(secondIndex, temp);
    }

    static public int makeLength(int value) {
        return (int)Math.ceil(Math.sqrt((double)value));
    }

    static  public char[] makeRow(String str, int point, int value) {
        char[] result = new char[value];
        for(int i = 0; i != value; ++i, ++point) {
            result[i] = point < str.length() ? str.charAt(point) : ' ';
        }
        return result;
    }
}
