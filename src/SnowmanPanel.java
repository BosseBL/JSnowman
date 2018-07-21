import java.awt.Color;
import java.awt.Dimension;
import java.awt.Graphics;
import java.util.ArrayList;
import javax.swing.JPanel;


public class SnowmanPanel
  extends JPanel
{
  protected int mid = 150;
  protected int top = 50;
  
  SnowFlakeManager sfm = new SnowFlakeManager(0.05F, 170, 300);
  
  public SnowmanPanel() {
    setPreferredSize(new Dimension(300, 200));
    setBackground(Color.cyan);
  }
  
  public void paintComponent(Graphics g) {
    super.paintComponent(g);
    sfm.updateFlakes();
    Dimension size = getSize();
    

    g.setColor(Color.blue);
    g.fillRect(0, 175, width, height - 175);
    


    g.setColor(Color.yellow);
    g.fillOval(-40, -40, 80, 80);
    

    g.setColor(Color.white);
    g.fillOval(mid - 20, top, 40, 40);
    g.fillOval(mid - 35, top + 35, 70, 50);
    g.fillOval(mid - 50, top + 80, 100, 60);
    

    g.setColor(Color.black);
    g.fillOval(mid - 10, top + 10, 5, 5);
    g.fillOval(mid + 5, top + 10, 5, 5);
    

    g.drawArc(mid - 10, top + 20, 20, 10, 190, 160);
    

    g.drawLine(mid - 25, top + 60, mid - 50, top + 40);
    g.drawLine(mid + 25, top + 60, mid + 55, top + 60);
    

    g.drawLine(mid - 20, top + 5, mid + 20, top + 5);
    g.fillRect(mid - 15, top - 20, 30, 25);
    
    drawFlakes(g);
  }
  
  private void drawFlakes(Graphics g) {
    ArrayList<SnowFlake> sfList = sfm.getFlakes();
    g.setColor(Color.WHITE);
    for (int i = 0; i < sfList.size(); i++) {
      SnowFlake sf = (SnowFlake)sfList.get(i);
      g.fillOval((int)x, (int)y, 4, 4);
    }
    sfm.updateFlakes();
  }
}
