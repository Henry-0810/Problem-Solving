package LabSheet15.ex1;

//BicycleShopAppWithExceptionHandlingPartial.java
/*This program creates a GUI that uses some menus for managing a file containing details about the
bicycles for sale/repair in a shop, as well as the ability to add, amend and remove bicycles from stock
This version add some processing and also does some file creation/manipulation with exception-handling*/

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.*;


public class BicycleShopAppWithExceptionHandlingPartial extends JFrame implements ActionListener {

    private JMenu fileMenu, bikeMenu;
    private JMenuItem item=null;
    private final File file = new File("labsheet15/exercise1/bicycles.data");

    public BicycleShopAppWithExceptionHandlingPartial( ) {
        super("Bike Shop System");

        Container pane = getContentPane();
        pane.setBackground(new Color(240,210,240));

        createFileMenu();
        createBikeMenu();

        JMenuBar menuBar = new JMenuBar();
        setJMenuBar(menuBar);
        menuBar.add(fileMenu);
        menuBar.add(bikeMenu);

        ImageIcon icon = new ImageIcon("labsheet15/exercise1/bike.png");
        setIconImage(icon.getImage());

        setSize(400,400 );
        setVisible(true);
    }

    public static void main( String[] args ) {
        BicycleShopAppWithExceptionHandlingPartial frame = new BicycleShopAppWithExceptionHandlingPartial();
    }


    private void createFileMenu(){

        fileMenu = new JMenu("File");

        String itemNames[] = {"New","Open","Save","Quit"};

        for(int i=0;i<itemNames.length;i++){
            item = new JMenuItem(itemNames[i]);
            item.addActionListener(this);

            if(i==3)
                fileMenu.addSeparator();

            fileMenu.add(item);
        }
    }


    private void createBikeMenu(){

        bikeMenu = new JMenu("Bicycle");

        String itemNames[] = {"Add","Amend","Remove","View"};

        for(int i=0;i<itemNames.length;i++) {

            item = new JMenuItem(itemNames[i]);
            item.addActionListener(this);
            bikeMenu.add(item);
        }
    }

    public void actionPerformed(ActionEvent e) {

        int choice;

        if(e.getActionCommand().equals("New")) {
            createFile();
        }
        else if(e.getActionCommand().equals("Open")) {
            openFile();
        }
        else if(e.getActionCommand().equals("Save")) {
            saveFile();

        }
        else if(e.getActionCommand().equals("Quit")) {
            choice = JOptionPane.showConfirmDialog(null, "Are you sure you wish to quit the application?",
                    "Exiting Application", JOptionPane.YES_NO_CANCEL_OPTION);

            if(choice==JOptionPane.YES_OPTION){
                JOptionPane.showMessageDialog(null,"Saving the file that stores bicycle details before terminating",
                        "Saving File",JOptionPane.INFORMATION_MESSAGE);
                System.exit(0);
            }

        }
        else if(e.getActionCommand().equals("Add"))
            JOptionPane.showMessageDialog(null,"Adding new bicycle details",
                    "Adding Bike",JOptionPane.INFORMATION_MESSAGE);
        else if(e.getActionCommand().equals("Amend"))
            JOptionPane.showMessageDialog(null,"Amending bicycle details",
                    "Amending Bike",JOptionPane.INFORMATION_MESSAGE);
        else if(e.getActionCommand().equals("Remove"))
            JOptionPane.showMessageDialog(null,"Removing bicycle details",
                    "Removing Bike",JOptionPane.INFORMATION_MESSAGE);
        else
            JOptionPane.showMessageDialog(null,"Viewing bicycle details",
                    "Viewing Bike",JOptionPane.INFORMATION_MESSAGE);
    }

    public void createFile() {

        if(!file.exists()) //if the file doesn't already exist, create it
            try {
                FileOutputStream fileOutputStream = new FileOutputStream(file);
                JOptionPane.showMessageDialog(null, "Created a new file to store bicycle details!",
                        "New File", JOptionPane.INFORMATION_MESSAGE);
                fileOutputStream.close();
            } catch (FileNotFoundException fnfe) {
                fnfe.printStackTrace();
                JOptionPane.showMessageDialog(null, "File could not be found!",
                        "Problem Finding File!", JOptionPane.ERROR_MESSAGE);
            }
            catch (IOException ioe) {
                ioe.printStackTrace();
                JOptionPane.showMessageDialog(null, "File could not be opened!",
                        "Problem Opening the File!", JOptionPane.ERROR_MESSAGE);
            }

        else
            JOptionPane.showMessageDialog(null, "File to store bicycle details already exists!",
                    "New File", JOptionPane.WARNING_MESSAGE);
    }

    public void openFile() {

        ObjectInputStream objectInputStream=null;

        //check to see if file exists already, if not create it

        //otherwise
             //attempt (try) to do the following:
                 //attach a file input stream to the file we wish to open for reading

                 //if the length of the file is not zero (i.e. it is not empty)

                      //attach an object input stream to the file input stream to enable deserialisation

                       JOptionPane.showMessageDialog(null, "Opened the file that stores bicycle details",
                            "Opened File", JOptionPane.INFORMATION_MESSAGE);
                }
                else
                    JOptionPane.showMessageDialog(null, "Can't read file as it is empty!",
                            "Empty File", JOptionPane.ERROR_MESSAGE);
            }
            catch (IOException ioe) {
               //display an error message dialog indicating the file could not be opened
            }

            //if at this point the value of the object input stream is null (it means that the file must have been empty)
                    return;

            try{
                //create an array list of Bicycle reference and set it null

                //read an object from the object input stream and cast it to an arrau list of Bicycle

                String bikeData="";

                //if some object was actually read from the file (and casted successfully to an array list)
                    //process that array list using a for-each loop
                        //adding each Bicycle object state onto the variable bikeData

                //close the object input stream now

                JOptionPane.showMessageDialog(null, "Details of bicycles read from file are:\n\n" + bikeData,
                        "Opened File", JOptionPane.INFORMATION_MESSAGE);
            }
            catch (IOException ioe) {
                ioe.printStackTrace();
                JOptionPane.showMessageDialog(null, "File could not be read!",
                        "Problem Reading From File!", JOptionPane.ERROR_MESSAGE);
            } catch (ClassNotFoundException cnfe) {
                cnfe.printStackTrace();
                JOptionPane.showMessageDialog(null, "Could not find the appropriate class!",
                        "Problem Finding the Class!", JOptionPane.ERROR_MESSAGE);
            }

        }
    }

    public void saveFile() {
        //if the file does not exist
            //create it

        try {
            //create a file output stream and attach it to the file
            //create an object output stream and attach it to the file output stream for writing purposes
            //create two Bicycle objects (note you must make the Bicycle class serialisable)
            //create an array list that you can add the Bicycle objects to
            //add the two Bicycle objects to the array list

            //write the array list to the file i.e. serialise it
            //close the object output stream

            JOptionPane.showMessageDialog(null, "Saved the file that stores bicycle details",
                    "Saved File", JOptionPane.INFORMATION_MESSAGE);
        } catch (FileNotFoundException fnfe) {
            System.out.println(fnfe.getStackTrace());
            JOptionPane.showMessageDialog(null, "File could not be found!",
                    "Problem Finding File!", JOptionPane.ERROR_MESSAGE);
        } catch (IOException ioe) {
            System.out.println(ioe.getStackTrace());
            JOptionPane.showMessageDialog(null, "File could not be written!",
                    "Problem Writing to File!", JOptionPane.ERROR_MESSAGE);
        }
    }
}