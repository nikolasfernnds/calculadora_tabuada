package br.sp.senai.jandira.calculadora_tabuada.gui;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;

public class TelaTabuada {
	
	
	public void criarTela() {
		JFrame tela = new JFrame();
		tela.setSize(500, 700);
		tela.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		tela.setTitle("Tabuada");
		tela.setLocationRelativeTo(null);
		tela.setLayout(null);
		
		//Criando um JLabel para inserir no JFrame
		
		JLabel lblMultiplicando = new JLabel();
		lblMultiplicando.setText("Multiplicando: ");
		lblMultiplicando.setBounds(20, 10, 150, 20);
		
		JTextField txtMultiplicando = new JTextField();
		txtMultiplicando.setBounds(180, 10, 50, 30);
		
		JLabel lblMinimoMultiplicador = new JLabel();
		lblMinimoMultiplicador.setText("Mínimo Multiplicando: ");
		lblMinimoMultiplicador.setBounds(20, 50, 150, 20);
		
		JTextField txtMinimoMultiplicador = new JTextField();
		txtMinimoMultiplicador.setBounds(180, 50, 50, 30);
		
		JLabel lblMaximoMultiplicador = new JLabel();
		lblMaximoMultiplicador.setText("Máximo Multiplicando: ");
		lblMaximoMultiplicador.setBounds(20, 90, 150, 20);
		
		JTextField txtMaximoMultiplicador = new JTextField();
		txtMaximoMultiplicador.setBounds(180, 90, 50, 30);
		
		
		
		JButton buttonCalcular = new JButton();
		buttonCalcular.setText("Calcular");
		
		tela.getContentPane().add(lblMultiplicando);
		tela.getContentPane().add(txtMultiplicando);
		tela.getContentPane().add(lblMinimoMultiplicador);
		tela.getContentPane().add(txtMinimoMultiplicador);
		tela.getContentPane().add(lblMaximoMultiplicador);
		tela.getContentPane().add(txtMaximoMultiplicador);
		tela.getContentPane().add(buttonCalcular);
	
		
		tela.setVisible(true);
	}
}
