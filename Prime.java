package assignment3;

public class Prime {
    public static void main(String[] args) {
        System.out.println("The prime numbers from 1 to 30 are:");
        for (int i = 2; i <=30 ; i++) {
            if(i==2){
                System.out.println(2);
                continue;
            }
            boolean f=true;
            for (int j = 2; j <= Math.sqrt(i) ; j++) {
                if(i%j==0 || i%(i/j)==0){
                    f=false;
                    break;
                }
            }
            if(f)
                System.out.println(i);
        }
    }
}
