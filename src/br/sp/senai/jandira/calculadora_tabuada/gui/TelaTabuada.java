package br.sp.senai.jandira.calculadora_tabuada.gui;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JList;
import javax.swing.JTextField;

import br.sp.senai.jandira.calculadora_tabuada.model.Tabuada;

public class TelaTabuada {
	
	private JLabel lblMultiplicando;
	private JTextField txtMultiplicando;
	private JLabel lblMinimoMultiplicador;
	private JTextField txtMinimoMultiplicador;
	private JLabel lblMaximoMultiplicador;
	private JTextField txtMaximoMultiplicador;
	private JButton buttonCalcular;
	private JButton buttonLimpar;
	private JList listTabuada;
	private String resultado[];
	
	
	public void criarTela() {
		JFrame tela = new JFrame();
		tela.setSize(265, 550);
		tela.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		tela.setTitle("Tabuada");
		tela.setLocationRelativeTo(null);
		tela.setLayout(null);
		tela.setResizable(false);
		
		//Criando um JLabel para inserir no JFrame
		
		lblMultiplicando = new JLabel();
		lblMultiplicando.setText("Multiplicando: ");
		lblMultiplicando.setBounds(20, 10, 150, 20);
		
		txtMultiplicando = new JTextField();
		txtMultiplicando.setBounds(180, 10, 50, 30);
		
	    lblMinimoMultiplicador = new JLabel();
		lblMinimoMultiplicador.setText("Mínimo Multiplicador: ");
		lblMinimoMultiplicador.setBounds(20, 50, 150, 30);
		
		txtMinimoMultiplicador = new JTextField();
		txtMinimoMultiplicador.setBounds(180, 50, 50, 30);
		
		lblMaximoMultiplicador = new JLabel();
		lblMaximoMultiplicador.setText("Máximo Multiplicador: ");
		lblMaximoMultiplicador.setBounds(20, 90, 150, 30);
		
	    txtMaximoMultiplicador = new JTextField();
		txtMaximoMultiplicador.setBounds(180, 90, 50, 30);
		
		//Botões
		
		buttonCalcular = new JButton();
		buttonCalcular.setText("Calcular");
		buttonCalcular.setBounds(20, 140, 100, 30);
		
		buttonLimpar = new JButton();
		buttonLimpar.setText("Limpar");
		buttonLimpar.setBounds(130, 140, 100, 30);
		
		//Lista
		
		listTabuada = new JList(resultado);
		listTabuada.setBounds(20, 190, 210, 300);
		


		
		
		tela.getContentPane().add(lblMultiplicando);
		tela.getContentPane().add(txtMultiplicando);
		tela.getContentPane().add(lblMinimoMultiplicador);
		tela.getContentPane().add(txtMinimoMultiplicador);
		tela.getContentPane().add(lblMaximoMultiplicador);
		tela.getContentPane().add(txtMaximoMultiplicador);
		tela.getContentPane().add(buttonCalcular);
		tela.getContentPane().add(buttonLimpar);
		tela.getContentPane().add(listTabuada);
		
		
		//Configurar os Listeners (ouvintes) dos botões
		
		buttonCalcular.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				
				String multiplicando    = txtMultiplicando.getText();
				String minMultiplicador = txtMinimoMultiplicador.getText();
				String maxMultiplicador = txtMaximoMultiplicador.getText();
				
				//Casting (Conversão de um tipo para outro)
				
				double multiplicandoDouble    = Double.parseDouble(multiplicando);
				double minMultiplicadorDouble = Double.parseDouble(minMultiplicador);
				double maxMultiplicadorDouble = Double.parseDouble(maxMultiplicador);
				
				Tabuada tabuada = new Tabuada();
				tabuada.setMultiplicando(multiplicandoDouble);
				tabuada.setMinimoMultiplicador(minMultiplicadorDouble);
				tabuada.setMaximoMultiplicador(maxMultiplicadorDouble);
				resultado = tabuada.calcularTabuada();
				

				
	
			}
		});
	
		
		tela.setVisible(true);
	}
}
