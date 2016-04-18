package HannoyTowerPackage;

import figure.Figure;
import figure.FigureCanvas;

import java.awt.*;

/**
 * Created by Samvel on 16/04/16.
 */
public class Disc extends Figure {
    public Disc(int x, int y, int width, int height, FigureCanvas canvas) {
        super(x, y, width, height, canvas);
    }

    public Disc(int x, int y, int width, int height, FigureCanvas canvas, Color color) {
        super(x, y, width, height, canvas, color);
    }

    @Override
    public void draw(Graphics g) {

    }

    @Override
    public boolean isBelong(int x, int y) {
        return false;
    }


}
