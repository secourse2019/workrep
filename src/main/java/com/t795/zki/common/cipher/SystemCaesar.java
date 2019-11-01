package com.t795.zki.common.cipher;

import com.sun.org.apache.xpath.internal.operations.String;
import com.t795.zki.common.bo.message.StreamMessage;

public interface SystemCaesar {
     StreamMessage encrypt ();
    StreamMessage decrypt ();
}