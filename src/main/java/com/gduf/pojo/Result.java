package com.gduf.pojo;

import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
public class Result {
    private String msg;
    private Integer code;
    private Object data;

}
