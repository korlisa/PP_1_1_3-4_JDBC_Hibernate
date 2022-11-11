package jm.task.core.jdbc.constants;

public class Constants {
    public static final String URL = "jdbc:mysql://localhost:3306/mydb";
    public static final String USERNAME = "user";
    public static final String PASSWORD = "user";

//    sql

    public static final String CREATE_USERS_TABLE = "CREATE TABLE USERS " +
                                                    "(id BIGINT UNSIGNED AUTO_INCREMENT PRIMARY KEY, " +
                                                    " Name VARCHAR(16) not NULL," +
                                                    " LastName VARCHAR(32) not NULL," +
                                                    " Age TINYINT UNSIGNED);";

    public static final String DROP_USERS_TABLE = "DROP TABLE IF EXISTS USERS;";
    public static final String SAVE_USER = "INSERT INTO USERS (Name, LastName, Age) VALUES (?, ?, ?);";
    public static final String REMOVE_USER = "DELETE FROM USERS WHERE id = ?";
    public static final String GET_ALL_USERS = "SELECT * FROM USERS";
    public static final String CLEAN_USERS_TABLE = "TRUNCATE TABLE USERS";
}
