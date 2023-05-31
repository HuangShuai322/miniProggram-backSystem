package com.miniProggram.api.controller;

import com.miniProggram.common.http.Result;
import com.miniProggram.dao.entity.ConferenceRoomJoin;
import com.miniProggram.service.conferenceRoomJoin.ConferenceRoomJoinService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.util.Date;

@RestController
@RequestMapping("/conferenceRoomJoin/")
public class SysConferenceRoomJoinController {
    @Autowired
    private ConferenceRoomJoinService conferenceRoomJoinService;

    @RequestMapping(value = "/conferenceRoomJoinAdd",method = RequestMethod.POST)
    public Result add(@RequestBody ConferenceRoomJoin conferenceRoomJoin)throws Exception{
        conferenceRoomJoin.setRoomId(1);
        conferenceRoomJoin.setJoinStatus(1);
        conferenceRoomJoin.setJoinAddTime(new Date());
        conferenceRoomJoinService.save(conferenceRoomJoin);
        return conferenceRoomJoinService.save(conferenceRoomJoin)? Result.ok():Result.fail();
    }
}
