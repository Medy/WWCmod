package WWCmod;

import net.minecraft.block.Block;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.EnumToolMaterial;
import net.minecraft.item.Item;
import net.minecraft.item.ItemFood;
import net.minecraft.item.ItemStack;
import net.minecraftforge.common.EnumHelper;
import cpw.mods.fml.common.Mod;
import cpw.mods.fml.common.Mod.EventHandler;
import cpw.mods.fml.common.event.FMLInitializationEvent;
import cpw.mods.fml.common.network.NetworkMod;
import cpw.mods.fml.common.registry.GameRegistry;
import cpw.mods.fml.common.registry.LanguageRegistry;

@Mod(modid="wwcmod",name="Wonder World Craft Mod",version="v1")
@NetworkMod(clientSideRequired=true,serverSideRequired=false)

public class WWCMod {
	//creative tab
	public static CreativeTabs WWCTab = new TabWWCMod(CreativeTabs.getNextID(), "Wonder World Craft Mod");
	//toolMaterial
	public static EnumToolMaterial EnumToolMaterialMithril= EnumHelper.addToolMaterial("Mithril", 2, 250, 6.0F, 2, 15);
	public static EnumToolMaterial EnumToolMaterialOrichalcum= EnumHelper.addToolMaterial("Orichalcum", 3, 1561, 20.0F, 3, 15);
	public static EnumToolMaterial EnumToolMaterialIron= EnumHelper.addToolMaterial("LowPowerIron", 2, 250, 6.0F, 2, 15);
	public static EnumToolMaterial EnumToolMaterialSteel= EnumHelper.addToolMaterial("Steel", 2, 250, 6.0F, 2, 15);
	public static EnumToolMaterial EnumToolMaterialBronze= EnumHelper.addToolMaterial("Bronze", 2, 250, 6.0F, 2, 15);
	public static EnumToolMaterial EnumToolMaterialPlatinum= EnumHelper.addToolMaterial("Platinum", 2, 250, 6.0F, 2, 15);
	public static EnumToolMaterial EnumToolMaterialGold= EnumHelper.addToolMaterial("Gold", 2, 250, 6.0F, 2, 15);
	//blocks
	public static Block copperore;
	public static Block tinore;
	public static Block silverore;
	public static Block platinumore;
	public static Block mithrilore;
	public static Block orichalcumore;
	//items
	public static Item copper;
	public static Item tin;
	public static Item silver;
	public static Item platinum;
	public static Item mithril;
	public static Item orichalcum;
	public static Item bronze;
	public static Item steel;
	public static Item titanium;
	//tools
	public static Item MithrilAxe;
	public static Item MithrilShovel;
	public static Item MithrilSword;
	public static Item MithrilPickaxe;
	public static Item MithrilHoe;
	public static Item OrichalcumAxe;
	public static Item OrichalcumShovel;
	public static Item OrichalcumSword;
	public static Item OrichalcumPickaxe;
	public static Item OrichalcumHoe;
	//anvil
	public static Block Anvil;
	public static Item IronBlade;
	public static Item IronHilt;
	public static Item IronGuard;
	public static Item IronSheild;
	public static Item IronAxe;
	public static Item IronShovel;
	public static Item IronPickaxe;
	public static Item IronHoe;
	public static Item IronSword;
	public static Item IronHammer;
	public static Item SteelBlade;
	public static Item SteelHilt;
	public static Item SteelGuard;
	public static Item SteelSheild;
	public static Item SteelAxe;
	public static Item SteelShovel;
	public static Item SteelPickaxe;
	public static Item SteelHoe;
	public static Item SteelSword;
	public static Item SteelHammer;
	public static Item Pliers;
	public static Item IronArrows;
	public static Item SteelArrows;
	//experts anvil
	public static Block ExpertsAnvil;
	public static Item BronzeBlade;
	public static Item BronzeHilt;
	public static Item BronzeGuard;
	public static Item BronzeSheild;
	public static Item BronzeAxe;
	public static Item BronzeShovel;
	public static Item BronzePickaxe;
	public static Item BronzeHoe;
	public static Item BronzeSword;
	public static Item BronzeHammer;
	public static Item PlatinumBlade;
	public static Item PlatinumHilt;
	public static Item PlatinumGuard;
	public static Item PlatinumAxe;
	public static Item PlatinumShovel;
	public static Item PlatinumPickaxe;
	public static Item PlatinumHoe;
	public static Item PlatinumSword;
	public static Item PlatinumHammer;
	public static Item GoldBlade;
	public static Item GoldHilt;
	public static Item GoldGuard;
	public static Item GoldSheild;
	public static Item GoldAxe;
	public static Item GoldShovel;
	public static Item GoldPickaxe;
	public static Item GoldHoe;
	public static Item GoldSword;
	public static Item GoldHammer;
	public static Item TitaniumHammer;
	public static Item MithrilBlade;
	public static Item MithrilHilt;
	public static Item MithrilGuard;
	public static Item MithrilSheild;
	public static Item MithrilTools;
	public static Item MithrilWeapons;
	public static Item MithrilHammer;
	//masters anvil
	public static Block MatersAnvil;
	public static Item OrichalcumHammer;
	public static Item OrichalcumBlade;
	public static Item OrichalcumHilt;
	public static Item OrichalcumGuard;
	public static Item OrichalcumSheild;
	public static Item OrichalcumTools;
	public static Item OrichalcumWeapons;
	public static Item Mjolnir;
	//machines
	public static Block MineralGrinder;
	public static Block ElectricFoundry;
	public static Block IndustrialFoundry;
	public static Block Analyzer;
	public static Block CoalGenerator;
	public static Block PowerCell;
	public static Block AdvancedWindmill;
	public static Block HydroTurbine;
	public static Block SolarPanel;
	public static Block GeneticAnalyzer;
	public static Block GeneticIncubator;
	public static Block Computer;
	public static Block ChargeAbsorber;
	public static Block GPS;
	public static Block TransportPipes;
	public static Block ConveyorBelts;
	//components
	public static Item Wire;
	public static Item SolarCollector;
	public static Item CircuitBoards;
	public static Item MachineCasing;
	public static Item LightingRod;
	public static Item Compost;
	public static Block Scaffolding;
	public static Item Wax;
	public static Block Candle;
	//winderness
	public static Block Waterwhell; 
	public static Block Windmill;
	public static Block GrindingWheel;
	public static Block CompostPoweredGenerator;
	public static Block CreatureTracker;
	public static Block TrackingDevice;
	public static Block CreatureAnalyzer;
	public static Block ResinExtractor;
	public static Block SurvivalKit;
	public static Block SurvivalSupplies;
	public static Block NewFoodRecipes;
	public static Block AutomatedTreeChopper;
	public static Block Gatherer;
	public static Block CrudeTools;
	//advanced enchanting
	public static Block ArcaneEnchantingTable;
	public static Item SpellBook;
	public static Item SpellBoookEnchanted;
	public static Item AncientScroll;
	public static Item AnalyzedScroll;
	public static Block ScrollReasearchTable;
	public static Item WeaponPartEnchants;
	public static Item ArcaneMetals;
	//tools
	public static Item Wrench;
	public static Item WireCutters;
	public static Item PowerTools;


@EventHandler
public void preInit(FMLInitializationEvent event){
	// world generation
		GameRegistry.registerWorldGenerator(new WorldGeneratorWWCMod());
	// ore blocks
	    copperore= new CopperOre(2501, "copperore").setUnlocalizedName("copperore").setHardness(2.0F).setStepSound(Block.soundMetalFootstep).setResistance(10.0F);
		GameRegistry.registerBlock(copperore, "copperore");
		LanguageRegistry.addName(copperore, "Copper Ore");

		tinore= new TinOre(2502, "tinore").setUnlocalizedName("tinore").setHardness(2.0F).setStepSound(Block.soundMetalFootstep).setResistance(10.0F);
		GameRegistry.registerBlock(tinore, "tinore");
		LanguageRegistry.addName(tinore, "Tin Ore");
		
		silverore= new SilverOre(2503, "silverore").setUnlocalizedName("silverore").setHardness(2.0F).setStepSound(Block.soundMetalFootstep).setResistance(10.0F);
		GameRegistry.registerBlock(silverore, "silverore");
		LanguageRegistry.addName(silverore, "Silver Ore");
		
		platinumore= new PlatinumOre(2504, "platinumore").setUnlocalizedName("platinumore").setHardness(2.0F).setStepSound(Block.soundMetalFootstep).setResistance(10.0F);
		GameRegistry.registerBlock(platinumore, "platinumore");
		LanguageRegistry.addName(platinumore, "Platinum Ore");
		
		mithrilore= new MithrilOre(2505, "mithrilore").setUnlocalizedName("mithrilore").setHardness(2.0F).setStepSound(Block.soundMetalFootstep).setResistance(10.0F);
		GameRegistry.registerBlock(mithrilore, "mithrilore");
		LanguageRegistry.addName(mithrilore, "Mithril Ore");

		orichalcumore= new OrichalcumOre(2506, "orichalcumore").setUnlocalizedName("orichalcumore").setHardness(2.0F).setStepSound(Block.soundMetalFootstep).setResistance(10.0F);
		GameRegistry.registerBlock(orichalcumore, "orichalcumore");
		LanguageRegistry.addName(orichalcumore, "Orichalcum Ore");
		
	// ingots items
		copper = new Ingot(2507).setUnlocalizedName("copper");
		LanguageRegistry.addName(copper, "Copper Ingot");
		
		tin = new Ingot(2508).setUnlocalizedName("tin");
		LanguageRegistry.addName(tin, "Tin Ingot");
		
		silver = new Ingot(2509).setUnlocalizedName("silver");
		LanguageRegistry.addName(silver, "Silver Ingot");
		
		platinum = new Ingot(2510).setUnlocalizedName("platinum");
		LanguageRegistry.addName(platinum, "Platinum Ingot");
		
		mithril = new Ingot(2511).setUnlocalizedName("mithril");
		LanguageRegistry.addName(mithril, "Mithril Ingot");
		
		orichalcum = new Ingot(2512).setUnlocalizedName("orichalcum");
		LanguageRegistry.addName(orichalcum, "Orichalcum Ingot");
		
		bronze = new Ingot(2513).setUnlocalizedName("bronze");
		LanguageRegistry.addName(bronze, "Bronze Ingot");
		
		steel = new Ingot(2514).setUnlocalizedName("steel");
		LanguageRegistry.addName(steel, "Steel Ingot");
		
		titanium = new Ingot(2515).setUnlocalizedName("titanium");
		LanguageRegistry.addName(titanium, "Titanium Ingot");
		
	//tools
		MithrilAxe = new WWCModAxe(2516, EnumToolMaterialMithril).setUnlocalizedName("mithrilaxe");
		MithrilShovel = new WWCModShovel(2517, EnumToolMaterialMithril).setUnlocalizedName("mithrilshovel");
		MithrilPickaxe = new WWCModPickaxe(2518, EnumToolMaterialMithril).setUnlocalizedName("mithrilpick");
		MithrilHoe = new WWCModHoe(2519, EnumToolMaterialMithril).setUnlocalizedName("mithrilhoe");
		MithrilSword = new WWCModSword(2520, EnumToolMaterialMithril).setUnlocalizedName("mithrilsword");
		LanguageRegistry.addName(MithrilAxe, "Mithril Axe");
		LanguageRegistry.addName(MithrilShovel, "Mithril Spade");
		LanguageRegistry.addName(MithrilPickaxe, "Mithril Pickaxe");
		LanguageRegistry.addName(MithrilSword, "Mithril Sword");
		LanguageRegistry.addName(MithrilHoe, "Mithril Hoe");
		
		OrichalcumAxe = new WWCModAxe(2521, EnumToolMaterialOrichalcum).setUnlocalizedName("orichalcumaxe");
		OrichalcumShovel = new WWCModShovel(2522, EnumToolMaterialOrichalcum).setUnlocalizedName("orichalcumshovel");
		OrichalcumPickaxe = new WWCModPickaxe(2523, EnumToolMaterialOrichalcum).setUnlocalizedName("orichalcumpick");
		OrichalcumHoe = new WWCModHoe(2524, EnumToolMaterialOrichalcum).setUnlocalizedName("orichalcumhoe");
		OrichalcumSword = new WWCModSword(2525, EnumToolMaterialOrichalcum).setUnlocalizedName("orichalcumsword");
		LanguageRegistry.addName(OrichalcumAxe, "Orichalcum Axe");
		LanguageRegistry.addName(OrichalcumShovel, "Orichalcum Spade");
		LanguageRegistry.addName(OrichalcumPickaxe, "Orichalcum Pickaxe");
		LanguageRegistry.addName(OrichalcumSword, "Orichalcum Sword");
		LanguageRegistry.addName(OrichalcumHoe, "Orichalcum Hoe");
		
		IronAxe = new WWCModAxe(2526,EnumToolMaterialIron).setUnlocalizedName("ironaxe");
		IronShovel = new WWCModShovel(2527,EnumToolMaterialIron).setUnlocalizedName("ironshovel");
		IronPickaxe = new WWCModPickaxe(2528,EnumToolMaterialIron).setUnlocalizedName("ironpickaxe");
		IronHoe = new WWCModHoe(2529,EnumToolMaterialIron).setUnlocalizedName("ironhoe");
		IronSword = new WWCModSword(2530,EnumToolMaterialIron).setUnlocalizedName("ironsword");
		LanguageRegistry.addName(IronAxe, "Iron Axe");
		LanguageRegistry.addName(IronShovel, "Iron Shovel");
		LanguageRegistry.addName(IronPickaxe, "Iron Pickaxe");
		LanguageRegistry.addName(IronHoe, "Iron Hoe");
		LanguageRegistry.addName(IronSword, "Iron Sword");
		
		SteelAxe = new WWCModAxe(2531,EnumToolMaterialSteel).setUnlocalizedName("steelaxe");
		SteelShovel = new WWCModShovel(2532,EnumToolMaterialSteel).setUnlocalizedName("steelshovel");
		SteelPickaxe = new WWCModPickaxe(2533,EnumToolMaterialSteel).setUnlocalizedName("steelpickaxe");
		SteelHoe = new WWCModHoe(2534,EnumToolMaterialSteel).setUnlocalizedName("steelhoe");
		SteelSword = new WWCModSword(2535,EnumToolMaterialSteel).setUnlocalizedName("steelsword");
		LanguageRegistry.addName(SteelAxe, "Steel Axe");
		LanguageRegistry.addName(SteelShovel, "Steel Shovel");
		LanguageRegistry.addName(SteelPickaxe, "Steel Pickaxe");
		LanguageRegistry.addName(SteelHoe, "Steel Hoe");
		LanguageRegistry.addName(SteelSword, "Steel Sword");
		
		BronzeAxe = new WWCModAxe(2536,EnumToolMaterialBronze).setUnlocalizedName("bronzeaxe");
		BronzeShovel = new WWCModShovel(2537,EnumToolMaterialBronze).setUnlocalizedName("bronzeshovel");
		BronzePickaxe = new WWCModPickaxe(2538,EnumToolMaterialBronze).setUnlocalizedName("bronzepickaxe");
		BronzeHoe = new WWCModHoe(2539,EnumToolMaterialBronze).setUnlocalizedName("bronzehoe");
		BronzeSword = new WWCModSword(2540,EnumToolMaterialBronze).setUnlocalizedName("bronzesword");
		LanguageRegistry.addName(BronzeAxe, "Bronze Axe");
		LanguageRegistry.addName(BronzeShovel, "Bronze Shovel");
		LanguageRegistry.addName(BronzePickaxe, "Bronze Pickaxe");
		LanguageRegistry.addName(BronzeHoe, "Bronze Hoe");
		LanguageRegistry.addName(BronzeSword, "Bronze Sword");
		
		PlatinumAxe = new WWCModAxe(2541,EnumToolMaterialPlatinum).setUnlocalizedName("platinumaxe");
		PlatinumShovel = new WWCModShovel(2542,EnumToolMaterialPlatinum).setUnlocalizedName("platinumshovel");
		PlatinumPickaxe = new WWCModPickaxe(2543,EnumToolMaterialPlatinum).setUnlocalizedName("platinumpickaxe");
		PlatinumHoe = new WWCModHoe(2544,EnumToolMaterialPlatinum).setUnlocalizedName("platinumhoe");
		PlatinumSword = new WWCModSword(2545,EnumToolMaterialPlatinum).setUnlocalizedName("platinumsword");
		LanguageRegistry.addName(PlatinumAxe, "Platinum Axe");
		LanguageRegistry.addName(PlatinumShovel, "Platinum Shovel");
		LanguageRegistry.addName(PlatinumPickaxe, "Platinum Pickaxe");
		LanguageRegistry.addName(PlatinumHoe, "Platinum Hoe");
		LanguageRegistry.addName(PlatinumSword, "Platinum Sword");
		
		GoldAxe = new WWCModAxe(2546,EnumToolMaterialGold).setUnlocalizedName("goldaxe");
		GoldShovel = new WWCModShovel(2547,EnumToolMaterialGold).setUnlocalizedName("goldshovel");
		GoldPickaxe = new WWCModPickaxe(2548,EnumToolMaterialGold).setUnlocalizedName("goldpickaxe");
		GoldHoe = new WWCModHoe(2549,EnumToolMaterialGold).setUnlocalizedName("goldhoe");
		GoldSword = new WWCModSword(2550,EnumToolMaterialGold).setUnlocalizedName("goldsword");
		LanguageRegistry.addName(GoldAxe, "GoldAxe");
		LanguageRegistry.addName(GoldShovel, "Gold Shovel");
		LanguageRegistry.addName(GoldPickaxe, "Gold Pickaxe");
		LanguageRegistry.addName(GoldHoe, "Gold Hoe");
		LanguageRegistry.addName(GoldSword, "Gold Sword");
		
	//weapon and tool parts
		IronBlade = new Parts(2551).setUnlocalizedName("ironblade");
		IronHilt = new Parts(2552).setUnlocalizedName("ironhilt");
		IronGuard = new Parts(2553).setUnlocalizedName("ironguard");
		IronSheild = new Parts(2554).setUnlocalizedName("ironsheild");
		LanguageRegistry.addName(IronBlade, "Iron Blade");
		LanguageRegistry.addName(IronHilt, "Iron Hilt");
		LanguageRegistry.addName(IronGuard, "Iron Guard");
		LanguageRegistry.addName(IronSheild, "Iron Sheild");
		
		SteelBlade = new Parts(2555).setUnlocalizedName("steelblade");
		SteelHilt = new Parts(2556).setUnlocalizedName("steelhilt");
		SteelGuard = new Parts(2557).setUnlocalizedName("steelguard");
		SteelSheild = new Parts(2558).setUnlocalizedName("steelsheild");
		LanguageRegistry.addName(SteelBlade, "Steel Blade");
		LanguageRegistry.addName(SteelHilt, "Steel Hilt");
		LanguageRegistry.addName(SteelGuard, "Steel Guard");
		LanguageRegistry.addName(SteelSheild, "Steel Sheild");
		
		
	//crafting
		GameRegistry.addRecipe(new ItemStack(MithrilAxe,1), new Object[]{
			"MM ","MS "," S ",'M',mithril, 'S',Item.stick,});
		GameRegistry.addRecipe(new ItemStack(MithrilShovel,1), new Object[]{
			" M "," S "," S ",'M',mithril, 'S',Item.stick,});
		GameRegistry.addRecipe(new ItemStack(MithrilPickaxe,1), new Object[]{
			"MMM"," S "," S ",'M',mithril, 'S',Item.stick,});
		GameRegistry.addRecipe(new ItemStack(MithrilHoe,1), new Object[]{
			"MM "," S "," S ",'M',mithril, 'S',Item.stick,});
		GameRegistry.addRecipe(new ItemStack(MithrilSword,1), new Object[]{
			" M "," M "," S ",'M',mithril, 'S',Item.stick,});
		
		GameRegistry.addRecipe(new ItemStack(OrichalcumAxe,1), new Object[]{
			"OO ","OS "," S ",'O',orichalcum, 'S',Item.stick,});
		GameRegistry.addRecipe(new ItemStack(OrichalcumShovel,1), new Object[]{
			" O "," S "," S ",'O',orichalcum, 'S',Item.stick,});
		GameRegistry.addRecipe(new ItemStack(OrichalcumPickaxe,1), new Object[]{
			"OOO"," S "," S ",'O',orichalcum, 'S',Item.stick,});
		GameRegistry.addRecipe(new ItemStack(OrichalcumHoe,1), new Object[]{
			"OO "," S "," S ",'O',orichalcum, 'S',Item.stick,});
		GameRegistry.addRecipe(new ItemStack(OrichalcumSword,1), new Object[]{
			" O "," O "," S ",'O',orichalcum, 'S',Item.stick,});
	//smelting
		GameRegistry.addSmelting(copperore.blockID, new ItemStack(copper,1), 2.0F);
		GameRegistry.addSmelting(tinore.blockID, new ItemStack(tin,1), 2.0F);
		GameRegistry.addSmelting(silverore.blockID, new ItemStack(silver,1), 2.0F);
		GameRegistry.addSmelting(platinumore.blockID, new ItemStack(platinum,1), 2.0F);
		GameRegistry.addSmelting(mithrilore.blockID, new ItemStack(mithril,1), 2.0F);
		GameRegistry.addSmelting(orichalcumore.blockID, new ItemStack(orichalcum,1), 2.0F);
}	

}


