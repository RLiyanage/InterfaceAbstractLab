/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab2;

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
        catalog.addCourse(programingCourse1);
        catalog.addCourse(programmingCourse2);
        catalog.addCourse(programmingCourse3); 
        programmingCourse2.setPrerequisites("Need to complete Intro Programming course.");
        programmingCourse3.setPrerequisites("Need to complete Java Programming course.");
        college.addCouse(programingCourse1);
        //System.out.println(college.getCatalog().getProgrammingCource().get(0).getCourseName());
        college.setCollegeName("College Name: "+ "WCTC");
        report.printReport(college.getCollegeName());
        college.printCatalog();
    }   
}
