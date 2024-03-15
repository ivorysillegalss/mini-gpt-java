package com.gduf.pojo;

import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
public class CaptchaCode {
    private byte[] imageBytes;
    private String code;
}
