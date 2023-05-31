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
@TableName("bx_conferenceroom_join")
public class ConferenceRoomJoin implements Serializable {
    @Id
    @TableId
    private Integer joinId;
    private Integer roomId;
    private String joinName;
    private String joinDesc;
    private Integer joinPerson;
    private Integer joinTel;
    private String joinTools;
    @DateTimeFormat(pattern = "yyyy-MM-dd")
    private Date joinAddTime;
    @DateTimeFormat(pattern = "yyyy-MM-dd")
    private Date joinUpdateTime;
    private Integer joinStatus;
    private String joinEnd;
    private String joinEndPoint;

}
