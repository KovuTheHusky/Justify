import java.io.File;
import java.util.Scanner;
import javax.swing.JOptionPane;

public class Justify
{
	public static void main(String[] args) throws Exception
	{
		Scanner s = new Scanner(new File(JOptionPane.showInputDialog("Enter the path to the file you want to open:", "DoI.txt")));
		//PrintWriter p = new PrintWriter(new FileWriter(JOptionPane.showInputDialog("Enter the path to the file you want to save to:", "DoI.fmt")));
		try
		{
			int i = 0;
			String str = null;
			for (;;)
			{
				str = s.nextLine();
				for (; str.length() > 72;)
				{
					System.out.println(str.substring(0, (i = str.lastIndexOf(" ", 71))));
					str = str.substring(i + 1);
				}
				System.out.println(str);
			}
		}
		catch (Exception ex)
		{
			//
		}
	}
}