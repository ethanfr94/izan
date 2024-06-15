/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package recuperaciones.ejercicio1;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Izan Franco Anduaga
 */
public class LibroDAOImp implements Repositorio<Libro> {

    @Override
    public List<Libro> listar() {
        Connection conn = AccesoBD.getInstance().getConn();
        List<Libro> libros = new ArrayList<>();
        try (PreparedStatement stmt = conn.prepareStatement("SELECT COD_LIBRO, TITULO, AUTOR, COPIAS FROM libros"); ResultSet rs = stmt.executeQuery();) {
            while (rs.next()) {
                Libro libro = new Libro(rs.getString("COD_LIBRO"), rs.getString("TITULO"), rs.getString("AUTOR"), rs.getInt("COPIAS"));
                if (!libros.add(libro)) {
                    throw new Exception("error no se ha insertado el objeto en la colección");
                }
            }
        } catch (SQLException ex) {
            System.out.println("SQLException: " + ex.getMessage());
        } catch (Exception ex) {
            System.out.println(ex.getMessage());
        }
        return libros;
    }

    @Override
    public Libro porCod(String cod) {
        Libro libro = null;
        Connection conn = AccesoBD.getInstance().getConn();
        String sql = "SELECT COD_LIBRO, TITULO, AUTOR, COPIAS FROM libros where COD_LIBRO=?;";
        try (PreparedStatement ps = conn.prepareStatement(sql);) {
            ps.setString(1, cod);
            ResultSet rs = ps.executeQuery();
            while (rs.next()) {
                libro = new Libro(rs.getString("COD_LIBRO"), rs.getString("TITULO"), rs.getString("AUTOR"), rs.getInt("COPIAS"));
            }
        } catch (SQLException e) {
            System.out.println(e.getMessage());
        }
        return libro;
    }

    @Override
    public void insertar(Libro libro) {
        Connection conn = AccesoBD.getInstance().getConn();
        String sql = "insert into libros (COD_LIBRO,TITULO,AUTOR,COPIAS) values (?,?,?,?)";
        try (PreparedStatement stmt = conn.prepareStatement(sql);) {
            stmt.setString(1, libro.getCod_libro());
            stmt.setString(2, libro.getTitulo());
            stmt.setString(3, libro.getAutor());
            stmt.setInt(4, libro.getCopias());
            int salida = stmt.executeUpdate();
            if (salida != 1) {
                throw new Exception(" No se ha modificado un solo registro");
            } else {
                System.out.println("Filas modificada: " + salida);
            }
        } catch (SQLException ex) {
            System.out.println("SQLException: " + ex.getMessage());
        } catch (Exception ex) {
            System.out.println(ex.getMessage());
        }
    }

    @Override
    public void modificar(String cod) {
        Connection conn = AccesoBD.getInstance().getConn();
        Libro l = porCod(cod);
        int salida = -1;
        String sql = "UPDATE libros SET COPIAS = (?/2) WHERE COD_LIBRO=?";
        try (PreparedStatement stmt = conn.prepareStatement(sql);) {
            stmt.setInt(1, l.getCopias());
            stmt.setString(2, cod);
            salida = stmt.executeUpdate();
            if (salida != 1) {
                throw new Exception(" No se ha modificado un solo registro");
            } else {
                System.out.println("Filas modificada: " + salida);
            }
        } catch (SQLException ex) {
            System.out.println("SQLException: " + ex.getMessage());
        } catch (Exception ex) {
            System.out.println(ex.getMessage());
        }
    } 

    //@Override
    public boolean eliminar(String cod) {
        Connection conn = AccesoBD.getInstance().getConn();
        int salida = -1;
        boolean borrado = false;
        String sql = "DELETE FROM libros WHERE COD_LIBRO=?";
        try (PreparedStatement stmt = conn.prepareStatement(sql);) {
            stmt.setString(1, cod);
            salida = stmt.executeUpdate();
            if (salida == 1) {
                borrado = true;
            } 
        } catch (SQLException ex) {
            System.out.println("SQLException: " + ex.getMessage());
        } 
        return borrado;
    }
    
    public void mostrarLectores(Libro libro){
        Connection conn = AccesoBD.getInstance().getConn();
        String sql = "SELECT NOMBRE,COD_LIBRO,FECHA_PRESTAMO FROM lectores where COD_LIBRO=?;";
        try (PreparedStatement ps = conn.prepareStatement(sql);) {
            ps.setString(1, libro.getCod_libro());
            ResultSet rs = ps.executeQuery();
            while (rs.next()) {
                Lector lector = new Lector(rs.getString("NOMBRE"), porCod(rs.getString("COD_LIBRO")), LocalDate.parse(rs.getString("FECHA_PRESTAMO")));
                System.out.println(lector.toString());
            }
        } catch (SQLException e) {
            System.out.println(e.getMessage());
        }
    }

}
