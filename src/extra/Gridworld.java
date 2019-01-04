package extra;

import java.util.Random;

import javax.swing.JOptionPane;

import info.gridworld.actor.Bug;
import info.gridworld.grid.Location;
import info.gridworld.world.World;

public class Gridworld {
	static Random factory = new Random();
	Gridworld() {
		World worlds = new World();
		worlds.show();
		Bug bugs = new Bug();
		Location place = new Location(100, 100);
		Bug bug2 = new Bug();
	}

	public static void main(String[] args) {
		Gridworld gridworld = new Gridworld();
		Location bugPlace = new Location(factory.nextInt(10), factory.nextInt(10));
		
	}
	
	
}
