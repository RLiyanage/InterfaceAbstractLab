package lab1;



/**
 * Describe responsibilities here. NOTE: this class has NO PREREQUISITES! Do not
 * change this fact.
 *
 * @author Rasika
 * @version 1.00
 */
public class IntroToProgrammingCourse extends SoftwareProgrammingCourse {
    
    public IntroToProgrammingCourse(String courseName, String courseNumber, double credits) {
        this.setCourseName(courseName);
        this.setCourseNumber(courseNumber);
        this.setCredits(credits);
    }
    
    @Override
    public void setPrerequisites(String prerequisites) {        
    }
    
    @Override
    public String getPrerequisites() {
        return ("None");        
    }
}
