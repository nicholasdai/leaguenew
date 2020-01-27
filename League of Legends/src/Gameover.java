//import java.awt.Graphics;
//import java.awt.Graphics2D;
//import java.awt.Image;
//import java.awt.MouseInfo;
//import java.awt.Point;
//import java.awt.PointerInfo;
//import java.awt.Rectangle;
//import java.awt.Toolkit;
//import java.awt.geom.AffineTransform;
//import java.net.URL;
//import java.util.ArrayList;
//
//public class Gameover {
//    public static int x; // position of a frog
//	public static int y;
//    private double vx, vy; // velocity
//    private int width, height;
//    private Image img;
//
//    // write the constructor for the frog which
//    // takes in a String fileName that will be used for the image setup.
//
//    public Gameover(String fileName) {
//        x = 00;
//        y = 450;
//        width = 1600;
//        height = 1600;
//
//        img = getImage("gameover.png");
//        init(x, y);
//        
//      //  if(Driver.getEnd = true) {
//      //  	y = 0;
//      //  }
//        
//    }
//    
//
//    public void setX(int newX) { // set x position
//        x = newX;
//    }
//
//    public void setY(int newY) { // set y position
//        y = newY;
//    }
//
//
//    public void setPos(int x, int y) {
//        this.x = x;
//        this.y = y;
//        init(x, y);
//    }
//
//    private AffineTransform tx = AffineTransform.getTranslateInstance(x, y);
//
//    // draw the affinetransform
//    public void paint(Graphics g) {
//        Graphics2D g2 = (Graphics2D) g;
//        g2.drawImage(img, tx, null);
//    }
//
//    private void init(double a, double b) {
//        tx.setToTranslation(a, b);
//    }
//
//    // converts image to make it drawable in paint
//    private Image getImage(String path) {
//        Image tempImage = null;
//        try {
//            URL imageURL = Gameover.class.getResource(path);
//            tempImage = Toolkit.getDefaultToolkit().getImage(imageURL);
//        } catch (Exception e) {
//            e.printStackTrace();
//        }
//        return tempImage;
//    }
//
//    public int getY() { // get y position
//        // TODO Auto-generated method stub
//        return y;
//    }
//
//    public int getX() { // get x position
//        // TODO Auto-generated method stub
//        return x;
//    }
//
//
//}