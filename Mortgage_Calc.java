//mortagage calculator with conditional and number formatting
import java.text.NumberFormat;
import java.util.Scanner;

public  class Mortgage_Calc {
    public static void main(String[] args){
        final byte MONTHS_IN_YEARS =12;
        final byte PERCENT = 100;

        Scanner scanner = new Scanner(System.in);

        int principle, no_of_payments = 0;
        float Monthly_interest = 0.0f;

        while(true){
            System.out.println("enter principle:");
            principle = scanner.nextInt();
            if (principle >=1000 && principle <=1_000_000)
                break;
            System.out.println("enter a value between 1000 and 1_000_000");
        }
        while(true){
            System.out.println("enter the annual interest");
            float Annual_interest = scanner.nextFloat();
            if (Annual_interest >= 1 && Annual_interest <= 30){
                Monthly_interest = Annual_interest / MONTHS_IN_YEARS / PERCENT;
                break;
            }
            System.out.println("Enter a value between 1 and 30");
        }
        while(true){
            System.out.println("Enter the period in years");
            int period_years = scanner.nextInt();
            if(period_years >= 1 && period_years <=100){
                no_of_payments = period_years * MONTHS_IN_YEARS;
                break;
            }
        }

        double mortgage = principle * (Monthly_interest * Math.pow(1+Monthly_interest, no_of_payments)) / (Math.pow(1+Monthly_interest, no_of_payments)-1);
        String mortgageformatted = NumberFormat.getCurrencyInstance().format(mortgage);
        System.out.println("Mortagage="+ mortgageformatted);
    }
}