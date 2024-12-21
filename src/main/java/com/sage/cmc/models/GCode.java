package com.sage.cmc.models;

import java.util.Map;

public class GCode {
    private String command;
    private Map<String, String> parameters;

    public GCode(String command, Map<String, String> parameters) {
        this.command = command;
        this.parameters = parameters;
    }

    // Getters and Setters


    public String getCommand() {
        return command;
    }

    public void setCommand(String command) {
        this.command = command;
    }

    public Map<String, String> getParameters() {
        return parameters;
    }

    public void setParameters(Map<String, String> parameters) {
        this.parameters = parameters;
    }
}
