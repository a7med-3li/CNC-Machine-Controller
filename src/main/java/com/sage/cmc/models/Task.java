package com.sage.cmc.models;

import java.time.LocalDateTime;
import java.util.List;

public class Task {
    private String taskID;
    private List<GCode> gCodeList;
    private String status;
    private LocalDateTime startTime;
    private LocalDateTime endTime;

    public Task(String taskID, List<GCode> gCodeList, String status, LocalDateTime startTime, LocalDateTime endTime) {
        this.taskID = taskID;
        this.gCodeList = gCodeList;
        this.status = status;
        this.startTime = startTime;
        this.endTime = endTime;
    }

    // Getters and Setters


    public String getTaskID() {
        return taskID;
    }

    public void setTaskID(String taskID) {
        this.taskID = taskID;
    }

    public List<GCode> getgCodeList() {
        return gCodeList;
    }

    public void setgCodeList(List<GCode> gCodeList) {
        this.gCodeList = gCodeList;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public LocalDateTime getStartTime() {
        return startTime;
    }

    public void setStartTime(LocalDateTime startTime) {
        this.startTime = startTime;
    }

    public LocalDateTime getEndTime() {
        return endTime;
    }

    public void setEndTime(LocalDateTime endTime) {
        this.endTime = endTime;
    }
}

