package WWCmod;

import net.minecraft.item.EnumToolMaterial;
import net.minecraft.item.ItemSpade;

public class WWCModShovel extends ItemSpade {

public WWCModShovel(int ItemID, EnumToolMaterial material){
super(ItemID, material);
setCreativeTab(WWCMod.WWCTab);
}



}