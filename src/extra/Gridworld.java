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
	Bug bug1 = new Bug();
	Bug bug2 = new Bug();
	Bug bug3 = new Bug(Color.BLUE);
	Flower flower = new Flower();
	
	public static void main(String[] args) {
		Gridworld gridworld = new Gridworld();
		gridworld.drawWorld();
		
	}
		public void drawWorld() {
			world.show();	
			Location bugPlace = new Location(factory.nextInt(10),factory.nextInt(10));	
			Location place = new Location(100, 100);
			world.add(bugPlace, bug1);
			bug1.turn();
		world.add(bugPlace, flower);
		}
	
		
	static Random factory = new Random();
	
	
}
