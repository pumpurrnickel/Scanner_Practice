import java.util.Scanner;

public class Superhero {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.println("Let's write a story about a superhero");
        System.out.println("Who is the hero of our story?");
        String name = input.nextLine();

        System.out.println("What is their superpower?");
        String power = input.nextLine();

        System.out.println("Here is their story...");
        System.out.println
        (
            "Little is known about the origins of " + name + " nor their true identity behind their persona. " + 
            "Some speculate that a terrible accident happened in a research facilitity, causing " + name + " to aquire their signature ability to " + power + "."
        );

        input.close();
    }
}