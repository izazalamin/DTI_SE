package day9.ToDoTask;

import java.util.Scanner;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.UUID;

public class ToDoListApp {
    private static final Scanner scanner = new Scanner(System.in);
    private static User currentUser;
    private static List<User> users = new ArrayList<>();

    public static void main(String[] args) {
        while (true) {
            displayMainMenu();
            int choice = scanner.nextInt();

            switch (choice) {
                case 1:
                    registerUser();
                    break;
                case 2:
                    loginUser();
                    break;
                case 3:
                    if (currentUser != null) {
                        addTask();
                    } else {
                        System.out.println("Please log in first.");
                    }
                    break;
                case 4:
                    if (currentUser != null) {
                        viewTasks();
                    } else {
                        System.out.println("Please log in first.");
                    }
                    break;
                case 5:
                    if (currentUser != null) {
                        deleteTask();
                    } else {
                        System.out.println("Please log in first.");
                    }
                    break;
                case 6:
                    logout();
                    break;
                default:
                    System.out.println("Invalid choice. Please try again.");
            }
        }
    }

    private static void displayMainMenu() {
        System.out.println("1. Register");
                System.out.println("2. Login");
        System.out.println("3. Add Task");
        System.out.println("4. View Tasks");
        System.out.println("5. Delete Task");
        System.out.println("6. Logout");
        System.out.print("Enter your choice: ");
    }

    private static void registerUser() {
        System.out.print("Enter username: ");
        String username = scanner.next();

        System.out.print("Enter password: ");
        String password = scanner.next();


        // Validate username and password (e.g., check for existing users, enforce password policies)

        User user = new User(username, password);
        users.add(user);
        System.out.println("Account created successfully!");
    }

    private static void loginUser() {
        System.out.print("Enter username: ");
        String username = scanner.next();

        System.out.print("Enter password: ");
        String password = scanner.next();


        for (User user : users) {
            if (user.getUsername().equals(username) && user.getPassword().equals(password)) {
                currentUser = user;
                System.out.println("Login successful!");

                return;
            }
        }

        System.out.println("Invalid username or password.");
    }

    private static void addTask() {
        scanner.nextLine();
        System.out.print("Enter task description: ");
        String description = scanner.nextLine();


        Task task = new Task(description);

        currentUser.getTodoList().addTask(task);
        System.out.println("Task added successfully!");
    }

    private static void viewTasks() {
        List<Task> tasks = currentUser.getTodoList().getTasks();
        if (tasks.isEmpty()) {
            System.out.println("No tasks found.");
        } else {
            System.out.println("Your tasks:");
            for (Task task : tasks) {
                System.out.println("ID: " + task.getId() + ", Description: " + task.getDescription());
            }
        }
    }

    private static boolean deleteTask() {
        System.out.print("Enter task ID to delete: ");
        String taskIdString = scanner.next();

        try {
            UUID taskId = UUID.fromString(taskIdString);
            if (currentUser.getTodoList().deleteTask(taskId)) {
                System.out.println("Task deleted successfully!");
                return true;
            } else {
                System.out.println("Task not found.");
                return false;
            }
        } catch (IllegalArgumentException e) {
            System.out.println("Invalid task ID format.");
            return false;
        }
    }

    private static void logout() {
        currentUser = null;
        System.out.println("Logged out successfully.");
    }
}