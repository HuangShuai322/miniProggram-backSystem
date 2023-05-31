package com.miniProggram.service.user.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.miniProggram.dao.entity.SysUser;
import com.miniProggram.dao.mapper.SysUserMapper;
import com.miniProggram.service.user.SysUserService;
import org.springframework.stereotype.Service;

@Service
public class SysUserServiceImpl extends ServiceImpl<SysUserMapper, SysUser> implements SysUserService {
}
