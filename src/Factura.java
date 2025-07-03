import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Factura extends JFrame {
    private JButton buttonMenu;
    private JTextField textFieldCodigo;
    private JTextField textFieldProducto;
    private JTextField textFieldPrecio;
    private JTextField textFieldCantidad;
    private JTextField textFieldSubtotal;
    private JTextField textFieldIva;
    private JTextField textFieldTotal;
    private JPanel Factura;
    private JButton buttonCalcular;
    public int stock;

    public Factura(String codigo, String nombre, String detalle, double precio, int stock, String usuario) {
        setTitle("Factura");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setSize(300,300);
        setContentPane(Factura);
        setVisible(true);

        buttonCalcular.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String codigo = textFieldCodigo.getText();
                String nombre = textFieldProducto.getText();
                String detalle = textFieldPrecio.getText();
                Double precio = Double.valueOf(textFieldPrecio.getText());
                int stock = Integer.valueOf(textFieldSubtotal.getText());

            }
        });

        buttonMenu.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                new Menu_opciones(usuario);
                setVisible(true);
                dispose();
            }
        });
    }
}
