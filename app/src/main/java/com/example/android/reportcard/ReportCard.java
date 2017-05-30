package com.example.android.reportcard;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

public class ReportCard  {

    // student's name

    private int mStudentIdNumber;

   // student's surname name

    private String mStudentSurname;

    // student's first name
    private String getmStudentName;

    //four courses (A,B,C,D) grades
    // course A grade
    private int mCourseAGrade;
    // course B grade
    private int mCourseBGrade;

    public ReportCard(int StudentIdNumber, String StudentName, String StudentSurName, String CourseAGrade, String CourseBGrade){
        mStudentIdNumber = StudentIdNumber;
        mStudentName = StudentName;
        mStudentSurname = StudentSurnName;
        mCourseAGrade = CourseAGrade;
        mCourseBGrade = CourseBGrade;

    }
    public int getStudentIdNumber() {
        return mStudentIdNumber;
    }

    public void setStudentId(int studentId) {
        mStudentIdNumber = studentId;
    }


    public String getStudentName() {
        return mStudentName;
    }

    public void setStudentName(String StudentName) {
        mStudentName = StudentName;
    }
    public String getStudentSurnName() {
        return mStudentSurnName;
    }

    public void setStudentSurnName(String StudentSurnName) {
        mStudentSurnName = StudentSurnName;
    }




    @Override
    public String toString() {
        return "Student{ " +
                "\nID: " + mStudentId +
                "\nFirst name: " + mStudentFirstName +
                "\nLast name: " + mStudentLastName +
                "\nGrade in Mathematics: " + mMathematicsGrade +
                "\nGrade in Chemistry: " + mChemistryGrade +
                "\nGrade in History: " + mHistoryGrade + " }";

    }



}
