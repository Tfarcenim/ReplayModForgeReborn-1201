package com.replaymod.lib.de.johni0702.minecraft.gui.element.advanced;

import com.replaymod.lib.de.johni0702.minecraft.gui.container.GuiContainer;

public class GuiTimelineTime<U extends AbstractGuiTimeline<U>> extends AbstractGuiTimelineTime<GuiTimelineTime<U>, U> {
   public GuiTimelineTime() {
   }

   public GuiTimelineTime(GuiContainer container) {
      super(container);
   }

   protected GuiTimelineTime<U> getThis() {
      return this;
   }
}
