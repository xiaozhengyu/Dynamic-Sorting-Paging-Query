package com.example.demo.repository;

import com.example.demo.entity.ConsumerEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;
import org.springframework.stereotype.Repository;

/**
 * @author xzy
 * @date 2020-10-19 11:51
 * 说明：
 */
@Repository
public interface ConsumerRepository extends JpaRepository<ConsumerEntity, String>, JpaSpecificationExecutor<ConsumerEntity> {
}
