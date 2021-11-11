package com.websitesmonitorization.dao;

import com.websitesmonitorization.model.Web;
import org.apache.commons.dbutils.handlers.ArrayListHandler;
import org.apache.commons.dbutils.handlers.BeanListHandler;
import org.apache.commons.dbutils.handlers.ScalarHandler;

import java.sql.Connection;
import java.sql.SQLException;
import java.util.List;

public class UserDAO extends GenericDAO{
    public List<Web> getSubscripcionesByUserID(int id) throws SQLException {
        List<Web> subscripciones;
        String query = "SELECT w.* FROM webs w INNER JOIN usuarios_web uw ON w.id = uw.id_web " +
                "INNER JOIN usuarios u ON u.id = uw.id_usuario WHERE u.id=?;";
        try (Connection conn = connector.getConnection()) {
            subscripciones=queryRunner.query(conn, query, new BeanListHandler<Web>(Web.class));
        }

        return subscripciones;
    }
}
