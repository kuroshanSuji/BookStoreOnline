package com.bookstoreonline.HomeAndLogin.model;

import java.beans.Transient;

public class User {
    private int userId;    // this is for internal usage
    private String userName;
    private String password;
    private Address address;
    private Preference preference;
    private String email;
   /* @Transient
    private Cart cart;*/
}
