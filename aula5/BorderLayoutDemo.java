// Fig. 11.42: BorderLayoutDemo.java
// Testando BorderLayoutFrame.
import javax.swing.JFrame;
public class BorderLayoutDemo
{
	public static void main( String args[] )
	{
		BorderLayoutFrame borderLayoutFrame = new BorderLayoutFrame();
		borderLayoutFrame.setDefaultCloseOperation( JFrame.EXIT_ON_CLOSE );
		borderLayoutFrame.setSize( 300, 200 ); // configura o tamanho do frame
		borderLayoutFrame.setVisible( true ); // exibe o frame
	} // fim de main
} // fim da classe BorderLayoutDemo
//-------------------------------------------------------------------------------------- 