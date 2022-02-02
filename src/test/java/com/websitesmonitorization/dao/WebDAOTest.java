package com.websitesmonitorization.dao;

import com.websitesmonitorization.model.Web;
import org.junit.Test;
import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.extension.ExtendWith;
import org.junit.runner.RunWith;
import org.springframework.boot.context.properties.EnableConfigurationProperties;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit.jupiter.SpringExtension;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import org.springframework.test.context.junit4.SpringRunner;

import java.sql.Date;
import java.sql.SQLException;

import static org.junit.Assert.assertEquals;

/*@RunWith(SpringRunner.class)
@SpringBootTest
@ContextConfiguration({"classpath*:spring/applicationContext.xml"})*/
public class WebDAOTest {

    @Test
    public void get_Web_By_ID_Test() throws SQLException {
        String dt = "2021-11-09";
        //java.text.SimpleDateFormat sdf = new java.text.SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
        //String currentTime = sdf.format(dt);
        WebDAO dao = new WebDAO();
        Web web = dao.getWebByID(1);
        System.out.println(web.getUpdate());
        System.out.println(dt);
        assertEquals(web.getUrl(), "https://www.telefonica.com/es/");
        assertEquals(web.getNombreWeb(), "telefonica");
        assertEquals(web.getTipoWeb(), "telecomunicacion");
        assertEquals(web.getUpdate().toString(), dt);
    }

    @Test
    public void get_Web_By_ID_Non_Existant_Test() throws SQLException {
        WebDAO dao = new WebDAO();
        assertEquals(null, dao.getWebByID(1000));
    }

    @Test
    public void delete_Web_By_ID_Test() throws SQLException {
        WebDAO dao = new WebDAO();
        int id = dao.insertWeb();
        dao.deleteWebByID(id);
        assertEquals(dao.getWebByID(id), null);


    }

    @Test
    public void update_Web_By_ID_Test() throws SQLException {
        WebDAO dao = new WebDAO();
        Web web = new Web();
        web.setIdWeb(1);
        web.setNombreWeb("telefonica");
        web.setTipoWeb("Test");
        web.setUrl("https://www.telefonica.com/es/");
        Date dt = new java.sql.Date(2021, 11, 9);
        //java.text.SimpleDateFormat sdf =
        //      new java.text.SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
        //String currentTime = sdf.format(dt);
        //dt = new Date(2021,11,9, 13,04,05);
        web.setUpdate(dt);
        dao.updateWebByID(1, web);
        assertEquals(dao.getWebByID(1).getTipoWeb(), web.getTipoWeb());


    }

    @AfterAll
    public void reset() throws SQLException {
        WebDAO dao = new WebDAO();
        Web web = new Web();
        web.setIdWeb(1);
        web.setNombreWeb("telefonica");
        web.setTipoWeb("telecomunicacion");
        web.setUrl("https://www.telefonica.com/es/");
        Date dt = new java.sql.Date(2021, 11, 9);
        //java.text.SimpleDateFormat sdf =
        //       new java.text.SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
        //String currentTime = sdf.format(dt);
        //dt = new Date(2021,11,9, 13,04,05);
        web.setUpdate(dt);
        dao.updateWebByID(1, web);
    }

}
