package com.miniProggram.api.controller;

import com.miniProggram.common.http.Result;
import com.miniProggram.common.utils.AesExample;
import com.miniProggram.dao.entity.SysUser;
import com.miniProggram.service.user.SysUserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.nio.charset.StandardCharsets;
import java.util.Date;

/**
 * 用户业务前端控制器
 */
@RestController
@RequestMapping("/user/")
public class SysUserController {
    @Autowired
    private SysUserService userService;
    /**
     * 注册控制器
     * @param user  注册用户信息
     * @return  返回相应信息
     */
    @RequestMapping(value = "userRegister",method = RequestMethod.POST)
    public Result userRegister(@RequestBody SysUser user) throws Exception {
        user.setUserAddTime(new Date());
        byte[] cipherText = AesExample.aesEncrypt(user.getUserPassword());
        //解密
        //String password = AesExample.aesEncrypt(test)
        user.setUserPassword(new String(cipherText, StandardCharsets.UTF_8));
        return userService.save(user)?Result.ok():Result.fail();
    }
}
