package WWCmod;

import net.minecraft.item.EnumToolMaterial;
import net.minecraft.item.ItemHoe;

public class WWCModHoe extends ItemHoe {

public WWCModHoe(int ItemID, EnumToolMaterial material){
super(ItemID, material);
setCreativeTab(WWCMod.WWCTab);
}



}