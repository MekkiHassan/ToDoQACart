package com.qacart.todo.Objects;

public class CompletTask {
    private  String item;
    private boolean isCompleted ;

    public CompletTask(String item, boolean isCompleted) {
        this.item = item;
        this.isCompleted = isCompleted;
    }

    public String getItem() {
        return item;
    }

    public void setItem(String item) {
        this.item = item;
    }

    public boolean getIsCompleted() {
        return isCompleted;
    }

    public void setCompleted(boolean isCompleted) {
        isCompleted = isCompleted;
    }



}
