package com.design.patterns.business;

import com.design.patterns.exceptions.LoginAtivoException;
import com.design.patterns.exceptions.LoginExcedeuTentativasException;
import com.design.patterns.exceptions.LoginExpiradoException;
import com.design.patterns.exceptions.LoginInvalidoException;
import com.design.patterns.exceptions.LoginIpInvalidoException;
import com.design.patterns.model.UsuarioModel;

public class LoginBusiness {

	public void validarLogin(UsuarioModel usuarioModel) throws LoginInvalidoException {
		if ( ! usuarioModel.getLogin().equals("ok@mail.com") || !usuarioModel.getSenha().equals("123") ) {
			throw new LoginInvalidoException("Usuário ou senha incorreta");
		}
		
	}
	
	public void validarUsuarioAtivo(UsuarioModel usuarioModel) throws LoginAtivoException {
		if ( usuarioModel.getLogin().equals("login.ativo@mail.com") ) {
			throw new LoginAtivoException("Usuário logado em outro equipamento");
		}
	}
	
	public void validarTentativasdeLogin(UsuarioModel usuarioModel) throws LoginExcedeuTentativasException {
		if ( usuarioModel.getLogin().equals("tentativas@mail.com") ) {
			throw new LoginExcedeuTentativasException("Tentativas excedidas");
		}
		
	}

	public void validarUsuarioExpirado(UsuarioModel usuarioModel) throws LoginExpiradoException {
		if ( usuarioModel.getLogin().equals("expirado@mail.com") ) {
			throw new LoginExpiradoException("Login expirado");
		}		
	}

	public void validarIp(UsuarioModel usuarioModel) throws LoginIpInvalidoException {
		if ( usuarioModel.getLogin().equals("ip@mail.com") ) {
			throw new LoginIpInvalidoException("Ip suspeito");
		}
		
	}
	
}