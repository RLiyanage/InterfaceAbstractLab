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
        SoftwareProgrammingCourse programingCourse = new IntroToProgrammingCourse("IntroProgramming","152-134",2.0);
        College college = new College();
        CollegeCatalog catalog = new CollegeCatalog();
        catalog.addCourses(programingCourse);
        college.setCatalog(catalog);
        System.out.println(college.getCatalog().getProgrammingCource().get(0).getCourseName());
        college.printCatalog();
    }   
}
