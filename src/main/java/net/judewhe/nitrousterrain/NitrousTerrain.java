package net.judewhe.nitrousterrain;

import net.fabricmc.api.ModInitializer;

import net.minecraft.resources.Identifier;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class NitrousTerrain implements ModInitializer {
	public static final String MOD_ID = "nitrous-terrain";
	public static final Logger LOGGER = LoggerFactory.getLogger(MOD_ID);

	@Override
	// runs on start
	public void onInitialize() {
		System.out.println("Is the mod being loaded?");

		// calling all functions at start

	}

	public static Identifier id(String path) {
		return Identifier.fromNamespaceAndPath(MOD_ID, path);
	}
}
