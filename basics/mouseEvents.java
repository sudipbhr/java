import java.awt.*;
import java.awt.event.*;
class mEvents extends Frame implements MouseListener{
    Label l;
    mEvents(){
        l = new Label();
        l.setBounds(20, 50, 100, 20);
        addMouseListener(this);
        add(l);
        setSize(300, 300);
        setLayout(null);
        setVisible(true);
    }
    public void mouseClicked(MouseEvent e){
        l.setText("Mouse Clicked");
    }
    public static void main(String[] args){
        new mEvents();
    }
}
