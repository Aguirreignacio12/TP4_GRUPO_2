package exercises;

import java.awt.Dimension;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.BorderFactory;
import javax.swing.JLabel;
import javax.swing.border.EmptyBorder;
import java.awt.GridLayout;

public class Ejercicio2 extends JFrame {

    private static final long serialVersionUID = 1L;
    private JPanel contentPane;
    
    

    public Ejercicio2() {
        setTitle("Promedio");
        setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        setBounds(100, 100, 400, 350);
        contentPane = new JPanel();
        contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
        setContentPane(contentPane);
                        contentPane.setLayout(null);
                    
// Panel para resultados
       JPanel panelResultados = new JPanel();
       panelResultados.setBounds(5, 190, 236, 100);
       contentPane.add(panelResultados);
       panelResultados.setBorder(BorderFactory.createTitledBorder("Notas del Estudiante"));
       panelResultados.setPreferredSize(new Dimension(250, 100));
       panelResultados.setLayout(null);
                        
       // Agregar componentes al panel de resultados
       JLabel label_4 = new JLabel("Promedio:");
       label_4.setBounds(16, 28, 80, 26);
       panelResultados.add(label_4);
       JTextField txtPromedio = new JTextField(5);
       txtPromedio.setBounds(108, 28, 106, 26);
       txtPromedio.setEditable(false); // No editable, solo para mostrar el resultado
       panelResultados.add(txtPromedio);
                                
       JLabel label_5 = new JLabel("Condición:");
       label_5.setBounds(16, 61, 80, 26);
       panelResultados.add(label_5);
       JTextField txtCondicion = new JTextField(5);
       txtCondicion.setBounds(108, 61, 106, 26);
       txtCondicion.setEditable(false); // No editable, solo para mostrar el resultado
       panelResultados.add(txtCondicion);
            
       // Panel para las notas
       JPanel panelNotas = new JPanel();
       panelNotas.setBounds(5, 13, 236, 164);
       contentPane.add(panelNotas);
       panelNotas.setBorder(BorderFactory.createTitledBorder("Notas del Estudiante"));
       panelNotas.setPreferredSize(new Dimension(250, 150));
       panelNotas.setLayout(null);
                    
       // Agregar componentes al panel de notas
       JLabel label = new JLabel("Nota 1:");
       label.setBounds(6, 18, 112, 24);
       panelNotas.add(label);
       JTextField txtNota1 = new JTextField(5);
       txtNota1.setBounds(118, 18, 112, 24);
       panelNotas.add(txtNota1);
                            
       JLabel label_1 = new JLabel("Nota 2:");
       label_1.setBounds(6, 54, 112, 24);
       panelNotas.add(label_1);
       JTextField txtNota2 = new JTextField(5);
       txtNota2.setBounds(118, 54, 112, 24);
       panelNotas.add(txtNota2);
                                    
       JLabel label_2 = new JLabel("Nota 3:");
       label_2.setBounds(6, 91, 112, 24);
       panelNotas.add(label_2);
       JTextField txtNota3 = new JTextField(5);
       txtNota3.setBounds(118, 91, 112, 24);
       panelNotas.add(txtNota3);
                                            
       JLabel label_3 = new JLabel("TPS:");
       label_3.setBounds(6, 127, 112, 24);
       panelNotas.add(label_3);
       JComboBox ComboBoxTPS = new JComboBox();
       JComboBox<String> comboBoxTPS = new JComboBox<>();
       comboBoxTPS.addItem("Aprobado");
       comboBoxTPS.addItem("Desaprobado");
       ComboBoxTPS.setBounds(118, 127, 112, 24);
       panelNotas.add(ComboBoxTPS);

// Panel para botones
        
       JPanel panelBotones = new JPanel();
       panelBotones.setBounds(253, 74, 129, 121);
       panelBotones.setLayout(new GridLayout(0, 1, 0, 0));
             
       JButton btnCalcular = new JButton("CALCULAR");
       panelBotones.add(btnCalcular);
            
       JButton btnNuevo = new JButton("NUEVO");
       panelBotones.add(btnNuevo);
                                
       JButton btnSalir = new JButton("SALIR");
       panelBotones.add(btnSalir);
                                        
       contentPane.add(panelBotones); 
       
// Acción para Calcular (btbCalcular)
       
       // rellena txtPromedio

       
       // rellena txtCondiciona
                                                        
// Acción para limpiar los campos (btnNuevo)
                                                                                                                               
// Acción para salir (btbSalir)
       
    }     
}
