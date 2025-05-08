public class alphabet_increment {
    public static void main(String[] args) {
                char ch='A';
        for(int i=1;i<6;i++){
            ch='A';
            for(int j=0;j<i;j++){
                System.out.print(ch);
                ch++;
            }
            System.out.println();
        }
    }
}
