import java.util.Scanner;

public class HelloThere {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);

        System.out.println("Howdy! How are you doing today?");
        input.nextLine();

        System.out.println("Wowee zowee, that's good to hear. Tell me more about yourself!");
        input.nextLine();

        System.out.println("Whoa! That sure is interesting, but I don't care!");
        input.close();
    }
}