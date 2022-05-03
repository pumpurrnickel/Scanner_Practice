import java.util.Scanner;

public class Variables {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.println("Enter a string of text: ");
        String text = input.nextLine();

        System.out.println("Enter an interger: ");
        int interger = input.nextInt();

        System.out.println("Enter a double: ");
        Double decimal = input.nextDouble();

        System.out.println("Enter a boolean value: ");
        Boolean bonk = input.nextBoolean();

        System.out.println("Your string is " + text);
        System.out.println("Your interger is " + interger);
        System.out.println("Your double is " + decimal);
        System.out.println("Your boolean is " + bonk);

        input.close();
    }
}
