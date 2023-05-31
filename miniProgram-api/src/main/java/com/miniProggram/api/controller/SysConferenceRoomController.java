package com.miniProggram.api.controller;

import com.miniProggram.common.http.Result;
import com.miniProggram.dao.entity.ConferenceRoom;
import com.miniProggram.service.conferenceRoom.SysConferenceRoomService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * 会议室前端控制器
 */
@RestController
@RequestMapping("/conferenceRoom/")
public class SysConferenceRoomController {

    @Autowired
    private SysConferenceRoomService conferenceRoomService;

    @RequestMapping(value = "getRoom",method = RequestMethod.POST)
    public Result<List<ConferenceRoom>> getRoom(){
        List<ConferenceRoom> allConferenceRoomList = conferenceRoomService.getAllConferenceRoom();
        return Result.ok(allConferenceRoomList);
    }

    @RequestMapping(value = "addRoom",method = RequestMethod.POST)
    public Result addingRoom(@RequestBody ConferenceRoom conferenceRoom){
        return conferenceRoomService.save(conferenceRoom) ? Result.ok(): Result.fail();
    }


}
