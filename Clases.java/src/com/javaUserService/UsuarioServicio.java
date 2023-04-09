package com.javaUserService;

import com.javaUsers.Usuario;

public class UsuarioServicio implements iUsuario {

    @Override
    public void registrar(Usuario usuario) {
        System.out.println(usuario + "registrada");
    }

}
