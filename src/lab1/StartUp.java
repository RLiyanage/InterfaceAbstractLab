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
public class StartUp {
    public static void main(String[] args) {
        PrintReport report = new PrintReport();
        SoftwareProgrammingCourse programingCourse1 = new IntroToProgrammingCourse("IntroProgramming","152-107",2.0);
        SoftwareProgrammingCourse programmingCourse2 = new IntroJavaCourse("Intro Java Programming","152-134",4);
        SoftwareProgrammingCourse programmingCourse3 = new AdvancedJavaCourse("Advanced Java Programming","152-135",4);
        College college = new College("WCTC");
        CollegeCatalog catalog = new CollegeCatalog();
        catalog.addCourses(programingCourse1);
        catalog.addCourses(programmingCourse2);
        catalog.addCourses(programmingCourse3); 
        programmingCourse2.setPrerequisites("Need to complete Intro Programming.");
        programmingCourse3.setPrerequisites("Need to complete Java Programming.");
        college.setCatalog(catalog);
        //System.out.println(college.getCatalog().getProgrammingCource().get(0).getCourseName());
        college.printCatalog();
    }   
}
