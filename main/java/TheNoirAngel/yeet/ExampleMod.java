package TheNoirAngel.yeet;

import net.minecraft.init.Blocks;
import net.minecraft.item.Item;
import net.minecraft.item.Item.ToolMaterial;
import net.minecraftforge.common.util.EnumHelper;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.common.Mod.EventHandler;
import net.minecraftforge.fml.common.event.FMLInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPreInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPostInitializationEvent;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

@Mod(modid = ExampleMod.MODID, name = ExampleMod.NAME, version = ExampleMod.VERSION)
public class ExampleMod
{
    public static final String MODID = "yeet";
    public static final String NAME = "I Want To Die";
    public static final String VERSION = "1.0";
    public static final String MC_VERSION = "[1.12.2]";

    public static final Logger lOGGER = LogManager.getLogger(ExampleMod.MODID);
    
    @EventHandler
    public void preInit(FMLPreInitializationEvent event) {
    }
    
    @EventHandler
    public void init(FMLInitializationEvent event)
    {
    	lOGGER.info(ExampleMod.NAME + "says hi!");
    }

    @EventHandler
    public void postInit(FMLPostInitializationEvent event)
    {
       
    }
}
