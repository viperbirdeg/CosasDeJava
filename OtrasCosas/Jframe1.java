import javax.swing.*;
import java.awt.*;

class Jframe1 {
    public static void main(String[] args) {
        // crear un contenedor superior
        JFrame ventana = new JFrame("Hola Mundo"); // contenedor superior
        ventana.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); // Cuando se tacha, se deja de ejecutar 
        //ventana.setDefaultCloseOperation(JFrame.DO_NOTHING_ON_CLOSE); // Este evita que se cierre el programa
        //JFrame.setDefaultLookAndFeelDecorated(true); // Establece el look and feel como el de java
        ventana.setSize(500, 250);// tamaño de ventana
        ventana.setVisible(true);// ventana sea visible (true), no visible (false)

        // Obtener su contenedor intermedios
        JPanel panel = new JPanel(); // contenedor intermedio
        ventana.add(panel); // añadir el panel a ventana

        panel.setLayout(null); // panel para cambiar de tamaño

        // Crear componentes
        JTextField cuadrotxt = new JTextField("Vale verga la vida");// Campo de texto
        cuadrotxt.setBounds(10, 10, 250, 30); // cuadrotxt (posicion en x, posicion en y, ancho, alto)
        panel.add(cuadrotxt); // añadir a panel cuadrotxt
        cuadrotxt.setOpaque(true);
        cuadrotxt.setBackground(Color.PINK);

        JLabel etiqueta = new JLabel("Holis");
        panel.add(etiqueta);
        etiqueta.setOpaque(true);
        etiqueta.setBackground(Color.BLACK);
        etiqueta.setForeground(Color.PINK);
        panel.add(etiqueta, BorderLayout.SOUTH);

        JButton boton1 = new JButton("Boton"); // boton1
        boton1.setBounds(10, 50, 250, 20); // boton1 (posicion en x, posicion en y, ancho, alto)
        panel.add(boton1); // añadir a panel el boton1
        boton1.setOpaque(true);
        boton1.setBackground(Color.GREEN);

    }
}