import java.util.ArrayList;
import java.util.List;

public class CompositeBlockImpl implements CompositeBlock {
    private String color;
    private String material;
    private List<Block> blocks = new ArrayList<>();

    public CompositeBlockImpl(String color, String material, int numberOfBlocks) {
        this.color = color;
        this.material = material;
        addBlocks(blocks, numberOfBlocks);
    }

    @Override
    public String getColor() {
        return color;
    }

    @Override
    public String getMaterial() {
        return material;
    }

    @Override
    public List<Block> getBlocks() {
        return blocks;
    }

    @Override
    public String toString() {
        return "CompositeBlockImpl{" +
                "color='" + color + '\'' +
                ", material='" + material + '\'' +
                ", blocks=" + blocks +
                '}';
    }

    private void addBlocks(List<Block> newBlocks, int numberOfBlocks) {
        for (int i = 0; i < numberOfBlocks; i++) {
            newBlocks.add(new BlockImpl(color, material));
        }
    }
}
