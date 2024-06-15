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
import java.util.Date;
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
                Lector lector = new Lector(rs.getInt("ID"), rs.getString("NOMBRE"), ld.porCod(rs.getString("COD_LIBRO")), LocalDate.parse(rs.getString("FECHA_PRESTAMO")));
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
        Lector lector = null;
        LibroDAOImp ld = new LibroDAOImp();
        Connection conn = AccesoBD.getInstance().getConn();
        String sql = "select ID, NOMBRE, COD_LIBRO, FECHA_PRESTAMO from lectores where NOMBRE = ?;";
        try (PreparedStatement ps = conn.prepareStatement(sql);) {
            ps.setString(1, nombre);
            ResultSet rs = ps.executeQuery();
            while (rs.next()) {
                lector = new Lector(rs.getInt("ID"), rs.getString("NOMBRE"), ld.porCod(rs.getString("COD_LIBRO")), LocalDate.parse(rs.getString("FECHA_PRESTAMO")));
            }
        } catch (SQLException e) {
            System.out.println(e.getMessage());
        }
        return lector;
    }

    public static void guardar(Lector lector) {        
        Connection conn = AccesoBD.getInstance().getConn();
        if (LectorImp.porNombre(lector.getNombre()) == null) {
            String sql = "insert into lectores (ID,NOMBRE,COD_LIBRO,FECHA) values (?,?,?,?)";
            try (PreparedStatement ps = conn.prepareStatement(sql);) {
                ps.setInt(1, lector.getId());
                ps.setString(2, lector.getNombre());
                ps.setString(3, lector.getCod_libro().getCod_libro());
                ps.setString(4, String.valueOf(lector.getFecha()));
                ps.executeUpdate();
            } catch (SQLException e) {
                System.out.println(e.getMessage());
            }
        } else {
            String st = "update lectores set ID = ?, NOMBRE = ?, COD_LIBRO = null, FECHA = null where ID = ?";
            try (PreparedStatement ps = conn.prepareStatement(st);) {
                ps.setInt(1, lector.getId());
                ps.setString(2, lector.getNombre());
                ps.setInt(4, lector.getId());
                ps.executeUpdate();
            } catch (SQLException e) {
                System.out.println(e.getMessage());
            }
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
