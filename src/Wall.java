import java.util.List;
import java.util.Optional;

public class Wall implements Structure {
    private List<CompositeBlock> blocks;

    public Wall(List<CompositeBlock> blocks) {
        this.blocks = blocks;
    }

    @Override
    public Optional<Block> findBlockByColor(String color) {
        return blocks.stream()
                .filter(block -> block.getColor().equals(color))
                .map(block -> block.getBlocks())
                .flatMap(List::stream)
                .findAny();
    }

    @Override
    public List<Block> findBlocksByMaterial(String material) {
        return blocks.stream()
                .filter(block -> block.getMaterial().equals(material))
                .map(block -> block.getBlocks())
                .flatMap(List::stream)
                .toList();
    }

    @Override
    public int count() {
        return (int)blocks.stream().map(block -> block.getBlocks()).flatMap(List::stream).count();
    }

}
