package udp;
import com.mysql.jdbc.Driver;

import java.io.IOException;
import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;
import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.ServerSocket;
import java.net.Socket;
import java.sql.*;
import java.sql.SQLException;
import java.util.Properties;

public class textTheard implements Runnable{
    public static void main(String[] args) throws IOException, SQLException, ClassNotFoundException, NoSuchMethodException, InvocationTargetException, InstantiationException, IllegalAccessException {
//        textTheard textTheard1 = new textTheard();
//        Thread thread = new Thread(textTheard1);
////        thread.start();
//        ServerSocket serverSocket = new ServerSocket(444);
//        Socket accept = serverSocket.accept();
//        Socket socket = new Socket("",33);
//        socket.getOutputStream().write("Hello World".getBytes());
        Class<?> aClass = Class.forName("com.mysql.jdbc.Driver");
        Constructor<?> constructor = aClass.getConstructor();
        Driver driver=(Driver) constructor.newInstance();
//        Driver driver = new Driver();
//        DriverManager.registerDriver(driver);
//        DriverManager.

        String url="jdbc:mysql://localhost:3306/atguigudb";
        Properties properties = new Properties();
        properties.setProperty("user","root");
        properties.setProperty("password","365234378893");
        Connection connect = driver.connect(url, properties);
        String sql="insert into employees values() ";
        Statement statement = connect.createStatement();
        int row= statement.executeUpdate(sql);
        if (row>0) System.out.println("succes");
        statement.close();
        connect.close();
    }
    public void run(){
        System.out.println("hello world");
    }
}
