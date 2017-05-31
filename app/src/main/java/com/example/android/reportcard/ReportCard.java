package com.example.android.reportcard;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

public class ReportCard  {

    // student's name

    private int mStudentIdNumber;

   // student's surname name

    private String mStudentSurname;

    // student's first name
    private String mStudentName;

    //four courses (A,B,C,D) grades
    // course A grade
    private int mCourseAGrade;
    // course B grade
    private int mCourseBGrade;

    public ReportCard(int StudentIdNumber, String StudentName, String StudentSurName, int CourseAGrade, int CourseBGrade){
        mStudentIdNumber = StudentIdNumber;
        mStudentName = StudentName;
        mStudentSurname = StudentSurName;
        mCourseAGrade = CourseAGrade;
        mCourseBGrade = CourseBGrade;

    }
    public int getStudentIdNumber() {
        return mStudentIdNumber;
    }

    public void setmStudentIdNumber(int studentIdNumber) {
        mStudentIdNumber = getStudentIdNumber();
    }


    public String getStudentName() {
        return mStudentName;
    }

    public void setStudentName(String StudentName) {
        mStudentName = StudentName;
    }
    public String getStudentSurname() {
        return mStudentSurname;
    }

    public void setStudentSurname(String StudentSurname) {
        mStudentSurname = StudentSurname;
    }

    public int getCourseAGrade() {
        return mCourseAGrade;
    }

    public void setCourseAGrade(int CourseAGrade) {
        mCourseAGrade = CourseAGrade;
    }
    public int getCourseBGrade() {
        return mCourseBGrade;
    }

    public void setCourseBGrade(int CourseBGrade) {
        mCourseBGrade = CourseBGrade;
    }



    @Override
    public String toString() {
        return "Student " + "\nID Number: " + mStudentIdNumber + "\nName: " + mStudentName
                + "\nSurname: " + mStudentSurname + "\nGrade in A course: " + mCourseAGrade
                + "\nGrade in B course: " + mCourseBGrade;
    }

    }




