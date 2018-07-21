public class SnowFlake {
  float x;
  float X;
  float y;
  float speed;
  float sinConst;
  long lastUpdate;
  int ground;
  boolean dead;
  
  public SnowFlake(float X, float y, float sinConst, float speed, int ground) { lastUpdate = System.currentTimeMillis();
    dead = false;
    this.X = X;
    this.speed = speed;
    this.y = y;
    this.sinConst = sinConst;
    this.ground = ground;
  }
  
  public void updatePosition() {
    if (!dead) {
      float t = (float)(System.currentTimeMillis() - lastUpdate);
      y += t * speed;
      x = (X + (float)(3.0D * Math.sin(sinConst * y)));
      lastUpdate = System.currentTimeMillis();
      if (y >= ground) dead = true;
    }
  }
  
  public boolean isDead() { return dead; }
}
