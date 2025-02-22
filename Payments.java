package TourismManagementSystem;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
public class Payments extends JFrame implements ActionListener {
    JButton Back,Pay;
    Payments(){
        setBounds(500,200,800,600);
        setLayout(null);
        ImageIcon i1=new ImageIcon(ClassLoader.getSystemResource("icons/paytm.jpeg"));
        Image i2=i1.getImage().getScaledInstance(800,600,Image.SCALE_DEFAULT);
        ImageIcon i3=new ImageIcon(i2);
        JLabel image=new JLabel(i3);
        image.setBounds(0,0,800,600);
        add(image);
        Pay=new JButton("Pay");
        Pay.setBounds(420,0,80,40);
        Pay.addActionListener(this);
        image.add(Pay);
        Back=new JButton("Back");
        Back.setBounds(520,0,80,40);
        Back.addActionListener(this);
       image.add(Back);

        setVisible(true);
    }
    public void actionPerformed(ActionEvent ae){
        if(ae.getSource()==Pay){
setVisible(false);
new Paytm();
        }
        else{
            setVisible(false);
        }
    }
    public static void main(String[] args) {
   new Payments();
    }
}
