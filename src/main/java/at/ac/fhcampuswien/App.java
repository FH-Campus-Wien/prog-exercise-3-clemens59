package at.ac.fhcampuswien;
import java.util.Arrays;
import java.util.Scanner;
import java.util.Random;

public class App {

    // Implement all methods as public static

    public static void oneMonthCalendar(int daysCount, int startDay){
        int count = 0;

        for (int w = 1; w < startDay; w++){
            System.out.print("   ");
            count ++;

        }

        for (int i = 1; i <= daysCount; i++ ){
            count++;
            if (i < 10){
                System.out.print(" ");
            }
            System.out.print(i + " ") ;
            if(count == 7 && i != daysCount){
                System.out.println();
                count = 0;
            }

        }
        System.out.println();
    }
    public static long[] lcg(long seed){
        long[] result = new long[11];
        long c = 12345;
        long a = 1103515245;
        long m = (long)Math.pow(2, 31);
        result[0] = seed;

        for (int i = 0; i < 10; i++) {
            result[i+1] = (a * result[i] + c) % m;

        }

        return Arrays.copyOfRange(result, 1, result.length);
    }

    public static void guessingGame(int numberToGuess){
        Scanner input = new Scanner(System.in);
        int count = 1;
        int won = 0;
        System.out.print("Guess number "+count+": ");
        int in = input.nextInt();

        for (int i = 0; i< 9; i++){

            if (numberToGuess > in) {
                System.out.println("The number AI picked is higher than your guess.");
                count++;
                System.out.print("Guess number "+count+": ");
                in = input.nextInt();

            }
            if (numberToGuess < in) {
                System.out.println("The number AI picked is lower than your guess.");
                count++;
                System.out.print("Guess number "+count+": ");
                in = input.nextInt();

            }

            if (numberToGuess == in) {
                System.out.println("You won wisenheimer!");
                i = 10;
                won = 1;
            }
            if (won == 0 && i == 8){
                System.out.println("You lost! Have you ever heard of divide & conquer?");
            }

        }

    }

    public static int randomNumberBetweenOneAndHundred() {
        Random random = new Random();
        int numberToGuess = 1+ random.nextInt(99);

        return numberToGuess;

    }

    public static boolean swapArrays(int[] array1, int[] array2){
        int[] arsaf = new int[array1.length];

        if (array1.length != array2.length){
            return false;
        }

        for (int i = 0; i < array1.length; i++) {
            arsaf[i] = array1[i];
            array1[i] = array2[i];
            array2[i] = arsaf[i];
        }
        return true;
    }

    public static void camelCase(String satz){
        char[] ar1 = satz.toCharArray();

    }


    public static int checkDigit(){

        return 5;
    }

    public static void main(String[] args) {
        oneMonthCalendar(31,1);
        lcg(1406932606);
        guessingGame(randomNumberBetweenOneAndHundred());



        // test your method implementations here
        // make method calls
        // print their results
        // etc.
    }
}