/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package recuperaciones.ejercicio1;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Izan Franco Anduaga
 */
public class LectorImp {

    public static List<Lector> lLectoresLibro(String cod) {
        Connection conn = AccesoBD.getInstance().getConn();
        List<Lector> lectores = new ArrayList<>();
        LibroDAOImp ld = new LibroDAOImp();
        String sql = "select ID, NOMBRE, COD_LIBRO, FECHA_PRESTAMO from lectores where COD_LIBRO = ?";
        try (PreparedStatement ps = conn.prepareStatement(sql)) {
            ps.setString(1, cod);
            ResultSet rs = ps.executeQuery();
            while (rs.next()) {
                Lector lector = new Lector(rs.getString("NOMBRE"), ld.porCod(rs.getString("COD_LIBRO")), LocalDate.parse(rs.getString("FECHA_PRESTAMO")));
                if (!lectores.add(lector)) {
                    throw new Exception("error no se ha insertado el objeto en la colección");
                }
            }
        } catch (SQLException ex) {
            System.out.println("SQLException: " + ex.getMessage());
        } catch (Exception ex) {
            System.out.println(ex.getMessage());
        }
        return lectores;
    }

    public static Lector porNombre(String nombre) {
        DateTimeFormatter f = DateTimeFormatter.ofPattern("yyyy-MM-dd");
        Lector lector = null;
        LibroDAOImp ld = new LibroDAOImp();
        Connection conn = AccesoBD.getInstance().getConn();
        String sql = "select ID, NOMBRE, COD_LIBRO, FECHA_PRESTAMO from lectores where NOMBRE = ?;";
        try (PreparedStatement ps = conn.prepareStatement(sql);) {
            ps.setString(1, nombre);
            ResultSet rs = ps.executeQuery();
            while (rs.next()) {
                LocalDate fp = LocalDate.parse(rs.getString("FECHA_PRESTAMO"));
                if (fp == null) {
                    lector = new Lector(rs.getString("NOMBRE"), ld.porCod("9788433975744"), LocalDate.now());
                } else {
                    lector = new Lector(rs.getString("NOMBRE"), ld.porCod(rs.getString("COD_LIBRO")), LocalDate.parse(rs.getString("FECHA_PRESTAMO")));
                    lector.setId(rs.getInt("ID"));
                }
            }
        } catch (SQLException e) {
            System.out.println(e.getMessage());
        }
        return lector;
    }

    public static void guardar(Lector lector) {
        System.out.println(lector.toString());
        if (porNombre(lector.getNombre()) == null) {
            insertar(lector);
        } else {
            modificar(lector);
        }
    }

    private static void modificar(Lector lector) {
        int x = -1;
        Connection conn = AccesoBD.getInstance().getConn();
        String sql = "UPDATE lectores SET COD_LIBRO = NULL, FECHA_PRESTAMO = NULL WHERE NOMBRE = ?;";
        try (PreparedStatement ps = conn.prepareStatement(sql);) {
            ps.setString(1, lector.getNombre());
            x = ps.executeUpdate();
        } catch (SQLException e) {
            System.out.println(e.getMessage());
        }
        if (x != 1) {
            System.out.println(x);
            System.out.println("error al modificar lector");
        } else {
            System.out.println("modificado correctamente");
        }
    }

    private static void insertar(Lector lector) {
        int x = -1;
        Connection conn = AccesoBD.getInstance().getConn();
        String sql = "insert into lectores (NOMBRE,COD_LIBRO,FECHA_PRESTAMO) values (?,?,?);";
        try (PreparedStatement ps = conn.prepareStatement(sql);) {
            ps.setString(1, lector.getNombre());
            ps.setString(2, lector.getLibro().getCod_libro());
            ps.setString(3, String.valueOf(lector.getFecha()));
            x = ps.executeUpdate();
        } catch (SQLException e) {
            System.out.println(e.getMessage());
        }
        if (x != 1) {
            System.out.println("error al insertar lector");
        } else {
            System.out.println("insertado correctamente");
        }
    }

    public static void eliminar(int id) {
        int x = -1;
        Connection conn = AccesoBD.getInstance().getConn();
        String sql = "delete from lectores where ID=?;";
        try (PreparedStatement ps = conn.prepareStatement(sql);) {
            ps.setInt(1, id);
            x = ps.executeUpdate();
        } catch (SQLException e) {
            System.out.println(e.getMessage());
        }
        if (x != 1) {
            System.out.println("error al eliminar lector");
        } else {
            System.out.println("eliminado correctamente");
        }
    }

}
