package com.example.demo.service;

import java.util.List;

import com.example.demo.entity.Usuario;

public interface UsuarioService {

	public abstract List<Usuario> listAllUsuario();
	
	public abstract Usuario addUsuario(Usuario usuario);
}
