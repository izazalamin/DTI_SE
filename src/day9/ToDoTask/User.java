package day9.ToDoTask;

class User {
    private String username;
    private String password;
    private ToDoList todoList;

    public User(String username, String password) {
        this.username = username;
        this.password = password;
        this.todoList = new ToDoList();
    }

    public String getUsername() {
        return username;
    }

    public String getPassword() {
        return password;
    }

    public ToDoList getTodoList() {
        return todoList;
    }
}
