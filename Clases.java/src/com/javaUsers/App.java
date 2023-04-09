package com.javaUsers;

import com.javaUserService.UsuarioServicio;
import com.javaUserService.iUsuario;

public class App {
    public static void main(String[] args) throws Exception {

        Usuario user1 = new Usuario(1, "Cristina Ramirez", "CristinaR@gmail.com", "3112345674", "20");
        iUsuario usuarioServicio = new UsuarioServicio();
        usuarioServicio.registrar(user1);

    }

}
