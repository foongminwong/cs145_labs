package lab04;

import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.image.BufferedImage;

import javax.swing.JFrame;
import javax.swing.JPanel;

public class Canvas {
  private JFrame frame;
  private BufferedImage image;
  
  public Canvas(int width, int height) {
    image = new BufferedImage(width, height, BufferedImage.TYPE_INT_RGB);

    frame = new JFrame("Canvas");
    frame.add(new CanvasPanel());
    frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    frame.setSize(width, height);
  }
  
  public Graphics2D getGraphics() {
    return image.createGraphics();
  }
  
  public void show() {
    frame.setVisible(true);
  }
  
  private class CanvasPanel extends JPanel {
    @Override
    public void paintComponent(Graphics g) {
      g.drawImage(image, 0, 0, null);
    }
  }
}