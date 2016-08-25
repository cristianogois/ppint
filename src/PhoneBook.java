// Extra: PhoneBook.java
// Testing JTable.
import java.awt.GridLayout;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTable;
public class PhoneBook extends JFrame
{
JPanel background;
JTable table;
JScrollPane bar;
Object [][] data =
{
{"20080001", "Antonio", "11 98888-0001", "antonio@gmail.com"},
{"20080002", "José", "11 98111-3333", "jose@hotmail.com"},
{"20080003", "Ricardo", "13 9876-5432", "ricardo@bol.com.br"},
{"20080004", "Roberto", "11 98765-4321", "roberto@gmail.com"},
{"20080005", "Valter", "11 2666-6666", "valter@yahoo.com.br"}
};
String [] column = {"RA", "Nome", "Telefone", "Email"};
public PhoneBook()
{
super ("Contatos");
} // end PhoneBook constructor
public void makeWindow()
{
background = new JPanel();
background.setLayout(new GridLayout(1, 1));
table = new JTable(data, column);
bar = new JScrollPane(table);
background.add(bar);
getContentPane().add(background);
setDefaultCloseOperation(EXIT_ON_CLOSE);
setSize(500, 125);
setVisible(true);
} // end method makeWindow
public static void main(String[] args)
{
PhoneBook pb1 = new PhoneBook();
pb1.makeWindow();
} // end main
} // end class PhoneBook

/*************************************************************************
* (C) Copyright 1992-2005 by Deitel & Associates, Inc. and               *
* Pearson Education, Inc. All Rights Reserved.                           *
*                                                                        *
* DISCLAIMER: The authors and publisher of this book have used their     *
* best efforts in preparing the book. These efforts include the          *
* development, research, and testing of the theories and programs        *
* to determine their effectiveness. The authors and publisher make       *
* no warranty of any kind, expressed or implied, with regard to these    *
* programs or to the documentation contained in these books. The authors *
* and publisher shall not be liable in any event for incidental or       *
* consequential damages in connection with, or arising out of, the       *
* furnishing, performance, or use of these programs.                     *
*************************************************************************/