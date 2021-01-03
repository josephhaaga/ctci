public class Q3 {
    String urlify(String in, int trueLength) {
        char[] characters = new char[trueLength];
        for (int i = 0; i < trueLength; i++) {
            characters[i] = (in.charAt(i) == ' ' ? "%20" : in.charAt(i));
        }
        return characters.toString();
    }
    public static void main(String[] args) {
        Q3 solver = new Q3();
        System.out.println(solver.urlify("Joseph Haaga", 12));
    }
}
