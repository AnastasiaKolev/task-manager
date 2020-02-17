package ru.kolevatykh.tm;

public class Task {

    private int projectId;
    private String title;
    private String content;

    public Task(int projectId, String title, String content) {
        this.projectId = projectId;
        this.title = title;
        this.content = content;
    }

    @Override
    public String toString() {
        return "Task{" +
                "projectId=" + projectId +
                ", title='" + title + '\'' +
                ", content='" + content + '\'' +
                '}';
    }
}
