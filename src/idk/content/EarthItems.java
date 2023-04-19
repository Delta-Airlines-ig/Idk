package idk.content;

import arc.*;
import arc.graphics.*;
import mindustry.*;
import mindustry.game.*;
import mindustry.graphics.*;
import mindustry.type.*;
import mindustry.ctype.UnlockableContent;

public class EarthItems{
    public static Item 
        //voltite
        voltite, 
    //other things
    iron, lithium, tin, steel, stone, aluminum, uranium;
  //add voltite alloys
//static here? \/
    public static void load(){
        voltite = new Item("voltite", Color.valueOf("00f0ec")){{
            localizedName = "voltite";
               description = "seemingly magical substance. holds alot of charge and will react violently with itself in certain conditions. when alloyed with metals, they become far more durable for some reason. this was discovered hundreds of years ago but was never published for unknown reasons, we only know this because of some old documents found aboard the spacecraft that crashed on Serpulo.";
                charge = 9.5f;
                radioactivity = 0f;
                explosiveness = 1f;
                flammability = 0.2f;
                cost = 0.1f;
                //hardness = 15;
       }};


      
        iron = new Item("iron"){{
            localizedName = "iron";
            flammability = 0f;
            explosiveness = 0f;
            hardness = 0;
        }};

        lithium = new Item("lithium"){{
            localizedName = "lithium";
            flammability = 0.1f;
            explosiveness = 0.3f;
            charge = 0.75f;
            hardness = 1;
        }};

        tin = new Item("tin"){{
            localizedName = "tin";
            explosiveness = 0f;
            hardness = 1;
        }};

        stone = new Item("stone"){{
            localizedName = "stone";
            hardness = 0;
        }};

        steel = new Item("steel", Color.valueOf("ec83af")){{
            localizedName = "steel";
            flammability = 0f;
            cost = 2;
        }};
        aluminum = new Item("aluminum", Color.valueOf("ec83af")){{
            localizedName = "aluminum";
            flammability = 0f;
            hardness = 2;
            cost = 1;
        }};
        uranium = new Item("uranium", Color.valueOf("ec83af")){{
            localizedName = "uranium";
            hardness = 3;
            radioactivity = 2f;
            flammability = 0f;
            cost = 1;
        }};
    }
}
