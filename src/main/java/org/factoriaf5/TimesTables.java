package org.factoriaf5;
import java.util.Scanner;

public class TimesTables {

    public static String[] generateTable(int inputNumber) {
        String[] arrayTable = new String[10]; 
        for (int i = 1; i <= 10; i++) {
            int result = inputNumber * i;
            arrayTable[i - 1] = inputNumber + " x " + i + " = " + result; 
        }
        return arrayTable;
    }

    public static void printTable(String[] arrayTable) {
        for (String line : arrayTable) {
            System.out.println(line);
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Introduce un número entero para obtener su tabla de multiplicar: ");
        int inputNumber = scanner.nextInt(); 
        String[] arrayTable = generateTable(inputNumber);
        printTable(arrayTable);
        scanner.close(); 
    }
}
