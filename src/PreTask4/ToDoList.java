package PreTask4;

import java.util.*;

public class ToDoList {
    private List<String> toDoList = new ArrayList<>();

    public void addToList(String task){
        toDoList.add(task);
    }

    public void printToDoList(){
        for (int i = 0; i < toDoList.size(); i++){
            System.out.println(i + " - " + toDoList.get(i) );
        }
    }

    public void changeTask(int index, String task){
        toDoList.set(index, task);
    }

    public void removeTask(String task){
        toDoList.remove(task);
    }
}
