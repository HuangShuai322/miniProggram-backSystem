package com.miniProggram.dao.mapper;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.miniProggram.dao.entity.ConferenceRoom;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

@Mapper
public interface ConferenceRoomMapper extends BaseMapper<ConferenceRoom> {
    List<ConferenceRoom> getAllConferenceRoom();
}
