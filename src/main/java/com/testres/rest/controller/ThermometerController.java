package com.testres.rest.controller;

import com.testres.rest.response.APIResponse;
import com.testres.rest.response.APIResponseBuilder;
import com.testres.rest.response.ThermometerDTO;
import com.testres.rest.service.ThermometerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;
import java.util.List;

/**
 * Created by Anton Afanasyeu on 17.03.16.
 */
@Controller
@RequestMapping(value = "/temp")
public class ThermometerController {



    @RequestMapping(value = "/", method = RequestMethod.GET)
    @ResponseBody
    @Produces({MediaType.APPLICATION_JSON})
    public APIResponse<ThermometerDTO> getTemp() {



        return null;
    }

}
