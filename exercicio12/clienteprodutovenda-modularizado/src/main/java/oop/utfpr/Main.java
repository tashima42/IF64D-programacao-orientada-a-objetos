package oop.utfpr;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        new Command(scanner).run();
        scanner.close();
    }
}