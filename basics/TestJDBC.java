import java.sql.*; 
import java.awt.*;
import java.awt.event.ActionListener;
import java.awt.event.*;
import javax.swing.*;

public class TestJDBC extends JFrame implements ActionListener{  
    // create a frame to input data from the dialog box
    JLabel id, name, address;
    JTextField id_field, name_field, address_field;
    JButton submit;
    
    TestJDBC(){
        setTitle("Data Entry for the users");

        setSize(300, 300);
        setLayout(new GridLayout(0,3));

        id = new JLabel("id");
        name = new JLabel("Name");
        address = new JLabel("Address");
        
        id_field = new JTextField(20);
        name_field = new JTextField(20);
        address_field = new JTextField(20);

        submit = new JButton("Save");
        submit.addActionListener(this);

        add(id);
        add(name);
        add(address);
        add(id_field);
        add(name_field);
        add(address_field);
        add(submit);


        setVisible(true);

    }
    public void actionPerformed(ActionEvent e){
    String id = id_field.getText();
       String name = name_field.getText();
       String address = address_field.getText();
       System.out.println(id + name + address);
    }
    public static void main(String args[]){  
        new TestJDBC();
        try{  
            Class.forName("com.mysql.jdbc.Driver");  
            Connection con=DriverManager.getConnection(  
            "jdbc:mysql://localhost:3306/java","root","");  
            //here sonoo is database name, root is username and password  
            Statement stmt=con.createStatement();  
            ResultSet rs=stmt.executeQuery("select * from details");  
            while(rs.next())  
            System.out.println(rs.getInt(1)+"  "+rs.getString(2)+"  "+rs.getString(3));  
            con.close();  
        }
        catch(Exception e){ 
            System.out.println(e);
        }  
    }  
}  