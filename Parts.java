package WWCmod;
import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;
import net.minecraft.item.Item;
import net.minecraft.client.renderer.texture.IconRegister;
import net.minecraft.creativetab.CreativeTabs;

public class Parts extends Item {
	public Parts(int id) {
		super(id); //Returns super constructor: par1 is ID
		setCreativeTab(WWCMod.WWCTab); //Tells the game what creative mode tab it goes in
		}
	@Override
	@SideOnly(Side.CLIENT)
	public void registerIcons(IconRegister reg){
		this.itemIcon = reg.registerIcon("wwcmod:"+ (this.getUnlocalizedName().substring(5)));
	}
		}
