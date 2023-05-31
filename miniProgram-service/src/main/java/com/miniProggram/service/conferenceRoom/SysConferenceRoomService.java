package com.miniProggram.service.conferenceRoom;

import com.baomidou.mybatisplus.extension.service.IService;
import com.miniProggram.dao.entity.ConferenceRoom;

import java.util.List;

/**
 * 会议室业务类
 */
public interface SysConferenceRoomService extends IService<ConferenceRoom> {
    List<ConferenceRoom> getAllConferenceRoom();
}
