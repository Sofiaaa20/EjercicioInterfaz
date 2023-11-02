package Cuarto;

import java.awt.EventQueue;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import java.awt.Color;
import javax.swing.JTextField;
import javax.swing.JLabel;
import javax.swing.JButton;
import javax.swing.SwingConstants;

public class Interfaz extends JFrame implements ActionListener {

	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	private JTextField txtNombre;
	private JTextField txtCiudad;
	private JLabel lblNombre;
	private JLabel lblCiudad;
	private JLabel txtFrase;
	private JButton btnButton;
	private JButton btnDesactivar;
	private JButton btnActivar;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Interfaz frame = new Interfaz();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public Interfaz() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBackground(new Color(181, 255, 241));
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		txtNombre = new JTextField();
		txtNombre.setBounds(197, 43, 130, 26);
		contentPane.add(txtNombre);
		txtNombre.setColumns(10);
		
		txtCiudad = new JTextField();
		txtCiudad.setColumns(10);
		txtCiudad.setBounds(197, 99, 130, 26);
		contentPane.add(txtCiudad);
		
		lblNombre = new JLabel("Nombre");
		lblNombre.setBounds(113, 48, 61, 16);
		contentPane.add(lblNombre);
		
		lblCiudad = new JLabel("Ciudad");
		lblCiudad.setBounds(113, 104, 61, 16);
		contentPane.add(lblCiudad);
		
		txtFrase = new JLabel("");
		txtFrase.setHorizontalAlignment(SwingConstants.CENTER);
		txtFrase.setBounds(62, 158, 336, 16);
		contentPane.add(txtFrase);
		
		btnButton = new JButton("Aceptar");
		btnButton.setBackground(new Color(246, 255, 244));
		btnButton.setBounds(57, 215, 117, 29);
		contentPane.add(btnButton);
		btnButton.addActionListener(this);
		
		btnDesactivar = new JButton("Desactivar");
		btnDesactivar.setBounds(181, 215, 117, 29);
		btnDesactivar.addActionListener(this);
		contentPane.add(btnDesactivar);
		
		btnActivar = new JButton("Activar");
		btnActivar.setBounds(298, 215, 117, 29);
		btnActivar.addActionListener(this);
		contentPane.add(btnActivar);
	}

	
	@Override
	public void actionPerformed(ActionEvent e) {
		
		if(e.getSource() == btnButton) {
			String nombre = txtNombre.getText();
			String ciudad = txtCiudad.getText();
			txtFrase.setText("Usted se llama " + nombre + " y usted vive "+ciudad);
			
		}else if(e.getSource() == btnActivar){
			txtNombre.setEnabled(true);
			txtCiudad.setEnabled(true);

		}else if(e.getSource() == btnDesactivar){
			txtCiudad.setEnabled(false);
			txtNombre.setEnabled(false);
			
		
		}
	}
}






