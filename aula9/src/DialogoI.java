// Exemplo de Diálogo por Instanciação
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class DialogoI extends JDialog implements ActionListener {
	// Rótulo
	JLabel lb;
	// Campo Texto
	JTextField tf;
	// Botão
	JButton bt;
	// Atributo de valor
	int valor;

	// Método Construtor
	public DialogoI(JFrame fr) {
		// Invoca o método construtor da superclasse
		super(fr, true);
		// Cria um Conteiner de Tela
		Container cp = getContentPane();
		// Determina a tela como um FlowLayout
		cp.setLayout(new FlowLayout());
		// Cria um Rótulo com o texto "Valor"
		lb = new JLabel("Valor:");
		// Adiciona o Rótulo no Conteiner
		cp.add(lb);
		// Cria um Campo Texto de largura 10 pxls
		tf = new JTextField(10);
		// Adiciona o Campo Texto no Conteiner
		cp.add(tf);
		// Cria um Botão com o texto "OK"
		bt = new JButton("OK");
		// Adiona o Botão no Conteiner
		cp.add(bt);
		// Adiciona uma ação ao Botão
		bt.addActionListener(this);
		// Programa o tamanho inicial do FlowLayout em pxls
		setSize(200, 100);
		// Determina a localização inicial do FlowLayout em pxls
		setLocation(200, 200);
		// Determina qual o título do FlowLayout
		setTitle("Valores");
		// Estabelece que o FlowLayout será visível inicialmente
		setVisible(true);
	}

	// Método de tratamento do evento da ação do botão
	public void actionPerformed(ActionEvent e) {
		// Verifica se o evento pertence ao botão
		if (e.getSource() == bt) {
			// Lê o valor constante no campo texto e o atribui a valor
			valor = Integer.parseInt(tf.getText());
			// Fecha e Libera o FlowLayout
			dispose();
		}
	}

	// Método para acessar o atributo Valor
	public int getValor() {
		return valor;
	}
}