import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.concurrent.ThreadLocalRandom;

import Classes.ItemGenerator;
import Classes.Rewards.Factories.BronzeFactory;
import Classes.Rewards.Factories.EmeraldFactory;
import Classes.Rewards.Factories.GemFactory;
import Classes.Rewards.Factories.GoldFactory;
import Classes.Rewards.Factories.RubyFactory;
import Classes.Rewards.Factories.SapphireFactory;
import Classes.Rewards.Factories.SilverFactory;

public class App {
    public static void main(String[] args) throws Exception{
        /**
         * Creature of new factory that creates new reward
         */
        ItemGenerator factory1 = new GoldFactory();
        ItemGenerator factory2 = new GemFactory();
        ItemGenerator factory3 = new BronzeFactory();
        ItemGenerator factory4 = new EmeraldFactory();
        ItemGenerator factory5 = new RubyFactory();
        ItemGenerator factory6 = new SapphireFactory();
        ItemGenerator factory7 = new SilverFactory();

        /**
         * Creature of randomizer to make random display of rewards
         */
        Random rnd = ThreadLocalRandom.current();

        /**
         * Adding newly creared factories to list
         */
        List<ItemGenerator> factoryList = new ArrayList<>();
        factoryList.add(factory1);
        factoryList.add(factory2);
        factoryList.add(factory3);
        factoryList.add(factory4);
        factoryList.add(factory5);
        factoryList.add(factory6);
        factoryList.add(factory7);

        /**
         * Cycle for random displaying of rewards
         */
        for (int i = 0; i < 20; i++) {
            int index = rnd.nextInt(0, factoryList.size());
            factoryList.get(index).openReward();
        }

    }
}
