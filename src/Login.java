import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Login extends JFrame {
    private JTextField textFieldUsuario;
    private JPasswordField passwordField;
    private JButton accesoButton;
    private JButton limpiarButton;
    private JPanel Login;

    public Login() {
        setTitle("Login");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setContentPane(Login);
        setSize(400,400);
        setVisible(true);


        accesoButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String usuario = textFieldUsuario.getText();
                String password = new String(passwordField.getPassword());

                if(usuario.isEmpty() || password.isEmpty()){
                    JOptionPane.showMessageDialog(Login,"Los campos estan vacios");
                }
                if(usuario.equals("Guanoluisa") && password.equals("Esfot123")) {
                    Menu_opciones menu = new Menu_opciones(usuario);
                    menu.setVisible(true);
                    dispose();
                }
                if(!usuario.equals("Guanoluisa") || !password.equals("Esfot123")){
                    JOptionPane.showMessageDialog(Login,"Usuario o contraseña incorrectos");
                }

            }
        });
        limpiarButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String usuario = textFieldUsuario.getText();
                String password = new String(passwordField.getPassword());

                textFieldUsuario.setText("");
                passwordField.setText("");
            }
        });
    }
}
