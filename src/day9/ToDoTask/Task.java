package day9.ToDoTask;

import java.util.UUID;

class Task {
    private UUID id;
    private String description;
    private boolean isCompleted;

    public Task(String description) {
        this.id = UUID.randomUUID();
        this.description = description;
        this.isCompleted = false;
    }

    public UUID getId() {
        return id;
    }

    public String getDescription() {
        return description;
    }

    public boolean isCompleted() {
        return isCompleted;

    }

    private int generateUniqueId() {
        // Implement a unique ID generation strategy (e.g., using a static counter)
        return 1; // Placeholder
    }
}
