import java.awt.*;

public class Graphic1 extends Canvas
{
	@Override
	public void paint(Graphics g)
	{
		int cx = 0;
		int cy = 0;

		double x = 0.0;
		double y = 0.0;
		double yi = 0.0;
		double d = 0.0;
		double i = 0.0;

		final double xDomain = 12.56;
		final double xStep = 0.01;

		while(x <= xDomain)
		{
			y = Math.sin(x) + Math.sin(3.0*x)/3.0 + Math.sin(5.0*x)/5.0 + Math.sin(7.0*x)/7.0;
			d = (y - yi)/xStep;
			i += y*xStep;
			yi = y;

			cx = (int) Math.round(100*x);

			cy = (int) (360 - Math.round(80*y));
			g.setColor(Color.RED);
			g.drawLine(cx, cy, cx, cy);

			cy = (int) (360 - Math.round(80*d));
			g.setColor(Color.GREEN);
			g.drawLine(cx, cy, cx, cy);

			cy = (int) (360 - Math.round(80*i));
			g.setColor(Color.BLUE);
			g.drawLine(cx, cy, cx, cy);

			x += xStep;
		}
	}
}
