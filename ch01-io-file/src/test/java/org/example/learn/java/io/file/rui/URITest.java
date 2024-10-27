package org.example.learn.java.io.file.rui;

import org.junit.Before;
import org.junit.Test;

import java.net.URI;
import java.net.URISyntaxException;

/**
 *
 * At the highest level a URI reference (hereinafter simply "URI") in string form has the syntax
 * [scheme:]scheme-specific-part[#fragment]
 *
 * The URI generic syntax consists of a hierarchical sequence of five components:
 * URI = scheme ":" ["//" authority] path ["?" query] ["#" fragment]
 * authority = [userinfo "@"] host [":" port]
 */
public class URITest {

    private URI uri;

    @Before
    public void setup() throws URISyntaxException {
        String uri = "jar:file:/C:/Program%20Files/test.jar!/foo/bar?queryString=123#fragment";
        this.uri = new URI(uri);
    }

    @Test
    public void testDemoScheme() {
        String scheme = uri.getScheme();
        System.out.println("scheme = " + scheme);
    }

    @Test
    public void testDemoSchemeSpecificPart() {
        String schemeSpecificPart = uri.getSchemeSpecificPart();
        System.out.println("schemeSpecificPart = " + schemeSpecificPart);
        String rawSchemeSpecificPart = uri.getRawSchemeSpecificPart();
        System.out.println("rawSchemeSpecificPart = " + rawSchemeSpecificPart);
    }

    @Test
    public void demoPath() {
        String path = this.uri.getPath();
        System.out.println("path = " + path);
    }
}