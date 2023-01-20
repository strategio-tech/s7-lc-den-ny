package tech.strategio;

import java.util.Scanner;

public class LoanCalculator {

    /**
     * 
     * @param the loan amount borrowed from friend
     * @return the remaining balance on the loan after 3 months of paying 10% each month
     */
    static int getRemainingAmountIn3Months(int amount) {
        int months = 3;

        while (months > 0){
            amount *= .9;
            months --;
        }

        return amount;
    }

    public static void main(String[] args) {
        try (Scanner scanner = new Scanner(System.in)) {
            int amount = scanner.nextInt();
            System.out.println(getRemainingAmountIn3Months(amount));
        }
    }
}
