package com.gduf.service;

import org.springframework.transaction.annotation.Transactional;

@Transactional
public interface FakeUserService {

    void generateFakeUser();
}
