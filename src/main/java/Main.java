package src.main.java;

import java.util.Scanner;

/**
 * Created by bingwang on 2/15/17.
 */
public class Main {
    public static void main(String[] args){
        IsoscelesTrianglePrinter isoscelesTrianglePrinter = new IsoscelesTrianglePrinter();
        Scanner scanner = new Scanner(System.in);
        int input = scanner.nextInt();
        isoscelesTrianglePrinter.print(input);
    }
}
