package com.t795.zki.common.bo.util;
package com.t795.zki.common.bo.message;

static class Util {
    public static void swapColumns(char[] first, char[] second) {
        char[] temp = first;
        first = second;
        second = temp;
    }

    public static void Transpanition(BlockMessage cont) {
        BlockMessage temp = new BlockMessage();
        temp.setRowsCount = cont.getRows;
        temp.setColumnsCount = cont.getCols;
        for(int i = 0; i != temp.getRows; ++i) {
            temp[i] = cont.getColumnByIndex(i);
        }
    }
}

