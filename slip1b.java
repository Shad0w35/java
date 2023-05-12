import java.awt.*;
import java.awt.event.*;
import java.sql.*;
import javax.swing.*;

public class EmployeeDetails extends JFrame implements ActionListener {
    JLabel l1, l2, l3, l4;
    JTextField tf1, tf2, tf3, tf4;
    JButton btn1, btn2;
    
    EmployeeDetails() {
        setTitle("Employee Details");
        setSize(400, 300);
        setLocationRelativeTo(null);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        
        l1 = new JLabel("Eno:");
        l2 = new JLabel("EName:");
        l3 = new JLabel("Designation:");
        l4 = new JLabel("Salary:");
        
        tf1 = new JTextField();
        tf2 = new JTextField();
        tf3 = new JTextField();
        tf4 = new JTextField();
        
        btn1 = new JButton("Submit");
        btn2 = new JButton("Reset");
        
        l1.setBounds(30, 30, 100, 20);
        tf1.setBounds(150, 30, 200, 20);
        l2.setBounds(30, 70, 100, 20);
        tf2.setBounds(150, 70, 200, 20);
        l3.setBounds(30, 110, 100, 20);
        tf3.setBounds(150, 110, 200, 20);
        l4.setBounds(30, 150, 100, 20);
        tf4.setBounds(150, 150, 200, 20);
        btn1.setBounds(100, 200, 80, 30);
        btn2.setBounds(200, 200, 80, 30);
        
        add(l1);
        add(tf1);
        add(l2);
        add(tf2);
        add(l3);
        add(tf3);
        add(l4);
        add(tf4);
        add(btn1);
        add(btn2);
        
        btn1.addActionListener(this);
        btn2.addActionListener(this);
        
        setVisible(true);
    }
    
    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == btn1) {
            try {
                Class.forName("org.postgresql.Driver");
                Connection con = DriverManager.getConnection("jdbc:postgresql://localhost:5432/employees", "root", "");
                PreparedStatement stmt = con.prepareStatement("INSERT INTO employee_details(eno, ename, designation, salary) VALUES(?, ?, ?, ?)");
                stmt.setString(1, tf1.getText());
                stmt.setString(2, tf2.getText());
                stmt.setString(3, tf3.getText());
                stmt.setString(4, tf4.getText());
                int result = stmt.executeUpdate();
                if (result > 0) {
                    JOptionPane.showMessageDialog(this, "Employee details added successfully!");
                    tf1.setText("");
                    tf2.setText("");
                    tf3.setText("");
                    tf4.setText("");
                } else {
                    JOptionPane.showMessageDialog(this, "Failed to add employee details.");
                }
                con.close();
            } catch (Exception ex) {
                System.out.println(ex);
            }
        } else if (e.getSource() == btn2) {
            tf1.setText("");
            tf2.setText("");
            tf3.setText("");
            tf4.setText("");
        }
    }
    
    public static void main(String[] args) {
        new EmployeeDetails();
    }
}
