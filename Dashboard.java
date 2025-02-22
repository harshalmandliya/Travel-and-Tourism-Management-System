package TourismManagementSystem;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class Dashboard extends JFrame implements ActionListener {
    String username;
    JButton addPersonalDetail,viewPersonalDetail,updatePersonalDetail,checkpakages,bookpakages,viewpakage,viewhotels,destinations,bookhotels,viewbookedhotels,payments,calculator,notepad,about, deletePersonalDetail;
    Dashboard(String username){
        this.username=username;
        //setBounds(0,0,1600,1000);
        setExtendedState(JFrame.MAXIMIZED_BOTH);
        setLayout(null);
        JPanel p1=new JPanel();
        p1.setLayout(null);
        p1.setBackground(new Color(0,0,102));
        p1.setBounds(0,0,1600,65);
        add(p1);
        ImageIcon i1=new ImageIcon(ClassLoader.getSystemResource("icons/dashboard.png"));
        Image i2=i1.getImage().getScaledInstance(70,70,Image.SCALE_DEFAULT);
        ImageIcon i3=new ImageIcon(i2);
        JLabel icon=new JLabel(i3);
        icon.setBounds(5,0,70,70);
        p1.add(icon);
        JLabel heading=new JLabel("Dashboard");
        heading.setBounds(80,10,300,40);
        heading.setForeground(Color.WHITE);
        heading.setFont(new Font("Tahoma",Font.PLAIN,30));
        p1.add(heading);
        JPanel p2=new JPanel();
        p2.setLayout(null);
        p2.setBackground(new Color(0,0,102));
        p2.setBounds(0,65,300,900);
        add(p2);
 addPersonalDetail=new JButton("Add Personal Details");
addPersonalDetail.setBounds(0,0,300,50);
addPersonalDetail.setBackground(new Color(0,0,102));
addPersonalDetail.setForeground(Color.WHITE);
addPersonalDetail.setFont(new Font("Tahoma",Font.PLAIN,20));
addPersonalDetail.setMargin(new Insets(0,0,0,60));
addPersonalDetail.addActionListener(this);
p2.add(addPersonalDetail);
         updatePersonalDetail=new JButton("Update Personal Details");
        updatePersonalDetail.setBounds(0,50,300,50);
        updatePersonalDetail.setBackground(new Color(0,0,102));
        updatePersonalDetail.setForeground(Color.WHITE);
        updatePersonalDetail.setFont(new Font("Tahoma",Font.PLAIN,20));
        updatePersonalDetail.setMargin(new Insets(0,0,0,30));
        updatePersonalDetail.addActionListener(this);
        p2.add(updatePersonalDetail);
        viewPersonalDetail=new JButton("View Details");
        viewPersonalDetail.setBounds(0,100,300,50);
        viewPersonalDetail.setBackground(new Color(0,0,102));
        viewPersonalDetail.setForeground(Color.WHITE);
        viewPersonalDetail.setFont(new Font("Tahoma",Font.PLAIN,20));
        viewPersonalDetail.setMargin(new Insets(0,0,0,130));
        viewPersonalDetail.addActionListener(this);
        p2.add(viewPersonalDetail);
        deletePersonalDetail=new JButton("Delete Personal Details");
        deletePersonalDetail.setBounds(0,150,300,50);
        deletePersonalDetail.setBackground(new Color(0,0,102));
        deletePersonalDetail.setForeground(Color.WHITE);
        deletePersonalDetail.setFont(new Font("Tahoma",Font.PLAIN,20));
        deletePersonalDetail.setMargin(new Insets(0,0,0,40));
        deletePersonalDetail.addActionListener(this);
        p2.add(deletePersonalDetail);
         checkpakages=new JButton("Check Pakages");
        checkpakages.setBounds(0,200,300,50);
        checkpakages.setBackground(new Color(0,0,102));
        checkpakages.setForeground(Color.WHITE);
        checkpakages.setFont(new Font("Tahoma",Font.PLAIN,20));
        checkpakages.setMargin(new Insets(0,0,0,110));
        checkpakages.addActionListener(this);
        p2.add(checkpakages);
         bookpakages=new JButton("Book Pakage");
        bookpakages.setBounds(0,250,300,50);
        bookpakages.setBackground(new Color(0,0,102));
        bookpakages.setForeground(Color.WHITE);
        bookpakages.setFont(new Font("Tahoma",Font.PLAIN,20));
        bookpakages.setMargin(new Insets(0,0,0,120));
        bookpakages.addActionListener(this);
        p2.add(bookpakages);
        viewpakage=new JButton("View Pakage");
        viewpakage.setBounds(0,300,300,50);
        viewpakage.setBackground(new Color(0,0,102));
        viewpakage.setForeground(Color.WHITE);
        viewpakage.setFont(new Font("Tahoma",Font.PLAIN,20));
        viewpakage.setMargin(new Insets(0,0,0,120));
        viewpakage.addActionListener(this);
        p2.add(viewpakage);
         viewhotels=new JButton("View Hotels");
        viewhotels.setBounds(0,350,300,50);
        viewhotels.setBackground(new Color(0,0,102));
        viewhotels.setForeground(Color.WHITE);
        viewhotels.setFont(new Font("Tahoma",Font.PLAIN,20));
        viewhotels.setMargin(new Insets(0,0,0,130));
        viewhotels.addActionListener(this);
        p2.add(viewhotels);
         bookhotels=new JButton("Book Hotels");
        bookhotels.setBounds(0,400,300,50);
        bookhotels.setBackground(new Color(0,0,102));
        bookhotels.setForeground(Color.WHITE);
        bookhotels.setFont(new Font("Tahoma",Font.PLAIN,20));
        bookhotels.setMargin(new Insets(0,0,0,140));
        bookhotels.addActionListener(this);
        p2.add(bookhotels);
        viewbookedhotels=new JButton("View Booked Hotels");
        viewbookedhotels.setBounds(0,450,300,50);
        viewbookedhotels.setBackground(new Color(0,0,102));
        viewbookedhotels.setForeground(Color.WHITE);
        viewbookedhotels.setFont(new Font("Tahoma",Font.PLAIN,20));
        viewbookedhotels.setMargin(new Insets(0,0,0,70));
        viewbookedhotels.addActionListener(this);
        p2.add(viewbookedhotels);
         destinations=new JButton("Destinations");
        destinations.setBounds(0,500,300,50);
        destinations.setBackground(new Color(0,0,102));
        destinations.setForeground(Color.WHITE);
        destinations.setFont(new Font("Tahoma",Font.PLAIN,20));
        destinations.setMargin(new Insets(0,0,0,140));
        destinations.addActionListener(this);
        p2.add(destinations);
         payments=new JButton("Payments");
        payments.setBounds(0,550,300,50);
        payments.setBackground(new Color(0,0,102));
        payments.setForeground(Color.WHITE);
        payments.setFont(new Font("Tahoma",Font.PLAIN,20));
        payments.setMargin(new Insets(0,0,0,155));
        payments.addActionListener(this);
        p2.add(payments);
        calculator=new JButton("Calculator");
        calculator.setBounds(0,600,300,50);
        calculator.setBackground(new Color(0,0,102));
        calculator.setForeground(Color.WHITE);
        calculator.setFont(new Font("Tahoma",Font.PLAIN,20));
        calculator.setMargin(new Insets(0,0,0,145));
        calculator.addActionListener(this);
        p2.add(calculator);
         notepad=new JButton("Notepad");
        notepad.setBounds(0,650,300,50);
        notepad.setBackground(new Color(0,0,102));
        notepad.setForeground(Color.WHITE);
        notepad.setFont(new Font("Tahoma",Font.PLAIN,20));
        notepad.setMargin(new Insets(0,0,0,155));
        notepad.addActionListener(this);
        p2.add(notepad);
         about=new JButton("About");
        about.setBounds(0,700,300,50);
        about.setBackground(new Color(0,0,102));
        about.setForeground(Color.WHITE);
        about.setFont(new Font("Tahoma",Font.PLAIN,20));
        about.setMargin(new Insets(0,0,0,175));
        about.addActionListener(this);
        p2.add(about);
        ImageIcon i4=new ImageIcon(ClassLoader.getSystemResource("icons/home.jpg"));
        Image i5=i4.getImage().getScaledInstance(1650,1000,Image.SCALE_DEFAULT);
        ImageIcon i6=new ImageIcon(i5);
        JLabel image=new JLabel(i6);
        image.setBounds(0,0,1650,1000);
        add(image);
        JLabel text=new JLabel("Tourism Management System");
        text.setBounds(400,70,1200,70);
        text.setForeground(Color.WHITE);
        text.setFont(new Font("Railway",Font.PLAIN,55));
        image.add(text);
        setVisible(true);
    }
    public void actionPerformed (ActionEvent ae){
        if(ae.getSource()==addPersonalDetail){
            new AddCustomer(username);
        }else if (ae.getSource()==viewPersonalDetail){
            new viewdetails(username);
        }else if(ae.getSource()==updatePersonalDetail){
            new updateCustomer(username);
        }else if(ae.getSource()==checkpakages){
            new checkPakages();
        }else if(ae.getSource()==bookpakages){
            new BookPackage(username);
        }else if(ae.getSource()==viewpakage){
            new ViewPackage(username);
        }
        else if(ae.getSource()==viewhotels){
            new CheckHotels();
        } else if(ae.getSource()==destinations){
new Destinations();
        }else if(ae.getSource()==bookhotels){
            new BookHotel(username);
        }else if(ae.getSource()==viewbookedhotels){
            new ViewBookedHotel(username);
        }
        else if(ae.getSource()==payments){
            new Payments();
        } else if (ae.getSource()==calculator) {
            try{
Runtime.getRuntime().exec("calc.exe");
            }catch (Exception e){
                e.printStackTrace();
            }
        } else if (ae.getSource()==notepad) {
            try{
                Runtime.getRuntime().exec("notepad.exe");
            }catch (Exception e){
                e.printStackTrace();
            }

        }
        else if(ae.getSource()==about){
            new About();
        }else if(ae.getSource()== deletePersonalDetail){
            new  DeleteDetails(username);
        }
    }
    public static void main(String[] args) {
        new Dashboard("");
    }
}
