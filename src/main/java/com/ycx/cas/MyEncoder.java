package com.ycx.cas;

import org.springframework.security.crypto.password.AbstractPasswordEncoder;

/**
 * @author czWang
 * @Created 2018/12/19 16:24.
 */
public class MyEncoder extends AbstractPasswordEncoder {
    @Override
    protected byte[] encode(CharSequence charSequence, byte[] bytes) {
        String string = bytes.toString();
        byte[] bytes1 = charSequence.toString().getBytes();

        System.out.println(string);
        return new byte[0];
    }
}
