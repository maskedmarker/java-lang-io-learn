package org.example.learn.java.io.file.resource;

import org.junit.Assert;
import org.junit.Test;

public class ClassLoaderTest {

    @Test
    public void test0() {
        ClassLoader appClassLoader = ClassLoaderTest.class.getClassLoader();
        System.out.println("appClassLoader = " + appClassLoader);
        Assert.assertEquals("sun.misc.Launcher$AppClassLoader", appClassLoader.getClass().getName());
        Assert.assertEquals(ClassLoader.getSystemClassLoader(), appClassLoader);

        ClassLoader extClassLoader = appClassLoader.getParent();
        System.out.println("extClassLoader = " + extClassLoader);

        ClassLoader bootstrapClassLoader = extClassLoader.getParent();
        System.out.println("bootstrapClassLoader = " + bootstrapClassLoader);
    }

    @Test
    public void test1() {
        ClassLoader appClassLoader = ClassLoader.getSystemClassLoader();
        ClassLoader extClassLoader = appClassLoader.getParent();
        ClassLoader bootstrapClassLoader = extClassLoader.getParent();


    }
}
