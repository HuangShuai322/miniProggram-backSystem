package com.miniProggram.dao.entity;

import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.data.annotation.Id;
import org.springframework.format.annotation.DateTimeFormat;

import java.io.Serializable;
import java.util.Date;

@Data
@AllArgsConstructor
@NoArgsConstructor
@TableName("bx_user")
public class SysUser implements Serializable {
    @Id
    @TableId
    private Integer userId;
    private String userName;
    private String userMobile;
    private Integer departmentId;
    @DateTimeFormat(pattern = "yyyy-MM-dd")
    private Date userAddTime;
    @DateTimeFormat(pattern = "yyyy-MM-dd")
    private Date userEditTime;
    private String userPassword;

}
