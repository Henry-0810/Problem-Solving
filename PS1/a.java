package PS1;

import javax.swing.*;
import java.util.EnumSet;

public class a {
    public static void main(String[] args) {
        double a, b, c, det;
        double r1, r2;
        String output;
        String banner = """
                ****Calculating the values and types of the roots of a quadratic equation****
                                
                                
                The quadratic equation has the form ax^2+bx+c = 0
                                
                                
                """;
        String title = "Roots and Types";
        a = Double.parseDouble(JOptionPane.showInputDialog(banner + "Please enter a value for integer co-efficient a"));
        b = Double.parseDouble(JOptionPane.showInputDialog(banner + "Please enter a value for integer co-efficient b"));
        c = Double.parseDouble(JOptionPane.showInputDialog(banner + "Please enter a value for integer co-efficient c"));

        det = Math.pow(b, 2) - 4 * a * c;
        if (det >= 0) {
            r1 = (-b + Math.sqrt(det)) / (2 * a);
            r2 = (-b - Math.sqrt(det)) / (2 * a);
            if (det > 0) {
                output = "The quadratic equation has 2 distinct real roots and their values are "
                        + String.format("%.3f",r1) + " and " + String.format("%.3f",r2);
                JOptionPane.showMessageDialog(null, output, title, 1);
            } else {
                output = "The quadratic equation has 2 identical real roots and their values are "
                        + String.format("%.3f",r1) + " and " + String.format("%.3f",r2);
                JOptionPane.showMessageDialog(null, output, title, 1);
            }
        } else {
            double x = -b / (2 * a);
            double y = (Math.sqrt(-det)) / (2 * a);
            output = "The quadratic equation has 2 complex conjugate roots and their values are "
                    + String.format("%.3f", x) + "+i" + String.format("%.3f", y) + " and " +
                    String.format("%.3f", x) + "-i" + String.format("%.3f", y);
            JOptionPane.showMessageDialog(null,output,title,1);
        }
    }
}
