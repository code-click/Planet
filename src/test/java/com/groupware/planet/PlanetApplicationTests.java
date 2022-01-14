package com.groupware.planet;

import com.groupware.planet.test.entity.Memo;
import com.groupware.planet.test.entity.MemoRepository;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.stream.IntStream;

@SpringBootTest
class PlanetApplicationTests {

    @Test
    void contextLoads() {
    }

    @Autowired
    MemoRepository memoRepository;

    @Test
    public void InsertDummies() {
        IntStream.rangeClosed(1, 10).forEach(i -> {
            Memo memo = Memo.builder().memoText("Sample..." + i).build(); //Create!
            memoRepository.save(memo);
        });
    }
}
