package org.example.learn.java.io.file.util;

import java.net.URI;
import java.net.URISyntaxException;
import java.net.URL;
import java.nio.file.Path;
import java.nio.file.Paths;

public class ClassPathResourceUtils {

    public static Path getFilePath(String classPath) {
        try {
            URL resource = ClassPathResourceUtils.class.getClassLoader().getResource(classPath);
            URI uri = resource.toURI();
            return Paths.get(uri);
        } catch (URISyntaxException e) {
            throw new RuntimeException(e);
        }
    }
}
