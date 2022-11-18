package problems;

import javax.swing.*;
import java.io.BufferedReader;
import java.io.InputStreamReader;

public class CalculateGrades {
    
    public static float calculateAverage(String[] grades) {
        int sum = 0;
        for (String grade : grades)
            sum += Integer.parseInt(grade);
        return (float) sum / grades.length;
    }
    
    public static void main(String[] args) throws Exception {
    
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Enter the grades of all subject using space separated");
        String[] grades = reader.readLine().split(" ");
        float average = calculateAverage(grades);
        if (average >= 80) System.out.println("A");
        else if (average >= 60) System.out.println("B");
        else if (average >= 40) System.out.println("C");
        else System.out.println("D");
        //System.out.println("Average grade : " + calculateAverage(grades));
    }
}
