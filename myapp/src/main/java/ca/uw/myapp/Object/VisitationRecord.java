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

/**
 *
 * @author siva
 */
@Entity
@Table(name = "VISITATIONRECORD")
public class VisitationRecord implements Serializable {

    @Id
    @Column(name = "id")
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    @ManyToOne(cascade = {CascadeType.ALL})
    @JoinColumn(referencedColumnName = "id")
    private DoctorPatient doctorPatient;

    @Column(name = "visit_date")
    private Date visitDate;
    @Column(name = "revno")
    private int revNo;
    @Column(name = "start_time")
    private Date startTime;
    @Column(name = "end_time")
    private Date endTime;

    @ManyToOne(cascade = {CascadeType.ALL})
    @JoinColumn(referencedColumnName = "id")
    private VisitPrescription visitPrescription;

    @Column(name = "diagnosis")
    private String diagnosis;
    @Column(name = "surgeryperformed")
    private String surgeryPerformed;
    @Column(name = "comments")
    private String comments;

    public VisitationRecord() {
    }

}
