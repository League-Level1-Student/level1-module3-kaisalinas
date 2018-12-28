package extra;

import info.gridworld.actor.Bug;
import info.gridworld.grid.Location;
import info.gridworld.world.World;

public class Gridworld {
	Gridworld() {
		World worlds = new World();
		worlds.show();
		Bug bugs = new Bug();
		Location place = new Location(100, 100);
	}

	public static void main(String[] args) {
		Gridworld gridworld = new Gridworld();
	}

}
