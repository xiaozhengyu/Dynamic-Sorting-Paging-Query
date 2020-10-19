package com.example.demo.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.hibernate.annotations.GenericGenerator;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

/**
 * @author xzy
 * @date 2020-10-19 11:46
 * 说明：顾客信息表
 */
@Entity
@Table(name = "consumer")
@Data
@NoArgsConstructor
@AllArgsConstructor
public class ConsumerEntity {
    @Id
    @GenericGenerator(name = "genericGenerator", strategy = "uuid")
    @GeneratedValue(generator = "genericGenerator")
    private String id;

    /**
     * 顾客姓名
     */
    private String name;

    /**
     * 顾客性别
     */
    private String sex;

    /**
     * 顾客年龄
     */
    private Integer age;
}
