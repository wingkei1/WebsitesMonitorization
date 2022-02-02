package com.websitesmonitorization.dao;

import com.websitesmonitorization.dao.connector.Connector;
import com.websitesmonitorization.model.Web;
import org.apache.commons.dbutils.QueryRunner;
import org.apache.commons.dbutils.handlers.BeanHandler;
import org.apache.commons.dbutils.handlers.ScalarHandler;
import org.springframework.stereotype.Repository;

import java.sql.Connection;
import java.sql.SQLException;


@Repository
public class WebDAO extends GenericDAO{
    public Web getWebByID(int id) throws SQLException {
        String query = "SELECT * FROM Webs WHERE id ="+id;
        Web web = null;
        Connector conector = new Connector();
        QueryRunner qr = new QueryRunner();
        try (Connection conn = conector.getConnection()) {
             web = qr.query(conn, query, new BeanHandler<>(Web.class));
        }

        return web;
    }

    public void deleteWebByID(int id) throws SQLException {
        String query = "DELETE FROM webs WHERE id ="+id;
        Connector conector = new Connector();
        QueryRunner qr = new QueryRunner();
        try (Connection conn = conector.getConnection()) {
            int id0=qr.update(conn, query, new ScalarHandler<Integer>());
        }

        return;
    }

    /*
    Ahora mismo inserta la misma web siempre
    TODO: inserta una web especifica
     */
    public int insertWeb() throws SQLException {
        String query1 = "INSERT INTO webs (url,nombre, tipo, `update`) VALUES (\"https://www.oracle.com/es/index.html\", \"oracle\", \"informatica\", \"2021-11-09 14:04:05\");";
        String query2 = "SELECT LAST_INSERT_ID();";
        int id=-1;
        Connector conector = new Connector();
        QueryRunner qr = new QueryRunner();
        try (Connection conn = conector.getConnection()) {
            id=qr.insert(conn, query1, new ScalarHandler<Integer>());
            //id=queryRunner.query(conn, query2, new ScalarHandler<Integer>());

        }

        return id;
    }

    public void updateWebByID(int id, Web web) throws SQLException {
        String query = "UPDATE webs SET url ="+web.getUrl()+", nombre="+web.getNombreWeb()+
                ", tipo="+web.getTipoWeb() +", update="+web.getUpdate()+" WHERE id ="+id;
        Connector conector = new Connector();
        QueryRunner qr = new QueryRunner();
        try (Connection conn = conector.getConnection()) {
            qr.update(conn, query);
        }

        return;
    }

}
