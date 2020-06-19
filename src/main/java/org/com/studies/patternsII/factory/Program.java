package org.com.studies.patternsII.factory;

import java.sql.*;

public class Program {

    public static void main(String args[]) throws SQLException {
        Statement st = null;
        ResultSet rs = null;
        Connection conexao = new ConnectionFactory().getConnection();

        st = conexao.createStatement();
        rs = st.executeQuery("select * from department");
        while (rs.next()){
            System.out.println(rs.getInt("Id") + " - "  + rs.getString("Name"));
        }

    }
}
