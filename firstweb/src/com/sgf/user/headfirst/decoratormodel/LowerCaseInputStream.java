package com.sgf.user.headfirst.decoratormodel;

import java.io.*;

/**
 * Created by yuers on 2018/11/22.
 */
public class LowerCaseInputStream extends FilterInputStream {
    /**
     * Creates a <code>FilterInputStream</code>
     * by assigning the  argument <code>in</code>
     * to the field <code>this.in</code> so as
     * to remember it for later use.
     *
     * @param in the underlying input stream, or <code>null</code> if
     *           this instance is to be created without an underlying stream.
     */
    public LowerCaseInputStream(InputStream in) {
        super(in);
    }

    public int read() throws IOException {
        int c = super.read();
        return (c == -1 ? c : Character.toLowerCase((char)c));
    }

    public int read(byte[] b, int offset, int len) throws IOException{
        int result = super.read(b,offset,len);
        for (int i=offset;i<offset+result;i++){
            b[i] = (byte) Character.toLowerCase((char)b[i]);
        }
        return result;
    }
}
