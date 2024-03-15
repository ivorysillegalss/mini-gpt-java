package com.gduf.controller;

import com.gduf.service.FakeUserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.stereotype.Component;

@Component
public class FakeUserInitializer implements ApplicationRunner {
    @Override
    public void run(ApplicationArguments args) throws Exception {
        // 在应用程序启动时初始化伪用户
        fakeUserService.generateFakeUser();
    }

    private final FakeUserService fakeUserService;

    @Autowired
    public FakeUserInitializer(FakeUserService fakeUserService) {
        this.fakeUserService = fakeUserService;
    }

}
