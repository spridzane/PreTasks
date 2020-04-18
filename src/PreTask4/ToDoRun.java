package PreTask4;

import com.sun.scenario.effect.impl.sw.java.JSWColorAdjustPeer;

import java.util.Scanner;

public class ToDoRun {
    private static Scanner sc = new Scanner(System.in);
    private static void printOut(){
        System.out.println("Action: \n" +
                "1 - to add a new item into toDoList \n" +
                "2 - to print out the toDoList \n" +
                "3 - to update an existing toDoList \n" +
                "4 - to remove an existing list of toDoList \n" +
                "0 - exit \n\n" +
                "After choosing any number/option press ENTER \n");
    }

    public static void main(String[] args) {
        ToDoList list = new ToDoList();
        printOut();

        int param = sc.nextInt();
        while(param != 0){
            switch (param){
                case 1:
                    System.out.println("Please enter a new task to add!!!");
                    sc.nextLine();
                    String task1 = sc.nextLine();
                    list.addToList(task1);

                    System.out.println("Action [0 - 4]");
                    param = sc.nextInt();
                    break;
                case 2:
                    System.out.println("Printing out the toDoList!!!");
                    list.printToDoList();

                    System.out.println("Action [0 - 4]");
                    param = sc.nextInt();
                    break;
                case 3:
                    System.out.println("Please update an existing item by entering index!!!");
                    sc.nextLine();
                    int i = sc.nextInt();
                    System.out.println("Please enter a new task to update existing item!!!");
                    sc.nextLine();
                    String task3 = sc.nextLine();
                    list.changeTask(i, task3);

                    System.out.println("Action [0 - 4]");
                    param = sc.nextInt();
                    break;
                case 4:
                    System.out.println("Please enter a task as a String to remove it!!!");
                    sc.nextLine();

                    String task4 = sc.nextLine();
                    list.removeTask(task4);

                    System.out.println("Action [0 - 4]");
                    param = sc.nextInt();
                    break;
                default:
                    param = 0;
            }
        }//while end

    }//end main
}//end class
