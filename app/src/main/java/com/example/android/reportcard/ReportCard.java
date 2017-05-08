package com.example.android.reportcard;


import java.util.Arrays;

public class ReportCard {

    /////////////////////// declaration of variables
    // array of subjects
    private String mSubject[];
    // array of grades
    private char mGrade[];
    // int with a year we set
    private int mYear;

    // setter methods
    public void setSubjects(String[] Subjects) {
        this.mSubject = Subjects;
    }

    public void setGrades(char[] Grades) {
        this.mGrade = Grades;
    }

    public void setYear(int Year) {
        this.mYear = Year;
    }

    // getter methods
    public String[] getSubjects() {
        return mSubject;
    }

    public char[] getGrades() {
        return mGrade;
    }

    public int getYear() {
        return mYear;
    }

    // Constructor for ReportCard class
    public ReportCard(String[] Subjects, char[] Grades, int Year) {
        this.mSubject = Subjects;
        this.mGrade = Grades;
        this.mYear = Year;
    }

    // toString method returns String with all data in arrays in readable form.
    @Override
    public String toString() {
        String result = "Year: " + mYear + "\n"
                + "Subjects: " + Arrays.toString(mSubject) + "\n"
                + "Grades: " + Arrays.toString(mGrade);
        return result;
    }
}
