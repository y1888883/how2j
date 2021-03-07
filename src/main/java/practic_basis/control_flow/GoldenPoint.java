package practic_basis.control_flow;

/**
 * @author: bamboo on 21/1/4
 * @description: _
 * 寻找某两个数相除，其结果 离黄金分割点 0.618最近
 * 分母和分子不能同时为偶数
 * 分母和分子 取值范围在[1-20]
 */

public class GoldenPoint {

    public static void main(String[] args) {
        float point = 0.618f;
        float min = 0;
        for (int i = 1; i < 21; i++) {
            for (int j = 1; j < 21; j++) {
                if ((i % 2 == 0) ^ (j % 2 == 0)) {
                    float res = (float) i / j;
                    float diff = res - point;
                    diff = diff < 0 ? 0 - diff : diff;
//                   这里要判断这个差值是最小的
                 /*   if () {
                    }
*/
                }
            }
        }
    }

}
