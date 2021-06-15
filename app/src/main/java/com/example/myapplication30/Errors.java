package com.example.myapplication30;
public class Errors {

    private String email,report;

    /**
     * @param email
     * @param report
     */
    public Errors(String email, String report) {
        this.email = email;
        this.report = report;
    }

    public Errors() {
    }

    /**
     * @return
     */
    public String getEmail() {
        return email;
    }

    /**
     * @param email
     */
    public void setEmail(String email) {
        this.email = email;
    }

    /**
     * @return
     */
    public String getReport() {
        return report;
    }

    /**
     * @param report
     */
    public void setReport(String report) {
        this.report = report;
    }
}
