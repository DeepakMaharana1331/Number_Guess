//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
import java.util.Random;
import java.util.Scanner;



class Machine{
    private int User_choice;
    private int Comp_choice;
    public Machine(){

        Random rand = new Random();
        Comp_choice = rand.nextInt(10);
        System.out.println("comp choice had been made ");


    }
//    public void input(){
//        Scanner sc = new Scanner(System.in);
//        System.out.println(" guess the number ");
//        User_choice = sc.nextInt();
//    }

    public void logic(){

        //System.out.println("entering logic");
        Scanner dc = new Scanner(System.in);
        System.out.println("guess the number between 0 to 10");
        User_choice= dc.nextInt();
        int guess = 1;
        int y =0;
        while(y!=1) {
            if (User_choice == Comp_choice) {
                System.out.println("you win and the number of gueses are:" + guess);
                y=1;
                break;
            } else if (User_choice > Comp_choice) {
                System.out.println("attempt :" + guess);
                System.out.println("guess smaller ");
                User_choice = dc.nextInt();
                guess = guess + 1;
                continue;
            } else if (User_choice < Comp_choice) {
                System.out.println("attempt :" + guess);
                System.out.println("guess Higher ");
                User_choice = dc.nextInt();
                guess = guess + 1;
                continue;
            }
        }
    }

}







