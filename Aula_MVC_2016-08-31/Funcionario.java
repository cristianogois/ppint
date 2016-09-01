import java.util.Observable;

public class Funcionario extends Observable {
	private int codigo;
	private String nome;
	private double salario;

	public int getCodigo() {
		return codigo;
	}

	public void setCodigo(int codigo) {
		this.codigo = codigo;
		setChanged();
		notifyObservers();
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
		setChanged();
		notifyObservers();
	}

	public double getSalario() {
		return salario;
	}

	public void setSalario(double salario) {
		this.salario = salario;
		setChanged();
		notifyObservers();
	}
}