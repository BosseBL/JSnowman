import java.util.ArrayList;

public class SnowFlakeManager
{
  ArrayList<SnowFlake> snowflakes;
  float speed;
  int ground;
  int width;
  
  public SnowFlakeManager(float speed, int ground, int width)
  {
    this.speed = speed;
    this.ground = ground;
    this.width = width;
    
    snowflakes = new ArrayList();
  }
  
  public void createNewFlakes()
  {
    java.util.Random rand = new java.util.Random(System.currentTimeMillis());
    for (int i = 0; i < width; i += 3) {
      if (rand.nextInt(1000) > 996) {
        snowflakes.add(new SnowFlake(i, 0.0F, 0.2F * rand.nextFloat(), speed, ground));
      }
    }
  }
  
  public void removeDeadFlakes() {
    for (int i = 0; i < snowflakes.size(); i++) {
      if (((SnowFlake)snowflakes.get(i)).isDead()) {
        snowflakes.remove(i);
        i--;
      }
    }
  }
  
  public void updateFlakes()
  {
    removeDeadFlakes();
    for (int i = 0; i < snowflakes.size(); i++) {
      ((SnowFlake)snowflakes.get(i)).updatePosition();
    }
    createNewFlakes();
  }
  
  public ArrayList<SnowFlake> getFlakes() {
    return snowflakes;
  }
}
