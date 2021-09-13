package br.ufrn.imd.visao;

import java.awt.BorderLayout;
import java.awt.Container;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JDesktopPane;
import javax.swing.JFrame;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;

public class TelaPrincipal extends JFrame implements ActionListener{
	
	private static final long serialVersionUID = 1L;

	JDesktopPane dtp = new JDesktopPane();
	
	JMenuBar mnbar = new JMenuBar();	
	JMenu menuCada = new JMenu("Cadastros");
	JMenu menuRela = new JMenu("Relatórios");
	JMenu menuAjud = new JMenu("Ajuda");
	
	JMenuItem mItem1 = new JMenuItem("Escritório");
	JMenuItem mItem2 = new JMenuItem("Residência");
	
	JMenuItem mItem4 = new JMenuItem("Lista Imóveis");
	
	JMenuItem mItem8 = new JMenuItem("Sair");
		 		
	public TelaPrincipal(){
		Container ct = this.getContentPane();
		ct.setLayout(new BorderLayout());
		
		setJMenuBar(mnbar);
		mnbar.add(menuCada);
		mnbar.add(menuRela);
		mnbar.add(menuAjud);

		menuCada.add(mItem1);
		menuCada.add(mItem2);
		
		menuRela.add(mItem4);
		
		menuAjud.addSeparator();
		menuAjud.add(mItem8);
		
		ct.add(BorderLayout.CENTER, dtp);
		
		setSize(800,600);
		setResizable(false);
		setTitle("Imobiliária Natal");
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		
		// eventos
		mItem1.addActionListener(this);	
		mItem2.addActionListener(this);
		mItem4.addActionListener(this);
		mItem8.addActionListener(this);
	}
	
	@Override
	public void actionPerformed(ActionEvent e) {
		if (e.getSource() == mItem1){
			//
		}
		if (e.getSource() == mItem8) {
			System.out.println("Fechando o sistema!!!");
			System.exit(0);
		}
	}
	
	public static void main(String[] args) {
		TelaPrincipal telaPai = new TelaPrincipal();
		telaPai.setVisible(true);
	}
}
