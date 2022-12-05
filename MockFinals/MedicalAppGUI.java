package MockFinals;

//GUI for a medical centre application
/*This basic GUI first automatically runs the main() of the TestPerson class thereby populating array-lists
 of Doctor and Patient objects with values. It presents a GUI interface that enables the end-user to do
 various things such as add a new patient, remove a patient and view the list of patients*/

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;


public class MedicalAppGUI extends JFrame implements ActionListener {

    private JMenu patientMenu;
    private JMenuItem item;
    //private ArrayList<Doctor> allDoctors; //You can uncomment this when you have written the Doctor class
    //private ArrayList<Patient> allPatients; //You can uncomment this when you have written the Patient class

    public MedicalAppGUI()  {

        super("Medical Centre System");

        Container pane = getContentPane();
        pane.setBackground(new Color(150,200,230));

        createPatientMenu();

        JMenuBar menuBar = new JMenuBar();
        setJMenuBar(menuBar);
        menuBar.add(patientMenu);

        setSize(400,400 );
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setVisible(true);

        //Add code here to call the TestPerson main() and also its getDoctors() and getPatients()

    }

    public static void main( String[] args ) {
        new MedicalAppGUI();
    }

    private void createPatientMenu() {

        patientMenu = new JMenu("Patient");

        String itemNames[] = {"Add", "Remove", "View", "Quit"};

        for (int i = 0; i < itemNames.length; i++) {
            item = new JMenuItem(itemNames[i]);
            item.addActionListener(this);

            if (i == 3)
                patientMenu.addSeparator();

            patientMenu.add(item);
        }
    }


    public void actionPerformed (ActionEvent e){

        //Add code here for handling events on the various GUI menu-items

    }

    public void addPatientGUI() {

        //new AddPatientGUI(allPatients); //You can uncomment this when you have written the Patient class
    }

    public void viewPatients() {

        //Add code here for the viewing the state of all the Patient objects within the
        //allPatients array-list

    }
}



