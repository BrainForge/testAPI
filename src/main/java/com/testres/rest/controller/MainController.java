package com.testres.rest.controller;

/**
 * Created by callo_000 on 27.09.2015.
 */

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

@Controller
@RequestMapping(value = "/")
public class MainController
{
    @RequestMapping(value= "/", method = RequestMethod.GET)
    @ResponseBody
    @Produces({ MediaType.APPLICATION_JSON })
    public String getMyData()
    {
        return "xui";
    }



}