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
@Table(name = "video")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Video.findAll", query = "SELECT v FROM Video v"),
    @NamedQuery(name = "Video.findByIdvideo", query = "SELECT v FROM Video v WHERE v.idvideo = :idvideo"),
    @NamedQuery(name = "Video.findByTitle", query = "SELECT v FROM Video v WHERE v.title = :title"),
    @NamedQuery(name = "Video.findByVideoLink", query = "SELECT v FROM Video v WHERE v.videoLink = :videoLink"),
    @NamedQuery(name = "Video.findByStatus", query = "SELECT v FROM Video v WHERE v.status = :status")})
public class Video implements Serializable {
    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "idvideo")
    private Integer idvideo;
    @Size(max = 100)
    @Column(name = "title")
    private String title;
    @Size(max = 255)
    @Column(name = "video_link")
    private String videoLink;
    @Size(max = 45)
    @Column(name = "status")
    private String status;

    public Video() {
    }

    public Video(Integer idvideo) {
        this.idvideo = idvideo;
    }

    public Integer getIdvideo() {
        return idvideo;
    }

    public void setIdvideo(Integer idvideo) {
        this.idvideo = idvideo;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getVideoLink() {
        return videoLink;
    }

    public void setVideoLink(String videoLink) {
        this.videoLink = videoLink;
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
        hash += (idvideo != null ? idvideo.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Video)) {
            return false;
        }
        Video other = (Video) object;
        if ((this.idvideo == null && other.idvideo != null) || (this.idvideo != null && !this.idvideo.equals(other.idvideo))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "net.panol.studionatural.admin.entity.Video[ idvideo=" + idvideo + " ]";
    }
    
}
