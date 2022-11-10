import java.awt.Color;
import java.awt.Canvas;
import javax.swing.JFrame;

public class Main
{
	public static JFrame appWindow = new JFrame();
	public static Canvas graph = new Graphic1();

	public static void main(String[] args)
	{
		graph.setBackground(Color.BLACK);
		appWindow.setTitle("JRE Graphic Window");
		appWindow.setSize(1280, 720);
		appWindow.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		appWindow.add(graph);
		appWindow.setVisible(true);
	}
}
