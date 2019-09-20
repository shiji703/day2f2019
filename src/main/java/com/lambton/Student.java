package com.lambton;
public class Student {
    private int PASS_MARKS = 50;
    private int studentId;
    private String firstName;
    private String lastName;
    private int marks1;
    private int marks2;
    private int marks3;
    private int marks4;
    private int marks5;
    private float percentage;
    private String results;
    private int total;
    public int getStudentId() {
        return studentId;
    }
    public void setStudentId(int studentId) {
        this.studentId = studentId;
    }
    public String getFirstName() {
        return firstName;
    }
    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }
    public String getLastName() {
        return lastName;
    }
    public void setLastName(String lastName) {
        this.lastName = lastName;
    }
    public int getMarks1() {
        return marks1;
    }
    public void setMarks1(int marks1) {
        this.marks1 = marks1;
    }
    public int getMarks2() {
        return marks2;
    }
    public void setMarks2(int marks2) {
        this.marks2 = marks2;
    }
    public int getMarks3() {
        return marks3;
    }
    public void setMarks3(int marks3) {
        this.marks3 = marks3;
    }
    public int getMarks4() {
        return marks4;
    }
    public void setMarks4(int marks4) {
        this.marks4 = marks4;
    }
    public int getMarks5() {
        return marks5;
    }
    public void setMarks5(int marks5) {
        this.marks5 = marks5;
    }
    public float getPercentage() {
        return percentage;
    }
    /* public void setPercentage(float percentage) {
         this.percentage = percentage;
     }*/
    public String getResults() {
        return results;
    }
    /* public void setResults(String results) {
         this.results = results;
     }*/
    public String getFullName() {
        return firstName + " " + lastName;
    }
    public int getTotal() {
        return total;
    }
    public void calculateTotal() {
        total = marks1 + marks2 + marks3 + marks4 + marks5;
    }
    public void calculatePercentage() {
        percentage = total / 5 * 100;
    }
    public void generateResult()
    {
        if(determineResult())
        {
            System.out.println("PASS");
        }
        else
        {
            System.out.println("FAIL");
        }
    }
    private boolean determineResult() {
        int count = 0;
        if (marks1 < PASS_MARKS) {
            count++;
        }
        if (marks2 < PASS_MARKS) {
            count++;
        }
        if (marks3 < PASS_MARKS) {
            count++;
        }
        if (marks4 < PASS_MARKS) {
            count++;
        }
        if (marks5 < PASS_MARKS) {
            count++;
        }
        if(count ==1)
        {
            System.out.println("FAIL");
            return false;
        }else if(count >= 2)
        {
            System.out.println("FAIl");
            return  false;
        }
        if (count >= 2) {
            return false;
        }
        return true;
    }
}