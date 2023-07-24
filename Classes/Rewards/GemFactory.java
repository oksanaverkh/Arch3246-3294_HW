package Classes.Rewards;

import Classes.IGameItem;
import Classes.ItemGenerator;

public class GemFactory extends ItemGenerator{

    @Override
    public IGameItem createItem() {
        return new Gem();
    }
    
}
