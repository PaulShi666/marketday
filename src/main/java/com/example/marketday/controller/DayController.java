package com.example.marketday.controller;

import com.example.marketday.domain.Day;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.sql.Date;

@RestController
public class DayController {

    @RequestMapping("/getMarketDate")
    public Day getMarketDate() {
        return new Day(1,new Date(121212),"");
    }

}
