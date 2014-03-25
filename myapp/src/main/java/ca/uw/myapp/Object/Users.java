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
import javax.validation.constraints.NotNull;

/**
 *
 * @author siva
 */

@Entity
@Table(name="USERS")
public class Users {
    
    @Id
    private String userid;
    
    @Column(name="username")
    private String username;
    
    @Column(name="password")
    private String password;
    
    @Column(name="firstName")
    private String firstname;
    @Column(name="middleName")
    private String middlename;
    @Column(name="lastName")
    private String lastname;
   
    @Column(name="zip",length=6)
    private String zip;
    
    @Column(name="dateOfBirth")
    private String dateofbirth;
    
    @Column(name="aptNo")
    private String apt_no;
    
    @Column(name="homePhoneNo")
    private int homephoneno;
    @Column(name="cellPhoneNo")
    private int cellphoneno;
    @Column(name="workPhoneNo")
    private int workphoneno;
    
    @Column(name="emergencyContactName")
    private String emergencycontactname;
    @Column(name="emergencycontactno")
    private String emergencyContactNo;
    
   
    
    
    public Users(){}

    public String getUserid() {
        return userid;
    }

    public void setUserid(String userid) {
        this.userid = userid;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getFirstname() {
        return firstname;
    }

    public void setFirstname(String firstname) {
        this.firstname = firstname;
    }

    public String getMiddlename() {
        return middlename;
    }

    public void setMiddlename(String middlename) {
        this.middlename = middlename;
    }

    public String getLastname() {
        return lastname;
    }

    public void setLastname(String lastname) {
        this.lastname = lastname;
    }

    public String getZip() {
        return zip;
    }

    public void setZip(String zip) {
        this.zip = zip;
    }

    public String getDateofbirth() {
        return dateofbirth;
    }

    public void setDateofbirth(String dateofbirth) {
        this.dateofbirth = dateofbirth;
    }

    public String getApt_no() {
        return apt_no;
    }

    public void setApt_no(String apt_no) {
        this.apt_no = apt_no;
    }

    public int getHomephoneno() {
        return homephoneno;
    }

    public void setHomephoneno(int homephoneno) {
        this.homephoneno = homephoneno;
    }

    public int getCellphoneno() {
        return cellphoneno;
    }

    public void setCellphoneno(int cellphoneno) {
        this.cellphoneno = cellphoneno;
    }

    public int getWorkphoneno() {
        return workphoneno;
    }

    public void setWorkphoneno(int workphoneno) {
        this.workphoneno = workphoneno;
    }

    public String getEmergencycontactname() {
        return emergencycontactname;
    }

    public void setEmergencycontactname(String emergencycontactname) {
        this.emergencycontactname = emergencycontactname;
    }

    public String getEmergencyContactNo() {
        return emergencyContactNo;
    }

    public void setEmergencyContactNo(String emergencyContactNo) {
        this.emergencyContactNo = emergencyContactNo;
    }
    
    

    
    
    
    
}
