package HannoyTowerPackage;


import figure.Figure;
import ui.FigureCanvas;

import java.awt.*;
import java.util.ArrayList;

public class Pegs extends Figure {

    private java.util.List<Disc> discsList = new ArrayList<>();
    private figure.Rectangle support;
    private figure.Rectangle twig;

 /*   public Pegs(int x, int y, int width, int height, FigureCanvas canvas) {
        super(x, y, width, height, canvas, Color.TRANSLUCENT);
    }
*/
    public Pegs(int x, int y, int width, int height, FigureCanvas canvas) {
        super(x, y, width, height, canvas, DEFAULT_COLOR);
    }
    HanoyCanvas hanoycanvas = new HanoyCanvas();
    int twigX = getWidth() / 2 + x - hanoycanvas.twigWidth / 2;
    int supportY = getHeight() + y - hanoycanvas.twigWidth;


    @Override
    public void draw(Graphics g) {
        g.setColor(getColor());
        int rodX = getWidth() / 2 + getX() - hanoycanvas.twigWidth / 2;
        int standY = getHeight() + getY() -  hanoycanvas.twigWidth;
        // draw rod
        g.fillRect(rodX, getY(), hanoycanvas.twigWidth, getHeight() - hanoycanvas.twigWidth);
        // draw stand
        g.fillRect(getX(), standY, getWidth(), hanoycanvas.twigWidth);

        for(Disc disc : discsList) {
            disc.draw(g);
        }
    }

    @Override
    public boolean isBelong(int x, int y) {
        return support.isBelong(x, y);
    }
    public void addDiscksList(Disc disc) {
        discsList.add(disc);
    }
}
