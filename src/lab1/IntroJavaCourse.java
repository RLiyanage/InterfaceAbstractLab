package lab1;

/**
 * Describe responsibilities here.
 *
 * @author      your name goes here
 * @version     1.00
 */
public class IntroJavaCourse extends SoftwareProgrammingCourse {   

    private String prerequisites;

    public IntroJavaCourse(String courseName, String courseNumber,double credits) {
        super(courseName,courseNumber,credits);
    }

    @Override
    public void setCourseNumber(String courseNumber) {
        super.setCourseNumber(courseNumber);
    }

    public String getPrerequisites() {
        return prerequisites;
    }

    public void setPrerequisites(String prerequisites) {
        this.prerequisites = prerequisites;
    }

        public void setCredits(double credits) {
        if(credits < 0 || credits > 5.0) {
            
         throw new IllegalArgumentException("Error: credits must be in the range 0.5 to 4.0");
           
        }
        this.setCredits(credits);
    }

    

}
