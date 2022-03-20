import java.util.ArrayList;
import java.util.List;

public class Main {

    public static void main(String[] args) {

        List<CompositeBlock> blocks = new ArrayList<>();

        BlockImpl block1 = new BlockImpl("red", "clay");
        BlockImpl block2 = new BlockImpl("brown", "dirt");

        CompositeBlockImpl compositeBlock = new CompositeBlockImpl("blue", "dirt", 3);

        blocks.add(block1);
        blocks.add(block2);
        blocks.add(compositeBlock);

        Wall wall = new Wall(blocks);

        System.out.println(wall.findBlockByColor("brown"));
        System.out.println(wall.findBlocksByMaterial("dirt"));
        System.out.println(wall.count());


    }
}
