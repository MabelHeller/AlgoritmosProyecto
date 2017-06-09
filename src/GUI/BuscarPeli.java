/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package GUI;

import Business.PeliculaBusiness;
import java.awt.Dimension;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JInternalFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;

/**
 *
 * @author Heller
 */
public class BuscarPeli extends JInternalFrame implements ActionListener {

    private JTextField jtfNombre;

    private JLabel jlblNombre;

    private JButton jbtnBuscar;

    public BuscarPeli() {
        super();
        //this.setSize(800,600);
        this.setPreferredSize(new Dimension(400, 400));
        init();
    }//constructor

    private void init() {

        this.setBounds(0, 0, 800, 600);
        this.setLayout(null);

        this.jlblNombre = new JLabel("Nombre de la pelicula: ");
        this.jlblNombre.setBounds(0, 60, 130, 60);
        this.add(this.jlblNombre);
        this.jtfNombre = new JTextField(10);
        this.jtfNombre.setBounds(120, 80, 80, 20);
        this.add(this.jtfNombre);

        this.jbtnBuscar = new JButton("Buscar");
        this.jbtnBuscar.addActionListener(this);
        this.jbtnBuscar.setBounds(130, 240, 80, 20);
        this.add(this.jbtnBuscar);

    } //init

    @Override
    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == jbtnBuscar) {
            PeliculaBusiness peli = new PeliculaBusiness();
            if (peli.buscarPeli(this.jtfNombre.getText())) {
                JOptionPane.showMessageDialog(null, "Encontrado");
            } else {
                JOptionPane.showMessageDialog(null, "No se encontro");
            }
        }
    }
}
