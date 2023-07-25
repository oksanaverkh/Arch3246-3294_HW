package Classes.Rewards.Factories;

import Classes.IGameItem;
import Classes.ItemGenerator;
import Classes.Rewards.Rewards.Sapphire;

public class SapphireFactory extends ItemGenerator{
    /**
     * Returns new reward
     */
    @Override
    public IGameItem createItem() {
        return new Sapphire();
    }
}
