public class Q2 {
    boolean isPermutation(String a, String b) {
        if (a.length() != b.length()) return false;
        int[] charArray = new int[128]; // ASCII
        for (int i=0; i < a.length(); i++){
            charArray[a.charAt(i)] += 1;
        }
        for (int j=0; j < b.length(); j++){
            charArray[b.charAt(j)] -= 1;
            if (charArray[b.charAt(j)] < 0) {
                return false;
            }
        }
        return true;
    }

    public static void main(String[] args) {
        Q2 solver = new Q2();
        System.out.println(solver.isPermutation("abc", "cba"));
        System.out.println(solver.isPermutation("abc", "cbad"));
    }
}
