package com.qacart.todo.Objects;

public class Tasks {




    private  String item;
    private boolean isCompleted;

    public  Tasks (String item,boolean isCompleted){
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
        public void setIsCompleted(boolean isCompleted) {
        this.isCompleted = isCompleted;
    }
}
