package PS1;

import com.sun.security.jgss.GSSUtil;

import java.util.Scanner;

public class c {
    public static void main(String[] args) {
        int i = 0, atLeast70 = 0, below40 = 0;
        double avg, largest = 0, smallest = 100, sum = 0;
        Scanner inputs = new Scanner(System.in);
        do {
            int[] getNums = new int[5];
            System.out.println("Please enter the mark for student " + (i+1));
            getNums[i] = inputs.nextInt();
            while (getNums[i] < 0 || getNums[i] > 100) {
                System.out.println("Invalid mark! Please re-enter mark for student " + (i+1));
                getNums[i] = inputs.nextInt();
            }
            sum += getNums[i];
            avg = sum / 5;
            if (getNums[i] > largest)
                largest = getNums[i];
            if (getNums[i] < smallest)
                smallest = getNums[i];
            if (getNums[i] >= 70)
                atLeast70++;
            if (getNums[i] < 40)
                below40++;
            i++;
        }
        while (i < 5);
        System.out.println("""
                ============================
                       Program Results
                ============================
                                
                                
                                
                """ + "The average of the valid marks entered is " + String.format("%.2f",avg) +
                "\nThe largest valid mark entered is " + String.format("%.0f",largest) +
                "\nThe smallest valid mark entered is " + String.format("%.0f",smallest)
                + "\nThe percentage of valid marks that were at least 70 is " + String.format("%.0f",(float) atLeast70 / 5 * 100)
                + "%" + "\nThe number of valid marks that were below 40 is " + below40);
    }
}
