package com.njust.teamwork_Fog_Node.dataprocessor;

import com.google.gson.Gson;

import java.math.BigInteger;
import java.util.Date;

public class EncryptedDataForm {
    private Date date;
    private String username;
    private BigInteger userTemperature;
    private BigInteger userHeartRate;

    public EncryptedDataForm(){}

    public String getJsonStringEDataForm(){
        Gson gson = new Gson();
        String jsonStringEDataForm = gson.toJson(this, EncryptedDataForm.class);
        return jsonStringEDataForm;
    }

    public static EncryptedDataForm jsonToEncryptedDataForm(String encryptedData){
        Gson gson = new Gson();
        return gson.fromJson(encryptedData, EncryptedDataForm.class);
    }

}


