package com.example.marketday.controller;

import com.example.marketday.domain.Day;
import com.example.marketday.service.DayService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.sql.Date;
import java.sql.SQLException;
import java.util.List;

@RestController
public class DayController {

    @RequestMapping("/getMarketDate")
    public Day getMarketDate() {
        return new Day(1,new Date(121212),"");
    }

    @RequestMapping("/getMarketDateList")
    public List<Day> getMarketDateList() {
        DayService dayService = new DayService();

        List<Day> dayList = null;
            try {
                dayList = dayService.findAllDayList();
            } catch (SQLException e) {
                e.printStackTrace();
            }

        return dayList;
    }

}
