package sample;

import java.sql.Connection;
import java.sql.SQLException;
import java.sql.Statement;

public class Database {
    private Connection connection;

    public void createListUser() {
        try {
            String sql = "CREATE TABLE IF NOT EXISTS USER (\n"
                    + "	phone integer PRIMARY KEY,\n"
                    + "	Fnavn TEXT NOT NULL,\n"
                    + "	Lname TEXT NOT NULL,\n"
                    + "	adresse TEXT NOT NULL,\n"
                    + "	Email TEXT NOT NULL,\n"
                    + "	mobil TEXT NOT NULL,\n"
                    + "	kontoNr TEXT NOT NULL, \n"
                    + "	kontrolCifre TEXT NOT NULL, \n"
                    + "	expirationDate_M TEXT NOT NULL, \n"
                    + "	expirationDate_y TEXT NOT NULL, \n"
                    + "	userName TEXT NOT NULL, \n"
                    + "	kode TEXT NOT NULL, \n"
                    + ");";
            Statement stmt = connection.createStatement();
            stmt.execute(sql);
            System.out.println("Connection to SQLite has been established.");
            stmt.close();

        } catch (SQLException throwables) {
            throwables.printStackTrace();
        }
    }

    private void addNewUser() {

    }
}