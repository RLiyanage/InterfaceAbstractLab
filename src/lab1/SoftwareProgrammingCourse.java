/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab1;

/**
 *
 * @author Sanuth
 */
public abstract class SoftwareProgrammingCourse {

    private String courseName;
    private String courseNumber;
    private double credits;

    public SoftwareProgrammingCourse(String courseName, String courseNumber, double credits) {
        this.courseName = courseName;
        this.courseNumber = courseNumber;
        this.credits = credits;
    }

    public void setCourseNumber(String courseNumber) {
        this.courseNumber = courseNumber;
    }

    public String getCourseNumber() {
        return courseNumber;
    }

    public double getCredits() {
        return credits;
    }

    public void setCredits(double credits) {
        this.credits = credits;
    }

    public void setCourseName(String courseName) {
        this.courseName = courseName;
    }

    public String getCourseName() {
        return courseName;
    }

    public abstract void setPrerequisites(String prerequisites);

    public abstract String getPrerequisites();
}
