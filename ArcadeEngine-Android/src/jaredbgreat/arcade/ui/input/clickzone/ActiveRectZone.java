package jaredbgreat.arcade.ui.input.clickzone;

import jaredbgreat.arcade.ui.input.PointerEvent;

/**
 *
 * @author Jared Blackburn
 */
public class ActiveRectZone extends RectZone implements IActiveViewZone {
    private IZoneAction action;
    

    public ActiveRectZone(int x, int y, int w, int h) {
        super(x, y, w, h);
    }
    
    
    public void setAction(IZoneAction act) {
        action = act;
    }
    
    
    public void activate(PointerEvent e) {
        if(isActivated(e)) {
            action.activate(e);
        }
    }
    
}