package potatowolfie.web.world.feature;

import net.minecraft.core.registries.Registries;
import net.minecraft.data.worldgen.BootstrapContext;
import net.minecraft.resources.Identifier;
import net.minecraft.resources.ResourceKey;
import net.minecraft.world.level.levelgen.feature.Feature;
import potatowolfie.web.Web;
import potatowolfie.web.world.feature.custom.SpiderEggClusterFeature;

public class WebConfiguredFeatures {

    public static final ResourceKey<Feature> SPIDER_EGG_CLUSTER_KEY =
            registerKey("spider_egg_cluster");

    public static void bootstrap(BootstrapContext<Feature> context) {
        context.register(SPIDER_EGG_CLUSTER_KEY, new SpiderEggClusterFeature(10, 15, 8, 0.6f));
    }

    public static ResourceKey<Feature> registerKey(String name) {
        return ResourceKey.create(Registries.FEATURE, Identifier.fromNamespaceAndPath(Web.MOD_ID, name));
    }
}