import javax.swing.JFrame;

public class Snowman extends JFrame
{
  public Snowman()
  {
    super("Snowman");
    setDefaultCloseOperation(3);
    
    SnowmanPanel sp = new SnowmanPanel();
    
    getContentPane().add(sp);
    
    pack();
    
    setVisible(true);
  }
  
  public static void main(String[] args) {
    Snowman sm = new Snowman();
    for (;;) {
      try {
        Thread.sleep(14L);
      }
      catch (InterruptedException e) {
        e.printStackTrace();
      }
      
      sm.repaint();
    }
  }
}
