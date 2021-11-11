package com.websitesmonitorization.controller;

import static org.junit.Assert.*;

import java.sql.SQLException;
import java.util.List;

import org.junit.Test;

import com.websitesmonitorization.dao.UserDAO;
import com.websitesmonitorization.dao.WebDAO;
import com.websitesmonitorization.model.Web;

public class UsuarioControllerTest {

		@Test
		public void getWebByUserId_test() throws SQLException {

			UserDAO usuDAO = new UserDAO();
			
			List<Web> subs;	
			subs = usuDAO.getSubscripcionesByUserID(1);
			Web web1 = subs.get(1);
			Integer idWeb1 = web1.getIdWeb();
			
			Web web2 = new Web();
			web2.setIdWeb(1);
					
			assertEquals(web1, web2);
		}
}

