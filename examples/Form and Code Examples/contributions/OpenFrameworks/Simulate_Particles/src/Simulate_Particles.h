/**
 * Simulate: Particles from Form+Code in Design, Art, and Architecture 
 * implemented in OpenFrameworks by Anthony Stellato <http://rabbitattack.com/> 
 * 
 * Requires OpenFrameworks available at http://openframeworks.cc/
 *
 * For more information about Form+Code visit http://formandcode.com
 */

#ifndef _TEST_APP
#define _TEST_APP


#include "ofMain.h"

class Particle {
public:
	ofPoint loc, vel, acc;
	ofPoint *hist;
	int counter;
	Particle(){};
	Particle(ofPoint l);
	void update();
	void draw();
	void drawArrowHead(ofPoint v, ofPoint loc, float scale);
};

class Simulate_Particles : public ofBaseApp{

	public:
		void setup();
		void update();
		void draw();

		void keyPressed  (int key);
		void keyReleased(int key);
		void mouseMoved(int x, int y );
		void mouseDragged(int x, int y, int button);
		void mousePressed(int x, int y, int button);
		void mouseReleased(int x, int y, int button);
		void windowResized(int w, int h);

};

#endif
