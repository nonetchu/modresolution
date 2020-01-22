package (MOD IMPL CLASS);

import (SCREEN POSITION CLASS);
import (MOD DRAGGABLE CLASS);

public class ModResolution extends ModDraggable{
	
	private ScreenPosition pos;
	
	@Override
	public int getWidth() {
		return font.getStringWidth("Resolution: " + mc.displayHeight);
	}

	@Override
	public int getHeight() {
		return font.FONT_HEIGHT;
	}

	@Override
	public void render(ScreenPosition pos) {
		font.drawStringWithShadow("Resolution: " + mc.displayHeight, pos.getAbsoluteX() + 1, pos.getAbsoluteY() + 1, -1);
		
	}
	
	public void renderDummy(ScreenPosition pos) {
		font.drawStringWithShadow("Resolution: " + mc.displayHeight, pos.getAbsoluteX() + 1, pos.getAbsoluteY() + 1, -1);
	}

	@Override
	public void save(ScreenPosition pos) {
		this.pos = pos;
		
	}

	@Override
	public ScreenPosition load() {
		return pos;
	}
  
  //I didn't set up saving position, sorry.

}
