package Noveno;

import java.awt.EventQueue;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import java.awt.Color;
import javax.swing.JLabel;
import javax.swing.SwingConstants;
import javax.swing.JTextField;
import javax.swing.JFormattedTextField;
import javax.swing.JEditorPane;
import javax.swing.JButton;
import javax.swing.JSpinner;
import javax.swing.JTextPane;

public class Interfaz extends JFrame implements MouseListener{

	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	private JLabel etiUno;
	private JLabel etiDos;
	private JLabel etiTres ;
	private JLabel etiCuatro ;
	private JLabel etiCinco;
	private JLabel etiSeis ;
	private JLabel etiSiete ;
	private JLabel etiOcho ;
	private JLabel etiNueve ;
	private JLabel lblNewLabel;
	String num;
	private JButton btnButton;
	private JLabel etiCero;
	

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


	public Interfaz() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBackground(new Color(208, 170, 160));
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		etiUno = new JLabel("1");
		etiUno.setHorizontalAlignment(SwingConstants.CENTER);
		etiUno.setBounds(49, 34, 61, 16);
		contentPane.add(etiUno);
		etiUno.addMouseListener(this);
		
		etiDos = new JLabel("2");
		etiDos.setHorizontalAlignment(SwingConstants.CENTER);
		etiDos.setBounds(49, 69, 61, 16);
		contentPane.add(etiDos);
		etiDos.addMouseListener(this);
		
		etiTres = new JLabel("3");
		etiTres.setHorizontalAlignment(SwingConstants.CENTER);
		etiTres.setBounds(49, 110, 61, 16);
		contentPane.add(etiTres);
		etiTres.addMouseListener(this);
		
		etiCuatro = new JLabel("4");
		etiCuatro.setHorizontalAlignment(SwingConstants.CENTER);
		etiCuatro.setBounds(193, 34, 61, 16);
		contentPane.add(etiCuatro);
		etiCuatro.addMouseListener(this);
		
		etiCinco = new JLabel("5");
		etiCinco.setHorizontalAlignment(SwingConstants.CENTER);
		etiCinco.setBounds(193, 69, 61, 16);
		contentPane.add(etiCinco);
		etiCinco.addMouseListener(this);
		
		etiSeis = new JLabel("6");
		etiSeis.setHorizontalAlignment(SwingConstants.CENTER);
		etiSeis.setBounds(193, 110, 61, 16);
		contentPane.add(etiSeis);
		etiSeis.addMouseListener(this);
		
		etiSiete = new JLabel("7");
		etiSiete.setHorizontalAlignment(SwingConstants.CENTER);
		etiSiete.setBounds(326, 34, 61, 16);
		contentPane.add(etiSiete);
		etiSiete.addMouseListener(this);
		
		etiOcho = new JLabel("8");
		etiOcho.setHorizontalAlignment(SwingConstants.CENTER);
		etiOcho.setBounds(326, 69, 61, 16);
		contentPane.add(etiOcho);
		etiOcho.addMouseListener(this);
		
		etiNueve = new JLabel("9");
		etiNueve.setHorizontalAlignment(SwingConstants.CENTER);
		etiNueve.setBounds(326, 110, 61, 16);
		contentPane.add(etiNueve);
		etiNueve.addMouseListener(this);
		
		lblNewLabel = new JLabel("");
		lblNewLabel.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel.setBounds(94, 198, 279, 24);
		contentPane.add(lblNewLabel);
		
		btnButton = new JButton("Borrar");
		btnButton.setBounds(170, 234, 117, 29);
		contentPane.add(btnButton);
		btnButton.addMouseListener(this);
		
		etiCero = new JLabel("0");
		etiCero.setHorizontalAlignment(SwingConstants.CENTER);
		etiCero.setBounds(193, 145, 61, 16);
		contentPane.add(etiCero);
		lblNewLabel.addMouseListener(this);
	}


	@Override
	public void mouseClicked(MouseEvent e) {
		
		if(e.getSource() == btnButton) {
			lblNewLabel.setText("");
		}
		
	}
	@Override
	public void mousePressed(MouseEvent e) {	
	}

	@Override
	public void mouseReleased(MouseEvent e) {
		// TODO Auto-generated method stub
		
	}


	@Override
	public void mouseEntered(MouseEvent e) {
		
	}


	@Override
	public void mouseExited(MouseEvent e) {
		
		if(e.getSource() == etiUno ) {
			num = etiUno.getText();
			lblNewLabel.setText(lblNewLabel.getText()+num);
			
		}else if(e.getSource() == etiDos) {
			num = etiDos.getText();
			lblNewLabel.setText(lblNewLabel.getText()+num);
			
		}else if(e.getSource() == etiTres) {
			num = etiTres.getText();
			lblNewLabel.setText(lblNewLabel.getText()+num);
			
		}else if(e.getSource() == etiCuatro) {
			num = etiCuatro.getText();
			lblNewLabel.setText(lblNewLabel.getText()+num);
			
		}else if(e.getSource() == etiCinco) {
			num = etiCinco.getText();
			lblNewLabel.setText(lblNewLabel.getText()+num);
			
		}else if(e.getSource() == etiSeis) {
			num = etiSeis.getText();
			lblNewLabel.setText(lblNewLabel.getText()+num);
			
		}else if(e.getSource() == etiSiete) {
			num = etiSiete.getText();
			lblNewLabel.setText(lblNewLabel.getText()+num);
			
		}else if(e.getSource() == etiOcho) {
			num = etiOcho.getText();
			lblNewLabel.setText(lblNewLabel.getText()+num);
			
		}else if(e.getSource() == etiNueve) {
			num = etiNueve.getText();
			lblNewLabel.setText(lblNewLabel.getText()+num);
			
		}
		
	}
}






