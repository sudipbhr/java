import javax.swing.*;
import java.awt.*;
public class RegisterForm {
    JFrame frame;
    JLabel label1, label2, label3, label4, label5, label6, label7, label8, label9, label10;
    JTextField fname, lname, email, phone, address;
    JTextArea description;
    JCheckBox terms;
    JRadioButton male, female, other;
    JComboBox countrylist;
    JSlider age;
    JPasswordField password, password2;
    JButton submit, reset;
    JMenu menu, submenu;
    JMenuItem i1, i2, i3, i4, i5;

    RegisterForm(){
        // menu bar and items
        JMenuBar mb = new JMenuBar();
        menu = new JMenu("Menu");
        submenu = new JMenu("Sub Menu");
        i1 = new JMenuItem("Item 1");
        i2 = new JMenuItem("Item 2");
        i3 = new JMenuItem("Item 3");
        i4 = new JMenuItem("Item 4");
        i5 = new JMenuItem("Item 5");
        i5.setEnabled(false);
        submenu.add(i1);
        submenu.add(i2);
        submenu.add(i3);
        submenu.add(i4);
        menu.add(i5);
        menu.add(submenu);
        mb.add(menu);
        
        frame = new JFrame("Registration Form");        
        label1 = new JLabel("First Name");
        fname = new JTextField();
        label2 = new JLabel("Last Name");
        lname = new JTextField();
        label3 = new JLabel("Email");
        email = new JTextField();
        label4 = new JLabel("Phone");
        phone = new JTextField();
        label5 = new JLabel("Address");
        address = new JTextField();
        label6 = new JLabel("Password");
        password = new JPasswordField();
        label7 = new JLabel("Confirm Password");
        password2 = new JPasswordField();
        password2.setToolTipText("Enter the same password as above");
        label8 = new JLabel("Description");
        description = new JTextArea();
        JScrollPane scroll = new JScrollPane(description);
        // country list
        label10 = new JLabel("Country");
        String[] country = {"Nepal", "India", "China", "USA", "UK", "Canada", "Russia", "Japan", "South Korea", "Australia"};
        countrylist = new JComboBox(country);
        male = new JRadioButton("Male");
        female = new JRadioButton("Female");
        other = new JRadioButton("Other");
        label9 = new JLabel("Age");
        age = new JSlider(0,100,18);
        terms = new JCheckBox("I agree to the terms and conditions");

        submit = new JButton("Submit");
        reset = new JButton("Reset");
        frame.add(label1);
        frame.add(fname);
        frame.add(label2);
        frame.add(lname);
        frame.add(label3);
        frame.add(email);
        frame.add(label4);
        frame.add(phone);
        frame.add(label5);
        frame.add(address);
        frame.add(label6);
        frame.add(password);
        frame.add(label7);
        frame.add(password2);
        frame.add(label8);
        frame.add(scroll); // the text area is made scrollable
        frame.add(countrylist);
        // button group 
        ButtonGroup bg = new ButtonGroup();
        frame.add(male);
        frame.add(female);
        frame.add(other);
        bg.add(male);
        bg.add(female);
        bg.add(other);
        // endof button groups
        frame.add(label9);
        frame.add(age);
        frame.add(label10);
        frame.add(terms);
        frame.add(submit);
        frame.add(reset);
        //add menu bar
        frame.setJMenuBar(mb);
        // set bounds to all the fields so that label and text field are aligned
        label1.setBounds(50,50,100,30);
        fname.setBounds(180,50,200,30);
        label2.setBounds(50,100,100,30);
        lname.setBounds(180,100,200,30);
        label3.setBounds(50,150,100,30);
        email.setBounds(180,150,200,30);
        label4.setBounds(50,200,100,30);
        phone.setBounds(180,200,200,30);
        label5.setBounds(50,250,100,30);
        address.setBounds(180,250,200,30);
        label6.setBounds(50,300,100,30);
        password.setBounds(180,300,200,30);
        label7.setBounds(50,350,200,30);
        password2.setBounds(180,350,200,30);
        label8.setBounds(50,400,100,30);
        scroll.setBounds(180,400,200,100);
        
        label9.setBounds(50,500,100,30);
        age.setBounds(180,500,200,30);
        label10.setBounds(50,550, 100, 30);
        countrylist.setBounds(180, 550, 100, 30);
        terms.setBounds(50,600,300,30);
        submit.setBounds(50,650,100,30);
        reset.setBounds(200,650,100,30);


        frame.setLayout(null);
        frame.setSize(1000,1000);
        frame.setVisible(true);
    }
    public static void main(String[] args){
        new RegisterForm();
    }
}
