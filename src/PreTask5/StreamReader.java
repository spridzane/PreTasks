package PreTask5;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class StreamReader {
    public static void main(String[] args) throws IOException {
        String text = "";
        System.out.println("Please enter the text: ");

        InputStreamReader input = new InputStreamReader(System.in);

        BufferedReader br = new BufferedReader(input);

        text = br.readLine();
        System.out.println(text);


    }//end main
}//end class
