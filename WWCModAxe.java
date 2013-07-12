package WWCmod;

import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;
import net.minecraft.client.renderer.texture.IconRegister;
import net.minecraft.item.EnumToolMaterial;
import net.minecraft.item.ItemAxe;

public class WWCModAxe extends ItemAxe {

public WWCModAxe(int ItemID, EnumToolMaterial material){
super(ItemID, material);
setCreativeTab(WWCMod.WWCTab);
}
@Override
@SideOnly(Side.CLIENT)
public void registerIcons(IconRegister reg){
	this.itemIcon = reg.registerIcon("wwcmod:"+ (this.getUnlocalizedName().substring(5)));
}


}