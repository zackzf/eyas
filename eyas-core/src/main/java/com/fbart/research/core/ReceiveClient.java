package com.fbart.research.core;

import java.io.File;
import java.io.FileOutputStream;
import java.io.InputStream;
import java.net.Socket;

public class ReceiveClient {
    public static void main(String[] args) throws Exception{
        Socket socket = new Socket("10.252.61.33", 5209);
        InputStream inputStream = socket.getInputStream();
        File file = new File("/Users/wangzhengfa/file/tmp/t1.zip");
        FileOutputStream fileOutputStream = new FileOutputStream(file);
        byte[] bytes = new byte[1024];
        int n = 0;
        while ((n = inputStream.read(bytes)) != -1) {
            fileOutputStream.write(bytes, 0, n);
        }
        inputStream.close();
        socket.close();
        fileOutputStream.close();
    }
}
