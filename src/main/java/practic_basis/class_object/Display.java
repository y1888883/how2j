package practic_basis.class_object;

/**
 * @author: bamboo on 20/12/12
 * @description: _
 */

public class Display {
    public static void main(String[] args) {
        Item bottle = new Item("血瓶", 50);
        Item shoes = new Item("草鞋", 300);
        Item sword = new Item("长剑", 350);
        System.out.println(bottle+"+"+shoes+sword);

    }
}
