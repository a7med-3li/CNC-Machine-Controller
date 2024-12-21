package com.sage.cmc.models;

public class Tool {
    private String toolId;
    private String type;
    private String status;

    public Tool(String toolId, String type, String status) {
        this.toolId = toolId;
        this.type = type;
        this.status = status;
    }

    // Getters and Setters

    public String getToolId() {
        return toolId;
    }

    public void setToolId(String toolId) {
        this.toolId = toolId;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

}

