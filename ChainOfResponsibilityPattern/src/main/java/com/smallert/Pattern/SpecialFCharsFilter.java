package com.smallert.Pattern;

import com.smallert.domin.Message;

public class SpecialFCharsFilter implements Filter {
    @Override
    public void doFilter(Message message) {
        message.setMsg(message.getMsg().replace("a","b"));
    }
}
