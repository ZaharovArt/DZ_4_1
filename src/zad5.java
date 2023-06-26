public class zad5 {
    public static void main(String[] args){

        int num = 123454321;
        int k=0;
        boolean nechet=false;
        int num2;
        int tmp=num;
        while (tmp>0){
        tmp /= 10;
        k++;

        }
        System.out.println(k);
        num2=k/2;

        if (k%2 != 0){
            nechet=true;
        }

        int kratno = (int) Math.pow(10,num2);
        int leftPart=0;
        int rightPart=0;
        System.out.println(kratno);

        System.out.println(num2);

        if (nechet) {

            leftPart = num/(kratno*10);
        }
        else {
            leftPart = num/kratno;
        }
        System.out.println(num);
        System.out.println(leftPart);

        rightPart=num%kratno;
        System.out.println(rightPart);
        int count=0;
        for(int i=0; i<num2;i++){
        int r=rightPart%10;
        int l= (int)( leftPart/Math.pow(10,k-i-1));

        }
    }
}
