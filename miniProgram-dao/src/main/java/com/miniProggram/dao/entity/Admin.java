package com.miniProggram.dao.entity;

import com.baomidou.mybatisplus.annotation.TableId;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.data.annotation.Id;

import java.io.Serializable;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class Admin implements Serializable {
    @Id
    @TableId
    private Integer adminId;
    private Integer adminName;
    private String adminDesc;
    private Integer adminPassword;
    private Integer adminStatus;
    private String adminAddTime;
    private String adminUpdateTime;

}
