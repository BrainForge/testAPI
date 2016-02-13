package com.testres.rest.controller;

/**
 * Created by callo_000 on 27.09.2015.
 */

import com.testres.rest.entity.TestTable;
import com.testres.rest.service.TestTableService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;
import java.util.List;

@Controller
@RequestMapping(value = "/")
public class MainController {

    @Autowired
    private TestTableService testTableService;

    @RequestMapping(value = "/", method = RequestMethod.GET)
    @ResponseBody
    @Produces({MediaType.APPLICATION_JSON})
    public String getMyData() {
        return "xui";
    }

    @RequestMapping(value = "/page", method = RequestMethod.GET)
    public String getPage() {
        return "index";
    }

    @RequestMapping(value = "/test", method = RequestMethod.GET)
    @ResponseBody
    @Produces({MediaType.APPLICATION_JSON})
    public List<TestTable> getTestTable() {
        return testTableService.getAll();
    }

    @RequestMapping(value = "/error", method = RequestMethod.GET)
    @ResponseBody
    @Produces({MediaType.APPLICATION_JSON})
    public Object testError() {
        Object nullObj = null;
        return nullObj.hashCode();
    }
}