package ex01_2;

public class Roman {

    public static String toRoman(int number) {
        if (number < 1 || 20 < number) {
            return "変換できません";
        }

        int x = number / 10;
        int i = number % 10;

        String roman = repeat("X", x);
        if (i == 9) {
            roman += "IX";
        } else if (i == 4) {
            roman += "IV";
        } else {
            int v = i / 5;
            roman += repeat("V", v);
            i %= 5;
            roman += repeat("I", i);
        }

        return roman;
    }

    /**
     * 指定した文字列を繰り返した文字列を生成する。
     *
     * @param s 繰り返す文字列
     * @param times 繰り返す回数
     * @return 指定した回数繰り返した文字列
     */
    private static String repeat(String s, int times) {
        StringBuffer sb = new StringBuffer();
        for (int i = 0; i < times; i++) {
            sb.append(s);
        }
        return sb.toString();
    }
}
