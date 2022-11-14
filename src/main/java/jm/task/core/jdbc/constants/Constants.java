package jm.task.core.jdbc.constants;

public class Constants {
    public static final String URL = "jdbc:mysql://localhost:3306/mydb";
    public static final String URLH = "jdbc:mysql://localhost:3306/mydb?useSSL=false";
    public static final String USERNAME = "user";
    public static final String PASSWORD = "user";
    public static final String DIALECT = "org.hibernate.dialect.MySQL5Dialect";

//    sql

    public static final String CREATE_USER_TABLE = "CREATE TABLE IF NOT EXISTS User " +
            "(id INT not null AUTO_INCREMENT, " +
            " name VARCHAR(16), " +
            " lastName VARCHAR(32), " +
            " age TINYINT," +
            " PRIMARY KEY (id))";

    public static final String DROP_USER_TABLE = "DROP TABLE IF EXISTS User";
    public static final String SAVE_USER = "INSERT INTO USER (Name, LastName, Age) VALUES (?, ?, ?);";
    public static final String REMOVE_USER = "DELETE FROM USERS WHERE id = ?";
    public static final String GET_ALL_USERS = "SELECT * FROM User";
    public static final String CLEAN_USER_TABLE = "TRUNCATE TABLE User";
    public static final String CLEAN_USER_HTABLE = "delete from User";
    public static final String FROM_USER = "FROM User";
}
