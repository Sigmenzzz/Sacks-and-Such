package mod.traister101.sns;

import mod.traister101.sns.util.handlers.PickupHandler;

import net.minecraftforge.common.MinecraftForge;
import net.minecraftforge.eventbus.api.IEventBus;

import lombok.experimental.UtilityClass;

@UtilityClass
public final class ForgeEventHandler {

	public static void init() {
		final IEventBus eventBus = MinecraftForge.EVENT_BUS;

		eventBus.addListener(PickupHandler::onPickupItem);
		eventBus.addListener(PickupHandler::onBlockActivated);
	}
}