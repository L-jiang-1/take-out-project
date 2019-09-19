package com.mr.domain.domain;

import lombok.Data;

@Data
public class UserVO {
    private Integer userId;
    private String userName;
    private String userPsd;
    private String userEmail;
    private String userPhone;
}
