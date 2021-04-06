
package com.example.canacomercio.retrofit.solicitar;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class SolicitarLogin {

    @SerializedName("email")
    @Expose
    private String email;
    @SerializedName("password")
    @Expose
    private String password;
    @SerializedName("remember_me")
    @Expose
    private boolean rememberMe;

    /**
     * No args constructor for use in serialization
     * 
     */
    public SolicitarLogin() {
    }

    /**
     * 
     * @param password
     * @param rememberMe
     * @param email
     */
    public SolicitarLogin(String email, String password, boolean rememberMe) {
        super();
        this.email = email;
        this.password = password;
        this.rememberMe = rememberMe;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public boolean getRememberMe() {
        return rememberMe;
    }

    public void setRememberMe(boolean rememberMe) {
        this.rememberMe = rememberMe;
    }

}
