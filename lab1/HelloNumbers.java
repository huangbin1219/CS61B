public class HelloNumbers {
    public static void main(String[] args) {
        int x = 0;
        int sum=0;
        while (x < 10) {
            int s=0;
            for(int j=0;j<=x;j++){
                s+=j;

            }
            System.out.print(s+" ");
            ++x;
        }
    }
}