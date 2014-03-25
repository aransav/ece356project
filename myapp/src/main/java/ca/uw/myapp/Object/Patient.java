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

import java.io.Serializable;
import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;
import javax.persistence.Table;

@Entity
@Table(name="PATIENT")
public class Patient implements Serializable {
    
    @Id
    @OneToOne(cascade={CascadeType.ALL})
    @JoinColumn(referencedColumnName = "id", name = "patient_id")
    private User u;
    
    @Column(name="health_card_no")
    private String healthCardNo;
    
    @Column(name="social_ins_no")
    private long socialInsNo;

    public Patient() {
    }

    public User getUser() {
        return u;
    }

    public void setUser(User u) {
        this.u = u;
    }

    public String getHealthCardNo() {
        return healthCardNo;
    }

    public void setHealthCardNo(String healthCardNo) {
        this.healthCardNo = healthCardNo;
    }

    public long getSocialInsNo() {
        return socialInsNo;
    }

    public void setSocialInsNo(long socialInsNo) {
        this.socialInsNo = socialInsNo;
    }
}
