package idk.content;

import arc.*;
import arc.graphics.*;
import arc.struct.*;
import mindustry.*;
import mindustry.game.*;
import mindustry.graphics.*;
import mindustry.type.*;
import mindustry.ctype.UnlockableContent;

import static mindustry.content.Items.*;

public class EarthItems{
    public static Item 
        //voltite
        voltite, 
    //other things
    iron, lithium, tin, steel, stone, aluminum, uranium, carbon, oxidizer, explosivemix, bronze, lead2, copper2;
  //add voltite alloys
    
   public static final Seq<Item> EarthItems = new Seq<>();
    public static final Seq<Item> Begone = new Seq<>();
    
    public static void load(){
        voltite = new Item("voltite", Color.valueOf("00f0ec")){{
            localizedName = "voltite";
               description = "seemingly magical substance. holds a lot of charge and will react violently with itself in certain conditions. when alloyed with metals, they become far more durable for some reason. this was discovered hundreds of years ago but was never published for unknown reasons, we only know this because of some old documents found aboard the spacecraft that crashed on Serpulo.";
                charge = 9.5f;
                radioactivity = 0f;
                explosiveness = 1f;
                flammability = 0.2f;
                cost = 0.1f;
                //hardness = 15;
       }};
        copper2 = new Item("copper2", Color.valueOf("d99d73")){{
            localizedName = "copper";
            hardness = 1;
            cost = 0.5f;
            alwaysUnlocked = true;
        }};

        lead2 = new Item("lead2", Color.valueOf("8c7fa9")){{
            localizedName = "lead";
            hardness = 1;
            cost = 0.7f;
        }};



      
        iron = new Item("iron"){{
            localizedName = "iron";
            description = "iron, sort of like copper, used in many buildings";
            flammability = 0f;
            explosiveness = 0f;
            hardness = 0;
        }};

        lithium = new Item("lithium"){{
            localizedName = "lithium";
            description = "used in batteries and other electronic components, also a bit explosive";
            flammability = 0.1f;
            explosiveness = 0.3f;
            charge = 0.75f;
            hardness = 1;
        }};

        tin = new Item("tin"){{
            localizedName = "tin";
            description = "like iron but not quite, used for building things";
            explosiveness = 0f;
            hardness = 1;
        }};

        stone = new Item("stone"){{
            description = "very basic resource, used for some basic machinery and other basic stuff. makes strong walls";
            localizedName = "stone";
            hardness = 0;
        }};

        steel = new Item("steel", Color.valueOf("ec83af")){{
            description = "stronger than iron, steel is used in many advanced machines";
            localizedName = "steel";
            flammability = 0f;
            cost = 2;
        }};
                bronze = new Item("bronze", Color.valueOf("ec83af")){{
            description = "used in piping and liquid things";
            localizedName = "bronze";
            flammability = 0f;
            cost = 2;
        }};
        aluminum = new Item("aluminum", Color.valueOf("ec83af")){{
            description = "lightweight, durable metal. useful for unit construction and some buildings";
            localizedName = "aluminum";
            flammability = 0f;
            hardness = 2;
            cost = 1;
        }};
        uranium = new Item("uranium", Color.valueOf("ec83af")){{
            description = "used in a similer way to thorium but is far more radioactive";
            localizedName = "uranium";
            hardness = 3;
            radioactivity = 2f;
            flammability = 0f;
            cost = 1;
        }};
                carbon = new Item("carbon", Color.valueOf("ec83af")){{
            description = "pretty much just very pure coal";
            localizedName = "carbon";
            flammability = 0f;
            cost = 1;
        }};
           oxidizer = new Item("oxidizer", Color.valueOf("ec83af")){{
            description = "used in explosives, very flammable";
            localizedName = "oxidizer";
            flammability = 1f;
            cost = 1;
        }};
                   explosivemix = new Item("explosive-compound", Color.valueOf("ec83af")){{
            description = "a high explosive, contains its own oxidizer";
            localizedName = "explosive compound";
            explosiveness = 1f;
            flammability = 1f;
            cost = 1;
        }};
                EarthItems.addAll(
                voltite, iron, lithium, tin, steel, aluminum, uranium, carbon, oxidizer, explosivemix, silicon, copper2, lead2, sand, surgeAlloy, phaseFabric, graphite
        );
                        Begone.addAll(
                thorium, beryllium, tungsten, oxide, carbide, fissileMatter, dormantCyst, scrap, coal, titanium, plastanium, sporePod, blastCompound, pyratite, copper, metaglass, lead
        );
    }
}
