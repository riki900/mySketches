class Planet {
 
  float radius;
  float angle;
  float distance;
  float orbitspeed;
  Planet[] planets;
  
  Planet(float r, float d, float o) {
    radius = r;
    distance = d;
    orbitspeed = o;
    angle = random(TWO_PI);
  }
  
  void orbit() {
    angle = angle + orbitspeed;
    if ( planets != null ) {
      for ( int i = 0; i < planets.length; i++ ) {
        planets[i].orbit();
      }
    }
  }
  
  void spawnMoons(int total) {
    planets = new Planet[total];
    for ( int i = 0; i < planets.length; i++ ) {
      float r = random(5,radius * .4 );
      float d = radius * random(1.5,4);
      float o = random(-0.1, 0.1);
      planets[i] = new Planet(r, d, o);
    }
    
  }
  void show() {
    pushMatrix();
    rotate(angle);
    translate(distance, 0);
    ellipse(0, 0, radius * 2, radius * 2);
    if ( planets != null ) {
      for (int i = 0; i < planets.length; i ++ ) {
        planets[i].show();
      }
    }
    popMatrix();
  }
}
