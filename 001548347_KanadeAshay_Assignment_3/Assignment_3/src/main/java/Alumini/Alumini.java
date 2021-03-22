/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Alumini;

/**
 *
 * @author kanad
 */
public class Alumini {
    private String AID;
    private String AName;
    private String ACourse;
    private String ContactNum;
    private String Grade;
    private String Job;
    private String JobPosition;

    public String getAID() {
        return AID;
    }

    public void setAID(String AID) {
        this.AID = AID;
    }

    public String getJobPosition() {
        return JobPosition;
    }

    public void setJobPosition(String JobPosition) {
        this.JobPosition = JobPosition;
    }

    public String getAName() {
        return AName;
    }

    public void setAName(String AName) {
        this.AName = AName;
    }

    public String getACourse() {
        return ACourse;
    }

    public void setACourse(String ACourse) {
        this.ACourse = ACourse;
    }

    public String getContactNum() {
        return ContactNum;
    }

    public void setContactNum(String ContactNum) {
        this.ContactNum = ContactNum;
    }

    public String getGrade() {
        return Grade;
    }

    public void setGrade(String Grade) {
        this.Grade = Grade;
    }

    public String getJob() {
        return Job;
    }

    public void setJob(String Job) {
        this.Job = Job;
    }
    
    @Override
    public String toString(){
        return AName;   
    }
    
}
