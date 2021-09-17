package com.company.loaders;

import com.company.GameException;

import java.net.URL;

/**
 * Import zasobów plikowych do aplikacji
 */
public class ResourceLoader {
    private ResourceLoader() {
        // klasa narzędziowa
    }

    public static URL loadResource(String resourceName) {
        URL resource = IconLoader.class.getResource(resourceName);
        if (resource == null) {
            throw new GameException("Błąd w czasie otwierania pliku: " + resourceName);
        }
        return resource;
    }
}
