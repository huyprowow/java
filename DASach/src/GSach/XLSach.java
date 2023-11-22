package GSach;

import java.sql.*;

public class XLSach {
    public Connection getConnect() throws SQLException{

            String url = "jdbc:mysql://localhost:3306/dlsach";
            String user = "root";
            String pass = "shinigami";
            Connection connect = DriverManager.getConnection(url, user, pass);
            return connect;

    }
    public ResultSet getSA() throws SQLException{
        String sql="Select * from tbSach";
        Statement statement= getConnect().createStatement();
        ResultSet rs=statement.executeQuery(sql);
        return rs;
    }
    public ResultSet delSA(double NamXB) throws SQLException{
        String sql="delete from tbSach where NamXB="+NamXB;
        Statement statement= getConnect().createStatement();
        ResultSet rs=statement.executeQuery(sql);
        return rs;
    }
}
