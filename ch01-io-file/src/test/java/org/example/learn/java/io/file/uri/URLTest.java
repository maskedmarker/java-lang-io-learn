package org.example.learn.java.io.file.uri;

import org.junit.Test;

import java.net.URI;
import java.net.URISyntaxException;
import java.net.URL;
import java.nio.file.Path;
import java.nio.file.Paths;

/**
 * URI是用来唯一标识一个资源的.强调唯一性
 * URL是用来标识资源的下载路径(可能多个url下载的内容是同一个资源),并不强调唯一性,更强调资源内容本身.
 * Path是文件系统中文件的唯一标识,即文件路径.
 *
 * URI/URL/Path在作用于文件系统时,是可以相互切换转化的.
 */
public class URLTest {

    @Test
    public void test0() throws URISyntaxException {
        String classPath = "txt.data";
        // 这里更多强调资源内容本身,所以返回的是Resource
        URL resource = URLTest.class.getClassLoader().getResource(classPath);
        System.out.println("resource = " + resource);
        // 这里更多强调资源的标识
        URI uri = resource.toURI();
        System.out.println("uri = " + uri);
        // 因为是本地文件系统的文件,所以资源的唯一标识去除协议后,就是文件的路径
        Path path = Paths.get(uri);
        System.out.println("path = " + path);
    }
}