package com.javainuse.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import sun.awt.SunHints;

@RestController
public class HelloWorldController {

    @RequestMapping({ "/hello" })
    public String firstPage() {
        return "Hello World";
    }
    @RequestMapping({ "/hello2" })
    public String secondPage() {
        return "Hello Rohit";
    }
    @RequestMapping({"/createUser"})
    public String createUser(@RequestParam(name="userName") String userName,@RequestParam(name="dob")String dob,@RequestParam(name = "profilePic") String profilePic, @RequestParam(name = "location") String location){
        return "successful/failure";
    }

    @RequestMapping({"/getOrderHistory"})
    public String getOrderHistory(@RequestParam(name="userName")String userName){

        return "List of failures";
    }

    @RequestMapping({"/userInfo"})
    public String userInfo(@RequestParam(name="userId")String userId){

        return "UserID,Full Name,DOB,ProfilePic,Password,Location,ModeOfPayment";
    }
    @RequestMapping(value = "/authenticate", method = RequestMethod.POST)
public void abc(){}

}
