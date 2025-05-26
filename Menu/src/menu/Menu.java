/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package menu;

// Menu.java
import javax.swing.*;
import java.awt.event.*;

public class Menu extends JFrame {

    public Menu() {
        setTitle("Sistema de Información Académica");
        setSize(500, 400);
        setLocationRelativeTo(null);
        setDefaultCloseOperation(EXIT_ON_CLOSE);

        JMenuBar menuBar = new JMenuBar();

        JMenu menuIngresar = new JMenu("Ingresar");
        JMenuItem menuEstudiantes = new JMenuItem("Estudiantes");
        JMenuItem menuDocentes = new JMenuItem("Docentes");
        JMenuItem menuCursos = new JMenuItem("Cursos");

        JMenu menuMatricula = new JMenu("Matrícula");
        JMenuItem menuMatricular = new JMenuItem("Registrar Matrícula");

        JMenu menuNotas = new JMenu("Notas");
        JMenuItem menuNotasVista = new JMenuItem("Ver Notas");

        JMenu menuSalir = new JMenu("Salir");
        JMenuItem salirItem = new JMenuItem("Salir del sistema");

        menuIngresar.add(menuEstudiantes);
        menuIngresar.add(menuDocentes);
        menuIngresar.add(menuCursos);
        menuMatricula.add(menuMatricular);
        menuNotas.add(menuNotasVista);
        menuSalir.add(salirItem);

        menuBar.add(menuIngresar);
        menuBar.add(menuMatricula);
        menuBar.add(menuNotas);
        menuBar.add(menuSalir);
        setJMenuBar(menuBar);

        menuEstudiantes.addActionListener(e -> new Estudiante().setVisible(true));
        menuDocentes.addActionListener(e -> new Docente().setVisible(true));
        menuCursos.addActionListener(e -> new Curso().setVisible(true));
        menuMatricular.addActionListener(e -> new Matricula().setVisible(true));
        menuNotasVista.addActionListener(e -> new Nota().setVisible(true));
        salirItem.addActionListener(e -> System.exit(0));
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(() -> new Menu().setVisible(true));
    }
}
