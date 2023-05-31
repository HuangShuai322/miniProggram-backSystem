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
public class Predetermine implements Serializable {
    @Id
    @TableId
    private Integer predetermineId;
    private String predetermineDay;
    private String predetermineEnd;
    private String predetermineEndPoint;
    private Integer predetermineEnrollId;
    private String predetermineStart;
    private Integer predetermineStatus;
    private String predetermineName;
    private String predetermineDesc;
    private Integer predeterminePerson;
    private String predetermineTel;

}
