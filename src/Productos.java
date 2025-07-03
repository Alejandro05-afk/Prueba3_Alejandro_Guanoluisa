import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Productos extends JFrame{
    private JLabel Encabezado;
    private JTextField textFieldCodigo;
    private JTextField textFieldNombre;
    private JTextField textFieldDetalle;
    private JTextField textFieldPrecio;
    private JTextField textFieldStock;
    private JButton guardarButton;
    private JButton limpiarButton;
    private JPanel Productos;
    private JButton volverButton;

    public Productos(String usuario) {
        String encabezado = Encabezado.getText();
        Encabezado.setText("Productos     "+"("+usuario+")");
        setTitle("Productos");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setSize(500,500);
        setLocationRelativeTo(null);
        setContentPane(Productos);
        setVisible(true);


        guardarButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String codigo =  textFieldCodigo.getText();
                String nombre =  textFieldNombre.getText();
                String detalle =  textFieldDetalle.getText();
                Double precio =  Double.parseDouble(textFieldPrecio.getText());
                int stock =  Integer.parseInt(textFieldStock.getText());

                if(codigo.isEmpty() || nombre.isEmpty() || detalle.isEmpty() || precio.describeConstable().isEmpty() || stock == 0){
                    JOptionPane.showMessageDialog(null,"Los campos estan vacios");
                }else if (precio >= 1000 || precio <= 0){
                    JOptionPane.showMessageDialog(null,"Precio invalido");
                }else if (stock >= 1000 || stock <= 0){
                    JOptionPane.showMessageDialog(null,"Stock invalido");
                }else {
                    JOptionPane.showMessageDialog(null,"Producto guardado correctamente");
                    textFieldCodigo.setText("");
                    textFieldNombre.setText("");
                    textFieldDetalle.setText("");
                    textFieldPrecio.setText("");
                    textFieldStock.setText("");

                    Factura factura = new Factura(codigo,nombre,detalle,precio,stock, usuario);
                    Mostrar_productos mostrarProductos = new Mostrar_productos(codigo,nombre,detalle,precio,stock, usuario);
                }
            }
        });

        volverButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                new Menu_opciones(usuario);
                setVisible(true);
                dispose();
            }
        });


        limpiarButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                textFieldCodigo.setText("");
                textFieldNombre.setText("");
                textFieldDetalle.setText("");
                textFieldPrecio.setText("");
                textFieldStock.setText("");
            }
        });



    }
}
