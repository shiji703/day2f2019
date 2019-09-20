package com.lambton;

import java.util.Arrays;

public class Student
{
    int studentID;
    String FirstName;
    String LastName;
    int[] marksof5subjects;
    int Total;
    float percentage;
    String result;

    public int getStudentID()
    {

        return studentID;
    }

    public void setStudentID(int studentID)
    {
        this.studentID = studentID;
    }

    public String getFirstName()
    {
        return FirstName;
    }

    public void setFirstName(String firstName)
    {
        FirstName = firstName;
    }

    public String getLastName()
    {
        return LastName;
    }

    public void setLastName(String lastName)
    {
        LastName = lastName;
    }

    public int[] getMarksof5subjects()
    {
        return marksof5subjects;
    }

    public void setMarksof5subjects(int[] marksof5subjects)
    {
        this.marksof5subjects = marksof5subjects;
    }

    public int getTotal()
    {
        return Total;
    }

    public void setTotal(int total)
    {
        Total = total;
    }

    public float getPercentage()
    {
        return percentage;
    }

    public void setPercentage(float percentage)
    {
        this.percentage = percentage;
    }

    public String getResult()
    {
        return result;
    }

    public void setResult(String result)
    {
        this.result = result;
    }
}
