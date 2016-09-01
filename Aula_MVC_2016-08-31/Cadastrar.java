import java.awt.event.ActionListener;
import java.util.Observer;

abstract class Cadastrar implements Observer {
	private Janela cadastro;
	private Rotulo codigoR, nomeR, salarioR;
	private CaixaDeTexto codigo, nome, salario;
	private Botao cadastrar, visualizar, sair;
	private Funcionario f;

	public Cadastrar(Funcionario f) {
		cadastro = new Janela();
		codigoR = new Rotulo("Código");
		nomeR = new Rotulo("Nome");
		salarioR = new Rotulo("Salário");
		codigo = new CaixaDeTexto();
		nome = new CaixaDeTexto();
		salario = new CaixaDeTexto();
		cadastrar = new Botao("Cadastrar");
		visualizar = new Botao("Visualizar");
		sair = new Botao("Sair");
		cadastro.getContentPane().add(codigoR);
		cadastro.getContentPane().add(codigo);
		cadastro.getContentPane().add(nomeR);
		cadastro.getContentPane().add(nome);
		cadastro.getContentPane().add(salarioR);
		cadastro.getContentPane().add(salario);
		cadastro.getContentPane().add(cadastrar);
		cadastro.getContentPane().add(visualizar);
		cadastro.getContentPane().add(sair);
		this.f = f;
		f.addObserver(this);
		cadastro.setVisible(true);
	}

	public int getCodigo() {
		return Integer.valueOf(codigo.getText());
	}

	public void setCodigo(int codigo) {
		this.codigo.setText(String.valueOf(codigo));
	}

	public String getNome() {
		return nome.getText();
	}

	public void setNome(String nome) {
		this.nome.setText(nome);
	}

	public double getSalario() {
		return Double.valueOf(salario.getText()).doubleValue();
	}

	public void setSalario(double salario) {
		this.salario.setText(String.valueOf(salario));
	}

	public void addCadastrarListener(ActionListener a) {
		cadastrar.addActionListener(a);
	}

	public void addVisualizarListener(ActionListener a) {
		visualizar.addActionListener(a);
	}

	public void addSairListener(ActionListener a) {
		sair.addActionListener(a);
	}

	protected Funcionario getF() {
		return f;
	}
}
