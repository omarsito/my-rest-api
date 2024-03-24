package com.epam.myrestapi.controller;

import com.epam.myrestapi.config.ConfigProperties;
import com.epam.myrestapi.pojo.RootAPI;
import com.epam.myrestapi.util.Cons;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class RootAPIController {

    private Logger logger = LoggerFactory.getLogger(this.getClass().getName());

    @Autowired
    ConfigProperties appProps;

    @GetMapping("/")
    public ResponseEntity<RootAPI> getRootAPIData(){
        return ResponseEntity.ok(new RootAPI(HttpStatus.OK.value(), Cons.ROOT_ENDPOINT_MSG,
                appProps.getPropsValue("app.version"), appProps.getPropsValue("app.name")));
    }

}