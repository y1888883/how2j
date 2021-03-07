package practic_basis.method;

/**
 * @author: bamboo on 20/12/19
 * @description: _为英雄类Hero设计几个新的方法：
 * 1. 超神 legendary(),无参数，无返回类型
 * 2. 获取当前的血量 getHp(), 无参数，有float类型的返回值
 * 3. 回血 recovery(float blood)， 有参数 float类型参数 blood表示本次恢复的血量，无返回类型
 */

public class Hero {
    String name;
    float hp;
    int moveSpeed;

    public Hero() {

    }

    public Hero(String name, float hp, int moveSpeed) {
        this.name = name;
        this.hp = hp;
        this.moveSpeed = moveSpeed;
    }


    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public float getHp() {
        return hp;
    }

    public void setHp(float hp) {
        this.hp = hp;
    }

    public int getMoveSpeed() {
        return moveSpeed;
    }

    public void setMoveSpeed(int moveSpeed) {
        this.moveSpeed = moveSpeed;
    }

    void legendary() {
        System.out.println("超神了");
    }

    void recovery(float blood) {
        hp = hp + blood;
    }

    public static void main(String[] args) {
        Hero garen = new Hero();
        garen.name = "盖伦";
        garen.hp = 500;
        System.out.println("当前血量是" + garen.hp);



    }

}
