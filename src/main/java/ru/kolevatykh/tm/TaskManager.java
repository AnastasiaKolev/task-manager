package ru.kolevatykh.tm;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class TaskManager {
    ProjectService projectService = new ProjectService();
    TaskService taskService = new TaskService();

    private static final String help = "help: \tShow all commands."
            + "\nproject-clear: \tRemove all projects."
            + "\nproject-create: \tCreate new project."
            + "\nproject-list: \tShow all projects."
            + "\nproject-remove: \tRemove selected project."
            + "\ntask-clear: \tRemove all tasks."
            + "\ntask-create: \tCreate new task."
            + "\ntask-list: \tShow all tasks."
            + "\ntask-remove: \tRemove selected task.";

    public void projectCreate(String name){
        Project project = new Project(name);
        projectService.create(project);
        System.out.println("[OK]");
    }

    public void projectList(){
        projectService.readAll();
    }

    public void projectClear(){
        taskService.clearAll();
        projectService.clearAll();
        System.out.println("Removed all projects.");
    }

    public void taskCreate(int projectId, String title, String content){
//        projectService.findById(projectId);
        Task task = new Task(projectId, title, content);
        taskService.create(projectId, task);
        System.out.println("[OK]");
    }

    public void taskList(){
        taskService.readAll();
    }


    public static void main(String[] args) {

        System.out.println("*** Welcome to task manager ***" +
                "\nFor details input \"help\"");
        try {
            BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

            String line;
            TaskManager main = new TaskManager();

            while ((line = reader.readLine()) != null) {
                if (line.equals("help")) {
                    System.out.println(help);
                }
                if (line.equals("project-clear")) {
                    System.out.println("[PROJECT CLEAR]");
                    main.projectClear();
                }
                if (line.equals("project-create")) {
                    System.out.println("[PROJECT CREATE]"
                            + "\nEnter name: ");
                    String name = reader.readLine();
                    main.projectCreate(name);
                }
                if (line.equals("project-list")) {
                    System.out.println("[PROJECT LIST]");
                    main.projectList();
                }
                if (line.equals("project-remove")) {
                    System.out.println("[PROJECT REMOVE]");
                }
                if (line.equals("task-clear")) {
                }
                if (line.equals("task-create")) {
                    System.out.println("[TASK CREATE]"
                            + "\nEnter project id: ");
                    main.projectList();
                    int id = Integer.valueOf(reader.readLine());

                    System.out.println("Enter title: ");
                    String title = reader.readLine();

                    System.out.println("Enter content: ");
                    String content = reader.readLine();
                    main.taskCreate((id - 1), title, content);
                }
                if (line.equals("task-list")) {
                    System.out.println("[TASK LIST]");
                    main.taskList();
                }
                if (line.equals("task-remove")) {
                }

            }
            reader.close();
        } catch (IOException ioe) {
            ioe.printStackTrace();
        }

    }
}

