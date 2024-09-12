package day9.ToDoTask;

import java.util.ArrayList;
import java.util.List;
import java.util.UUID;

class ToDoList {
    private List<Task> tasks;

    public ToDoList() {
        this.tasks = new ArrayList<>();
    }

    public void addTask(Task task) {
        tasks.add(task);
    }

    public boolean deleteTask(UUID taskId) {
        for (int i = tasks.size() - 1; i >= 0; i--) {
            if (tasks.get(i).getId().equals(taskId)) {
                tasks.remove(i);
                return true;
            }
        }
        return false;
    }

    public List<Task> getTasks() {
        return tasks;
    }
}