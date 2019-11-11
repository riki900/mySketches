/**
 * Repeat: Recursive Tree from Form+Code in Design, Art, and Architecture 
 * implemented in OpenFrameworks by Anthony Stellato <http://rabbitattack.com/> 
 * 
 * Requires OpenFrameworks available at http://openframeworks.cc/
 *
 * For more information about Form+Code visit http://formandcode.com
 */

#ifndef _TEST_APP
#define _TEST_APP


#include "ofMain.h"

class Repeat_RecursiveTree : public ofBaseApp{

	public:
		void setup();
		void update();
		void draw();
	
		void seed1(float dotSize, float angle, float x, float y);
		void seed2(float dotSize, float angle, float x, float y);

		void keyPressed  (int key);
		void keyReleased(int key);
		void mouseMoved(int x, int y );
		void mouseDragged(int x, int y, int button);
		void mousePressed(int x, int y, int button);
		void mouseReleased(int x, int y, int button);
		void windowResized(int w, int h);

		float dotSize, angleOffsetA, angleOffsetB;
};

#endif
