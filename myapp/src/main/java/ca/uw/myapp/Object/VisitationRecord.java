/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package ca.uw.myapp.Object;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

/**
 *
 * @author siva
 */

@Entity
@Table(name="VISITATIONRECORD")
public class VisitationRecord {
    @Id
    @Column(name="patientid")
    private String patientId;
    
    @Column(name="visitdate")
    private String visitDate;
    @Column(name="revno")
    private int revNo;
    @Column(name="doctorId")
    private String doctorId;
    @Column(name="starttime")
    private String startTime;
    @Column(name="endtime")
    private String endTime;
    @Column(name="prescriptionid")
    private String prescriptionId;
    @Column(name="diagnosis")
    private String diagnosis;
    @Column(name="surgeryperformed")
    private String surgeryPerformed;
    @Column(name="comments")
    private String comments;

    public VisitationRecord() {
    }

    public String getPatientId() {
        return patientId;
    }

    public void setPatientId(String patientId) {
        this.patientId = patientId;
    }

    public String getVisitDate() {
        return visitDate;
    }

    public void setVisitDate(String visitDate) {
        this.visitDate = visitDate;
    }

    public int getRevNo() {
        return revNo;
    }

    public void setRevNo(int revNo) {
        this.revNo = revNo;
    }

    public String getDoctorId() {
        return doctorId;
    }

    public void setDoctorId(String doctorId) {
        this.doctorId = doctorId;
    }

    public String getStartTime() {
        return startTime;
    }

    public void setStartTime(String startTime) {
        this.startTime = startTime;
    }

    public String getEndTime() {
        return endTime;
    }

    public void setEndTime(String endTime) {
        this.endTime = endTime;
    }

    public String getPrescriptionId() {
        return prescriptionId;
    }

    public void setPrescriptionId(String prescriptionId) {
        this.prescriptionId = prescriptionId;
    }

    public String getDiagnosis() {
        return diagnosis;
    }

    public void setDiagnosis(String diagnosis) {
        this.diagnosis = diagnosis;
    }

    public String getSurgeryPerformed() {
        return surgeryPerformed;
    }

    public void setSurgeryPerformed(String surgeryPerformed) {
        this.surgeryPerformed = surgeryPerformed;
    }

    public String getComments() {
        return comments;
    }

    public void setComments(String comments) {
        this.comments = comments;
    }
    
    
         
    
    
}
