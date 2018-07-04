package com.module.server.sample.client;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

/**
 * TODO description：数据处理层
 *
 * @author bing.li
 * @version v1.0
 * @date 2018/7/4 18:09
 */
@Repository
public interface UserRepository extends JpaRepository <User, Integer> {
}
