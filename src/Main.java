

public class Main {
    public static void main(String[] args) {
        int counter=0;
        int flag = 0;
        for (int i = 1; i < 1000 ; i++) {
            for (int j = 2; j < i; j++) {
                if ((i%j)==0) {
                    flag = 1;
                    break;
                }
            }
            if (flag==0) {
                System.out.println(i+" ");
                counter++;
            }
            flag=0;
        }
        System.out.println();
        System.out.println("There are "+counter+" prime numbers up to 1000.");

    }
}