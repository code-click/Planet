package com.groupware.planet.test.service;

import com.groupware.planet.test.mapper.TestMapper;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class TestServiceImpl implements TestService {
    private final TestMapper testMapper;

    @Override
    public int test() {
        return testMapper.test();
    }
}
