package idk.content;

import arc.graphics.*;
import arc.util.*;
import idk.planets.*;
import mindustry.maps.generators.PlanetGenerator;
import mindustry.content.*;
import mindustry.graphics.g3d.*;
import mindustry.type.*;

public class EarthPlanets{
    public static Planet earth;

    public static void load(){
        try{
          //placeholder name ig idk a good planet name
            earth = new Planet("earth?", Planets.sun, 1f, 2) {{
                //atmosphereColor = Color.gray.cpy();
                //landCloudColor = Color.clear.cpy();
                atmosphereRadOut = 0.5f;
                atmosphereRadIn = 0.05f;
               // tidalLock = true;
                hasAtmosphere = true;
              //  generator = new idkGenerator();
                //placeholder
                 generator = new placeholdergen();
                meshLoader = () -> new HexMesh(this, 12);
                startSector = 1;
                accessible = true;
                sectorSeed = -1;
               bloom = false;
                //defaultCore = fortress;
                defaultCore = Blocks.coreShard;
                
            }};
        }
        catch(Exception e){
            Log.info("the planet broke??");
            Log.err(e);
        }

    }
}
