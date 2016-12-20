package Map;

import Teams.Team;

import java.util.HashMap;

/**
 * Created by WHOmagoo on 12/18/2016.
 */
public class Country {
    String name;
    HashMap<String, Country> neighbors;
    TileType type;
    Team occupiedBy;

}
