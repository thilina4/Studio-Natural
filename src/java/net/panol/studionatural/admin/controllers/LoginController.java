/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package net.panol.studionatural.admin.controllers;

import java.io.Serializable;
import javax.faces.application.FacesMessage;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;
import javax.faces.context.FacesContext;
import net.panol.studionatural.admin.session.DataQuery;
import org.primefaces.context.RequestContext;

/**
 *
 * @author Thilina
 */
@ManagedBean (name = "login")
@SessionScoped
public class LoginController implements Serializable{
    private String username;
    private String password;
    private final DataQuery query = new DataQuery();

    public String loginControl(){
        if (query.loginControl(username, password)) {
            return "admin_panel.xhtml?faces-redirect=true";
        }
        RequestContext.getCurrentInstance().update("growl");
        FacesContext context = FacesContext.getCurrentInstance();
        context.addMessage(null, new FacesMessage(FacesMessage.SEVERITY_ERROR, "Error", "User name or password is invalid"));
        return "";
    }
    
    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }
}
