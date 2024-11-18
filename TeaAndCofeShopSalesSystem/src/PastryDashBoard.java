package TeaAndCofeShopSalesSystem.src;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class PastryDashBoard extends JFrame {

    public PastryDashBoard() {
        initComponents();
    }

    private void initComponents() {
        JScrollPane jScrollPane = new JScrollPane();
        JPanel jPanel = new JPanel();
        jPanel.setLayout(new BoxLayout(jPanel, BoxLayout.Y_AXIS));

        JPanel pastry1 = createPastryPanel("Croissant", "50", 0);
        jPanel.add(pastry1);

        JPanel pastry2 = createPastryPanel("Muffin", "40", 1);
        jPanel.add(pastry2);

        JPanel pastry3 = createPastryPanel("Danish", "60", 2);
        jPanel.add(pastry3);

        // dito add more pastries

        jScrollPane.setViewportView(jPanel);
        getContentPane().add(jScrollPane);
        setTitle("Pastry Menu");
        setSize(400, 400);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setVisible(true);
    }

    private JPanel createPastryPanel(String name, String price, int index) {
        JPanel pastryPanel = new JPanel();
        pastryPanel.setLayout(new BoxLayout(pastryPanel, BoxLayout.Y_AXIS));

        JLabel nameLabel = new JLabel("Name: " + name);
        JLabel priceLabel = new JLabel("Price: " + price);
        JLabel quantityLabel = new JLabel("Quantity: ");
        JComboBox<String> quantityComboBox = new JComboBox<>(new String[]{"0", "1", "2", "3", "4", "5"});
        JCheckBox purchaseCheckBox = new JCheckBox("Purchase");

        purchaseCheckBox.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent evt) {
                // Handle purchase action
                if (purchaseCheckBox.isSelected()) {
                    System.out.println(name + " selected for purchase.");
                } else {
                    System.out.println(name + " deselected.");
                }
            }
        });

        pastryPanel.add(nameLabel);
        pastryPanel.add(priceLabel);
        pastryPanel.add(quantityLabel);
        pastryPanel.add(quantityComboBox);
        pastryPanel.add(purchaseCheckBox);

        return pastryPanel;
    }

    public static void main(String[] args) {
        new PastryDashBoard();
    }
}
