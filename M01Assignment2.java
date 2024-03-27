import java.util.Scanner;

public class M01Assignment2 {

    public static int getDigit(int number){
        String numString = Integer.toString(number);
        if (numString.length() == 2){
            int finalNum = Character.getNumericValue(numString.charAt(0)) + Character.getNumericValue(numString.charAt(1));
            return finalNum;
        }
        else{
            return number;
        }
    }

    public static int sumOfDoubleEvenPlace(long number) {
        String longNum = Long.toString(number);
        int numIndex = 0;
        int total = 0;
        for (int i = 0; i < longNum.length(); i++){
            if (numIndex == 0){
                int digitSum = Character.getNumericValue(longNum.charAt(i)) * 2;
                total += getDigit(digitSum);
                numIndex += 1;
            }
            else {
                numIndex = 0;
            }
        }
        return total;
    }

    public static int sumOfOddPlace(long number){
        String longNum = Long.toString(number);
        int numIndex = 0;
        int total = 0;
        for (int i = 1; i < longNum.length(); i++){
            if (numIndex == 0){
                int digitSum = Character.getNumericValue(longNum.charAt(i));
                total += digitSum;
                numIndex += 1;
            }
            else {
                numIndex = 0;
            }
        }
        return total;
    }

    public static boolean isValid(long number){
        int total = sumOfDoubleEvenPlace(number) + sumOfOddPlace(number);
        if (total % 10 == 0) {
            return true;
        }
        return false;
    }

    public static void main(String[] args) {
        
        
        Scanner input = new Scanner(System.in);
        System.out.println("Enter a credit card number: ");
        Long userCardNum = input.nextLong();
        if (isValid(userCardNum)) {
            System.out.println(userCardNum + " is valid.");
        }
        if (!isValid(userCardNum)) {
            System.out.println(userCardNum + " is not valid.");
        }

    }
}