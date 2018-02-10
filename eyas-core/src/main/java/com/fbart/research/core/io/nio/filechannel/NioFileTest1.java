package com.fbart.research.core.io.nio.filechannel;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.nio.ByteBuffer;
import java.nio.channels.FileChannel;

public class NioFileTest1 {
    public static void main(String[] args) throws IOException {
        File file = new File("/Users/wangzhengfa/file/tmp/nio_file.txt");
        if (!file.exists()) {
            file.createNewFile();
        }
        FileChannel channel = new FileOutputStream(file).getChannel();
        ByteBuffer byteBuffer = ByteBuffer.wrap("Hello".getBytes());
        channel.write(byteBuffer);
        channel.close();
    }
}
