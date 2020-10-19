package com.example.demo.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.hibernate.annotations.GenericGenerator;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;
import java.math.BigDecimal;
import java.util.Date;

/**
 * @author xzy
 * @date 2020-10-19 11:48
 * 说明：顾客消费记录
 */
@Entity
@Table(name = "consumption_log")
@Data
@NoArgsConstructor
@AllArgsConstructor
public class ConsumptionLogEntity {
    @Id
    @GenericGenerator(name = "genericGenerator", strategy = "uuid")
    @GeneratedValue(generator = "genericGenerator")
    private String id;

    /**
     * 顾客ID
     */
    private String consumerId;

    /**
     * 消费金额
     */
    private BigDecimal amountConsumption;

    /**
     * 消费日期
     */
    private Date date;
}
