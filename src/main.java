//Учитывая число n, вернуть количество положительных нечетных чисел ниже n!
class Kata {

    public static int oddCount(int n){
        return (n/2);
        /*int c = 0;
        for(int i=1; i< n; i++){
            if(i%2!=0){
                c ++;
            }
        }
        return c;*/
    }

}
//Завершите функцию квадратной суммы, чтобы она возводила в квадрат каждое переданное ей число, а затем суммировала результаты.
 class Kata1
{
    public static int squareSum(int[] n)
    {
        int c = 0;
        for(int i=0; i< n.length; i++){
            c += n[i]*n[i];
        }
        return c;
    }
}

public class main {
    public static void main(String[] args) {
        int c = Kata.oddCount(15);
        System.out.println(c);

        int c1 = Kata1.squareSum(new int[] {1,2,2});
        System.out.println(c1);
    }
}
