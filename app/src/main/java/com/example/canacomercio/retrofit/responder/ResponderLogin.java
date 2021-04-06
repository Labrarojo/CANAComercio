
package com.example.canacomercio.retrofit.responder;

import com.example.canacomercio.retrofit.Data;
import com.example.canacomercio.retrofit.Links;
import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;


public class ResponderLogin {

    @SerializedName("data")
    @Expose
    private Data data;
    @SerializedName("links")
    @Expose
    private Links links;

    /**
     * No args constructor for use in serialization
     * 
     */
    public ResponderLogin() {
    }

    /**
     * 
     * @param data
     * @param links
     */
    public ResponderLogin(Data data, Links links) {
        super();
        this.data = data;
        this.links = links;
    }

    public Data getData() {
        return data;
    }

    public void setData(Data data) {
        this.data = data;
    }

    public Links getLinks() {
        return links;
    }

    public void setLinks(Links links) {
        this.links = links;
    }

}
