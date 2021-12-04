package com.parkhuiwo0.designpatterns.gofdesignpatterns.structure.bridge.example;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class JdbcExample {

    public static void main(String[] args) throws ClassNotFoundException {
        /**
         * 구체적인 것은 Driver에 해당한다.
         * 새로운 DB를 만들어도 Jdbc 코드를 바꿀 필요는 없다.
         */
        Class.forName("org.h2.Driver");

        /**
         * Bridge에서 추상화에 해당한다. (DriverManager, Statement, ResultSet)
         */
        try (Connection conn = DriverManager.getConnection ("jdbc:h2:mem:~/test", "sa","")) {

            String sql =  "CREATE TABLE  ACCOUNT " +
                    "(id INTEGER not NULL, " +
                    " email VARCHAR(255), " +
                    " password VARCHAR(255), " +
                    " PRIMARY KEY ( id ))";

            Statement statement = conn.createStatement();
            statement.execute(sql);

//            PreparedStatement statement1 = conn.prepareStatement(sql);
//            ResultSet resultSet = statement.executeQuery(sql);
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }
}
