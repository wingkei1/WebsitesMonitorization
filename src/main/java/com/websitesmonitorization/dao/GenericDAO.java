package com.websitesmonitorization.dao;



import com.websitesmonitorization.dao.connector.Connector;
import org.apache.commons.dbutils.QueryRunner;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
@Repository
public class GenericDAO {
    @Autowired
    protected Connector connector;

    //@Autowired
    protected QueryRunner queryRunner;
}
