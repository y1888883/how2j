package practic_basis.class_object;

/**
 * @author: bamboo on 21/4/26
 * @description: _
 */

public class Test {
    private Item item;

    public Item before(Shoes shoes) {
        item.setName(shoes.getName());
        return item;
    }

    public void add(Shoes shoes) {
        item = before(shoes);
    }
}
