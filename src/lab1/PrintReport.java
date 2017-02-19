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
public class PrintReport {
    String report;

    public PrintReport() {
        
    }

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
