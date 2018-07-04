package com.module.server.sample.client;

import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import lombok.extern.slf4j.Slf4j;
import org.apache.commons.lang.ObjectUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

/**
 * TODO description：数据处理层
 *
 * @author bing.li
 * @version v1.0
 * @date 2018/7/4 18:03
 */
@RequestMapping("/user")
@RestController
@Slf4j
@SuppressWarnings("all")
@Api(value = "用户处理层", tags = "用户处理层")
public class UserController {

    @Autowired
    private UserRepository repository;

    /**
     * Gets all.
     *
     * @return the all
     */
    @ApiOperation(value = "获取用户总数", notes = "传入参数：无")
    @RequestMapping("findCount")
    public long findCount() {
        long count = repository.count();
        System.out.println( count );
        return count;
    }

    /**
     * Save user.
     *
     * @param user the user
     * @return the user
     */
    @RequestMapping(name = "/save", method = RequestMethod.POST)
    public User save(@RequestBody User user) {
        try {
            User user1 = repository.saveAndFlush( user );
            if (ObjectUtils.notEqual( user1, null )) {
                return user1;
            } else {
                return null;
            }
        } catch (Exception e) {
            e.printStackTrace();
            return null;
        }
    }
}
