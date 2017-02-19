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
public class College {
     private CollegeCatalog catalog;
     private PrintReport printReport;
     private String collegeName;

    public College(String collegeName) {
        this.catalog = new CollegeCatalog();
        this.printReport = new PrintReport();
        
    }

    public void setCatalog(CollegeCatalog catalog) {
        this.catalog = catalog;
    }

    public CollegeCatalog getCatalog() {
        return catalog;
    }

    public void addCouses(SoftwareProgrammingCourse course){
        this.catalog.addCourses(course);
    }
    
    public void printCatalog(){
        for (SoftwareProgrammingCourse c : catalog.getProgrammingCource() ){
            printReport.printReport("Course Name : " + c.getCourseName()+" Couse Number: "+ c.getCourseNumber()+" " + 
                    "Credit:"+ c.getCredits()+ " " + " Prerequisites:" + c.getPrerequisites() );
        }
    }

    public String getCollegeName() {
        return collegeName;
    }

    public void setCollegeName(String collegeName) {
        this.collegeName = collegeName;
    }
}
