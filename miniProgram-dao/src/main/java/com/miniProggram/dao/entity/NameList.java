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
public class NameList implements Serializable {
    @Id
    @TableId
    private Integer listId;
    private String listName;
    private String listMobile;

}
