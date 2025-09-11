package utils; //Criado a pasta 'utils' para organização de código

import java.util.Scanner;

public class IOutils {
    public static void println(String message){
        System.out.println(message);
    }

    public static int scanInt(Scanner scanner){
        var input = scanner.nextInt();
        scanner.nextLine();
        return input;
    }
}