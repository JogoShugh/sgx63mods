package com.sgx63.umm

import net.fabricmc.api.ModInitializer
import net.minecraft.resources.ResourceLocation
import org.slf4j.LoggerFactory

object Sgx63Umm : ModInitializer {
	const val MOD_ID: String = "sgx63-umm"

	private val LOGGER = LoggerFactory.getLogger(MOD_ID)

	override fun onInitialize() {
		// This code runs as soon as Minecraft is in a mod-load-ready state.
		// However, some things (like resources) may still be uninitialized.
		// Proceed with mild caution.

		LOGGER.info("Hello SGX63 Mods! Welcome to the Ultimate Mind Multiverse!")
	}

	fun id(path: String): ResourceLocation
		= ResourceLocation(MOD_ID, path)
}
