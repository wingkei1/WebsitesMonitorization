package com.websitesmonitorization.controller;

import static org.junit.Assert.*;

import java.sql.SQLException;

import com.websitesmonitorization.model.Web;
import com.websitesmonitorization.dao.WebDAO;

import org.junit.Test;

public class WebControllerTest {

	@Test
	public void getWebById_test() throws SQLException {

		WebDAO webDAO = new WebDAO();
		
		Web web1 = webDAO.getWebByID(1);
		Web web2 = new Web();
		web2.setIdWeb(1);
				
		assertEquals(web1, web2);
	}

}
