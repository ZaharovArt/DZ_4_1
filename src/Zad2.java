public class Zad2 {
    public static void main(String[] args) {
            int x=1000000;

        for(int i = 2; i < x; ++i){
            int count = 0;
            for(int j = 2; j <=i && count < 2;++j){
                if(i%j==0){
                    ++count;
                }
            }
            if(count<2)
                System.out.println(i);
        }

    }

}
