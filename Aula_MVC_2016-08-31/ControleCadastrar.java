import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Observable;
import javax.swing.JOptionPane;

public class ControleCadastrar extends Cadastrar {
	public ControleCadastrar(Funcionario f) {
		super(f);
		addCadastrarListener(new CadastrarListener());
		addVisualizarListener(new VisualizarListener());
		addSairListener(new SairListener());
	}

	public void update(Observable arg0, Object arg1) {
		JOptionPane.showMessageDialog(null, "Atualização realizada com sucesso!!!");
	}

	class CadastrarListener implements ActionListener {
		public void actionPerformed(ActionEvent e) {
			getF().setCodigo(getCodigo());
			getF().setNome(getNome());
			getF().setSalario(getSalario());
		}
	}

	class VisualizarListener implements ActionListener {
public void actionPerformed(ActionEvent e)
{
JOptionPane.showMessageDialog(null,"Código: "+getF().getCodigo()+"\nNome: "+getF().getNome()+"\nSalário: "+getF().getSalario());
}
	}

	class SairListener implements ActionListener {
		public void actionPerformed(ActionEvent e) {
			System.exit(0);
		}
	}
}