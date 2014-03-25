/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package ca.uw.myapp.Object;

/**
 *
 * @author siva
 */

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="APPOINTMENTS")
public class Appointments {
    @Id
    @Column(name="patientid")
    private String patientId;
    
    @Column(name="dateofapp")
    private String dateOfApp;
    
    @Column(name="doctorid")
    private String doctorId;
    
    @Column(name="comments")
    private String comments;
    
    @Column(name="status")
    private String status;
    
    @Column(name="schedlength")
    private String schedLength;
    
    @Column(name="proceduredesc")
    private String procedureDesc;

    public Appointments() {
    }

    public String getPatientId() {
        return patientId;
    }

    public void setPatientId(String patientId) {
        this.patientId = patientId;
    }

    public String getDateOfApp() {
        return dateOfApp;
    }

    public void setDateOfApp(String dateOfApp) {
        this.dateOfApp = dateOfApp;
    }

    public String getDoctorId() {
        return doctorId;
    }

    public void setDoctorId(String doctorId) {
        this.doctorId = doctorId;
    }

    public String getComments() {
        return comments;
    }

    public void setComments(String comments) {
        this.comments = comments;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public String getSchedLength() {
        return schedLength;
    }

    public void setSchedLength(String schedLength) {
        this.schedLength = schedLength;
    }

    public String getProcedureDesc() {
        return procedureDesc;
    }

    public void setProcedureDesc(String procedureDesc) {
        this.procedureDesc = procedureDesc;
    }
    
    
}
