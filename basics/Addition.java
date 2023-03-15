import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

class Addition extends JFrame implements ActionListener{
    JLabel first_num, second_num, result;
    JTextField first, second;
    JButton add;
    public Addition(){
        first_num = new JLabel("First Number");
        first_num.setBounds(50, 50, 100, 30);
        second_num = new JLabel("Second Number");
        second_num.setBounds(50, 100, 100, 30);
        result = new JLabel("Result");
        result.setBounds(50, 150, 100, 30);
        first = new JTextField();
        first.setBounds(200, 50, 100, 30);
        second = new JTextField();
        second.setBounds(200, 100, 100, 30);
        add = new JButton("Add");
        add.setBounds(200, 150, 100, 30);
        // f = new JFrame("Addition");
        // f.add(first_num);
        // f.add(second_num);
        // f.add(result);
        // f.add(add);
        // f.setSize(500, 500);
        // f.setLayout(null);
        // f.setVisible(true);


    }
}


public class Addition {
    
}
