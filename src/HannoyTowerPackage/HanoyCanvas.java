package HannoyTowerPackage;

import ui.FigureCanvas;

import java.awt.*;
import java.awt.event.*;
import java.util.ArrayList;
import java.util.List;

/**
 * Created by Samvel on 16/04/16.
 */
public class  HanoyCanvas extends FigureCanvas {

    public int twigWidth;
    public int twigHeight;
    public int rodWidth;
    public int discHeight;

    private int discCount;
    private List<Disc> discs = new ArrayList<>();
    private Pegs twig1;
    private Pegs twig2;
    private Pegs twig3;


    public HanoyCanvas() {
        super();

        //int x, int y, int width, int height, FigureCanvas canvas

        twig1 = new Pegs(DEFAULT_MARGIN, DEFAULT_MARGIN, twigWidth, twigHeight, this);
        twig2 = new Pegs(DEFAULT_MARGIN, DEFAULT_MARGIN, twigWidth, twigHeight, this);
        twig3 = new Pegs(DEFAULT_MARGIN, DEFAULT_MARGIN, twigWidth, twigHeight, this);

        addMouseListener(new MouseListener() {
            @Override
            public void mouseClicked(MouseEvent e) {

            }

            @Override
            public void mousePressed(MouseEvent e) {

            }

            @Override
            public void mouseReleased(MouseEvent e) {

            }

            @Override
            public void mouseEntered(MouseEvent e) {

            }

            @Override
            public void mouseExited(MouseEvent e) {

            }
        });

        addMouseMotionListener(new MouseMotionListener() {
            @Override
            public void mouseDragged(MouseEvent e) {
                mouseDraggedPerformedHanoi(e);
            }

            @Override
            public void mouseMoved(MouseEvent e) {
                mouseMovedPerformedHanoi(e);
            }
        });

        addComponentListener(new ComponentAdapter() {
            @Override
            public void componentResized(ComponentEvent e) {
                super.componentResized(e);
                hanoiCanvasResizedPerformed(e);
            }
        });
    }

    private void hanoiCanvasResizedPerformed(ComponentEvent e) {
        int space = (getBorderRight() - getBorderLeft() - twigWidth * 3) / 2;
        twig1.setX(getBorderLeft());
        twig1.setY(getBorderBottom() - twigHeight);
        twig2.setX(getBorderLeft() + twigWidth + space);
        twig2.setY(getBorderBottom() - twigHeight);
        twig3.setX(getBorderLeft() + (twigWidth + space) * 2);
        twig3.setY(getBorderBottom() - twigHeight);
    }

    @Override
    public void paint(Graphics g) {
        super.paint(g);
        twig1.draw(g);
        twig2.draw(g);
        twig3.draw(g);
    }

    public void loadDisc(int diskCount) {
        this.discCount = diskCount;

        int diskHeight = ((twig1.getHeight() - 5) / diskCount);
        diskHeight = diskHeight > 15 ? 15 : diskHeight;
        int xDiff = (twig1.getWidth() - rodWidth - 10) / (diskCount *2);
        xDiff = xDiff > 10 ? 10 : xDiff;
        int x = twig1.getX() +  xDiff;
        int y = twig1.getY() + twig1.getHeight() - rodWidth - diskHeight;
        int currentWidth = twig1.getWidth() - 2 * xDiff;
        Disc disk;

        for (int i = 0; i < diskCount; i++) {
            disk = new Disc(x, y, currentWidth, discHeight, this);
            discs.add(disk);
            twig1.addDiscksList(disk);
            repaint();
            x += xDiff;
            y -= diskHeight;
            currentWidth -= xDiff * 2;

        }
    }

    private void mouseDraggedPerformedHanoi(MouseEvent e) {
        repaint();

    }

    private void mouseMovedPerformedHanoi(MouseEvent e) {
        repaint();

    }
}
