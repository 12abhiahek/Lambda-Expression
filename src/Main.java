import com.nt.StrngLen.strLength;
import com.nt.length.LengthSum;
import com.nt.sum.SumOfTwoNumber;


// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {
        // Press Alt+Enter with your caret at the highlighted text to see how
        // IntelliJ IDEA suggests fixing it.
        System.out.println("Hello and welcome!");

        System.out.println();

        // different class implementation class

        MyInter imp=new MyInterImp();
        imp.sayHello();

        System.out.println();

       // Anonymous class
        MyInter m=new MyInter() {
            @Override
            public void sayHello() {
                System.out.println("this is methode of anonymous class");
            }

        };
        m.sayHello();

        System.out.println();

        MyInter m1=new MyInter() {
            @Override
            public void sayHello() {
                System.out.println("this is method of second anonymous class");

            }
        };
        m1.sayHello();

        System.out.println();

        //By using lambda function

        MyInter l=()->{System.out.println("methods calling from lambda expression");
        };
        l.sayHello();
        System.out.println();
        System.out.println("Sum Of Two Number");
        SumOfTwoNumber s=(int a,int b)->{
          System.out.println("Sum of nunber are::"+ (a+b));
        };
        s.sum(4,4);
        System.out.println();
        System.out.println("Sum of 2nd method");
        SumOfTwoNumber s2=(int a ,int b)->{
            System.out.println("sum of 2nd method are::"+(a+b));
        };
        s2.sum(7,5);
        System.out.println();
        System.out.println("sum of 3rd number are::");
        s2.sum(99,99);
        System.out.println();
        LengthSum ls=(x,y)->{
            System.out.println("length of two nunber are::"+2*(x+y));
        };
          //System.out.println("sum of length are::");
        ls.length(9,9);
        System.out.println();
        System.out.println("length of string are::");
        strLength sl=(str)-> {
            return str.length();
        };
        sl.stringLength("abhishek");
        // pattern print
        // Press Shift+F10 or click the green arrow button in the gutter to run the code.
        for (int i = 1; i <= 5; i++) {

            // Press Shift+F9 to start debugging your code. We have set one breakpoint
            // for you, but you can always add more by pressing Ctrl+F8.
            //System.out.println("i = " + i);

            for(int j=0;j<i;j++) {

                System.out.print("*");

            }
            System.out.println();

        }
    }



}