package com.example.contactsmgmtappwithsqlite.db.entity;

public class Contact {

    public static final String T_NAME = "contacts";
    public static final String C_ID = "ID";
    public static final String C_NAME = "NAME";
    public static final String C_EMAIL = "EMAIL";

    private String name;
    private String email;
    private int id;

    public Contact(String name, String email, int id) {
        this.name = name;
        this.email = email;
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public static final String T_CREATE =
            "CREATE TABLE "
                    + T_NAME
                    + "(" + C_ID
                    + "INTEGER PRIMARY KEY AUTOINCREMENT, "
                    + ", " + C_NAME
                    + " TEXT" + ", "
                    + C_EMAIL + " DATETIME DEFAULT CURRENT_TIMESTAMP"
                    + ")";


}
