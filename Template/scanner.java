import java.util.Scanner;
public class scanner{
    public static void main(String[] args) {
        try (Scanner man = new Scanner(System.in)) {
            System.out.print("Input: ");//now you know?
            int ball = man.nextInt();
            System.out.println("you entered: "+ ball);//online ball
        }
    }
}