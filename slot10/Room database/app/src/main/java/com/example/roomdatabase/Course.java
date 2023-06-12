package com.example.roomdatabase;

import androidx.room.Entity;
import androidx.room.PrimaryKey;

@Entity(tableName = "course_table")//Setting table name
public class Course {
    // below line is to auto increment id for each course.
    // variable for our id.
    @PrimaryKey(autoGenerate = true)
    private int id;
    // below line is a variable for course name.
    private String courseName;
    // below line is use for course description.
    private String courseDescription;
    // below line is use for course duration.
    private String courseDuration;
    // below line we are creating constructor class.
    // inside constructor class we are not passing
    // our id because it is incrementing automatically.
    public Course(String courseName, String courseDescription,
                  String courseDuration) {
        this.courseName = courseName;
        this.courseDescription = courseDescription;
        this.courseDuration = courseDuration;
    }
    public String getCourseName() {
        return courseName;
    }
    public void setCourseName(String courseName) {
        this.courseName = courseName;
    }
    public String getCourseDescription() {
        return courseDescription;
    }
    public void setCourseDescription(String courseDescription)
    {
        this.courseDescription = courseDescription;
    }
    public String getCourseDuration() {
        return courseDuration;
    }
    public void setCourseDuration(String courseDuration) {
        this.courseDuration = courseDuration;
    }
    public int getId() {
        return id;
    }
    public void setId(int id) {
        this.id = id;
    }
}
