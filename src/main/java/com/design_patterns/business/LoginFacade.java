package com.design_patterns.business;

import com.design_patterns.exceptions.LoginAtivoException;
import com.design_patterns.exceptions.LoginExcedeuTentativasException;
import com.design_patterns.exceptions.LoginExpiradoException;
import com.design_patterns.exceptions.LoginInvalidoException;
import com.design_patterns.exceptions.LoginIpInvalidoException;
import com.design_patterns.model.UsuarioModel;

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