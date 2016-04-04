package com.testres.rest.controller;

/**
 * Created by callo_000 on 27.09.2015.
 */

import com.testres.rest.entity.TestTable;
import com.testres.rest.mongoRepository.TestMongoRepository;
import com.testres.rest.response.APIResponse;
import com.testres.rest.response.APIResponseBuilder;
import com.testres.rest.service.TestTableService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;
import java.io.IOException;
import java.util.List;

@Controller
@RequestMapping(value = "/")
public class MainController {

    @Autowired
    private TestTableService testTableService;

    @RequestMapping(value = "/", method = RequestMethod.GET)
    @ResponseBody
    @Produces({MediaType.APPLICATION_JSON})
    public APIResponse<String> getMyData() throws IOException, InterruptedException {
        testTableService.insetToMongo();
        return APIResponseBuilder.build(testTableService.getTermometr());
    }

    @RequestMapping(value = "/page", method = RequestMethod.GET)
    public String getPage() {
        return "index";
    }

    @RequestMapping(value = "/test", method = RequestMethod.GET)
    @ResponseBody
    @Produces({MediaType.APPLICATION_JSON})
    public APIResponse<TestTable> getTestTable() {
        List<TestTable> testTables = testTableService.getAll();
        return APIResponseBuilder.build(testTables);
    }


}