package extra;

import java.awt.Color;
import java.util.Random;

import javax.swing.JOptionPane;

import info.gridworld.actor.Bug;
import info.gridworld.actor.Flower;
import info.gridworld.grid.Location;
import info.gridworld.world.World;

public class Gridworld {
	World world = new World();
	Bug bug1 = new Bug(Color.BLUE);
	Bug bug2 = new Bug();
	Bug bug3 = new Bug();
	Flower flower = new Flower();
	Flower flower2 = new Flower();
	Flower flower3 = new Flower();
	static Random factory = new Random();
	int row;
	int col;
	
	public static void main(String[] args) {
		Gridworld gridworld = new Gridworld();
		gridworld.drawWorld();
		
	}
		public void drawWorld() {
			world.show();
			row = factory.nextInt(10);
			col = factory.nextInt(10);
			Location bugPlace = new Location(row, col);	
			Location place = new Location(100, 100);
			world.add(bugPlace, bug1);
			bug1.turn();
			
		Location flowerPlace = new Location(row, col-1);
		world.add(flowerPlace, flower);
		Location flowerPlace2 = new Location(row, col+1);
		world.add(flowerPlace2, flower2);
	
		for(int col=0; col<10; col++) {
		for( row=0; row<10; row++) {
			Location flowerPlace3 = new Location(row, col);
			world.add(flowerPlace3, flower3);
			}
		}
	}
		
}
