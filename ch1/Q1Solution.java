public class Q1Solution {
    boolean isUniqueChars(String str) {
        int checker = 0;
        for (int i = 0; i < str.length(); i++) {
            int val = str.charAt(i) - 'a';
            if ((checker & (1 << val)) > 0) {
                return false;
            }
            checker |= (1 << val);
        }
        return true;
    }

    public static void main(String[] args) {
        Q1Solution a = new Q1Solution();
        System.out.println(a.isUniqueChars("joe"));
        System.out.println(a.isUniqueChars("joej"));
    }
}
