package ru.kolevatykh.tm;

import java.util.ArrayList;
import java.util.List;

public class ProjectService {
    private static List<Project> projects = new ArrayList<Project>();

    void create(Project project){
        projects.add(project);
    }

    public Project findById(int id){
        return projects.get(id);
    }

    public void readAll(){
        for (int i=0; i < projects.size(); i++){
            System.out.println((i+1) + ". " + projects.get(i).toString());
        }
    }

    public void clearAll(){

    }

    public void removeById(int id){

    }
}
