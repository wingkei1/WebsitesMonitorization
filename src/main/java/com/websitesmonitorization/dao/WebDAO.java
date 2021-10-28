package com.websitesmonitorization.dao;

import com.websitesmonitorization.model.Web;
import org.apache.commons.dbutils.handlers.BeanHandler;
import org.springframework.stereotype.Repository;

import java.sql.Connection;
import java.sql.SQLException;


@Repository
public class WebDAO extends GenericDAO{
    public Web getWebByID(int id) throws SQLException {
        String query = "SELECT * FROM Webs WHERE id ="+id;
        Web web = null;
        try (Connection conn = connector.getConnection()) {
             web = queryRunner.query(conn, query, new BeanHandler<>(Web.class));
        }

        return web;
    }

}
