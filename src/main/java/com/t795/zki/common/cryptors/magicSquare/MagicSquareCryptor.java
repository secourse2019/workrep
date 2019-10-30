package com.t795.zki.common.cryptors.magicSquare;

public class MagicSquareCryptor {
    String key;
    MagicSquareCryptor(String magicSquare)
    {
        key = magicSquare;
    }

    private int[] prepareMagicSquare(String magicSquare)
    {
        int[] result = new int[magicSquare.length()];
        char[] temp = magicSquare.toCharArray();
        for(int i = 0; i < temp.length; i++)
        {
            result[i] = temp[i];
        }
        return result;
    }

    public StreamMassage encrypt(String massage)
    {
        int[] keyMS = prepareMagicSquare(key);
        char[] text = massage.toCharArray();
        String result = "";
        for(int i = 0; i < keyMS.length; i++)
        {
            result += text[keyMS[i]];
        }
        return new StreamMassage(result);
    }

    public StreamMassage decrypt(String massage)
    {
        int[] keyMS = prepareMagicSquare(key);
        char[] text = massage.toCharArray();
        char[] result = new char[keyMS.length];
        for(int i = 0; i < keyMS.length; i++)
        {
            result[keyMS[i]] = text[i];
        }
        return new StreamMassage(result.toString());
    }
}
