package com.example.demo.repository;

import com.example.demo.entity.ConsumptionLogEntity;
import com.example.demo.entity.dto.ConsumptionLogDTO;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.List;

/**
 * @author xzy
 * @date 2020-10-19 11:51
 * 说明：
 */
@Repository
public interface ConsumptionLogRepository extends JpaRepository<ConsumptionLogEntity, String>, JpaSpecificationExecutor<ConsumptionLogEntity> {

    /**
     * 查询所有消费记录
     *
     * @return - 所有消费记录
     */
    @Query(" select " +
            "    new com.example.demo.entity.dto.ConsumptionLogDTO(l,c) " +
            "from " +
            "    ConsumptionLogEntity l " +
            "left join ConsumerEntity c on l.consumerId = c.id")
    List<ConsumptionLogDTO> findAllConsumptionLog();
}
