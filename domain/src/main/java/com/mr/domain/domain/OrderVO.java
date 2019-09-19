package com.mr.domain.domain;

import lombok.Data;

import java.util.Date;

@Data
public class OrderVO {
    private Integer oId;
    private Date oDate;
    private String oname;
    private Double omoney;
    private Integer ostauts;
}
