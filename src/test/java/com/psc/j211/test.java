package com.psc.j211;

import lombok.extern.slf4j.Slf4j;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

@Slf4j
public class test {

    @Test
    @DisplayName("git action 테스트")
    public void gitActionTest(){
        log.info("테스트 실행되었음2");
    }

}
