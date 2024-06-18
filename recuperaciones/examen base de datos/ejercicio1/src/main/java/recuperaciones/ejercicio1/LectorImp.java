/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package recuperaciones.ejercicio1;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Izan Franco Anduaga
 */
public class LectorImp {

    private static Connection getConnection() {
        return AccesoBD.getInstance().getConn();
    }

    public static List<Lector> lLectoresLibro(String cod) {
        List<Lector> lectores = new ArrayList<>();
        LibroDAOImp ld = new LibroDAOImp();
        String sql = "select ID, NOMBRE, COD_LIBRO, FECHA_PRESTAMO from lectores where COD_LIBRO = ?";
        try (PreparedStatement ps = getConnection().prepareStatement(sql)) {
            ps.setString(1, cod);
            ResultSet rs = ps.executeQuery();
            while (rs.next()) {
                Lector lector = new Lector(rs.getInt("ID"), rs.getString("NOMBRE"), ld.porCod(rs.getString("COD_LIBRO")), rs.getDate("FECHA_PRESTAMO").toLocalDate());
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

    public static void guardar(Lector lector) {
        String sql;
        boolean insertar = false;
        if (lector.getId() == 0) {
            sql = "insert into lectores (NOMBRE,COD_LIBRO,FECHA_PRESTAMO) values (?,?,?);";
            insertar = true;
        } else {
            sql = "UPDATE lectores SET COD_LIBRO = NULL, FECHA_PRESTAMO = NULL WHERE ID = ?;";
        }
        try (PreparedStatement ps = getConnection().prepareStatement(sql);) {
            if (insertar) {
                ps.setString(1, lector.getNombre());
                ps.setString(2, lector.getLibro().getCod_libro());
                ps.setDate(3, Date.valueOf(lector.getFecha()));
                lector.setId();
            } else {
                ps.setInt(1, lector.getId());
            }
            int salida = ps.executeUpdate();
            if (salida != 1) {
                if (insertar) {
                    System.out.println("error al insertar lector");
                } else {
                    System.out.println("error al modificar lector");
                }
            }else{
                if (insertar) {
                    System.out.println("lector insertado correctamente");
                } else {
                    System.out.println("lector modificado correctamente");
                }
            }
        } catch (SQLException e) {
            System.out.println(e.getMessage());
        }        
    }

    public static void eliminar(int id) {
        int x = -1;
        String sql = "delete from lectores where ID=?;";
        try (PreparedStatement ps = getConnection().prepareStatement(sql);) {
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
