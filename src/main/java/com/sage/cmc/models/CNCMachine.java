package com.sage.cmc.models;

public class CNCMachine {
    private String machineId;
    private String status;
    private Position currentPosition;
    private Position targetPosition;
    private int speed;
    private Tool currentTool;

    public CNCMachine(){}

    public CNCMachine(String machineId, String status, Position currentPosition, Position targetPosition, int speed, Tool currentTool) {
        this.machineId = machineId;
        this.status = status;
        this.currentPosition = currentPosition;
        this.targetPosition = targetPosition;
        this.speed = speed;
        this.currentTool = currentTool;
    }

    // Getters and Setters
    public String getMachineId() {
        return machineId;
    }

    public void setMachineId(String machineId) {
        this.machineId = machineId;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public Position getCurrentPosition() {
        return currentPosition;
    }

    public void setCurrentPosition(Position currentPosition) {
        this.currentPosition = currentPosition;
    }

    public Position getTargetPosition() {
        return targetPosition;
    }

    public void setTargetPosition(Position targetPosition) {
        this.targetPosition = targetPosition;
    }

    public int getSpeed() {
        return speed;
    }

    public void setSpeed(int speed) {
        this.speed = speed;
    }

    public Tool getCurrentTool() {
        return currentTool;
    }

    public void setCurrentTool(Tool currentTool) {
        this.currentTool = currentTool;
    }

    // Methods: initialize(), start(), stop(), reset(), updatePosition()


}
