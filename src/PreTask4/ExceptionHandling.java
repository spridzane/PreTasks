package PreTask4;

import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.InputMismatchException;
import java.util.Scanner;

public class ExceptionHandling {
    public static void main(String[] args) {

//        float arr[] = new float[]{33.2f, 66.1f, 19.7f};
//
//        try {
//            System.out.println("Float Array of index path 3: " + arr[3]);
//        } catch (ArrayIndexOutOfBoundsException error) {
//            System.out.println("Error::::: " + error);
//        }

        boolean continueLoop = true;
        Scanner sc = new Scanner(System.in);
        do{
            try{
                System.out.println("Please enter int number: ");
                int numerator = sc.nextInt();

                System.out.println("Please enter the divider number: ");
                int divider = sc.nextInt();

                System.out.println(divide(numerator,divider));
                int res = divide(numerator, divider);
                saveToFile(res);

            }catch (ArithmeticException e){
                System.out.println("Arithmetical exception: " + e);
                System.out.println("Only non-zero values are allowed! ");
            }catch (InputMismatchException e){
                System.out.println("InputMismatchException: " + e);
                System.out.println("Only int values are allowed! ");
                continueLoop = false;
            } catch (IOException e) {
                System.out.println("IOException: " + e);
                System.out.println("could not save the file! ");
                //e.printStackTrace();
            }finally {
                System.out.println("Finally block");
            }

        }while(continueLoop);

    }//end main

    public static int divide(int num1, int num2){
        return num1 / num2;
    }

    private static void saveToFile(int res) throws IOException {
        PrintWriter writer = new PrintWriter(new FileWriter("test.txt"));
        writer.println("Result: " + res);
        writer.close();
    }

}//and class