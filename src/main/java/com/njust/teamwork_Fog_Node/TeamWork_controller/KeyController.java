package com.njust.teamwork_Fog_Node.TeamWork_controller;

import com.njust.teamwork_Fog_Node.paillier.PaillierPublicKey;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class KeyController {

    @PostMapping("/postPublicKey")
    public String setPublicKey(@RequestParam String paillierJsonStringPublicKey){
        System.out.println(paillierJsonStringPublicKey);
        /**
         * 保存处理收到的publickey用于运算
         */
        PaillierPublicKey paillierPublicKey = PaillierPublicKey.paillierJsonToPublicKey(paillierJsonStringPublicKey);
        try {
            paillierPublicKey.saveToFile();
        } catch (Exception e) {
            e.printStackTrace();
        }
        System.out.println(paillierJsonStringPublicKey);
        return "success";
    }

}
