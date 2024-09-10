package gui;

import javax.swing.*;
import java.awt.*;

public class UserForm {

    public static void main(String[] args) {
        JFrame frame = new JFrame("User Form");

        JPanel panel = new JPanel();
        panel.setLayout(new GridLayout(10,2));
        JLabel accountTypeLabel = new JLabel("Account Type *");
        JRadioButton personalAccount = new JRadioButton("Personal Account");
        JRadioButton businessAccount = new JRadioButton("Business Account");
        personalAccount.setSelected(true);
        ButtonGroup accountTypeGroup = new ButtonGroup();
        accountTypeGroup.add(personalAccount);
        accountTypeGroup.add(businessAccount);
        JPanel accountTypePanel = new JPanel();
        accountTypePanel.setLayout(new BoxLayout(accountTypePanel, BoxLayout.X_AXIS));
        accountTypePanel.add(personalAccount);
        accountTypePanel.add(businessAccount);

        // First Name
        JLabel firstNameLabel = new JLabel("First Name *");
        JTextField firstNameField = new JTextField(20);

        // Last Name
        JLabel lastNameLabel = new JLabel("Last Name *");
        JTextField lastNameField = new JTextField(20);

        // Country/Region
        JLabel countryLabel = new JLabel("Country/Region *");
        String[] countries = { "United States", "Canada", "Mexico", "United Kingdom", "Australia" };
        JComboBox<String> countryComboBox = new JComboBox<>(countries);

        // Street Address
        JLabel streetAddressLabel = new JLabel("Street Address *");
        JTextField streetAddressField = new JTextField(20);

        // Street Address 2
        JLabel streetAddress2Label = new JLabel("Street Address 2");
        JTextField streetAddress2Field = new JTextField(20);

        // City
        JLabel cityLabel = new JLabel("City *");
        JTextField cityField = new JTextField(20);

        // State/Province
        JLabel stateLabel = new JLabel("State/Province *");
        String[] states = { "Select State or Province", "California", "New York", "Texas", "Florida", "Illinois" };
        JComboBox<String> stateComboBox = new JComboBox<>(states);

        // ZIP/Postal Code
        JLabel zipLabel = new JLabel("ZIP/Postal Code *");
        JTextField zipField = new JTextField(10);

        // Phone Number
        JLabel phoneLabel = new JLabel("Phone Number *");
        JTextField phoneField = new JTextField(15);

        // Add components to the main panel
        panel.add(accountTypeLabel);
        panel.add(accountTypePanel);
        panel.add(firstNameLabel);
        panel.add(firstNameField);
        panel.add(lastNameLabel);
        panel.add(lastNameField);
        panel.add(countryLabel);
        panel.add(countryComboBox);
        panel.add(streetAddressLabel);
        panel.add(streetAddressField);
        panel.add(streetAddress2Label);
        panel.add(streetAddress2Field);
        panel.add(cityLabel);
        panel.add(cityField);
        panel.add(stateLabel);
        panel.add(stateComboBox);
        panel.add(zipLabel);
        panel.add(zipField);
        panel.add(phoneLabel);
        panel.add(phoneField);
        frame.add(panel);

        frame.setSize(400, 350);
        frame.setVisible(true);
    }
}
