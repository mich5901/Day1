
import TurtleGraphics.SketchPadWindow;
import TurtleGraphics.Pen;
import TurtleGraphics.StandardPen;
import java.awt.Color;
import java.util.Scanner;

public class LineChart {

    //static = global variable 
    static SketchPadWindow win = new SketchPadWindow(850, 650);
    static Pen p = new StandardPen(win);

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int x1, y1, x2, y2;
        //draw x y axis
        p.setColor(Color.black);
        p.up();
        p.move(-400, 0);
        p.down();
        p.move(400, 0);
        p.up();
        p.move(0, 300);
        p.down();
        p.move(0, -300);
        p.home();

        for (int x = -400; x < 400; x += 50) {
            drawTick(x, 0, 90);

        }

        for (int y = -300; y <= 300; y += 50) {
            drawTick(0, y, 0);
        }
        System.out.print("Enter X1 value > ");
        x1 = scan.nextInt();
        System.out.print("Enter Y1 value > ");
        y1 = scan.nextInt();
        System.out.print("Enter X2 value > ");
        x2 = scan.nextInt();
        System.out.print("Enter Y1 value > ");
        y2 = scan.nextInt();

        p.setWidth(5);
        p.setColor(Color.blue);
        p.up();
        p.move(x1, y1);
        p.down();
        p.move(x2, y2);
        p.up();

        plot(x1, y1);
        plot(x2, y2);
    }

    public static void drawTick(int xloc, int yloc, int dir) {
        if (xloc == 0 && yloc == 0) {
            return;
        }
        p.up();
        p.move(xloc, yloc);
        p.down();
        p.setDirection(dir);
        p.move(10);
        p.up();
        p.move(xloc - 5, yloc + 20);

        if (dir == 90) {
            p.move(xloc - 5, yloc + 20);
            p.drawString("" + xloc);

        } else {
            p.move(xloc + 20, yloc - 5);
            p.drawString("" + yloc);
        }
    }

    public static void plot(int xloc, int yloc) {
        p.setWidth(20);
        p.setColor(Color.red);
        p.up();
        p.move(xloc, yloc);
        p.down();
        p.move(3);
        p.setWidth(5);
        p.setColor(Color.blue);
        p.up();
        p.move(xloc + 10, yloc - 10);
        p.drawString(String.format("(%d, %d)", xloc, yloc));
    }
}
