package datos;

import java.sql.*;
import java.util.*;
import com.javaUsers.Usuario;

public class UserDao {

    public static final String SQL_SELECT = "SELECT * FROM USUARIOSDB";
    public static final String SQL_INSERT = "INSERT INTO  USUARIOSDB (nombre,correo,telefono,edad) VALUES(?,?,?,?)";
    public static final String SQL_UPDATE = " UPDATE USUARIOSDB SET NOMBRE = ?, CORREO = ?, TELEFONO = ?,EDAD = ? WHERE IsUser = ?";
    public static final String SQL_DELETE = "DELETE FROM USUARIOSDB WHERE IdUser = ?";

    public Usuario mostrar() {
        Connection conexion = null;
        PreparedStatement sentencia = null;
        ResultSet resultado = null;
        Usuario usuario = null;
        List<Usuario> usuariosDB = new ArrayList<>();

        try {
            conexion = ConexionDB.getConexion();
            sentencia = conexion.prepareStatement(SQL_SELECT);
            resultado = sentencia.executeQuery();

            while (resultado.next()){
                usuario = new Usuario();
                usuario.setId(resultado.getInt("IdUser"));
                usuario.setNombres(resultado.getString("nombre"));
                usuario.setCorreo(resultado.getString("correo"));
                usuario.setTelefono(resultado.getString("Telefono"));
                usuario.setEdad(resultado.getString("edad"));
                usuario.add(usuario);

            }
        } catch (SQLException e) {
            e.printStackTrace(System.out);
        } finally{
            try{
                ConexionDB.cerrar(resultado);
                ConexionDB.cerrar(sentencia);
                ConexionDB.cerrar(conexion);
            catch(SQLException e){
                    e.printStackTrace(System.out);
            }

        }
        return usuario;
                
    }
    
        
}
}
