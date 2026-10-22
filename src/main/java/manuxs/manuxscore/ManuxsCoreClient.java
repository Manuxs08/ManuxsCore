package manuxs.manuxscore;

import net.fabricmc.api.ClientModInitializer;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class ManuxsCoreClient implements ClientModInitializer {
    public static final Logger LOGGER = LoggerFactory.getLogger(ManuxsCore.MOD_ID);

    @Override
    public void onInitializeClient() {
        LOGGER.info("Manuxs Core Client Initialized");
    }
}
