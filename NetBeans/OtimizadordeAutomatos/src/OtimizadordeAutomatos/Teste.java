package OtimizadordeAutomatos;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.EventQueue;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.*;
import javax.swing.border.EmptyBorder;

public class Teste extends JFrame {

	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
            @Override
			public void run() {
				try {
					Teste frame = new Teste();
					frame.setVisible(true);
				} catch (Exception e) {
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public Teste() {
		setTitle("Optimizador de Automatos - Vers\u00E3o 3.1");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 601, 471);

		
		JMenuBar menuBar = new JMenuBar();
		setJMenuBar(menuBar);
		
		JMenu mnArquivo = new JMenu("Arquivo");
		menuBar.add(mnArquivo);
		
		JMenuItem mntmNovomodoGrfico = new JMenuItem("Novo (Modo Gr\u00E1fico)");
		mnArquivo.add(mntmNovomodoGrfico);
		
		JMenuItem mntmNovomodoTexto = new JMenuItem("Novo (Modo Texto)");
		mntmNovomodoTexto.addActionListener(new ActionListener() {
            @Override
			public void actionPerformed(ActionEvent arg0) {
				new TextGUI().setVisible(true);
			}
		});
		mnArquivo.add(mntmNovomodoTexto);
		
		JSeparator separator = new JSeparator();
		mnArquivo.add(separator);
		
		JMenuItem mntmImportarArquivo = new JMenuItem("Importar Arquivo");
		mnArquivo.add(mntmImportarArquivo);
		contentPane = new JPanel();
		contentPane.setBackground(new Color(100, 149, 237));
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		contentPane.setLayout(new BorderLayout(0, 0));
		setContentPane(contentPane);
	}

}
