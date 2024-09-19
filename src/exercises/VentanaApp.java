package exercises;

import java.awt.BorderLayout;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JButton;
import java.awt.FlowLayout;
import javax.swing.JLabel;
import java.awt.Color;
import java.awt.Font;

public class VentanaApp extends JFrame {

	private static final long serialVersionUID = 1L;
	private JPanel contentPane;


	/**
	 * Create the frame.
	 */
	public VentanaApp() {
		setForeground(Color.BLACK);
		setTitle("TP N\u00B0 4 - Aplicaciones de escritorio");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(new BorderLayout(0, 0));
		
		JPanel panel_4 = new JPanel();
		contentPane.add(panel_4, BorderLayout.CENTER);
		panel_4.setLayout(null);
		
		JButton btnEjercicio = new JButton("Ejercicio 1");
		btnEjercicio.setFont(new Font("Segoe UI Semibold", Font.PLAIN, 12));
		btnEjercicio.setBounds(166, 75, 89, 23);
		panel_4.add(btnEjercicio);
		
		JButton btnEjercicio_1 = new JButton("Ejercicio 2");
		btnEjercicio_1.setFont(new Font("Segoe UI Semibold", Font.PLAIN, 12));
		btnEjercicio_1.setBounds(166, 109, 89, 23);
		panel_4.add(btnEjercicio_1);
		
		JButton btnEjercicio_2 = new JButton("Ejercicio 3");
		btnEjercicio_2.setFont(new Font("Segoe UI Semibold", Font.PLAIN, 12));
		btnEjercicio_2.setBounds(166, 143, 89, 23);
		panel_4.add(btnEjercicio_2);
		
		JLabel lblTpgrupo = new JLabel("GRUPO NRO: 4");
		lblTpgrupo.setBounds(35, 24, 118, 23);
		panel_4.add(lblTpgrupo);
		lblTpgrupo.setFont(new Font("Segoe UI Semibold", Font.PLAIN, 16));
		lblTpgrupo.setForeground(Color.BLACK);
	}
}
