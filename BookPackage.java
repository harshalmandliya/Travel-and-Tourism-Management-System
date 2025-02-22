package TourismManagementSystem;
import java.awt.*;
import javax.swing.*;
import java.awt.event.*;
import java.sql.*;
public class BookPackage extends JFrame implements ActionListener{
    Choice cpackage;
    JTextField tfpersons;
    String username;
    JLabel labelusername,labelid,labelnumber,labelphone,labelprice;
    JButton Checkprice,Bookpackage,Back;
    BookPackage(String username){
        this.username=username;
setBounds(350,200,1100,500);
setLayout(null);
getContentPane().setBackground(Color.WHITE);
JLabel text =new JLabel("BOOK PACKAGE");
text.setBounds(100,10,200,30);
text.setFont(new Font("Tahoma",Font.BOLD,20));
add(text);
        JLabel lblusername=new JLabel("Username");
        lblusername.setBounds(40,70,200,20);
        lblusername.setFont(new Font("Tahoma",Font.PLAIN,16));
        add(lblusername);
         labelusername=new JLabel("");
        labelusername.setBounds(250,70,100,20);
        labelusername.setFont(new Font("Tahoma",Font.PLAIN,16));
        add(labelusername);
        JLabel lblpackage=new JLabel("Select Package");
        lblpackage.setBounds(40,110,150,20);
        lblpackage.setFont(new Font("Tahoma",Font.PLAIN,16));
        add(lblpackage);
       cpackage=new Choice();
       cpackage.add("GOLD PACKAGE");
       cpackage.add("SILVER PACKAGE");
       cpackage.add("BRONZE PACKAGE");
       cpackage.setBounds(250,110,200,20);
       add(cpackage);
        JLabel lblpersons=new JLabel("Total Persons");
        lblpersons.setBounds(40,150,150,20);
        lblpersons.setFont(new Font("Tahoma",Font.PLAIN,16));
        add(lblpersons);
       tfpersons=new JTextField("1");
       tfpersons.setBounds(250,150,200,25);
       add(tfpersons);
        JLabel lblid=new JLabel("ID");
        lblid.setBounds(40,190,150,20);
        lblid.setFont(new Font("Tahoma",Font.PLAIN,16));
        add(lblid);
         labelid=new JLabel("");
        labelid.setBounds(250,190,200,25);
        add(labelid);
        JLabel lblnumber=new JLabel("Number");
        lblnumber.setFont(new Font("Tahoma",Font.PLAIN,16));
        lblnumber.setBounds(40,230,150,25);
        add(lblnumber);
         labelnumber=new JLabel("");
        labelnumber.setBounds(250,230,150,25);
        add(labelnumber);
        JLabel lblphone=new JLabel("Phone");
        lblphone.setBounds(40,270,150,20);
        lblphone.setFont(new Font("Tahoma",Font.PLAIN,16));
        add(lblphone);
         labelphone=new JLabel("");
        labelphone.setBounds(250,270,200,25);
        add(labelphone);
        JLabel lbltotal=new JLabel("Total price");
        lbltotal.setFont(new Font("Tahoma",Font.PLAIN,16));
        lbltotal.setBounds(40,310,150,25);
        add(lbltotal);
        labelprice=new JLabel("");
        labelprice.setBounds(250,310,150,25);
        add(labelprice);
        try{
            conn co=new conn();
            String query="select * from customer where username='"+username+"'";
            ResultSet rs =  co.s.executeQuery(query);
            while(rs.next()){
                labelusername.setText(rs.getString("username"));
                labelid.setText(rs.getString("id"));
                labelnumber.setText(rs.getString("number"));
                labelphone.setText(rs.getString("phone"));
            }
        }catch (Exception e){
e.printStackTrace();
        }
        Checkprice=new JButton("Check Price");
        Checkprice.setBackground(Color.black);
        Checkprice.setForeground(Color.WHITE);
        Checkprice.setBounds(60,380,120,25);
        Checkprice.addActionListener(this);
        add(Checkprice);
        Bookpackage=new JButton("Book Package");
        Bookpackage.setBackground(Color.black);
        Bookpackage.setForeground(Color.WHITE);
        Bookpackage.setBounds(200,380,120,25);
        Bookpackage.addActionListener(this);
        add(Bookpackage);
        Back=new JButton("Back");
        Back.setBackground(Color.black);
        Back.setForeground(Color.WHITE);
        Back.setBounds(340,380,120,25);
        Back.addActionListener(this);
        add(Back);
        ImageIcon i1=new ImageIcon(ClassLoader.getSystemResource("icons/bookpackage.jpg"));
        Image i2=i1.getImage().getScaledInstance(500,300,Image.SCALE_DEFAULT);
        ImageIcon i3=new ImageIcon(i2);
        JLabel image=new JLabel(i3);
        image.setBounds(550,50,500,300);
        add(image);
setVisible(true);
    }
    public void actionPerformed(ActionEvent ae){
        if(ae.getSource()==Checkprice){
String pack=cpackage.getSelectedItem();
int cost=0;
if(pack.equals("GOLD PACKAGE")){
cost+=32000;
}
else if(pack.equals("SILVER PACKAGE")){
cost+=24000;
}
else{
cost+=12000;
}
int persons=Integer.parseInt(tfpersons.getText());
cost*=persons;
labelprice.setText("Rs "+cost);
        }
        else if(ae.getSource()==Bookpackage){
try{
conn c=new conn();
c.s.executeUpdate("insert into bookpackage value('"+labelusername.getText()+"','"+cpackage.getSelectedItem()+"','"+tfpersons.getText()+"','"+labelid.getText()+"','"+labelnumber.getText()+"','"+labelphone.getText()+"','"+labelprice.getText()+"')");
JOptionPane.showMessageDialog(null,"Package Booked Successfully");
setVisible(false);
}catch(Exception e){
    e.printStackTrace();
}
        }
        else{
            setVisible(false);
        }
    }
    public static void main(String[] args) {
        new BookPackage("harshal");

    }
}
