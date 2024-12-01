/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
import javax.swing.*;
import javax.swing.table.DefaultTableModel;
import java.sql.*;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

/**
 *
 * @author Marianne
 */
public class allmenu extends JFrame{
    private JTable jTable;
    private DefaultTableModel tableModel;

    public allmenu() {
     
        initComponents();
        fetchData();
    }
    private void initComponents() {
        // Initialize JTable and DefaultTableModel
        tableModel = new DefaultTableModel(new Object[]{"Product Name", "Product Price", "Product Quantity"}, 0);
        jTable = new JTable(tableModel);
        JScrollPane scrollPane = new JScrollPane(jTable);

        // Add the JScrollPane to the JFrame
        this.add(scrollPane);
        this.setSize(600, 400);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setVisible(true);
    }
    private void fetchData() {
        String url = "jdbc:mysql://localhost:3306/oop";
        String user = "root";
        String password = "";

        Connection connection = null;
        Statement stmt = null;
        ResultSet rs = null;
        
         try {
            // Load MySQL driver
            Class.forName("com.mysql.cj.jdbc.Driver");

            // Establish the database connection
            connection = DriverManager.getConnection(url, user, password);

            // Create a Statement
            stmt = connection.createStatement();

            // Execute query
            String query = "SELECT * FROM allmenu";
            rs = stmt.executeQuery(query);

            // Process the result set and add to the table model
            while (rs.next()) {
                //String id = String.valueOf(rs.getInt("CoffeeID"));
                String name = rs.getString("DrinkName");
                String price = rs.getString("DrinkPrice");
                String quantity = rs.getString("Quantity");
                String size = rs.getString("DrinkSize");
                double total = rs.getDouble("Total");

                tableModel.addRow(new Object[]{ name, price, quantity,size, total});
            }
        } catch (ClassNotFoundException e) {
            JOptionPane.showMessageDialog(this, "Database Driver not found!", "Error", JOptionPane.ERROR_MESSAGE);
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(this, "Database connection failed!", "Error", JOptionPane.ERROR_MESSAGE);
        } finally {
            // Close resources
            try {
                if (rs != null) rs.close();
                if (stmt != null) stmt.close();
                if (connection != null) connection.close();
            } catch (SQLException e) {
                System.err.println("Failed to close resources: " + e.getMessage());
            }
        }
    }

    public static void main(String[] args) {
        new DrinksDashBoard();
    }


}
