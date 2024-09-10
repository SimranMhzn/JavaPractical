package gui;

import javax.swing.*;
import java.awt.*;

public class TestForm {

    public static void main(String[] args) {
        JFrame frame = new JFrame("User Form");

        JPanel panel = new JPanel(new GridBagLayout());
        GridBagConstraints gbc = new GridBagConstraints();
        gbc.insets = new Insets(5, 5, 5, 5); // Padding between components
        gbc.anchor = GridBagConstraints.WEST; // Align labels and fields to the left

        JLabel accountLabel = new JLabel("Account Type *");
        JRadioButton pAcc= new JRadioButton("Personal Account");
        JRadioButton bAcc = new JRadioButton("Business Account");
        pAcc.setSelected(true);
        ButtonGroup accountGroup = new ButtonGroup();
        accountGroup.add(pAcc);
        accountGroup.add(bAcc);
        JPanel accountPanel = new JPanel(new FlowLayout(FlowLayout.LEFT, 0, 0));
        accountPanel.add(pAcc);
        accountPanel.add(bAcc);

        gbc.gridx = 0;
        gbc.gridy = 0;
        panel.add(accountLabel, gbc);
        gbc.gridx = 1;
        panel.add(accountPanel, gbc);

        JLabel firstNameLabel = new JLabel("First Name *");
        JTextField firstNameField = new JTextField(20);
        gbc.gridx = 0;
        gbc.gridy = 1;
        panel.add(firstNameLabel, gbc);
        gbc.gridx = 1;
        panel.add(firstNameField, gbc);

        JLabel lastNameLabel = new JLabel("Last Name *");
        JTextField lastNameField = new JTextField(20);
        gbc.gridx = 0;
        gbc.gridy = 2;
        panel.add(lastNameLabel, gbc);
        gbc.gridx = 1;
        panel.add(lastNameField, gbc);

        JLabel countryLabel = new JLabel("Country/Region *");
        String[] countries = {"United States", "Canada", "Mexico", "United Kingdom", "Australia"};
        JComboBox<String> countryComboBox = new JComboBox<>(countries);
        gbc.gridx = 0;
        gbc.gridy = 3;
        panel.add(countryLabel, gbc);
        gbc.gridx = 1;
        panel.add(countryComboBox, gbc);

        JLabel streetAddressLabel = new JLabel("Street Address *");
        JTextField streetAddressField = new JTextField(20);
        gbc.gridx = 0;
        gbc.gridy = 4;
        panel.add(streetAddressLabel, gbc);
        gbc.gridx = 1;
        panel.add(streetAddressField, gbc);

        JLabel streetAddress2Label = new JLabel("Street Address 2");
        JTextField streetAddress2Field = new JTextField(20);
        gbc.gridx = 0;
        gbc.gridy = 5;
        panel.add(streetAddress2Label, gbc);
        gbc.gridx = 1;
        panel.add(streetAddress2Field, gbc);

        JLabel cityLabel = new JLabel("City *");
        JTextField cityField = new JTextField(20);
        gbc.gridx = 0;
        gbc.gridy = 6;
        panel.add(cityLabel, gbc);
        gbc.gridx = 1;
        panel.add(cityField, gbc);

        JLabel stateLabel = new JLabel("State/Province *");
        String[] states = {"Select State or Province", "California", "New York", "Texas", "Florida", "Illinois"};
        JComboBox<String> stateComboBox = new JComboBox<>(states);
        gbc.gridx = 0;
        gbc.gridy = 7;
        panel.add(stateLabel, gbc);
        gbc.gridx = 1;
        panel.add(stateComboBox, gbc);

        JLabel zipLabel = new JLabel("ZIP/Postal Code *");
        JTextField zipField = new JTextField(10);
        gbc.gridx = 0;
        gbc.gridy = 8;
        panel.add(zipLabel, gbc);
        gbc.gridx = 1;
        panel.add(zipField, gbc);

        JLabel phoneLabel = new JLabel("Phone Number *");
        JTextField phoneField = new JTextField(15);
        gbc.gridx = 0;
        gbc.gridy = 9;
        panel.add(phoneLabel, gbc);
        gbc.gridx = 1;
        panel.add(phoneField, gbc);

        frame.add(panel);

        frame.setSize(600, 600);
        frame.setVisible(true);
    }
}

