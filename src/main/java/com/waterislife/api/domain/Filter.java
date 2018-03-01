package com.waterislife.api.domain;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import java.io.Serializable;
import java.util.Date;

@Document
public class Filter implements Serializable {
    private static final long serialVersionUID = 1L;

    @Id
    private String id;
    private String name;
    private Date installation;

    public Filter() {
    }

    public Filter(String id, String name, Date installation) {
        this.id = id;
        this.name = name;
        this.installation = installation;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Date getInstallation() {
        return installation;
    }

    public void setInstallation(Date installation) {
        this.installation = installation;
    }
}
