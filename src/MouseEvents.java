
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import org.w3c.dom.events.EventTarget;
import org.w3c.dom.events.MouseEvent;
import org.w3c.dom.views.AbstractView;

import java.awt.Color;
import javax.swing.JLabel;
import java.awt.Font;
import java.awt.event.MouseListener;

public class MouseEvents extends JFrame implements MouseListener {

	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	JLabel etiPal1, etiPal2, etiPal3, etiPal4, txtOcultar;

	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					MouseEvents frame = new MouseEvents();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	public MouseEvents() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBackground(new Color(243, 194, 234));
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		etiPal1 = new JLabel("Perro");
		etiPal1.setFont(new Font("Tahoma", Font.PLAIN, 15));
		etiPal1.setBounds(101, 103, 42, 26);
		contentPane.add(etiPal1);
		
		etiPal2 = new JLabel("Hamburguesa");
		etiPal2.setFont(new Font("Tahoma", Font.PLAIN, 15));
		etiPal2.setBounds(68, 59, 103, 18);
		contentPane.add(etiPal2);
		
		etiPal3 = new JLabel("Tacos");
		etiPal3.setFont(new Font("Tahoma", Font.PLAIN, 15));
		etiPal3.setBounds(283, 61, 63, 14);
		contentPane.add(etiPal3);
		
		etiPal4 = new JLabel("Salchipapa");
		etiPal4.setFont(new Font("Tahoma", Font.PLAIN, 15));
		etiPal4.setBounds(265, 109, 98, 20);
		contentPane.add(etiPal4);
		
		txtOcultar = new JLabel("Ocultar");
		txtOcultar.setBackground(new Color(224, 101, 203));
		txtOcultar.setForeground(new Color(224, 101, 203));
		txtOcultar.setFont(new Font("Tahoma", Font.PLAIN, 25));
		txtOcultar.setBounds(170, 208, 90, 26);
		txtOcultar.addMouseListener(this);
		contentPane.add(txtOcultar);
		
	}

	@Override
	public void mouseClicked(java.awt.event.MouseEvent e) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void mousePressed(java.awt.event.MouseEvent e) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void mouseReleased(java.awt.event.MouseEvent e) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void mouseEntered(java.awt.event.MouseEvent e) {
		etiPal1.setVisible(false);
        etiPal2.setVisible(false);
        etiPal3.setVisible(false);
        etiPal4.setVisible(false);
	}

	@Override
	public void mouseExited(java.awt.event.MouseEvent e) {
		etiPal1.setVisible(true);
        etiPal2.setVisible(true);
        etiPal3.setVisible(true);
        etiPal4.setVisible(true);
	}
}