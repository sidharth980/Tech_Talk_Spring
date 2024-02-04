package org.example.Student.Model;

public class Student {
    private long id; // Generate unique IDs for easier management
    private String name;
    private String major;

    public Student(String name, String major) {
        this.name = name;
        this.major = major;
    }

    public Student() {
    }

    public Student(long id, String name, String major) {
        this.id = id;
        this.name = name;
        this.major = major;
    }

    public void setId(long id) {
        this.id = id;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setMajor(String major) {
        this.major = major;
    }

    public long getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public String getMajor() {
        return major;
    }
// Getters, setters, constructors (including one with ID)
}