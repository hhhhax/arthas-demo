package com.hax.demo.service.impl;

import com.hax.demo.mapper.UserMapper;
import com.hax.demo.pojo.User;
import com.hax.demo.service.UserService;
import com.hax.demo.core.service.impl.AbstractService;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import javax.annotation.Resource;


/**
 * Created by CodeGenerator on 2020/04/23.
 */
@Service
@Transactional
public class UserServiceImpl extends AbstractService<User> implements UserService {
    @Resource
    private UserMapper userMapper;

}
