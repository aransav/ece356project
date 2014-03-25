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
import javax.persistence.EmbeddedId;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToMany;
import javax.persistence.ManyToOne;
import javax.persistence.OneToOne;
import javax.persistence.Table;

@Entity
@Table(name = "DOCTORPATIENT")
public class DoctorPatient implements Serializable {

    @Id
    @Column(name = "id")
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    @ManyToOne(cascade = {CascadeType.ALL})
    @JoinColumn(referencedColumnName = "staff_id")
    private Staff doctor;

    @ManyToOne(cascade = {CascadeType.ALL})
    @JoinColumn(referencedColumnName = "patient_id")
    private Patient patient;

    @Column(name = "primarydoctor")
    private boolean primaryDoctor;

    public DoctorPatient() {
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Patient getPatient() {
        return patient;
    }

    public void setPatient(Patient patient) {
        this.patient = patient;
    }

    public boolean isPrimaryDoctor() {
        return primaryDoctor;
    }

    public void setPrimaryDoctor(boolean primaryDoctor) {
        this.primaryDoctor = primaryDoctor;
    }

    

}
