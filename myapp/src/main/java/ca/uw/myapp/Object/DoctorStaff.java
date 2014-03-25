/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ca.uw.myapp.Object;

import java.io.Serializable;
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
@Table(name = "DOCTORSTAFF")
public class DoctorStaff implements Serializable {

    @Id
    @Column(name = "id")
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    @ManyToOne(cascade = {CascadeType.ALL})
    @JoinColumn(referencedColumnName = "staff_id")
    private Staff doctor;

    @ManyToOne(cascade = {CascadeType.ALL})
    @JoinColumn(referencedColumnName = "staff_id")
    private Staff staff;

    public DoctorStaff() {
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Staff getDoctor() {
        return doctor;
    }

    public void setDoctor(Staff doctor) {
        this.doctor = doctor;
    }

    public Staff getStaff() {
        return staff;
    }

    public void setStaff(Staff staff) {
        this.staff = staff;
    }

}
