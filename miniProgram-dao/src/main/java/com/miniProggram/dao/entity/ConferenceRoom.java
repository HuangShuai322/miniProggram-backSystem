package com.miniProggram.dao.entity;

import com.baomidou.mybatisplus.annotation.TableId;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.data.annotation.Id;
import org.springframework.format.annotation.DateTimeFormat;

import java.util.Date;

@Data
@AllArgsConstructor
@NoArgsConstructor
/**
 * 会议室 */
public class ConferenceRoom {
    @Id
    @TableId
    private Integer roomId;
    private String roomTitle;
    private String roomName;
    private Integer roomOrder;
    private Integer roomPerson;
    private String roomTools;
    private Integer roomStatus;
    private Integer floorId;
    private String roomImage;
    private Integer roomCrateId;
    @DateTimeFormat(pattern = "yyyy-MM-dd")
    private Date roomAddTime;
    @DateTimeFormat(pattern = "yyyy-MM-dd")
    private Date roomUpdateTime;
}
