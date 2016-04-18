package HannoyTowerPackage;


import figure.Figure;
import figure.FigureCanvas;

import java.awt.*;

public class Pegs extends Figure {
    public Pegs(int x, int y, int width, int height, FigureCanvas canvas) {
        super(x, y, width, height, canvas);
    }

    public Pegs(int x, int y, int width, int height, FigureCanvas canvas, Color color) {
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
