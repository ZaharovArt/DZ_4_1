public class Main {

    public static void main(String[] args) {

        int i=0;
        int j=1;
        int temp=0;

        for (i=0, j=1; i+j<1000000; i=j,j=temp){

        System.out.println(temp=i+j);

        }
    }
}