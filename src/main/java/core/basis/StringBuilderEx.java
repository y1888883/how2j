package core.basis;

/**
 * @author: bamboo on 20/12/9
 * @description: _
 */

public class StringBuilderEx {
    public static void main(String[] args) {
        StringBuilder builder = new StringBuilder();
        StringBuilder br = builder.append(1).append("ge").append('人');
        br.appendCodePoint(49);
        System.out.println(br);
        System.out.println(br.toString());

    }
}
