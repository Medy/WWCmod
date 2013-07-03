package WWCmod;

import net.minecraft.item.EnumToolMaterial;
import net.minecraft.item.ItemAxe;

public class WWCModSword extends ItemAxe {

public WWCModSword(int ItemID, EnumToolMaterial material){
super(ItemID, material);
setCreativeTab(WWCMod.WWCTab);
}



}