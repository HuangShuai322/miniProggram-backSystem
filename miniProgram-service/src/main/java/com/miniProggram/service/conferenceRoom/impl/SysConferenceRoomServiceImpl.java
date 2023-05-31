package com.miniProggram.service.conferenceRoom.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.miniProggram.dao.entity.ConferenceRoom;
import com.miniProggram.dao.mapper.ConferenceRoomMapper;
import com.miniProggram.service.conferenceRoom.SysConferenceRoomService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * 会议室业务层实现类
 */
@Service
public class SysConferenceRoomServiceImpl extends ServiceImpl<ConferenceRoomMapper, ConferenceRoom> implements SysConferenceRoomService {
    @Autowired
    ConferenceRoomMapper conferenceRoomMapper;

    @Override
    public List<ConferenceRoom> getAllConferenceRoom() {
        return conferenceRoomMapper.getAllConferenceRoom();
    }
}
