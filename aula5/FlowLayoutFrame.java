// Fig. 11.39: FlowLayoutFrame.java
// Demonstrando os alinhamentos de FlowLayout.
import java.awt.FlowLayout;
import java.awt.Container;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JFrame;
import javax.swing.JButton;
public class FlowLayoutFrame extends JFrame
{
	private JButton leftJButton; // bot�o para configurar alinhamento � esquerda
	private JButton centerJButton; // bot�o p/ configurar alinhamento centralizado
	private JButton rightJButton; // bot�o para configurar alinhamento � direita
	private FlowLayout layout; // objeto de layout
	private Container container; // cont�iner para configurar layout

	// configura GUI e registra listeners de bot�o
	public FlowLayoutFrame()
	{
		super( "FlowLayout Demo" );
		layout = new FlowLayout(); // cria FlowLayout
		container = getContentPane(); // obt�m cont�iner para layout
		setLayout( layout ); // configura o layout de frame

		// configura leftJButton e registra listener
		leftJButton = new JButton( "Left" ); // cria bot�o Left
		add( leftJButton ); // adiciona o bot�o Left ao frame
		leftJButton.addActionListener(
				new ActionListener() // classe interna an�nima
				{
					// processa o evento leftJButton
					public void actionPerformed( ActionEvent event )
					{
						layout.setAlignment( FlowLayout.LEFT );
						// realinha os componentes anexados
						layout.layoutContainer( container );
					} // fim do m�todo actionPerformed
				} // fim da classe interna an�nima
				); // fim da chamada para addActionListener

		// configura centerJButton e registra o listener
		centerJButton = new JButton( "Center" ); // cria bot�o Center
		add( centerJButton ); // adiciona bot�o Center ao frame
		centerJButton.addActionListener(
				new ActionListener() // classe interna an�nima
				{
					// processa evento centerJButton
					public void actionPerformed( ActionEvent event )
					{
						layout.setAlignment( FlowLayout.CENTER );
						// realinha os componentes anexados
						layout.layoutContainer( container );
					} // fim do m�todo actionPerformed
				} // fim da classe interna an�nima
				); // fim da chamada para addActionListener 

		//configura rightJButton e registra o listener
		rightJButton = new JButton( "Right" ); // cria bot�o Right
		add( rightJButton ); // adiciona bot�o Right ao frame
		rightJButton.addActionListener(
				new ActionListener() // classe interna an�nima
				{
					// processo evento rightJButton
					public void actionPerformed( ActionEvent event )
					{
						layout.setAlignment( FlowLayout.RIGHT );
						// realinha os componentes anexados
						layout.layoutContainer( container );
					} // fim do m�todo actionPerformed
				} // fim da classe interna an�nima
				); // fim da chamada para addActionListener
	} // fim do construtor FlowLayoutFrame
} // FlowLayoutFrame fim da classe
//Fig. 11.40: FlowLayoutDemo.java
