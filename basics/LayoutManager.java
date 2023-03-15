import javax.swing.*;
public class LayoutManager{
    JFrame frameObj;
    LayoutManager(){
        frameObj = new JFrame();
        JLabel lable = new JLabel("Hell0");
        lable.setBounds(100, 200, 100, 200);
        JTextField textField = new JTextField(20);
        textField.setBounds(100, 200, 100, 200);
        JTextArea textArea = new JTextArea(5, 20);
        JPasswordField passwordField = new JPasswordField(10);
        frameObj.add(lable);
        frameObj.add(textField);
        frameObj.add(textArea);
        frameObj.add(passwordField);
        frameObj.setSize(400, 400);
        frameObj.setVisible(true);
    }

    public static void main(String[] args){
        new LayoutManager();
    }



}