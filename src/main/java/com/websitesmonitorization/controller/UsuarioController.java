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
import com.websitesmonitorization.model.Usuario;
import com.websitesmonitorization.dao.WebDAO;
import com.websitesmonitorization.dao.UserDAO;

import org.apache.commons.dbutils.handlers.ArrayListHandler;
import org.apache.commons.dbutils.handlers.BeanListHandler;
import org.apache.commons.dbutils.handlers.ScalarHandler;

import java.util.List;

@RestController
@RequestMapping("/usuario")
public class UsuarioController {

	/*
	@GetMapping(value = "/{id}")
	public ResponseEntity<Usuario> getUserById(@PathVariable int id) throws SQLException {

		
		UserDAO usuDAO = new UserDAO();
		Usuario usu = new Usuario();
		usu = usuDAO.getUserByID(id);
		
		return new ResponseEntity<Usuario>(usu, HttpStatus.OK);
		
	}
	*/
	
	@GetMapping(value = "/{id}")
	public ResponseEntity<List<Web>> getWebByUserId(@PathVariable int id) throws SQLException {
		
		UserDAO usuDAO = new UserDAO();
		List<Web> subs;
		
		subs = usuDAO.getSubscripcionesByUserID(id);
		
		return new ResponseEntity<List<Web>>(subs, HttpStatus.OK);
		
	}
		
	/*@DeleteMapping(value = "/{id}")
	public ResponseEntity<String> deleteUserByID(@PathVariable int id) throws SQLException {

		WebDAO webDAO = new WebDAO();
		Web web = webDAO.deleteUserByID(id);
		
		return new ResponseEntity<Web>(web, HttpStatus.OK);
		
	}
	
	@PostMapping(value = "/{id}")
	public ResponseEntity<String> postUserByID(@PathVariable int id) throws SQLException {

		WebDAO webDAO = new WebDAO();
		Web web = webDAO.updateUserByID(id);
		
		return new ResponseEntity<Web>(web, HttpStatus.OK);
		
	}
	
	@PutMapping(value = "/{id}")
	public ResponseEntity<String> postWebByID(@PathVariable int id) throws SQLException {

	*/
	
}
