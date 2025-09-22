package com.codexmaker.service.dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.logging.Logger;

import com.codexmaker.config.AppConfig;

/**
 * Manages database connections using environment variables for configuration.
 */
public class DatabaseConnection {
    private static Connection connection;
    private static final Logger LOGGER = Logger.getLogger(DatabaseConnection.class.getName());

    public static Connection getConnection() throws SQLException {
        if (connection == null || connection.isClosed()) {
            try {
                String dbUrl = AppConfig.getEnvVariable("DATABASE_URL");
                String dbUser = AppConfig.getEnvVariable("DATABASE_USER");
                String dbPassword = AppConfig.getEnvVariable("DATABASE_PASSWORD");

                connection = DriverManager.getConnection(dbUrl, dbUser, dbPassword);
            } catch (SQLException e) {
                e.printStackTrace();
                throw e;
            }
        }
        LOGGER.info("success connection to database");
        return connection;
    }

    public static void closeConnection() {
        if (connection != null) {
            try {
                connection.close();
                LOGGER.info("success connection closed");
            } catch (Exception e) {
                e.getStackTrace();
            }
        }
    }
}