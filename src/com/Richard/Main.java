package com.Richard;

import java.util.ArrayList;

public class Main {

    public static void main(String[] args) {
	// write your code here
        ITECCourse concepts = new ITECCourse("Info Tech Concepts","T3050", 1100, 30);

        concepts.addStudent("Max");
        concepts.addStudent("Nancy");
        concepts.addStudent("Orson");

        ArrayList<ITECCourse> courses = new ArrayList<ITECCourse>();
        courses.add(concepts);

        for (ITECCourse x : courses) {
            x.spotsOpen();
        }

        concepts.writeCourseinfo();
    }
}
