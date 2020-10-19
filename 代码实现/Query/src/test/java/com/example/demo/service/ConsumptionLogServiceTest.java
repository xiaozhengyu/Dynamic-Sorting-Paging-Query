package com.example.demo.service;

import com.example.demo.entity.dto.ConsumptionLogDTO;
import org.junit.jupiter.api.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.util.List;

/**
 * @author xzy
 * @date 2020-10-19 12:36
 * 说明：
 */
@SpringBootTest
@RunWith(SpringRunner.class)
class ConsumptionLogServiceTest {

    @Autowired
    private ConsumptionLogService consumptionLogService;

    @Test
    void findAllConsumptionLog() {
        List<ConsumptionLogDTO> consumptionLogDTOList = consumptionLogService.findAllConsumptionLog();
    }
}