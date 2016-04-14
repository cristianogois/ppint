// Exemplo de Diálogo por Método - Teste
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class ExemploM extends JFrame implements ActionListener {
	// Botão
	JButton b;

	// Método Construtor
	public ExemploM() {
		// Cria um Conteiner de Tela
		Container c = getContentPane();
		// Determina a tela como um FlowLayout
		c.setLayout(new FlowLayout());
		// Cria um Botão com o texto "Clique"
		b = new JButton("Clique");
		// Adiona o Botão no Conteiner
		c.add(b);
		// Adiciona uma ação ao Botão
		b.addActionListener(this);
		// Programa o tamanho inicial do FlowLayout em pxls
		setSize(350, 75);
		// Determina a localização inicial do FlowLayout em pxls
		setLocation(470, 50);
		// Determina qual o título do FlowLayout
		setTitle("Exemplo de Diálogo (Método)");
		// Estabelece que o FlowLayout será visível inicialmente
		setVisible(true);
	}

	// Método de tratamento do evento da ação do botão
	public void actionPerformed(ActionEvent e) {
		// Verifica se o evento pertence ao botão
		if (e.getSource() == b) {
			// Apresenta o atributo valor (de Dialogo)
			JOptionPane.showMessageDialog(null, "Valor Digitado:" + DialogoM.getValor(this));
		}
	}

	// Método Principal
	public static void main(String args[]) {
		// Instancia um objeto de Exemplo
		ExemploM prog = new ExemploM();
		// Programa encerramento do Frame no Sair (X)
		prog.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}
}