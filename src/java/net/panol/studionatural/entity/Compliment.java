/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package net.panol.studionatural.entity;

import java.io.Serializable;
import java.util.Date;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Lob;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import javax.validation.constraints.Size;
import javax.xml.bind.annotation.XmlRootElement;

/**
 *
 * @author Thilina
 */
@Entity
@Table(name = "compliment")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Compliment.findAll", query = "SELECT c FROM Compliment c"),
    @NamedQuery(name = "Compliment.findByIdcompliment", query = "SELECT c FROM Compliment c WHERE c.idcompliment = :idcompliment"),
    @NamedQuery(name = "Compliment.findByName", query = "SELECT c FROM Compliment c WHERE c.name = :name"),
    @NamedQuery(name = "Compliment.findByEmail", query = "SELECT c FROM Compliment c WHERE c.email = :email"),
    @NamedQuery(name = "Compliment.findByAdded", query = "SELECT c FROM Compliment c WHERE c.added = :added"),
    @NamedQuery(name = "Compliment.findByStatus", query = "SELECT c FROM Compliment c WHERE c.status = :status")})
public class Compliment implements Serializable {
    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "idcompliment")
    private Integer idcompliment;
    @Size(max = 100)
    @Column(name = "name")
    private String name;
    // @Pattern(regexp="[a-z0-9!#$%&'*+/=?^_`{|}~-]+(?:\\.[a-z0-9!#$%&'*+/=?^_`{|}~-]+)*@(?:[a-z0-9](?:[a-z0-9-]*[a-z0-9])?\\.)+[a-z0-9](?:[a-z0-9-]*[a-z0-9])?", message="Invalid email")//if the field contains email address consider using this annotation to enforce field validation
    @Size(max = 100)
    @Column(name = "email")
    private String email;
    @Lob
    @Size(max = 65535)
    @Column(name = "description")
    private String description;
    @Column(name = "added")
    @Temporal(TemporalType.DATE)
    private Date added;
    @Size(max = 45)
    @Column(name = "status")
    private String status;

    public Compliment() {
    }

    public Compliment(Integer idcompliment) {
        this.idcompliment = idcompliment;
    }

    public Integer getIdcompliment() {
        return idcompliment;
    }

    public void setIdcompliment(Integer idcompliment) {
        this.idcompliment = idcompliment;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public Date getAdded() {
        return added;
    }

    public void setAdded(Date added) {
        this.added = added;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (idcompliment != null ? idcompliment.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Compliment)) {
            return false;
        }
        Compliment other = (Compliment) object;
        if ((this.idcompliment == null && other.idcompliment != null) || (this.idcompliment != null && !this.idcompliment.equals(other.idcompliment))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "net.panol.studionatural.admin.entity.Compliment[ idcompliment=" + idcompliment + " ]";
    }
    
}
