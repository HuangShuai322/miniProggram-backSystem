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
public class Floor implements Serializable {
    @Id
    @TableId
    private Integer floorId;
    private Integer floor;

}
