package com.example.marketday.service;

import com.example.marketday.dao.DayDao;
import com.example.marketday.domain.Day;

import java.sql.SQLException;
import java.util.List;

public class DayService {
    public List<Day> findAllDayList() throws SQLException {
        DayDao dayDao = new DayDao();

        return dayDao.findAllDayList();
    }

}
