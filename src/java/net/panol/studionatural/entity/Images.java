/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package net.panol.studionatural.entity;

import java.io.Serializable;
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
import javax.validation.constraints.Size;
import javax.xml.bind.annotation.XmlRootElement;

/**
 *
 * @author Thilina
 */
@Entity
@Table(name = "images")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Images.findAll", query = "SELECT i FROM Images i"),
    @NamedQuery(name = "Images.findByIdimages", query = "SELECT i FROM Images i WHERE i.idimages = :idimages"),
    @NamedQuery(name = "Images.findByTitile", query = "SELECT i FROM Images i WHERE i.titile = :titile"),
    @NamedQuery(name = "Images.findByCategory", query = "SELECT i FROM Images i WHERE i.category = :category"),
    @NamedQuery(name = "Images.findByStatus", query = "SELECT i FROM Images i WHERE i.status = :status")})
public class Images implements Serializable {
    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "idimages")
    private Integer idimages;
    @Size(max = 100)
    @Column(name = "titile")
    private String titile;
    @Lob
    @Column(name = "file")
    private byte[] file;
    @Size(max = 100)
    @Column(name = "category")
    private String category;
    @Size(max = 45)
    @Column(name = "status")
    private String status;

    public Images() {
    }

    public Images(Integer idimages) {
        this.idimages = idimages;
    }

    public Integer getIdimages() {
        return idimages;
    }

    public void setIdimages(Integer idimages) {
        this.idimages = idimages;
    }

    public String getTitile() {
        return titile;
    }

    public void setTitile(String titile) {
        this.titile = titile;
    }

    public byte[] getFile() {
        return file;
    }

    public void setFile(byte[] file) {
        this.file = file;
    }

    public String getCategory() {
        return category;
    }

    public void setCategory(String category) {
        this.category = category;
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
        hash += (idimages != null ? idimages.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Images)) {
            return false;
        }
        Images other = (Images) object;
        if ((this.idimages == null && other.idimages != null) || (this.idimages != null && !this.idimages.equals(other.idimages))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "net.panol.studionatural.admin.entity.Images[ idimages=" + idimages + " ]";
    }
    
}
