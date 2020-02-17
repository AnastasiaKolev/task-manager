package ru.kolevatykh.tm;

import java.util.ArrayList;
import java.util.List;

public class TaskService {
    private List<Task> tasks = new ArrayList();
    private int projectId;

    public void create(int projectId, Task task){
        this.projectId = projectId;
        tasks.add(task);
    }

    public void readById(int id){

    }

    public void readAll(){
        for (int i=0; i < tasks.size(); i++){
            System.out.println((i+1) + ". " + tasks.get(i).toString());
        }
    }

    public void clearAll(){

    }

    public void removeById(int id){

    }
}
