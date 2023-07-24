import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.concurrent.ThreadLocalRandom;

import Classes.ItemGenerator;
import Classes.Rewards.GemFactory;
import Classes.Rewards.GoldFactory;

public class App {
    public static void main(String[] args) throws Exception{
        ItemGenerator factory1 = new GoldFactory();
        factory1.openReward();
        ItemGenerator factory2 = new GemFactory();
        factory2.openReward();

        Random rnd = ThreadLocalRandom.current();
        List<ItemGenerator> factoryList = new ArrayList<>();
        factoryList.add(factory1);
        factoryList.add(factory2);

        for (int i = 0; i < 20; i++) {
            int index = Math.abs(rnd.nextInt()%2==0?0:1);
            factoryList.get(index).openReward();
        }

    }
}
