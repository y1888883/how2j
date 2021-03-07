package practic_basis.control_flow;

/**
 * @author: bamboo on 21/1/8
 * @description: _
 * x+y=8
 * i-j=6
 * x+i=14
 * y+j=6
 * x+y+i=17
 * x+y=8 i=9 j=2 y=4 x=4
 */

public class Sum {
    public static void main(String[] args) {
        for (int x = 0; x < 10; x++) {
            for (int y = 0; y < 10; y++) {
                for (int i = 0; i < 10; i++) {
                    for (int j = 0; j < 10; j++) {
                        if (x + y == 8 && i - j == 6 && x + i == 14 && y + j == 6) {
                            System.out.println("x--" + x + " y--" + y + " i--" + i + " j--" + j);

                        }
                    }

                }
            }
        }

    }
}
