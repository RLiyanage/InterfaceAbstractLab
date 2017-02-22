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
public class PrintReport {
    String report;
   

    public void printReport(String report){
        System.out.println(report);
    }  

    public String getReport() {
        return report;
    }

    public void setReport(String report) {
        this.report = report;
    }
}
