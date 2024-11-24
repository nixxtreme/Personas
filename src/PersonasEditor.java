import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;

public class PersonasEditor extends JFrame {
    private JPanel panel1;
    private JButton prevButton;
    private JButton nextButton;
    private JButton addButton;
    private JTextField txtName;
    private JTextField txtAPaterno;
    private JTextField txtAMaterno;
    private JTextField txtEdad;
    private JTextField txtTel;
    private JTextField txtMail;
    private JTextField txtAddress;
    private JLabel lblName;
    public ArrayList<Persona> personas;
    public int i = 0;
    public  PersonasEditor(){

        setContentPane(panel1);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setSize(400, 300);

        personas = new ArrayList<Persona>();
        nextButton.setToolTipText("Muestra la siguiente persona");
        prevButton.setToolTipText("Muestra la persona anterior");

        nextButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {

                txtName.setText(personas.get(i).getNombre());
                txtAPaterno.setText(personas.get(i).getApellidoP());
                txtAMaterno.setText(personas.get(i).getApellidoM());
                txtEdad.setText(String.valueOf(personas.get(i).getEdad()));
                txtTel.setText(personas.get(i).getTelefono());
                txtMail.setText(personas.get(i).getEmail());
                txtAddress.setText(personas.get(i).getDireccion());
                if(personas.size()>i+1)
                    i++;
            }
        });

        prevButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                txtName.setText(personas.get(i).getNombre());
                txtAPaterno.setText(personas.get(i).getApellidoP());
                txtAMaterno.setText(personas.get(i).getApellidoM());
                txtEdad.setText(String.valueOf(personas.get(i).getEdad()));
                txtTel.setText(personas.get(i).getTelefono());
                txtMail.setText(personas.get(i).getEmail());
                txtAddress.setText(personas.get(i).getDireccion());
                if(i>0)
                    i--;
            }
        });

        addButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                Persona nuevaPersona = new Persona(txtName.getText(), txtAPaterno.getText(),
                        txtAMaterno.getText(), Integer.parseInt(txtEdad.getText()), txtTel.getText(), txtMail.getText(),
                        txtAddress.getText()
                );
                personas.add(nuevaPersona);
                //System.out.println(personas.get(0).getNombre());
                txtName.setText("");
                txtAPaterno.setText("");
                txtAMaterno.setText("");
                txtEdad.setText("");
                txtTel.setText("");
                txtMail.setText("");
                txtAddress.setText("");

            }
        });

        setVisible(true);
    }


    public static void main(String[] args) {
        new PersonasEditor();
    }

}
