/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.finalmente;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.sql.Statement;

/**
 *
 * @author tashima-utfpr
 */
public class Connect {

    static Connection conn;

    public static final Connection connect() {
        if (Connect.conn != null) {
            return Connect.conn;
        } else {
            String url = "jdbc:sqlite:" + System.getProperty("user.dir") + "/database.db";
            try {
                Connection conn = DriverManager.getConnection(url);
                Connect.conn = conn;
                return Connect.conn;
            } catch (SQLException e) {
                System.out.println(e.getMessage());
            }
        }
        return null;
    }
    
        public static void prepare(Connection conn, Boolean dropTables, Boolean migrate) {
        if (dropTables) {
            Connect.dropAllTables(conn);
        }
        
        if (migrate) {
            System.out.println("STARTED MIGRATIONS");
//	    Connect.dropAllTables(conn);
            Connect.migrate(conn);
            System.out.println("FINISHED MIGRATIONS");
        }
    }

    public static void migrate(Connection conn) {
        Connect.migrateClientes(conn);
    }

    private static void dropAllTables(Connection conn) {
        try ( Statement stmt = conn.createStatement()) {
            stmt.execute("DROP TABLE IF EXISTS cliente;");
                 System.out.println("Droped all tables");
        } catch (SQLException e) {
            System.out.println(e.getMessage());
        }
    }

    private static void migrateClientes(Connection conn) {
        String sql = "CREATE TABLE IF NOT EXISTS clientes( cod integer PRIMARY KEY, name text NOT NULL, address text NOT NULL);";
        try ( Statement stmt = conn.createStatement()) {
            stmt.execute(sql);
            System.out.println("Migrated clientes");
        } catch (SQLException e) {
            System.out.println(e.getMessage());
        }
    }
}