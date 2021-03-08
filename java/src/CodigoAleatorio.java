

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

import java.awt.Font;
import java.awt.event.ActionListener;
import java.util.Random;
import java.awt.event.ActionEvent;

public class CodigoAleatorio extends JFrame {

	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					CodigoAleatorio frame = new CodigoAleatorio();
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
	public CodigoAleatorio() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);

		JLabel lblGeradorDeCodigos = new JLabel("Gerador de Codigos");
		lblGeradorDeCodigos.setFont(new Font("Arial", Font.PLAIN, 25));
		lblGeradorDeCodigos.setBounds(104, 76, 235, 36);
		contentPane.add(lblGeradorDeCodigos);
		
		
		///Caracteres que iram compor o codigo, podendo deixar com apenas numeros,letras ou simbolos
		String caracteres = "ABCDEFGHIJKLMNOPQRSTUVYWXZ0123456789@#$%&";

		Random random = new Random();
		Random quantidade = new Random();
		int maxCaracter = 7;
		int minCaracter = 5;
		int qtdCaracter = quantidade.nextInt((maxCaracter - minCaracter) + 1) + minCaracter;

		String armazenaChaves = "";

		int index = -1;
		for( int i = 0; i < qtdCaracter; i++ ) {
			index = random.nextInt( caracteres.length() );
			armazenaChaves += caracteres.substring(index, index + 1 );
			caracteres=caracteres.replaceAll(caracteres.substring(index, index + 1),"");
		}
		String codigo = armazenaChaves;

		JButton btnMostrar = new JButton("Mostrar");
		btnMostrar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				JOptionPane.showMessageDialog(null,"Codigo: "+codigo);
			}
		});
		btnMostrar.setBounds(168, 134, 89, 23);
		contentPane.add(btnMostrar);
	}	

}
