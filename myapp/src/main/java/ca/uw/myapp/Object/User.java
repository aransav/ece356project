/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package ca.uw.myapp.Object;

import java.io.Serializable;
import java.sql.Date;
import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;
import javax.validation.constraints.NotNull;

/**
 *
 * @author siva
 */

@Entity
@Table(name="_USER")
public class User implements Serializable {
    
    @Id
    @Column(name="id")
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    
    @Column(name="username")
    @NotNull
    private String username;
    
    @Column(name="password")
    private String password;
    
    @Column(name="first_name")
    @NotNull
    private String firstname;
    
    @Column(name="middle_name")
    private String middlename;
    
    @Column(name="last_name")
    @NotNull
    private String lastname;
    
    @Column(name="gender")
    private String gender;
    
    @ManyToOne(cascade={CascadeType.ALL})
    @JoinColumn(name = "address_id")
    private Address address;
    
    @Column(name="date_of_birth")
    private Date dateofbirth;
    
    @Column(name="phone_home")
    private int homephoneno;
    @Column(name="phone_cell")
    private int cellphoneno;
    @Column(name="phone_work")
    private int workphoneno;
    
    @Column(name="emerg_contact_first_name")
    private String emerg_contact_first_name;
    @Column(name="emerg_contact_last_name")
    private String emerg_contact_last_name;
    @Column(name="phone_emerg")
    private String emergencyContactNo;
    @Column(name="emerg_relation")
    private String emergencyRelation;
    
   
    
    
    public User(){}

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
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

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public Address getAddress() {
        return address;
    }

    public void setAddress(Address address) {
        this.address = address;
    }

    public Date getDateofbirth() {
        return dateofbirth;
    }

    public void setDateofbirth(Date dateofbirth) {
        this.dateofbirth = dateofbirth;
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

    public String getEmerg_contact_first_name() {
        return emerg_contact_first_name;
    }

    public void setEmerg_contact_first_name(String emerg_contact_first_name) {
        this.emerg_contact_first_name = emerg_contact_first_name;
    }

    public String getEmerg_contact_last_name() {
        return emerg_contact_last_name;
    }

    public void setEmerg_contact_last_name(String emerg_contact_last_name) {
        this.emerg_contact_last_name = emerg_contact_last_name;
    }

    public String getEmergencyContactNo() {
        return emergencyContactNo;
    }

    public void setEmergencyContactNo(String emergencyContactNo) {
        this.emergencyContactNo = emergencyContactNo;
    }

    public String getEmergencyRelation() {
        return emergencyRelation;
    }

    public void setEmergencyRelation(String emergencyRelation) {
        this.emergencyRelation = emergencyRelation;
    }

    
    
   
    
    

    
    
    
    
}
