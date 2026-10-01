package potatowolfie.web.world.feature;

import com.mojang.serialization.MapCodec;
import net.minecraft.core.Registry;
import net.minecraft.core.registries.BuiltInRegistries;
import net.minecraft.resources.Identifier;
import potatowolfie.web.Web;
import potatowolfie.web.world.feature.custom.SpiderEggClusterFeature;

public class WebFeatures {

    public static final MapCodec<SpiderEggClusterFeature> SPIDER_EGG_CLUSTER =
            Registry.register(BuiltInRegistries.FEATURE_TYPE,
                    Identifier.fromNamespaceAndPath(Web.MOD_ID, "spider_egg_cluster"),
                    SpiderEggClusterFeature.CODEC);

    public static void registerFeatures() {
        Web.LOGGER.info("Registering Web Features");
    }
}