package com.churning;

import net.runelite.client.config.Config;
import net.runelite.client.config.ConfigGroup;
import net.runelite.client.config.ConfigItem;

@ConfigGroup("Churning")
public interface ChurningConfig extends Config
{
	@ConfigItem(
		keyName = "DisplayOverlay",
		name = "Churning Overlay",
		description = "Determines whether to show the churning overlay or not",
		position = 1
	)
	default boolean DisplayOverlay()
	{
		return false;
	}
}
