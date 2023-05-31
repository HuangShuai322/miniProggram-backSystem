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
public class News implements Serializable {
    @Id
    @TableId
    private Integer newId;
    private Integer newsCrateId;
    private String newsDesc;
    private String newsTitle;
    private Integer newsOrder;
    private String newsPic;
    private String newsContent;
    private String newsCrateName;
    private String newsAddTime;
    private String newsUpdateTime;

}
