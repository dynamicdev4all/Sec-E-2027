public class CountWords {
    public static void main(String[] args) {
        String str = "This      is             sec e from RDEC";
        int count = 0;
        for (int i = 0; i < str.length(); i++) {
            if(str.charAt(i) == ' ' && str.charAt(i + 1) != ' '){
               count++; 
            }
        }
        System.out.println(0x12);
    }
}
