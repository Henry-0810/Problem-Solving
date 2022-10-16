package PS1;

import javax.swing.*;
import java.util.Scanner;

public class b {
    public static void main(String[] args) {
        String output;
        double minD, maxD;
        String banner = """
                -----The Super-Duper Potato Grading Machine-----
                
                
                """;
        String condition = JOptionPane.showInputDialog(banner + "Please enter the condition of the potato(good or bad)");

        if(condition == null){
            JOptionPane.showMessageDialog(null,"Bruhhh");
        }
        else if(condition.equalsIgnoreCase("good")){
            minD = Double.parseDouble((JOptionPane.showInputDialog(banner
                    + "Please enter the minimum diameter of the potato")));
            if(minD<0){
                output = "The minimum diameter value cannot be negative .... exiting program now";
                JOptionPane.showMessageDialog(null,output,"Invalid Information",0);
            }
            else{
                maxD = Double.parseDouble((JOptionPane.showInputDialog(banner +
                        "Please enter the maximum diameter of the potato")));
                if(maxD < 0){
                    output = "The maximum diameter value cannot be negative .... exiting program now";
                    JOptionPane.showMessageDialog(null,output,"Invalid Information",0);
                }
                else{
                    output = "The average diameter of the potato is " + String.format("%.2f",average(minD,maxD)) +"mm and so its grade is "
                            + grade(minD,maxD);
                    JOptionPane.showMessageDialog(null,output,"Potato Information",1);
                }
            }

        }
        else if(condition.equalsIgnoreCase("bad")){
            output = "The condition of this potato is bad .... exiting program now";
            JOptionPane.showMessageDialog(null,output,"Bad potato",2);
        }
        else{
            output = "You have entered an invalid potato condition .... exiting program now";
            JOptionPane.showMessageDialog(null,output,"Invalid Information",0);
        }

    }

    private static String grade(double minD, double maxD) {
        if(average(minD,maxD) > 0.01 && average(minD,maxD)<=24.99)
            return "D";
        else if(average(minD,maxD) > 25 && average(minD,maxD)<=49.99)
            return "C";
        else if(average(minD,maxD) > 50 && average(minD,maxD)<=74.99)
            return "B";
        else
            return "A";
    }

    private static double average(double minD, double maxD) {
        return (minD + maxD)/2;
    }

}
