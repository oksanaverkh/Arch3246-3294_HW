package Classes.Rewards.Factories;

import Classes.IGameItem;
import Classes.ItemGenerator;
import Classes.Rewards.Rewards.Ruby;

public class RubyFactory extends ItemGenerator{
    /**
     * Returns new reward
     */
    @Override
    public IGameItem createItem() {
        return new Ruby();
    }
}
