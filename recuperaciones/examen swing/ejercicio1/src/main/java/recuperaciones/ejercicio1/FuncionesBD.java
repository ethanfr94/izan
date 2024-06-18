/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package recuperaciones.ejercicio1;

import java.sql.*;
import java.util.ArrayList;
import javax.swing.JOptionPane;

/**
 *
 * @author Izan Franco Anduaga
 */
public class FuncionesBD {

    private static Connection getConnection() {
        return AccesoBD.getInstance().getConn();
    }

    public static void muestraMensaje(String mensaje, String tipo) {
        switch (tipo.toLowerCase()) {
            case "error" -> {
                JOptionPane.showMessageDialog(null, mensaje, "ERROR", JOptionPane.ERROR_MESSAGE);
            }
            case "info" -> {
                JOptionPane.showMessageDialog(null, mensaje, "INFORMACION", JOptionPane.INFORMATION_MESSAGE);
            }
            case "warning" -> {
                JOptionPane.showMessageDialog(null, mensaje, "AVISO", JOptionPane.WARNING_MESSAGE);
            }
            case "pregunta" -> {
                JOptionPane.showMessageDialog(null, mensaje, "PREGUNTA", JOptionPane.QUESTION_MESSAGE);
            }
        }

    }

    public static boolean verificarUsuario(String user, String pass) {
        boolean valido = false;
        String sql = "select usuario, password, administrador from usuarios where usuario = ? and password = MD5(?) ;";
        Profesor p = null;
        ResultSet rs = null;
        try (PreparedStatement ps = getConnection().prepareStatement(sql)) {
            ps.setString(1, user);
            ps.setString(2, pass);
            rs = ps.executeQuery();
            if (rs.next()) {
                if (rs.getInt("administrador") == 1) {
                    return true;
                } else {
                    muestraMensaje("permiso denegado", "error");
                }
            } else {
                muestraMensaje("usuario o contraseña desconocidos", "error");
            }
        } catch (SQLException e) {
            System.out.println(e.getMessage());
        }
        return valido;
    }

    public static Departamento porId(int id) {
        Departamento d = null;
        ResultSet rs = null;
        String sql = "SELECT id, codigo, nombre FROM departamentos where id = ?";
        try (PreparedStatement ps = getConnection().prepareStatement(sql);) {
            ps.setInt(1, id);
            rs = ps.executeQuery();
            if (rs.next()) {
                d = new Departamento(rs.getInt("id"), rs.getString("codigo"), rs.getString("nombre"));
            } else {
                muestraMensaje("no se ha encontrado ningun departamento con esa id", "warning");
            }
        } catch (SQLException ex) {
            System.out.println("SQLException: " + ex.getMessage());
        }
        return d;
    }

    public static ArrayList<Profesor> listarProfesores() {
        ArrayList<Profesor> lista = new ArrayList<>();
        String sql = "SELECT dni,profesores.nombre,apellidos,correo_electronico,departamentos.id as departamento FROM profesores inner join departamentos on departamentos.id=departamento_id;";
        try (PreparedStatement stmt = getConnection().prepareStatement(sql);) {
            try (ResultSet rs = stmt.executeQuery(sql);) {
                while (rs.next()) {
                    Profesor p = new Profesor(rs.getString("dni"), rs.getString("nombre"), rs.getString("apellidos"), rs.getString("correo_electronico"), porId(rs.getInt("departamento")));
                    if (!lista.add(p)) {
                        throw new Exception("error no se ha insertado el objeto en la colección");
                    }
                }
            }
        } catch (SQLException ex) {
            System.out.println("SQLException: " + ex.getMessage());
        } catch (Exception ex) {
            System.out.println(ex.getMessage());
        }
        return lista;
    }

    public static ArrayList<Departamento> listarDepartamentos() {
        ArrayList<Departamento> departamentos = new ArrayList<>();
        String sql = "SELECT id,nombre,codigo FROM departamentos order by nombre;";
        try (PreparedStatement stmt = getConnection().prepareStatement(sql);) {
            ResultSet rs = stmt.executeQuery(sql);
            while (rs.next()) {
                Departamento d = new Departamento(rs.getInt("id"), rs.getString("codigo"), rs.getString("nombre"));
                if (!departamentos.add(d)) {
                    throw new Exception("error no se ha insertado el objeto en la colección");
                }
            }
        } catch (SQLException ex) {
            System.out.println("SQLException: " + ex.getMessage());
        } catch (Exception ex) {
            System.out.println(ex.getMessage());
        }
        return departamentos;
    }

    public static boolean insertarProfesor(Profesor p) {
        boolean correcto = false;
        String sql = null;
        sql = "INSERT INTO profesores(dni,nombre,apellidos, correo_electronico, departamento_id) VALUES (?,?,?,?,?)";
        try (PreparedStatement stmt = getConnection().prepareStatement(sql);) {
            stmt.setString(1, p.getDni());
            stmt.setString(2, p.getNombre());
            stmt.setString(3, p.getApellidos());
            stmt.setString(4, p.getEmail());
            stmt.setInt(5, p.getDepartamento().getId());
            int salida = stmt.executeUpdate();
            if (salida != 1) {
                throw new Exception("No se ha insertado/modificado un solo registro");
            } else {
                correcto = true;
            }
        } catch (SQLException ex) {
            System.out.println("SQLException: " + ex.getMessage());
        } catch (Exception ex) {
            System.out.println(ex.getMessage());
        }
        return correcto;
    }

}
