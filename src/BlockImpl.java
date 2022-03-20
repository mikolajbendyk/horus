import java.util.Collections;
import java.util.List;

public class BlockImpl implements Block, CompositeBlock {
    private String color;
    private String material;

    public BlockImpl(String color, String material) {
        this.color = color;
        this.material = material;
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
        return Collections.singletonList(this);
    }

    @Override
    public String toString() {
        return "BlockImpl{" +
                "color='" + color + '\'' +
                ", material='" + material + '\'' +
                '}';
    }
}
