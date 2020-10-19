package com.example.demo.entity.dto;

import com.example.demo.entity.ConsumerEntity;
import com.example.demo.entity.ConsumptionLogEntity;
import lombok.Data;

import java.math.BigDecimal;
import java.util.Date;

/**
 * @author xzy
 * @date 2020-10-19 12:27
 * 说明：
 */
@Data
public class ConsumptionLogDTO {
    private String id;
    private String consumerName;
    private BigDecimal amountConsumption;
    private Date date;

    public ConsumptionLogDTO() {
        System.out.println("no argument constructor");
    }

    public ConsumptionLogDTO(String id, String consumerName, BigDecimal amountConsumption, Date date) {
        System.out.println("all argument constructor");
        this.id = id;
        this.consumerName = consumerName;
        this.amountConsumption = amountConsumption;
        this.date = date;
    }

    public ConsumptionLogDTO(ConsumptionLogEntity l, ConsumerEntity c) {
        this.id = l.getId();

        // 排除NullPointException隐患！
        if (c != null) {
            this.consumerName = c.getName();
        }

        this.amountConsumption = l.getAmountConsumption();
        this.date = l.getDate();
    }
}
