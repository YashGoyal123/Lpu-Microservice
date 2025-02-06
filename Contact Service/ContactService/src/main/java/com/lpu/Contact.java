package com.lpu;

import java.util.ArrayList;
import java.util.List;

public class Contact {
	Long cid;
    String email;
    String contactname;
    Long userId;

    public Long getCid() {
        return cid;
    }

    public void setCid(Long cid) {
        this.cid = cid;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getContactname() {
        return contactname;
    }

    public void setContactname(String contactname) {
        this.contactname = contactname;
    }

    public Long getUserId() {
        return userId;
    }

    public void setUserId(Long userId) {
        this.userId = userId;
    }

    public Contact(Long cid, String email, String contactname, Long userId) {
        this.cid = cid;
        this.email = email;
        this.contactname = contactname;
        this.userId = userId;
    }

    public Contact() {
    }
}