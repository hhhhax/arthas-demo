package com.hax.demo.controller;

import com.github.pagehelper.PageHelper;
import com.hax.demo.domain.PageResult;
import com.hax.demo.domain.ResponseResult;
import com.hax.demo.mapperExtend.ExtUserMapper;
import com.hax.demo.pojo.User;
import com.hax.demo.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;
import javax.validation.constraints.NotNull;
import java.util.List;

/**
 * Created by CodeGenerator on 2020/04/23.
 */
@RestController
@Validated
@RequestMapping("/user")
public class UserController {
    @Resource
    private UserService userService;

    @Autowired
    private ExtUserMapper extUserMapper;

    @PostMapping
    public ResponseResult add(@RequestBody User user) {
        userService.save(user);
        return ResponseResult.ok();
    }

    @DeleteMapping("/{id}")
    public ResponseResult delete(@PathVariable Integer id) {
        userService.deleteById(id);
        return ResponseResult.ok();
    }

    @PutMapping
    public ResponseResult update(@RequestBody User user) {
        userService.update(user);
        return ResponseResult.ok();
    }

    @GetMapping("/{id}")
    public ResponseResult detail(@PathVariable Integer id) {
        User user = userService.findById(id);
        return ResponseResult.ok(user);
    }

    @GetMapping
    public ResponseResult list(@NotNull(message = "该参数不能为空") Integer page, @RequestParam(defaultValue = "0") Integer size) {
        PageHelper.startPage(page, size);
        List<User> list = userService.findAll();
        PageResult<User> pageInfo = new PageResult<>(list);
        return ResponseResult.ok(pageInfo);
    }
}
