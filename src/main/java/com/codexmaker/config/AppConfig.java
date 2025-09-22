package com.codexmaker.config;

import io.github.cdimascio.dotenv.Dotenv;

/**
 * Configuration class to load environment variables from .env file.
 */
public class AppConfig {
    private static Dotenv dotenv;

    static {
        dotenv = Dotenv.load();
    }

    public static String getEnvVariable(String key) {
        return dotenv.get(key);
    }
}