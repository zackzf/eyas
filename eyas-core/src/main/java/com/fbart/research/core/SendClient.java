package com.fbart.research.core;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.Socket;

public class SendClient {
    public static void main(String[] args) throws Exception{
        Socket socket = new Socket("10.252.61.33", 5209);
        OutputStream outputStream = socket.getOutputStream();
        File file = new File("/Users/wangzhengfa/file/tmp/t2.zip");
        FileInputStream fis = new FileInputStream(file);
        byte[] bytes = new byte[1024];
        int n = 0;
        while ((n = fis.read(bytes)) != -1) {
            outputStream.write(bytes, 0, n);
        }
        outputStream.flush();
        outputStream.close();
        socket.close();
    }
}
