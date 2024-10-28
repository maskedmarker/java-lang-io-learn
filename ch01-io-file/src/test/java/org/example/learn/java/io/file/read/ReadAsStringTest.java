package org.example.learn.java.io.file.read;

import org.example.learn.java.io.file.util.ClassPathResourceUtils;
import org.junit.Test;

import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Path;

/**
 * 将文件中的内容当作字符串读取
 */
public class ReadAsStringTest {

    @Test
    public void test0() throws IOException {
        String classPath = "txt.data";
        Path filePath = ClassPathResourceUtils.getFilePath(classPath);
        byte[] bytes = Files.readAllBytes(filePath);
        String content = new String(bytes, StandardCharsets.UTF_8);
        System.out.println("content = " + content);
    }
}