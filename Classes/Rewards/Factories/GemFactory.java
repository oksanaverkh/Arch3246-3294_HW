package Classes.Rewards.Factories;

import Classes.IGameItem;
import Classes.ItemGenerator;
import Classes.Rewards.Rewards.Gem;

public class GemFactory extends ItemGenerator{

    /**
     * Returns new reward
     */
    @Override
    public IGameItem createItem() {
        return new Gem();
    }
    
}
