package test;

/**
 * Created by Thoughtworks on 16-3-18.
 */
public class ToDoList {

    int totalTaskCount;
    int finishedTaskCount;

    public ToDoList() {
        totalTaskCount = finishedTaskCount = 0;
    }

    public int getTotalTaskCount() {
        return totalTaskCount;
    }

    public void setTotalTaskCount(int count) {
        totalTaskCount = count;
    }

    public void finishTask(int count) {
        finishedTaskCount = count;
    }

    public int getRestTasksCount() {
        return totalTaskCount - finishedTaskCount;
    }
}