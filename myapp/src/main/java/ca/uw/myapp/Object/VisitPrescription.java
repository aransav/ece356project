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

@Entity
@Table(name="VISITPRESCRIPTION")
public class VisitPrescription implements Serializable {
    
    @Id
    @Column(name = "id")
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    
    @ManyToOne(cascade = {CascadeType.ALL})
    @JoinColumn(referencedColumnName="id")
    private Prescription prescription;
    
    @Column(name="start_date")
    private Date startDate;
    @Column(name="expiry_date")
    private Date expiryDate;

    public VisitPrescription() {
    }


    
    
}
