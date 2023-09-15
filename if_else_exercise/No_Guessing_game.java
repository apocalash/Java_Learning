package if_else_exercise;

import java.util.Scanner;

public class No_Guessing_game {
    public static void main(String[] args){
        int random_number = (int)(Math.random()*100+1);
        int user_answer;

        Scanner scanner = new Scanner(System.in);
        System.out.println("enter guess");
        user_answer = scanner.nextInt();

        if(user_answer<0 || user_answer>100)
            System.out.println("user input is invalid");
        else if (user_answer == random_number)
            System.out.println("correct guess");
        else if (user_answer > random_number) {
            System.out.println("guess is too high");
        }
        else if (user_answer < random_number) {
            System.out.println("guess is too low");
        }
        else
            System.out.println("guess is incorrect. Correct answer is:"+random_number);
        System.out.println(" Correct answer is:"+random_number);
    }
}
