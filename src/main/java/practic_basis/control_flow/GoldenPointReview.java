package practic_basis.control_flow;

/**
 * @author: bamboo on 21/5/12
 * @description: _
 * 寻找某两个数相除，其结果 离黄金分割点 0.618最近
 * 分母和分子不能同时为偶数
 * 分母和分子 取值范围在[1-20]
 * 再做！！！
 * 先找到思路
 * 首先分子除以分母=value
 * 分割点是0.618
 * 用value-0.618，小于0用0-diff:diff
 * 然后求最大值
 */

public class GoldenPointReview {
    public static void main(String[] args) {
        float point = 0.618f;
        float max = 100;
        for (float i = 1; i < 21.0; i++) {
            for (float j = 1; j < 21.0; j++) {
                if (i % 2 == 0 || j % 2 == 0) {
//              我先拿到了值
                    float value = i / j;
                    float diff = value - point;
                    diff = diff < 0 ? 0 - diff : diff;
                    if (point < 0.618) {


                    }


                }
            }
        }
        System.out.println(max);
    }
}
