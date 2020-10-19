package com.example.demo.serviceimpl;

import com.example.demo.entity.dto.ConsumptionLogDTO;
import com.example.demo.repository.ConsumptionLogRepository;
import com.example.demo.service.ConsumptionLogService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @author xzy
 * @date 2020-10-19 12:24
 * 说明：
 */
@Service
public class ConsumptionLogServiceImpl implements ConsumptionLogService {
    private final ConsumptionLogRepository consumptionLogRepository;

    @Autowired
    public ConsumptionLogServiceImpl(ConsumptionLogRepository consumptionLogRepository) {
        this.consumptionLogRepository = consumptionLogRepository;
    }

    @Override
    public List<ConsumptionLogDTO> findAllConsumptionLog() {
        return consumptionLogRepository.findAllConsumptionLog();
    }
}
