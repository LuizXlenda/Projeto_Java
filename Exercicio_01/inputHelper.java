package Exercicio_01;

import java.util.Scanner;

public class inputHelper {


    static String inputString(String texto){
        Scanner sc = new Scanner(System.in);
        System.out.print(texto);
        String inputS = sc.nextLine();
        return inputS;

    }

    static int inputInt(String texto){
        Scanner sc = new Scanner(System.in);
        System.out.print(texto);
        int inputI = Integer.parseInt(sc.nextLine());
        return inputI;

    }

    static double inputDouble(String texto){
        Scanner sc = new Scanner(System.in);
        System.out.print(texto);
        double inputD = Double.parseDouble(sc.nextLine());
        return inputD;
    }
}