package PreTask5;

import javafx.scene.transform.Scale;

import java.io.*;
import java.util.Scanner;

public class InputOutput {
    public static void main(String[] args) throws IOException {

        File file = new File("file.txt");

        if(!file.exists()){
            try {
                file.createNewFile();
            }catch (IOException e){
                e.printStackTrace();
            }
        }
        String text = readFile();

        try{
            PrintWriter pw = new PrintWriter(file);

            Scanner in = new Scanner(System.in);
            System.out.println("Please type here: ");
            String userInput = in.nextLine();

            text += userInput;
            pw.println("file.txt :" + text);
            pw.close();
        }catch (FileNotFoundException e){
            e.printStackTrace();
        }
    }//end main

    public static String readFile(){
        String result = "";
        BufferedReader br = null;

        try{
            br = new BufferedReader(new FileReader("file.txt"));
            String line;
            while((line = br.readLine()) != null){
                result += line + "\n";
            }
            br.close();
        }catch (FileNotFoundException e){
            e.printStackTrace();
        }catch (IOException e){
            e.printStackTrace();
        }

        return result;
    }

}
