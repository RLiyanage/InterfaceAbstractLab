package lab1;

/**
 * Describe responsibilities here.
 *
 * @author your name goes here
 * @version 1.00
 */
public class IntroJavaCourse extends SoftwareProgrammingCourse {

    private String prerequisites;

    public IntroJavaCourse(String courseName, String courseNumber, double credits) {
        super(courseName, courseNumber, credits);
    }

    @Override
    public final void setCourseNumber(String courseNumber) {
        if (courseNumber == null || courseNumber.length() == 0) {
            throw new IllegalArgumentException("Error: courseNumber cannot be null of empty string");
        }
        super.setCourseNumber(courseNumber);

    }

    @Override
    public String getPrerequisites() {
        return prerequisites;
    }

    @Override
    public void setPrerequisites(String prerequisites) {
        if (prerequisites == null || prerequisites.length() == 0) {
            throw new IllegalArgumentException("Error: prerequisites cannot be null of empty string");
        }
        this.prerequisites = prerequisites;
    }

    @Override
    public void setCredits(double credits) {
        if (credits < 0 || credits > 5.0) {
            throw new IllegalArgumentException("Error: credits must be in the range 0.5 to 4.0");
        }
        super.setCredits(credits);
    }

    @Override
    public final void setCourseName(String courseName) {
        if (courseName == null || courseName.length() == 0) {
            throw new IllegalArgumentException("Error: courseName cannot be null of empty string");
        }
        super.setCourseName(courseName);
    }

}
