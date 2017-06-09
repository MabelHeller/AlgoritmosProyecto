/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Data;

import Domain.Nodo;
import Domain.Pelicula;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import com.csvreader.CsvWriter;
import com.csvreader.CsvReader;
import java.io.File;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;

/**
 *
 * @author Heller
 */
public class PeliculaData {

    public CirculeDoubleListPeliculas lAction = new CirculeDoubleListPeliculas();
    public CirculeDoubleListPeliculas lChildish = new CirculeDoubleListPeliculas();
    public CirculeDoubleListPeliculas lComedy = new CirculeDoubleListPeliculas();
    public CirculeDoubleListPeliculas lFiction = new CirculeDoubleListPeliculas();
    public CirculeDoubleListPeliculas lRomance = new CirculeDoubleListPeliculas();
    public CirculeDoubleListPeliculas lDrama = new CirculeDoubleListPeliculas();
    public CirculeDoubleListPeliculas lista = new CirculeDoubleListPeliculas();
    public List<Pelicula> listaAction = new ArrayList<Pelicula>();
    public List<Pelicula> listaChildsh = new ArrayList<Pelicula>();
    public List<Pelicula> listaComedy = new ArrayList<Pelicula>();
    public List<Pelicula> listaDrama = new ArrayList<Pelicula>();
    public List<Pelicula> listaFiccion = new ArrayList<Pelicula>();
    public List<Pelicula> listaRomance = new ArrayList<Pelicula>();
    public List<Pelicula> listaPeli = new ArrayList<Pelicula>();

    public  CirculeDoubleListPeliculas fileReader() throws FileNotFoundException, IOException {
        Pelicula p = new Pelicula();
        boolean b = false;
        String linea;
        CsvReader br = new CsvReader("datos.csv");
        br.readHeaders();
        while (br.readRecord()) {
            Pelicula pelicula = new Pelicula();
            pelicula.setCode(Integer.parseInt(br.get(0)));
            pelicula.setTitle(br.get(1));
            pelicula.setGender(Integer.parseInt(br.get(2)));
            pelicula.setTotal(Integer.parseInt(br.get(3)));
            pelicula.setSubtitled(Integer.parseInt(br.get(4)));
            pelicula.setPremier(Integer.parseInt(br.get(5)));            
            lista.insertInOrder(pelicula);
            listaPeli.add(pelicula);
            switch (pelicula.getGender()) {
                case 1000:
                    lDrama.insertInOrder(pelicula);
                    //listaDrama.add(pelicula);

                    break;
                case 2000:
                    lComedy.insertInOrder(pelicula);
                    //listaComedy.add(pelicula);

                    break;
                case 3000:
                    lChildish.insertInOrder(pelicula);
                    //istaChildsh.add(pelicula);
                    break;
                case 4000:
                    lAction.insertInOrder(pelicula);
                    //listaAction.add(pelicula);
                    break;
                case 5000:
                    lRomance.insertInOrder(pelicula);
                    //listaRomance.add(pelicula);
                    break;
                case 6000:
                    lFiction.insertInOrder(pelicula);
                    //listaFiccion.add(pelicula);
                    break;
                default:
                    break;
            }
        }
        br.close();
        insertar(lAction);
        insertar(lChildish);
        insertar(lDrama);
        insertar(lComedy);
        insertar(lFiction);
        insertar(lRomance);
        return lista;
    }

    public boolean writerFile(Pelicula pelicula) throws IOException {
        File file = new File("datos.csv");
        if (file.exists()) {
            File filePeli = new File("datos.csv");
        }
        CsvWriter cw = new CsvWriter(new FileWriter(file, true), ',');
        cw.write(Integer.toString(pelicula.getCode()));
        cw.write(pelicula.getTitle());
        cw.write(Integer.toString(pelicula.getGender()));
        cw.write(Integer.toString(pelicula.getTotal()));
        cw.write(Integer.toString(pelicula.getSubtitled()));
        cw.write(Integer.toString(pelicula.getPremier()));
        lista.insertInOrder(pelicula);
        cw.endRecord();
        cw.close();
        return true;
        
    }

    public boolean buscarPeli(String titulo) {
        File file = new File("datos.csv");
        List<Pelicula> listaPeliculas = new ArrayList<Pelicula>();
        if (file.exists()) {
            try {
                CsvReader br = new CsvReader("datos.csv");
                br.readHeaders();
                while (br.readRecord()) {
                    Pelicula pelicula = new Pelicula();
                    pelicula.setCode(Integer.parseInt(br.get(0)));
                    pelicula.setTitle(br.get(1));
                    pelicula.setGender(Integer.parseInt(br.get(2)));
                    pelicula.setTotal(Integer.parseInt(br.get(3)));
                    pelicula.setSubtitled(Integer.parseInt(br.get(4)));
                    pelicula.setPremier(Integer.parseInt(br.get(5)));
                    listaPeliculas.add(pelicula);
                }
            } catch (FileNotFoundException ex) {
                Logger.getLogger(PeliculaData.class.getName()).log(Level.SEVERE, null, ex);
            } catch (IOException ex) {
                Logger.getLogger(PeliculaData.class.getName()).log(Level.SEVERE, null, ex);
            }

            Pelicula pelicula = null;
            for (int i = 0; i < listaPeliculas.size(); i++) {
                if (listaPeliculas.get(i).getTitle().equalsIgnoreCase(titulo)) {
                    pelicula = listaPeliculas.get(i);
                    JOptionPane.showMessageDialog(null, pelicula);
                    return true;
                }
            }
        }
        return false;
    }

    public void insertar(CirculeDoubleListPeliculas lista) {
        Nodo tail = lista.getTail();
        Nodo tempPtr = lista.getHead();
        while (tempPtr != tail) {
            if (tempPtr.getDato().getGender() == 1000) {
                listaDrama.add(tempPtr.getDato());
            } else if (tempPtr.getDato().getGender() == 2000) {
                listaComedy.add(tempPtr.getDato());
            } else if (tempPtr.getDato().getGender() == 3000) {
                listaChildsh.add(tempPtr.getDato());
            } else if (tempPtr.getDato().getGender() == 4000) {
                listaAction.add(tempPtr.getDato());
            } else if (tempPtr.getDato().getGender() == 5000) {
                listaRomance.add(tempPtr.getDato());
            } else if (tempPtr.getDato().getGender() == 6000) {
                listaFiccion.add(tempPtr.getDato());
            }
            tempPtr = tempPtr.getNext();
        }

        if (tempPtr == tail) {

            if (tempPtr.getDato().getGender() == 1000) {
                listaDrama.add(tempPtr.getDato());
            } else if (tempPtr.getDato().getGender() == 2000) {
                listaComedy.add(tempPtr.getDato());
            } else if (tempPtr.getDato().getGender() == 3000) {
                listaChildsh.add(tempPtr.getDato());
            } else if (tempPtr.getDato().getGender() == 4000) {
                listaAction.add(tempPtr.getDato());
            } else if (tempPtr.getDato().getGender() == 5000) {
                listaRomance.add(tempPtr.getDato());
            } else if (tempPtr.getDato().getGender() == 6000) {
                listaFiccion.add(tempPtr.getDato());
            }

        }
    }

    public CirculeDoubleListPeliculas Drama() {
        return this.lDrama;
    }

    public CirculeDoubleListPeliculas Comedy() {
        return this.lComedy;
    }

    public CirculeDoubleListPeliculas Childisch() {
        return this.lChildish;
    }

    public CirculeDoubleListPeliculas Action() {
        return this.lAction;
    }

    public CirculeDoubleListPeliculas Romance() {
        return this.lRomance;
    }

    public CirculeDoubleListPeliculas Fiction() {
        return this.lFiction;
    }
}
