package WWCmod;

import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;
import net.minecraft.creativetab.CreativeTabs;



public final class TabWWCMod extends CreativeTabs
{
public TabWWCMod(int par1, String par2Str)
{
super(par1, par2Str);
}

//sets the image for the creative tab
@SideOnly(Side.CLIENT)
public int getTabIconItemIndex()
{
//there is a difference between items and blocks. will give an example of both
return WWCMod.copper.itemID;
}

//sets the title/name for the creative tab
public String getTranslatedTabLabel()
{
return "Wonder World Craft Mod";
}
}