package com.Richard;

import java.util.ArrayList;

/**
 * Created by NinjaHunter on 3/11/17.
 */
public class ITECCourse {
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getCode() {
        return code;
    }

    public void setCode(int code) {
        this.code = code;
    }

    public int getMaxStudents() {
        return maxStudents;
    }

    public void setMaxStudents(int maxStudents) {
        this.maxStudents = maxStudents;
    }

    public String getRoom() {
        return room;
    }

    public void setRoom(String room) {
        this.room = room;
    }

    private String name;
    private int code;
    private ArrayList<String> students;
    private int maxStudents;
    private String room;

    //Constructor
    public ITECCourse(String courseName, String courseRoom, int courseCode, int courseMaxStudents){
        this.name = courseName;
        this.code = courseCode;
        this.students = new ArrayList<String>();
        this.maxStudents = courseMaxStudents;
        this.room = courseRoom;
    }

    public void addStudent(String studentName){
        //Adding students

        //Doesn't add student if max limit is reached.
        if(students.size() == maxStudents){
            System.out.println("Course is full - can't add " + studentName);
            System.out.println("The maximum number of students is " + maxStudents);
        }else{
            students.add(studentName);
        }
    }

    public void writeCourseinfo(){
        //displaying the course name, room, code, the number of students in the class, max students, and the names of each student.
        System.out.println("Course name: " + name);
        System.out.println("Room: " + room);
        System.out.println("Course code: " + code);
        System.out.println("Number of students currently enrolled: " + students.size());
        System.out.println("Maximum class size: " + maxStudents);
        System.out.println("Students enrolled: " + students);
    }

    public void spotsOpen(){
        //Calculates and displays spots available in the class.
        int open = maxStudents - students.size();
        System.out.println("Spots available in " + name + ": " + open);
    }
}
