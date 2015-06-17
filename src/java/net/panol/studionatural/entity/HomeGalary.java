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
@Table(name = "home_galary")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "HomeGalary.findAll", query = "SELECT h FROM HomeGalary h"),
    @NamedQuery(name = "HomeGalary.findByIdhomeGalary", query = "SELECT h FROM HomeGalary h WHERE h.idhomeGalary = :idhomeGalary"),
    @NamedQuery(name = "HomeGalary.findByType", query = "SELECT h FROM HomeGalary h WHERE h.type = :type"),
    @NamedQuery(name = "HomeGalary.findByVideoLink", query = "SELECT h FROM HomeGalary h WHERE h.videoLink = :videoLink"),
    @NamedQuery(name = "HomeGalary.findByContainer", query = "SELECT h FROM HomeGalary h WHERE h.container = :container"),
    @NamedQuery(name = "HomeGalary.findByTile", query = "SELECT h FROM HomeGalary h WHERE h.tile = :tile")})
public class HomeGalary implements Serializable {
    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "idhome_galary")
    private Integer idhomeGalary;
    @Lob
    @Column(name = "image1")
    private byte[] image1;
    @Lob
    @Column(name = "image2")
    private byte[] image2;
    @Lob
    @Column(name = "image3")
    private byte[] image3;
    @Size(max = 45)
    @Column(name = "type")
    private String type;
    @Size(max = 255)
    @Column(name = "video_link")
    private String videoLink;
    @Size(max = 45)
    @Column(name = "container")
    private String container;
    @Size(max = 45)
    @Column(name = "tile")
    private String tile;

    public HomeGalary() {
    }

    public HomeGalary(Integer idhomeGalary) {
        this.idhomeGalary = idhomeGalary;
    }

    public Integer getIdhomeGalary() {
        return idhomeGalary;
    }

    public void setIdhomeGalary(Integer idhomeGalary) {
        this.idhomeGalary = idhomeGalary;
    }

    public byte[] getImage1() {
        return image1;
    }

    public void setImage1(byte[] image1) {
        this.image1 = image1;
    }

    public byte[] getImage2() {
        return image2;
    }

    public void setImage2(byte[] image2) {
        this.image2 = image2;
    }

    public byte[] getImage3() {
        return image3;
    }

    public void setImage3(byte[] image3) {
        this.image3 = image3;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getVideoLink() {
        return videoLink;
    }

    public void setVideoLink(String videoLink) {
        this.videoLink = videoLink;
    }

    public String getContainer() {
        return container;
    }

    public void setContainer(String container) {
        this.container = container;
    }

    public String getTile() {
        return tile;
    }

    public void setTile(String tile) {
        this.tile = tile;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (idhomeGalary != null ? idhomeGalary.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof HomeGalary)) {
            return false;
        }
        HomeGalary other = (HomeGalary) object;
        if ((this.idhomeGalary == null && other.idhomeGalary != null) || (this.idhomeGalary != null && !this.idhomeGalary.equals(other.idhomeGalary))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "net.panol.studionatural.admin.entity.HomeGalary[ idhomeGalary=" + idhomeGalary + " ]";
    }
    
}
