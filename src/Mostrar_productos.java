import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Mostrar_productos extends JFrame {
    private JButton volverAlMenuButton;
    private JTextField textFieldCodigo;
    private JTextField textFieldNombre;
    private JTextField textFieldDetalle;
    private JTextField textFieldStock;
    private JPanel Mostrar;

    public Mostrar_productos(String codigo, String nombre, String detalle, double precio, int stock, String usuario) {
        setTitle("Mostrar productos");
        setSize(500, 500);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setContentPane(Mostrar);
        setLocationRelativeTo(null);

        textFieldCodigo.setText(codigo);
        textFieldNombre.setText(nombre);
        textFieldDetalle.setText(detalle);
        textFieldStock.setText(String.valueOf(stock));

        volverAlMenuButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                Menu_opciones menu = new Menu_opciones(usuario);
                menu.setVisible(true);
                dispose();
            }
        });

        setVisible(true);
    }
}
