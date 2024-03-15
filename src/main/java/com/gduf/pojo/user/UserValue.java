package com.gduf.pojo.user;

import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
public class UserValue {
    private Integer userValueId;
    private Boolean gender;
    private Integer age;
    private String sign;
    private String pic;
    private String email;
    private Integer userId;

    public UserValue() {
        this.sign = null;
        this.age = null;
        this.gender = false;
        this.pic = null;
        this.email = null;
        this.userId = 0;
    }
}