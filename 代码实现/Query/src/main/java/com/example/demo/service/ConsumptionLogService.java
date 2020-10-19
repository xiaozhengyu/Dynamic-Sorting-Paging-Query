package com.example.demo.service;

import com.example.demo.entity.dto.ConsumptionLogDTO;

import java.util.List;

/**
 * @author xzy
 * @date 2020-10-19 12:24
 * 说明：
 */
public interface ConsumptionLogService {
    List<ConsumptionLogDTO> findAllConsumptionLog();
}
