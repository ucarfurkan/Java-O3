package com.company;

public class Instructor extends User {
    private String branch;

    public Instructor(int id, String userName, String fullName, String branch) {
        super(id, userName, fullName);
        this.branch = branch;
    }

    public String getBranch() {
        return branch;
    }

    public void setBranch(String branch) {
        this.branch = branch;
    }

}
