package lab2;

/**
 * Describe responsibilities here.
 *
 * @author your name goes here
 * @version 1.00
 */
public class IntroJavaCourse implements SoftwareProgrammingCourse {

    public String courseName;
    public String courseNumber;
    public double credits;
    public String prerequisites;

    public IntroJavaCourse(String courseName, String courseNumber, double credits) {
        this.courseName = courseName;
        this.courseNumber = courseNumber;
    }

    @Override
    public String getCourseNumber() {
        return courseNumber;
    }

    @Override
    public void setCourseNumber(String courseNumber) {
        if (courseNumber == null || courseNumber.length() == 0) {
            throw new IllegalArgumentException("Error: courseNumber cannot be null of empty string");
        }
        this.courseNumber = courseNumber;

    }

    @Override
    public double getCredits() {
        return credits;
    }

    @Override
    public void setCredits(double credits) {
        if (credits < 0.5 || credits > 4.0) {
            throw new IllegalArgumentException("Error: credits must be in the range 0.5 to 4.0");
        }
        this.credits = credits;

    }

    @Override
    public String getPrerequisites() {
        return prerequisites;
    }

    @Override
    public void setPrerequisites(String prerequisites) {
        this.prerequisites = prerequisites;
    }

    @Override
    public String getCourseName() {
        return courseName;
    }

    @Override
    public void setCourseName(String courseName) {
        if (courseName == null || courseName.length() == 0) {
            throw new IllegalArgumentException("Error: courseName cannot be null of empty string");
        }
        this.courseName = courseName;
    }

}
