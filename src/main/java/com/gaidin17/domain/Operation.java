package com.gaidin17.domain;

import java.util.Date;

/**
 * Created by Gaidin on 30.03.2017.
 */
public class Operation {
    private Date date;
    private String address;

    public Operation(Date date, String address) {
        this.date = date;
        this.address = address;
    }

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }
}
