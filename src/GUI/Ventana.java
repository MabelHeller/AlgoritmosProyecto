/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package GUI;

import java.awt.Dimension;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JDesktopPane;
import javax.swing.JFrame;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;

/**
 *
 * @author Heller
 */
public class Ventana extends JFrame implements ActionListener {

    private JMenu jmMenu;
    private JMenuItem jmiBuscar;
    private JMenuItem jmiGeneroDrama;
    private JMenuItem jmiGeneroAction;
    private JMenuItem jmiGeneroFiccion;
    private JMenuItem jmiGeneroRomance;
    private JMenuItem jmiGeneroChildsh;
    private JMenuItem jmiGeneroComedy;

    private JMenuItem jmiRegistrarPelicula;
    private JMenuItem jmiListado;

    private JMenuBar jmbBarra;
    private JDesktopPane desktopPane;

    public Ventana() {
        super();
        this.setPreferredSize(new Dimension(800, 600));
        init();
    }//constructor

    private void init() {
        this.desktopPane = new JDesktopPane();
        this.setBounds(0, 0, 800, 600);
        this.desktopPane.setLayout(null);
        this.jmMenu = new JMenu("Menu");
        this.jmiBuscar = new JMenuItem("Buscar Pelicula");
        this.jmiGeneroDrama = new JMenuItem("Lista Drama");
        this.jmiGeneroAction = new JMenuItem("Lista Action");
        this.jmiGeneroFiccion = new JMenuItem("Lista Ficcion");
        this.jmiGeneroChildsh = new JMenuItem("Lista Childish");
        this.jmiGeneroRomance = new JMenuItem("Lista Romance");
        this.jmiGeneroComedy = new JMenuItem("Lista Comedy");

        this.jmiRegistrarPelicula = new JMenuItem("Registrar la pelicula");
        this.jmiListado = new JMenuItem("Listado General");
        this.jmbBarra = new JMenuBar();
        this.jmbBarra.setBounds(5, 5, 70, 50);

        this.add(this.jmMenu);
        jmbBarra.add(jmMenu);
        jmMenu.add(jmiBuscar);
        jmMenu.add(jmiRegistrarPelicula);
        jmMenu.add(jmiGeneroDrama);
        jmMenu.add(jmiGeneroAction);
        jmMenu.add(jmiGeneroChildsh);
        jmMenu.add(jmiGeneroComedy);
        jmMenu.add(jmiGeneroFiccion);
        jmMenu.add(jmiGeneroRomance);
        jmMenu.add(jmiListado);
        this.jmiGeneroDrama.addActionListener(this);
        this.jmiGeneroAction.addActionListener(this);
        this.jmiGeneroComedy.addActionListener(this);
        this.jmiGeneroFiccion.addActionListener(this);
        this.jmiGeneroChildsh.addActionListener(this);
        this.jmiGeneroRomance.addActionListener(this);
        this.jmiBuscar.addActionListener(this);
        this.jmiRegistrarPelicula.addActionListener(this);
        this.jmiListado.addActionListener(this);

        this.setJMenuBar(jmbBarra);

        this.getContentPane().add(this.desktopPane);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == jmiBuscar) {
            BuscarPeli r = new BuscarPeli();
            r.setBounds(0, 0, 400, 400);
            this.desktopPane.add(r);
            r.show();
            r.setClosable(true);

        } else if (e.getSource() == jmiRegistrarPelicula) {
            InsertarPeli ip = new InsertarPeli();
            ip.setBounds(0, 0, 400, 400);
            this.desktopPane.add(ip);
            ip.show();
            ip.setClosable(true);
        } else if (e.getSource() == jmiGeneroDrama) {
            ListaDrama ld = new ListaDrama();
            this.desktopPane.add(ld);
            ld.show();
            ld.setClosable(true);

        } else if (e.getSource() == jmiListado) {
            CargarLista cl = new CargarLista();
            this.desktopPane.add(cl);
            cl.show();
            cl.setClosable(true);
        } else if (e.getSource() == jmiGeneroAction) {
            ListaAction ld = new ListaAction();
            this.desktopPane.add(ld);
            ld.show();
            ld.setClosable(true);

        }else if (e.getSource() == jmiGeneroFiccion) {
            ListaFiccion ld = new ListaFiccion();
            this.desktopPane.add(ld);
            ld.show();
            ld.setClosable(true);
        }else if (e.getSource() == jmiGeneroComedy) {
            ListaComedy ld = new ListaComedy();
            this.desktopPane.add(ld);
            ld.show();
            ld.setClosable(true);
        }else if (e.getSource() == jmiGeneroChildsh) {
            ListaChidish ld = new ListaChidish();
            this.desktopPane.add(ld);
            ld.show();
            ld.setClosable(true);
        }else if (e.getSource() == jmiGeneroRomance) {
            ListaRomance ld = new ListaRomance();
            this.desktopPane.add(ld);
            ld.show();
            ld.setClosable(true);
        }
    }
}
