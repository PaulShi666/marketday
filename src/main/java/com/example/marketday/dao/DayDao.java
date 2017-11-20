package com.example.marketday.dao;

import com.example.marketday.domain.Day;
import com.example.marketday.utils.DataSourceUtils;
import org.apache.commons.dbutils.QueryRunner;
import org.apache.commons.dbutils.ResultSetHandler;
import org.apache.commons.dbutils.handlers.BeanListHandler;

import java.sql.SQLException;
import java.util.List;

public class DayDao {
    public List<Day> findAllDayList() throws SQLException {
        QueryRunner runner = new QueryRunner(DataSourceUtils.getDataSource());
        String sql = "SELECT * FROM marketday";
        List<Day> dayList = runner.query(sql, new BeanListHandler<Day>(Day.class));
        return dayList;
    }
}
