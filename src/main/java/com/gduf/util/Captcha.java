package com.gduf.util;

import cn.hutool.captcha.AbstractCaptcha;
import cn.hutool.captcha.CaptchaUtil;

import java.util.Random;

public class Captcha {

    public static AbstractCaptcha createCaptcha() {
        Random random = new Random();
        int i = random.nextInt(4);
        AbstractCaptcha captcha;
        if (i == 1) {
            captcha = CaptchaUtil.createLineCaptcha(200, 100);
        } else if (i == 2) {
            captcha = CaptchaUtil.createShearCaptcha(200, 100);
        } else {
            captcha = CaptchaUtil.createCircleCaptcha(200, 100);
        }
        return captcha;
    }
}
