/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package proyectoalgoritmos;


import Data.CirculeDoubleListPeliculas;
import Data.PeliculaData;
import Domain.Pelicula;
import GUI.Ventana;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import javax.swing.JFrame;

/**
 *
 * @author Heller
 */
public class ProyectoAlgoritmos {

    public static void main(String[] args) throws IOException, IOException {
        PeliculaData pd = new PeliculaData();
        CirculeDoubleListPeliculas listaCircular = new CirculeDoubleListPeliculas();

        Ventana principal = new Ventana();
        principal.setVisible(true);
        principal.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }

}
