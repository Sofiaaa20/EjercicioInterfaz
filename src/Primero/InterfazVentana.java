package Primero;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import java.awt.Color;
import java.awt.Font;
import java.awt.Button;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JButton;

public class InterfazVentana extends JFrame implements ActionListener{

	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	JLabel etiCiudad, etiNombre, title;
	JButton btnVisuCiudad, btnOcultarCiudad,btnOcultarNombre,btnVisuNombre;
	

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					InterfazVentana frame = new InterfazVentana ();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	public InterfazVentana() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBackground(new Color(255, 128, 255));
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		etiCiudad = new JLabel("CalarcÃ¡");
        etiCiudad.setFont(new Font("Tahoma", Font.PLAIN, 15));
        etiCiudad.setBounds(22, 160, 63, 19);
        etiCiudad.setVisible(true); // Inicialmente oculto
        contentPane.add(etiCiudad);

        etiNombre = new JLabel("Sofia Ramirez Valencia");
        etiNombre.setFont(new Font("Tahoma", Font.PLAIN, 15));
        etiNombre.setBounds(22, 85, 164, 30);
        etiNombre.setVisible(true); // Inicialmente oculto
        contentPane.add(etiNombre);

        title = new JLabel("Eventos Botones");
        title.setFont(new Font("Tahoma", Font.PLAIN, 20));
        title.setBounds(148, 11, 153, 36);
        contentPane.add(title);

        btnVisuCiudad = new JButton("Visualizar Ciudad");
        btnVisuCiudad.setBounds(313, 159, 121, 24);
        btnVisuCiudad.addActionListener(this); // Registrar ActionListener
        contentPane.add(btnVisuCiudad);

        btnOcultarCiudad = new JButton("Ocultar Ciudad");
        btnOcultarCiudad.setBounds(194, 159, 107, 24);
        btnOcultarCiudad.addActionListener(this); // Registrar ActionListener
        contentPane.add(btnOcultarCiudad);

        btnOcultarNombre = new JButton("Ocultar Nombre");
        btnOcultarNombre.setBounds(194, 91, 107, 24);
        btnOcultarNombre.addActionListener(this); // Registrar ActionListener
        contentPane.add(btnOcultarNombre);

        btnVisuNombre = new JButton("Visualizar Nombre");
        btnVisuNombre.setBounds(311, 91, 121, 24);
        btnVisuNombre.addActionListener(this); // Registrar ActionListener
        contentPane.add(btnVisuNombre);
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		  if (e.getSource() == btnOcultarNombre) {
	            etiNombre.setVisible(false);
	        } else if (e.getSource() == btnVisuNombre) {
	            etiNombre.setVisible(true);
	        } else if (e.getSource() == btnOcultarCiudad) {
	            etiCiudad.setVisible(false);
	        } else if (e.getSource() == btnVisuCiudad) {
	            etiCiudad.setVisible(true);
	        }
	}
}