import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Menu_opciones extends JFrame {
    private JButton registroButton;
    private JButton ventasButton;
    private JButton verProductosButton;
    private JPanel Opciones;
    public String codigo;
    public String nombre;
    public String detalle;
    public double precio;
    public int stock;

    public  Menu_opciones(String usuario) {
        setTitle("Menu_opciones");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setSize(400,400);
        setContentPane(Opciones);
        setVisible(true);

        registroButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                Productos productos = new Productos(usuario);
                productos.setVisible(true);
                dispose();
            }
        });
        ventasButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                Factura factura = new Factura(codigo,nombre,detalle,precio,stock, usuario);
                factura.setVisible(true);
                dispose();
            }
        });
        verProductosButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {

            }
        });
    }
}
