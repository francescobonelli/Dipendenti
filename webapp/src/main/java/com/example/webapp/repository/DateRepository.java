package com.example.webapp.repository;


import java.time.LocalDate;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

@Repository
public class DateRepository {
    @Autowired
    private final JdbcTemplate jdbcTemplate;

    public DateRepository(JdbcTemplate jdbcTemplate) {
        this.jdbcTemplate = jdbcTemplate;
    }

    public List<LocalDate> getDate() {
        String sql = "SELECT data_fine_rapporto FROM dipendenti";

   
        return jdbcTemplate.query(sql, (rs, rowNum) -> rs.getObject("data_fine_rapporto", LocalDate.class));
    }
}


