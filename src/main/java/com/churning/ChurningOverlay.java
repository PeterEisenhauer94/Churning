package com.churning;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.Graphics2D;
import java.util.Set;
import javax.inject.Inject;
import net.runelite.api.Client;
import static net.runelite.api.MenuAction.RUNELITE_OVERLAY_CONFIG;
import net.runelite.client.ui.overlay.OverlayMenuEntry;
import net.runelite.client.ui.overlay.OverlayPanel;
import net.runelite.client.ui.overlay.OverlayPosition;
import net.runelite.client.ui.overlay.OverlayPriority;
import net.runelite.client.ui.overlay.components.LineComponent;
import net.runelite.client.util.ColorUtil;

public class ChurningOverlay extends OverlayPanel
{
    private final Client client;
    private final ChurningConfig config;
    private final ChurningPlugin plugin;

    @Inject
    private ChurningOverlay(Client client, ChurningConfig config, ChurningPlugin plugin)








}
