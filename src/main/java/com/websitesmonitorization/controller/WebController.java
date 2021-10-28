package com.websitesmonitorization.controller;

import java.sql.SQLException;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.websitesmonitorization.model.Web;
import com.websitesmonitorization.dao.WebDAO;

@RestController
@RequestMapping("/web")
public class WebController {

	@GetMapping(value = "/{id}")
	public ResponseEntity<Web> getWebById(@PathVariable int id) throws SQLException {

		WebDAO webDAO = new WebDAO();
		Web web = webDAO.getWebByID(123456);
		
		return new ResponseEntity<Web>(web, HttpStatus.OK);
		
	}
		
	/*@DeleteMapping(value = "/{id}")
	public ResponseEntity<String> deleteWebByID(@PathVariable int id) throws SQLException {

		WebDAO webDAO = new WebDAO();
		Web web = webDAO.deleteWebByID(123456);
		
		return new ResponseEntity<Web>(web, HttpStatus.OK);
		
	}
	
	@GetMapping(value = "/{id}")
	public ResponseEntity<String> updateWebByID(@PathVariable int id) throws SQLException {

		WebDAO webDAO = new WebDAO();
		Web web = webDAO.updateWebByID(123456);
		
		return new ResponseEntity<Web>(web, HttpStatus.OK);
		
	}*/
	
}
