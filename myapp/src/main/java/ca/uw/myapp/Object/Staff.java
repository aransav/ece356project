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
@Table(name="STAFF")
public class Staff implements Serializable {
    
    @Id
    @OneToOne(cascade={CascadeType.ALL})
    @JoinColumn(referencedColumnName = "id", name = "staff_id")
    private User users;
    
    @Column(name="roles")
    private String roles;

    public Staff() {
    }

    public User getUsers() {
        return users;
    }

    public void setUsers(User users) {
        this.users = users;
    }

    public String getRoles() {
        return roles;
    }

    public void setRoles(String roles) {
        this.roles = roles;
    }

    
    
    
    
    
}
