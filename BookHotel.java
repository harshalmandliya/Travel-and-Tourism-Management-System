package TourismManagementSystem;
import java.awt.*;
import javax.swing.*;
import java.awt.event.*;
import java.sql.*;
public class BookHotel extends JFrame implements ActionListener{
    Choice chotel,cac,cfood;
    JTextField tfpersons,tfdays,tfac;
    String username;
    JLabel labelusername,labelid,labelnumber,labelphone,labelprice;
    JButton Checkprice,Bookpackage,Back;
    BookHotel(String username){
        this.username=username;
        setBounds(350,200,1100,600);
        setLayout(null);
        getContentPane().setBackground(Color.WHITE);
        JLabel text =new JLabel("BOOK HOTEL");
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
        JLabel lblhotel=new JLabel("Select Hotel");
        lblhotel.setBounds(40,110,150,20);
        lblhotel.setFont(new Font("Tahoma",Font.PLAIN,16));
        add(lblhotel);
        chotel=new Choice();
        chotel.setBounds(250,110,200,20);
        add(chotel);
        try{
            conn c=new conn();
            ResultSet rs=c.s.executeQuery("select * from hotelone");
            while(rs.next()){
                chotel.add(rs.getString("name"));
            }
        }catch (Exception e){
            e.printStackTrace();
        }
        JLabel lblpersons=new JLabel("Total Persons");
        lblpersons.setBounds(40,150,150,20);
        lblpersons.setFont(new Font("Tahoma",Font.PLAIN,16));
        add(lblpersons);
        tfpersons=new JTextField("1");
        tfpersons.setBounds(250,150,200,25);
        add(tfpersons);
        JLabel lbldays=new JLabel("Number of Days");
        lbldays.setBounds(40,190,150,20);
        lbldays.setFont(new Font("Tahoma",Font.PLAIN,16));
        add(lbldays);
        tfdays=new JTextField("1");
        tfdays.setBounds(250,190,200,25);
        add(tfdays);
        JLabel lblac=new JLabel("AC / Non AC");
        lblac.setBounds(40,230,150,20);
        lblac.setFont(new Font("Tahoma",Font.PLAIN,16));
        add(lblac);
        cac=new Choice();
        cac.add("AC");
        cac.add("NON-AC");
        cac.setBounds(250,230,200,25);
        add(cac);
        JLabel lblfood=new JLabel("Food Included");
        lblfood.setBounds(40,270,150,20);
        lblfood.setFont(new Font("Tahoma",Font.PLAIN,16));
        add(lblfood);
        cfood=new Choice();
        cfood.add("YES");
        cfood.add("NO");
        cfood.setBounds(250,270,200,25);
        add(cfood);
        JLabel lblid=new JLabel("ID");
        lblid.setBounds(40,310,150,20);
        lblid.setFont(new Font("Tahoma",Font.PLAIN,16));
        add(lblid);
        labelid=new JLabel("");
        labelid.setBounds(250,310,200,25);
        add(labelid);
        JLabel lblnumber=new JLabel("Number");
        lblnumber.setFont(new Font("Tahoma",Font.PLAIN,16));
        lblnumber.setBounds(40,350,150,25);
        add(lblnumber);
        labelnumber=new JLabel("");
        labelnumber.setBounds(250,350,150,25);
        add(labelnumber);
        JLabel lblphone=new JLabel("Phone");
        lblphone.setBounds(40,390,150,20);
        lblphone.setFont(new Font("Tahoma",Font.PLAIN,16));
        add(lblphone);
        labelphone=new JLabel("");
        labelphone.setBounds(250,390,200,25);
        add(labelphone);
        JLabel lbltotal=new JLabel("Total price");
        lbltotal.setFont(new Font("Tahoma",Font.PLAIN,16));
        lbltotal.setBounds(40,430,150,25);
        add(lbltotal);
        labelprice=new JLabel("");
        labelprice.setBounds(250,430,150,25);
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
        Checkprice.setBounds(60,490,120,25);
        Checkprice.addActionListener(this);
        add(Checkprice);
        Bookpackage=new JButton("Book Hotel");
        Bookpackage.setBackground(Color.black);
        Bookpackage.setForeground(Color.WHITE);
        Bookpackage.setBounds(200,490,120,25);
        Bookpackage.addActionListener(this);
        add(Bookpackage);
        Back=new JButton("Back");
        Back.setBackground(Color.black);
        Back.setForeground(Color.WHITE);
        Back.setBounds(340,490,120,25);
        Back.addActionListener(this);
        add(Back);
        ImageIcon i1=new ImageIcon(ClassLoader.getSystemResource("icons/book.jpg"));
        Image i2=i1.getImage().getScaledInstance(600,300,Image.SCALE_DEFAULT);
        ImageIcon i3=new ImageIcon(i2);
        JLabel image=new JLabel(i3);
        image.setBounds(500,50,600,300);
        add(image);
        setVisible(true);
    }
    public void actionPerformed(ActionEvent ae){
        if(ae.getSource()==Checkprice){
            try {
                conn c = new conn();
                ResultSet rs = c.s.executeQuery("select * from hotelone where name='" + chotel.getSelectedItem() + "'");
               while(rs.next()){
                   int cost=Integer.parseInt(rs.getString("costperperson"));
                   int food=Integer.parseInt(rs.getString("foodincluded"));
                   int ac=Integer.parseInt(rs.getString("acroom"));
                   int persons=Integer.parseInt(tfpersons.getText());
                   int days=Integer.parseInt(tfdays.getText());
                   String acselected=cac.getSelectedItem();
                   String foodselected=cfood.getSelectedItem();
                   if(persons*days>0){
                       int total=0;
                       total+=acselected.equals("AC") ? ac : 0;
                       total+=foodselected.equals("YES") ? food : 0;
                       total+=cost;
                       total=persons*total*days;
                       labelprice.setText("Rs"+total);
                   }
                   else{
                       JOptionPane.showMessageDialog(null,"Please inter a valid number");
                   }

               }

            }catch (Exception e){
                e.printStackTrace();
            }
        }
        else if(ae.getSource()==Bookpackage){
            try{
                conn c=new conn();
                c.s.executeUpdate("insert into bookhotel value('"+labelusername.getText()+"','"+chotel.getSelectedItem()+"','"+tfpersons.getText()+"', '"+tfdays.getText()+"' , '"+cac.getSelectedItem()+"' , '"+cfood.getSelectedItem()+"' ,'"+labelid.getText()+"','"+labelnumber.getText()+"','"+labelphone.getText()+"','"+labelprice.getText()+"')");
                JOptionPane.showMessageDialog(null,"Hotel Booked Successfully");
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
        new BookHotel("harshal");

    }
}

