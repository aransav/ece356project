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
@Table(name="PATIENT")
public class Patient {
    @Id
    @Column(name="id")
    private String id;
    
    @Column(name="healthcardno")
    private String healthCardNo;
    
    @Column(name="socialinsno")
    private String socialInsNo;

    public Patient() {
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getHealthCardNo() {
        return healthCardNo;
    }

    public void setHealthCardNo(String healthCardNo) {
        this.healthCardNo = healthCardNo;
    }

    public String getSocialInsNo() {
        return socialInsNo;
    }

    public void setSocialInsNo(String socialInsNo) {
        this.socialInsNo = socialInsNo;
    }
    
    
}
