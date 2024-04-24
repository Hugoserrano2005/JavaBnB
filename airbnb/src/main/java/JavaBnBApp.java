
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JLabel;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author hugos
 */
import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class JavaBnBApp {
    private static Administrador administrador = new Administrador("admin@javabnb.com", "admin");

    public static void main(String[] args) {
        JFrame frame = new JFrame("JavaBnB Administrador Login");
        frame.setSize(300, 200);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setLayout(new GridLayout(3, 2));

        JLabel labelUser = new JLabel("Correo:");
        JTextField textFieldUser = new JTextField();
        JLabel labelPassword = new JLabel("Clave:");
        JPasswordField passwordField = new JPasswordField();
        JButton loginButton = new JButton("Login");

        frame.add(labelUser);
        frame.add(textFieldUser);
        frame.add(labelPassword);
        frame.add(passwordField);
        frame.add(new JLabel());  // Empty label for layout purposes
        frame.add(loginButton);

        loginButton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                String correo = textFieldUser.getText();
                String clave = new String(passwordField.getPassword());

                if (autenticarAdmin(correo, clave)) {
                    JOptionPane.showMessageDialog(frame, "Autenticación exitosa", "Login", JOptionPane.INFORMATION_MESSAGE);
                    // Aquí puedes llamar a otras funciones de administración
                    abrirPanelDeAdministracion();
                } else {
                    JOptionPane.showMessageDialog(frame, "Autenticación fallida", "Login", JOptionPane.ERROR_MESSAGE);
                }
            }
        });

        frame.setVisible(true);
    }

    private static boolean autenticarAdmin(String correo, String clave) {
        return administrador.getCorreo().equals(correo) && administrador.getClave().equals(clave);
    }

    private static void abrirPanelDeAdministracion() {
        // Aquí se abriría la interfaz gráfica del panel de administración
        System.out.println("Acceso al panel de administración concedido.");
    }
}
