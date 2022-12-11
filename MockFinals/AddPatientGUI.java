package MockFinals;

//AddPatientGUI.java
/*This program uses box-layout and gridbag-layout managers in combination with a
number of panels to create a GUI designed to take in patient details*/

import javax.swing.*;
import javax.swing.event.ListSelectionEvent;
import javax.swing.event.ListSelectionListener;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;

public class AddPatientGUI extends JFrame implements ActionListener, ListSelectionListener {

    private Insets normalInsets = new Insets(10, 10, 0, 10);
    private Insets topInsets = new Insets(30, 10, 0, 10);

    private Patient patient; //You can uncomment this when you have written the Patient class
    private ArrayList<Patient> allPatients; //You can uncomment this when you have written the Patient class

    private JTextField fnameField,lnameField, addressField, PPSNField, mobileField,
            bloodTypeField;

    private JList<String> allergyList;
    private DefaultListModel<String> listModel;
    private ArrayList<String> selectedValuesList;


    //You can uncomment this method when you have written the Patient class

    public AddPatientGUI(ArrayList<Patient> allPatients)  {

        super("Add Patient Details");

        JPanel panel = new JPanel();
        panel.setLayout(new BoxLayout(panel, BoxLayout.Y_AXIS));

        panel.add(createTitlePanel());
        panel.add(createDetailsPanel());
        panel.add(Box.createVerticalStrut(40));
        panel.add(createSubmitPanel());
        panel.add(Box.createVerticalStrut(20));

        add(panel);

        setDefaultCloseOperation(DISPOSE_ON_CLOSE);
        setSize(600,500);

        //Add code to place this GUI at location (300,300) on the screen
        setLocation(300,300);


        setVisible(true);
        this.allPatients = allPatients;
    }


    private JPanel createTitlePanel() {

        JPanel panel = new JPanel();

        JLabel titleLabel = new JLabel("Patient Details");
        titleLabel.setFont(new Font("serif",Font.PLAIN,20));

        panel.add(titleLabel);

        return panel;
    }

    private JPanel createDetailsPanel() {

        JPanel panel = new JPanel();
        panel.setLayout(new GridBagLayout());

        int gridy = 0;

        JPanel namePanel = new JPanel();

        JLabel fnameLabel = new JLabel("Firstname" + "             ");
        namePanel.add(fnameLabel);

        fnameField = new JTextField(15);
        namePanel.add(fnameField);

        JLabel lnameLabel = new JLabel("Lastname");
        namePanel.add(lnameLabel);

        lnameField = new JTextField(15);
        namePanel.add(lnameField);

        addComponent(panel, namePanel, 0, gridy++, 0, 1, topInsets,
                GridBagConstraints.LINE_START, GridBagConstraints.NONE);

        JLabel addressLabel = new JLabel(" Address");
        addComponent(panel, addressLabel, 0, gridy, 1, 1, normalInsets,
                GridBagConstraints.LINE_START, GridBagConstraints.NONE);

        addressField = new JTextField(25);
        addComponent(panel, addressField, 1, gridy++, 2, 1, normalInsets,
                GridBagConstraints.LINE_START, GridBagConstraints.NONE);

        JLabel PPSNLabel = new JLabel(" PPSN");
        addComponent(panel, PPSNLabel, 0, gridy, 1, 1, normalInsets,
                GridBagConstraints.LINE_START, GridBagConstraints.NONE);

        PPSNField = new JTextField(25);
        addComponent(panel, PPSNField, 1, gridy++, 1, 1, normalInsets,
                GridBagConstraints.LINE_START, GridBagConstraints.NONE);

        JLabel mobileLabel = new JLabel(" Mobile Number");
        addComponent(panel, mobileLabel, 0, gridy, 1, 1, normalInsets,
                GridBagConstraints.LINE_START, GridBagConstraints.NONE);

        mobileField = new JTextField(25);
        addComponent(panel, mobileField, 1, gridy++, 1, 1, normalInsets,
                GridBagConstraints.LINE_START, GridBagConstraints.NONE);

        JLabel bloodTypeLabel = new JLabel(" Blood Type");
        addComponent(panel, bloodTypeLabel, 0, gridy, 1, 1, normalInsets,
                GridBagConstraints.LINE_START, GridBagConstraints.NONE);

        bloodTypeField = new JTextField(25);
        addComponent(panel, bloodTypeField, 1, gridy++, 1, 1, normalInsets,
                GridBagConstraints.LINE_START, GridBagConstraints.NONE);

        JLabel allergiesLabel = new JLabel(" Allergies");
        addComponent(panel, allergiesLabel, 0, gridy, 1, 1, normalInsets,
                GridBagConstraints.LINE_START, GridBagConstraints.NONE);

        createJList();

        addComponent(panel, allergyList, 1, gridy++, 1, 1, normalInsets,
                        GridBagConstraints.LINE_START, GridBagConstraints.NONE);

        return panel;
    }

    private void createJList(){
        listModel = new DefaultListModel<>();

        listModel.addElement("Peanut");
        listModel.addElement("Shellfish");
        listModel.addElement("Insect Bites");
        listModel.addElement("Dairy");
        listModel.addElement("Glucose");

        allergyList = new JList<>(listModel);

        allergyList.addListSelectionListener(this);

        allergyList.setSelectionMode(ListSelectionModel.MULTIPLE_INTERVAL_SELECTION);
    }

    public void valueChanged(ListSelectionEvent e) {

        if (!allergyList.isSelectionEmpty()) {
            selectedValuesList =  (ArrayList<String>)allergyList.getSelectedValuesList();
        }
    }

    private void addComponent(Container container, Component component,
                              int gridx, int gridy, int gridwidth, int gridheight, Insets insets,
                              int anchor, int fill) {

        GridBagConstraints gbc = new GridBagConstraints(gridx, gridy,
                gridwidth, gridheight, 0.0, 0.0, anchor, fill, insets, 0, 0);

        container.add(component, gbc);
    }

    private JPanel createSubmitPanel() {

        JPanel panel = new JPanel();

        JButton submitButton = new JButton("Add Patient");

        panel.add(submitButton);

        submitButton.addActionListener(this);

        return panel;
    }



    public void actionPerformed(ActionEvent e) {

        //Add code to retrieve values entered on the text-fields and process the values
        //stored within the selectedValuesList array-list

        //then create a new Patient object using this data and add it to the allPatients array-list

        //finally display a message-dialog and destroy (dispose of) this GUI
        int i = 0;
        
        String[] allergies = new String[selectedValuesList.size()];

        for (String s:selectedValuesList) {
            allergies[i] = selectedValuesList.get(i);
            i++;
        }

        patient = new Patient(fnameField.getText(),lnameField.getText(),PPSNField.getText(),addressField.getText(),mobileField.getText(),
                bloodTypeField.getText(),allergies);

        allPatients.add(patient);

        JOptionPane.showMessageDialog(null,"New Patient Added", "Patient Added",JOptionPane.INFORMATION_MESSAGE);
    }
}
