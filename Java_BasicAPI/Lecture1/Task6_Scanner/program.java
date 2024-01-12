package Java_BasicAPI.Lecture1.Task6_Scanner;
import java.util.Scanner;

public class program {
    public static void main(String[] args) {
        Scanner iScanner = new Scanner(System.in, "CP866");
        System.out.printf("Имя: ");
        String name = iScanner.nextLine();
        System.out.printf("Привет, %s!", name);
        iScanner.close();
    }    
}