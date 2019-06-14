package com.payment.demo.controllers;

import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import java.util.HashMap;
import java.util.Map;

public class MpesaControllerCallBack {
    @RequestMapping( value = "/api/v1/c2b/callback/validation", method = RequestMethod.POST )
    public Map<String, Object> MPESAC2BValidation(@RequestBody MpesaControllerCallBack request) {
        //print you response and do other stuff
        return new HashMap<>();
    }

    @RequestMapping( value = "/api/v1/c2b/callback/confirmation", method = RequestMethod.POST )
    public Map<String, Object> MPESAC2BConfirmation(@RequestBody MpesaControllerCallBack request) {
        //print you response and do other stuff
        return new HashMap<>();
    }

}
