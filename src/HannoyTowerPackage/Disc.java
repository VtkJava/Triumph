package HannoyTowerPackage;

import figure.Figure;
import ui.FigureCanvas;

import java.awt.*;

/**
 * Created by Samvel on 16/04/16.
 */
public class Disc extends Figure {
   /* public Disc(int x, int y, int width, int height, FigureCanvas canvas) {

        super(x, y, width, height, canvas);
    }*/

    public Disc(int x, int y, int width, int height, FigureCanvas canvas) {
        super(x, y, width, height, canvas, Color.blue);
    }

    @Override
    public void draw(Graphics g) {
        g.setColor(new Color(0xDC80FF));
        g.fillRect(getX(), getY(), getWidth(), getHeight());
        g.setColor(new Color(0x4A54FF));
        g.drawLine(getX(), getY(), getX() + getWidth() - 1, getY());
    }

    @Override
    public boolean isBelong(int x, int y) {
        return x >= this.getX() && x <= (this.getX() + this.getWidth())
                && y >= this.getY() && y <= (this.getY() + this.getHeight());
    }


}
