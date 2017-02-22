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
        this.setCourseName(courseName);
        this.setCourseNumber(courseNumber);
        this.setCredits(credits);
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

    
    

    
}
