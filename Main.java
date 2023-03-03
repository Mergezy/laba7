public class Main{
    public static void main(String[] arg){
        Calc n1 = new Calc(2,5,7);
        Calc n2 = new Calc(-8,-3,-3);
        Calc n3 = new Calc(5,5,0);

        n1.sum();
        n1.getResult();

        n2.sum();
        n2.getResult();

        n3.sum();
        n3.getResult();

        n1.division();
        n1.getResult();

        n2.division();
        n2.getResult();

        n2.setNum(5,6,6);
        n2.division();
        n2.getResult();

        n3.division();
        n3.getResult();

        n1.factorial();
        n1.getResult();

        n3.factorial();
        n3.getResult();

        n1.setNum(4,2,2);
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
        public void setNum(int x, int a, int b){
            this.x = x;
            this.a = a;
            this.b = b;
        }
        private static int fact(int i){
            if (i == 0)
                return 1;
            else
                return(i * fact(i-1));
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
