package com.design.patterns.business;

import com.design.patterns.exceptions.LoginAtivoException;
import com.design.patterns.exceptions.LoginExcedeuTentativasException;
import com.design.patterns.exceptions.LoginExpiradoException;
import com.design.patterns.exceptions.LoginInvalidoException;
import com.design.patterns.exceptions.LoginIpInvalidoException;
import com.design.patterns.model.UsuarioModel;

public class LoginFacade {

	private LoginBusiness loginBusiness = new LoginBusiness();
	
	public void loginWeb(UsuarioModel usuarioModel) throws 
			LoginAtivoException, 
			LoginExcedeuTentativasException, 
			LoginExpiradoException, 
			LoginIpInvalidoException, 
			LoginInvalidoException {
		
		loginBusiness.validarUsuarioAtivo(usuarioModel);
		loginBusiness.validarTentativasdeLogin(usuarioModel);
		loginBusiness.validarUsuarioExpirado(usuarioModel);
		loginBusiness.validarIp(usuarioModel);
		loginBusiness.validarLogin(usuarioModel);
		
	}
	
	public void loginMobile(UsuarioModel usuarioModel) throws 
			LoginAtivoException, 
			LoginExcedeuTentativasException, 
			LoginExpiradoException, 
			LoginInvalidoException {

		loginBusiness.validarUsuarioAtivo(usuarioModel);
		loginBusiness.validarTentativasdeLogin(usuarioModel);
		loginBusiness.validarUsuarioExpirado(usuarioModel);
		loginBusiness.validarLogin(usuarioModel);
		
	}
	
}