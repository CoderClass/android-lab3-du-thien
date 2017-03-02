package com.duphungcong.lab3;

import java.util.Date;

/**
 * Created by thiendn on 02/03/2017.
 */

public class User {
    private String uId;
    private String message;
    private Date time;

    public Date getTime() {
        return time;
    }

    public User(String uId, String message, Date time) {
        this.uId = uId;
        this.message = message;
        this.time = time;
    }

    public String getMessage() {
        return message;
    }

    public String getuId() {
        return uId;
    }


}
