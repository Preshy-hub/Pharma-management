/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package dao;

import java.awt.HeadlessException;
import javax.swing.JOptionPane;
import java.sql.Connection;
import java.sql.Statement;
import java.sql.SQLException;

/**
 *
 * @author nwaob
 */
public class Tables {
    public static void main (String[] args){
        try{
            Connection con;
            con = ConnectionProvider.getCon();
            Statement st = con.createStatement();
         //   st.executeUpdate("create table appuser(appuser_pk int AUTO_INCREMENT primary key, userRole varchar (200),name varchar (200), dob varchar(50), mobileNumber varchar(50), email varchar(200), username varchar(200), password varchar(50), address varchar(200))");
            st.executeUpdate("insert into appuser (userRole,name,dob,mobileNumber,email,username,password,address) values('Admin','Admin','16-12-1992','0000111122','admin@email.com','admin','admin','USA')");
            JOptionPane.showMessageDialog(null, "Table Created Successfully");
        }
        catch(HeadlessException | SQLException e){
            JOptionPane.showMessageDialog(null, e);
        }
    }
}
