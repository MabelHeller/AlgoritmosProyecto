/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package GUI;

import Business.PeliculaBusiness;
import Data.CirculeDoubleListPeliculas;
import Domain.Pelicula;
import java.awt.Dimension;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JButton;
import javax.swing.JInternalFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;

/**
 *
 * @author Heller
 */
public class InsertarPeli extends JInternalFrame implements ActionListener {

    private JTextField jtfCodigo;
    private JTextField jtfNombre;
    private JTextField jtftGenero;
    private JTextField jtftSubtitulo;
    private JTextField jtftPremier;
    private JTextField jtftTotal;

    private JLabel jlblCodigo;
    private JLabel jlblNombre;
    private JLabel jlblGenero;
    private JLabel jlblSubtitulo;
    private JLabel jlblPremier;
    private JLabel jlblTotal;

    private JButton jbtnInsertar;
    private JButton jbtnPrueba;

    public InsertarPeli() {
        super();
        //this.setSize(800,600);
        this.setPreferredSize(new Dimension(400, 400));
        init();
    }//constructor

    private void init() {

        this.setBounds(0, 0, 800, 600);
        this.setLayout(null);
        this.jlblCodigo = new JLabel("Code: ");
        this.jlblCodigo.setBounds(0, 0, 80, 60);
        this.add(this.jlblCodigo);
        this.jtfCodigo = new JTextField(10);
        this.jtfCodigo.setBounds(80, 20, 80, 20);
        this.add(this.jtfCodigo);

        this.jlblPremier = new JLabel("Premier: ");
        this.jlblPremier.setBounds(0, 60, 80, 60);
        this.add(this.jlblPremier);
        this.jtftPremier = new JTextField(10);
        this.jtftPremier.setBounds(80, 80, 80, 20);
        this.add(this.jtftPremier);

        this.jlblSubtitulo = new JLabel("Subtitled ");
        this.jlblSubtitulo.setBounds(0, 119, 80, 60);
        this.add(this.jlblSubtitulo);
        this.jtftSubtitulo = new JTextField(10);
        this.jtftSubtitulo.setBounds(80, 140, 80, 20);
        this.add(this.jtftSubtitulo);

        this.jlblNombre = new JLabel("Title: ");
        this.jlblNombre.setBounds(0, 215, 80, 60);
        this.add(this.jlblNombre);
        this.jtfNombre = new JTextField(10);
        this.jtfNombre.setBounds(80, 240, 80, 20);
        this.add(this.jtfNombre);

        this.jlblTotal = new JLabel("Total: ");
        this.jlblTotal.setBounds(0, 170, 80, 60);
        this.add(this.jlblTotal);
        this.jtftTotal = new JTextField(10);
        this.jtftTotal.setBounds(80, 192, 80, 20);
        this.add(this.jtftTotal);

        this.jlblGenero = new JLabel("Gender: ");
        this.jlblGenero.setBounds(0, 260, 80, 60);
        this.add(this.jlblGenero);
        this.jtftGenero = new JTextField(10);
        this.jtftGenero.setBounds(80, 285, 80, 20);
        this.add(this.jtftGenero);

        this.jbtnInsertar = new JButton("Insertar");
        this.jbtnInsertar.addActionListener(this);
        this.jbtnInsertar.setBounds(130, 330, 80, 20);
        this.add(this.jbtnInsertar);
    } //init

    @Override
    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == jbtnInsertar) {
            try {
                PeliculaBusiness pb = new PeliculaBusiness();
                CirculeDoubleListPeliculas peliB = new CirculeDoubleListPeliculas();
                Pelicula peli = new Pelicula(Integer.parseInt(this.jtfCodigo.getText()), this.jtfNombre.getText(), Integer.parseInt(this.jtftGenero.getText()), Integer.parseInt(this.jtftTotal.getText()), Integer.parseInt(this.jtftSubtitulo.getText()), Integer.parseInt(this.jtftPremier.getText()));

                if (pb.writerFile(peli)) {
                    JOptionPane.showMessageDialog(null, "Insertado");
                    jtfCodigo.setText("");
                    jtfNombre.setText("");
                    jtftGenero.setText("");
                    jtftTotal.setText("");
                    jtftSubtitulo.setText("");
                    jtftPremier.setText("");
                } else {
                    JOptionPane.showMessageDialog(null, "No se insertado");
                }
            } catch (IOException ex) {
                Logger.getLogger(InsertarPeli.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
    }

}
