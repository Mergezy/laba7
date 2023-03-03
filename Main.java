import java.util.Scanner;

public class Main{
    public static void main(String[] arg){
        Scanner input = new Scanner(System.in);
        System.out.printf("Введите x: ");
        int x = input.nextInt();
        System.out.println();
        System.out.printf("Введите a: ");
        int a = input.nextInt();
        System.out.println();
        System.out.printf("Введите b: ");
        int b = input.nextInt();
        System.out.println();

        Calc n1 = new Calc(x,a,b);

        n1.sum();
        n1.getResult();

        n1.division();
        n1.getResult();

        n1.factorial();
        n1.getResult();
    }
    /*
1) y=3x+5
2) y=(a+b)/(a-b)
3) y=(ax/b)!
 */
    static class Calc{
        String s1;
        int x, a, b, error,y;
        public Calc(int x, int a, int b){
            this.x = x;
            this.a = a;
            this.b = b;
        }
        public void sum(){
            y = 3*x+5;
            s1 = "y=3x+5";
        }
        public void division(){
            if (a-b != 0) {
                y = (a+b)/(a-b);
                s1 = "y=(a+b)/(a-b)";
            }else if(a-b == 0){error = 1;}
        }
        public void factorial(){
            if(b != 0){
                y = fact((a*x)/b);
                s1 = "y=(ax/b)!";
            }else if(b == 0) {error = 1;}
        }
        private static int fact(int i){
            if (i == 0)
                return 1;
            else
                for (int j = 0; j <= i; j++){
                    i *= j;
                }
            return i;
        }

        public void getResult(){
            System.out.println(s1);
            if(error == 1){System.out.println("Ошибка! НА 0 ДЕЛИТЬ НЕЛЬЗЯ!\n\n");}
            else {System.out.printf("X = %d, A = %d, B = %d, Y = %d \n\n",x,a,b,y);}
            error = 0;
            s1 = "";
        }
    }
}
