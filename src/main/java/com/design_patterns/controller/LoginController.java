package com.design_patterns.controller;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.design_patterns.business.LoginFacade;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import com.design_patterns.exceptions.LoginAtivoException;
import com.design_patterns.exceptions.LoginExcedeuTentativasException;
import com.design_patterns.exceptions.LoginExpiradoException;
import com.design_patterns.exceptions.LoginInvalidoException;
import com.design_patterns.exceptions.LoginIpInvalidoException;
import com.design_patterns.model.UsuarioModel;

@SuppressWarnings("serial")
@WebServlet("/Login")
public class LoginController extends HttpServlet {
	
	// INSTANCIA DA CLASSE LOGGER
	private static final Logger LOGGER = LogManager.getLogger(LoginController.class.getName());
	private final LoginFacade loginFacade = new LoginFacade();
	
       
    public LoginController() {
        super();
    }

    
    @Override
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		try { 
			
			UsuarioModel usuarioModel = new UsuarioModel();
			usuarioModel.setLogin(request.getParameter("login"));
			usuarioModel.setSenha(request.getParameter("senha"));
			
			loginFacade.loginWeb(usuarioModel);
			
			RequestDispatcher despachar = request.getRequestDispatcher("home.jsp");
			despachar.forward(request, response);
			
		} catch (LoginAtivoException | LoginExcedeuTentativasException | LoginExpiradoException |
                 LoginInvalidoException | LoginIpInvalidoException e) {
			System.out.println("Erro ");
			response.sendRedirect("erro.jsp?msg=" + e.getMessage());
	    } catch (Exception e) {
			System.out.println("Ocorreu um erro muito crítico, desconhecido pela aplicação");
			response.sendRedirect("erro.jsp?msg=Erro crítico");
		}
	}
}