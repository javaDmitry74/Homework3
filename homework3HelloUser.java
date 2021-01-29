import java.util.Formatter;
import java.util.Scanner;

public class homework3HelloUser {


    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        System.out.println("Enter your name: ");
        String name = scan.nextLine();
        System.out.println("Enter your age: ");
        int age = scan.nextInt();

        StringBuilder strBuilderName = new StringBuilder();
        StringBuilder strBuilderAge = new StringBuilder();
        Formatter fmtName = new Formatter(strBuilderName);
        Formatter fmtAge = new Formatter(strBuilderAge);
        System.out.format("Hello!%n"); //Printing out hello and using formatter %n to move cursor to next line
        fmtName.format("Your name: %10s", name); //formatter %10s with length of empty field 10
        fmtAge.format("Your age: %10s", age);
        System.out.println(strBuilderName.toString());
        System.out.println(strBuilderAge.toString());
    }
}
