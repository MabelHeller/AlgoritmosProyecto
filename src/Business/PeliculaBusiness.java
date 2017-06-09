/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business;

import Data.CirculeDoubleListPeliculas;
import Data.PeliculaData;
import Domain.Pelicula;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.List;

/**
 *
 * @author Heller
 */
public class PeliculaBusiness {

    PeliculaData p = new PeliculaData();

    public CirculeDoubleListPeliculas fileReader() throws FileNotFoundException, IOException {
        return this.p.fileReader();
    }

    public boolean writerFile(Pelicula pelicula) throws IOException {
        return this.p.writerFile(pelicula);
    }

    public boolean buscarPeli(String titulo) {
        return this.p.buscarPeli(titulo);
    }

}
