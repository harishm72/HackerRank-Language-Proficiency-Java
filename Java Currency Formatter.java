import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {
    
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double payment = scanner.nextDouble();
        scanner.close();
        Locale ind = new Locale("en","IN");
        Locale fre = new Locale("fr","fr");
        // Write your code here.
       String us = NumberFormat.getCurrencyInstance(Locale.US).format(payment);
       String india = NumberFormat.getCurrencyInstance(ind).format(payment);
       String china = NumberFormat.getCurrencyInstance(Locale.CHINA).format(payment);
       String france = NumberFormat.getCurrencyInstance(fre).format(payment);
        
        System.out.println("US: " + us);
        System.out.println("India: " + india);
        System.out.println("China: " + china);
        System.out.println("France: " + france);
    }
}
