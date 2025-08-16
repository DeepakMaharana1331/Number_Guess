import java.util.Scanner;

public class NumGuess {
    public static void main(String[] args) {



        System.out.println("welcome to the number guessing game");
        Scanner ac = new Scanner(System.in);
        int f;


        System.out.println(" To play press :1 To leave press :2 ");
        f = ac.nextInt();


        if (f==1){
            Machine player =new Machine();

            player.logic();}
        else{
            System.out.println("thank you for visiting");
        }
    }
}

