package com.njust.teamwork_Fog_Node.TeamWork_controller;

import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class DataController {

    @PostMapping("/postEData")
    public String postEData(@RequestParam String myEncryptedData){
        System.out.println(myEncryptedData);
        return myEncryptedData;
    }

}
