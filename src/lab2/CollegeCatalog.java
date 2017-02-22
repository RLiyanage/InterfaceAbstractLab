/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab2;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Sanuth
 */
public class CollegeCatalog {

    private List<SoftwareProgrammingCourse> programmingCource;

    public CollegeCatalog() {
        this.programmingCource = new ArrayList();
    }

    public void addCourse(SoftwareProgrammingCourse course) {
        this.programmingCource.add(course);
    }

    public void setProgrammingCource(List<SoftwareProgrammingCourse> programmingCource) {
        this.programmingCource = programmingCource;
    }

    public List<SoftwareProgrammingCourse> getProgrammingCource() {
        return programmingCource;
    }

}
