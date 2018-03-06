package com.bl.dao;

import com.bl.entity.BLEntity;
import org.springframework.data.jpa.repository.JpaRepository;

/**
 * @author zhanjian@ultrapower.com.cn
 * @Description: ${todo}(用一句话描述该文件做什么)
 * @date 2018/3/6 15:40
 */
public interface BlDao extends JpaRepository<BLEntity, Long>{
}
