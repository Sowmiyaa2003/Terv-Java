
import java.util.function.ObjDoubleConsumer;

/*
import java.util.Scanner;
public class test {
        public static void main(String[]args){
    System.out.println("hello world");
 }}
 */
/*public class test{
    public void main(String[]args){
        System.out.println("num");
    }
}*/
/*public class test{
       public static void main(String[]args){
        System.out.println(args.length);
}
}  */   
/*public class test{
    public static void main(String[]args){
     System.out.println(args.length);
     for(int i=0;i<args.length;i++){
        System.out.println(args[i]);
     }
}
}     
*/
/*public class test{
    public void main(){
        System.out.println("hello");
        }
        public static void main(String[]args){
            test t= new test();
            t.main();
        }
    }*/
    //non static
  /*   public class test{
        public void main(int a,int b){
            System.out.println(a+b);
            System.out.println(a-b);
            System.out.println(a*b);

            }//static
            public static void main(String[]args){
                test t=new test();
                t.main(10,20);
               
            }
        }
            */
           /* order priority (%,/,*,+,-)+ irrutha check from left to right
             public class test{
                public static void main(String[]args){
                    System.out.println(10-7+1426%625/28*14-32);
                }
            }
*/
/*unary operator
public class test{
    public static void main(String[]args){
        int a= 10;
        System.out.println(++a); //increment aagi print pannum 11
        System.out.println(a++); //a ipo 11 athu increment aagi 12 nu varen
        System.out.println(a); //ipo a oda value 12
        System.out.println(a+a); // 12+12 =24 nu add aaguthu
    }
}
    */
   /*  public class test{
        public static void main(String[]args){
            boolean a = true;
            System.out.println(!a);
        }
    }
*/
/*public class test{
    public static void main(String[]args){
        int a=50;
        System.out.println(++a+a++ + ++a + a++);
    }
    }
    */
    //assignment operator
    /*  public class test{
    public static void main(String[]args){
    int a=10;
    int b=20;
    a+=b;
    System.out.println(a);
}
}
*/
/*import java.util.Scanner;
public class test{
    public static void main(String[]args){
        Scanner sc=new Scanner(System.in);
        int n = sc.nextInt();
        System.out.println(n);
        
        if(7.5<n)
        {
            System.out.println("not eligible")  ;
        }
        else{
            System.out.println(" eligible");
        }

    }
}
*/
//2.technique in swapping
//swap using assignment of temp
/*public class test{
    public static void main(String[]args){
        int temp;
        int a=5;
        int b=10;
        System.out.println(a);
        System.out.println(b);
        temp=b;
        b=temp;
        System.out.println(a);
        System.out.println(b);
    }
}
    */
    //2.swap using relational operator
    /*public class test{
        public static void main(String[]args){
            int a=5;
            int b=10;
            System.out.println(a);//5
            System.out.println(b);//10
            a=a+b;//15=a
            b=a-b;//15-10=5=b
            a=a+b;//15+5=20=a
            System.out.println(a);
            System.out.println(b);
        }
    }
        */
        //logical operator
       /*  public class test{
            public static void main(String[]args){
                boolean a=true;
                boolean b=false;
                System.out.println(a && b);
            }
        }
            */
        /*public class test{
            public static void main(String[]args){
                boolean a=true;
                boolean b=false;
                System.out.println(a || b);
            }
        }*/
        // task for using cgpa and arrears for check eligible
       /*  import java.util.Scanner;
        public class test{
            public static void main(String[]args){
            Scanner sc=new Scanner(System.in);
            System.out.println("enter CGPA:");
            float a=sc.nextFloat();
            System.out.println("enter arrear:");
            int b=sc.nextInt();
            if(a>7.0 && (b==0) || (b==1)){
                System.out.println("eligible");
            }
            else if(a>7.5 && b==0){
                System.out.println("eligible for mnc");
            }
            else if((a>=6.5 && a<=7.0) && (b==0) ||(b==1)){
            System.out.println("eligible");
        }
        else{
            System.out.println("not eligible");
        }
        }
    }
        */
        //ternary operator
      /*   public class test{
            public static void main(String[]args){
                int a=10;
                int b=20;
                System.out.println(a>b?"a is max":"b is max");
            }
        }
            */
           /* public class test{
                public static void main(String[]args){
                    int a= 0;
                    System.out.println((a%2==0)?"even":"odd");
                }
            }
                */
             
            /*  
            check vote using ternary
             public class test{
                    public static void main(String[]args){
                        int a=30;
                        System.out.println((a>=18)?"a can vote":"a cannot vote");
                    }
                }
                    */
                    //max of 3 number

                  /*   public class test{
                        public static void main(String[]args){
                            int a=10;
                            int b=20;
                            int c=30;
                            System.out.println((a>b) && (a>c)?"a is max": ((b>a) && (b>c)?"b is max":"c is max"));
                        }
                    }
                        */
                     /*    
                     //nested if else
                     public class test{
                            public static void main(String[]args){
                                int a=-2;
                                System.out.println(((a>0)?"a is positive":(a<0)?"a is negative":"a is zero"));
                            }
                        }
                            */
                            //swapping by using bitwise
                           /* public class test{
                                public static void main(String[]args){
                                    int a=10;
                                    int b=5;
                                    a=a^b;
                                    b=a^b;
                                    a=a^b;
                                    System.out.println(a);
                                    System.out.println(b);
                                }
                            }
                                */
                                //bitwise using even and odd
                               /*  public class test{
                                    public static void main(String[]args){
                                        int a=10;
                                        System.out.println(((a&1)==0)?"even":"odd");
                                    }
                                }
                                    */
                                    //bitwise operator
                                   /*  public class test{
                                        public static void main(String[]args){
                                            int a=-10;
                                            System.out.println(a<<2);
                                            System.out.println(a>>2);
                                            System.out.println(a>>>2);
                                        }}
                                            */
                                            //if statement
                                          /*  public class test{
                                                public static void main(String[]args){
                                                    boolean sat =true;
                                                    if(sat){
                                                        System.out.println("holiday");  
                                                    }
                                                }
                                            }
*/
                                            //if else statement:quadratic equation
                                           /* import java.util.Scanner;
                                            public class test{
                                                public static void main(String[]args){
                                                    Scanner sc=new Scanner(System.in);
                                                    double a=sc.nextDouble();
                                                    double b=sc.nextDouble();
                                                    double c=sc.nextDouble();
                                                    double res=b*b-4.0*a*c;
                                                    if(res>0){
                                                        System.out.println((-b+Math.pow(res,0.5))/2.0*a);
                                                        System.out.println((-b-Math.pow(res,0.5))/2.0*a);
                                                    }
                                                    else
                                                    {
                                                        System.out.println("no real root");
                                                    }
                                                }
                                            }
*/
                                            //if else if statement
                                          /* public class test{
                                                public static void main(String[]args){
                                                    int a=80;
                                                    if(a>=50){
                                                        System.out.println("watch movie");  
                                                    }
                                                    else if(a<=50){
                                                        System.out.println("watch reels");
                                                    }
                                                    else{
                                                        System.out.println("sit simply");
                                                    }
                                                }
                                            }
                                                */
                                                //nested statements
                                              /*   import java.util.Scanner;
                                                public class test{
                                                    public static void main(String[]args){
                                                        Scanner sc=new Scanner(System.in);
                                                        int grade =sc.nextInt();
                                                        System.out.println("grade:");
                                                        if(grade>=85){
                                                            if(grade>=95){
                                                                System.out.println("O grade");
                                                            }
                                                            else{
                                                                System.out.println("A grade");
                                                            }
                                                        }
                                                        else
                                                        {
                                                            System.out.println("B grade");
                                                        }
                                                    }
                                                }
                                                    */
                                                     //nested statements
                                                /* import java.util.Scanner;
                                                public class test{
                                                    public static void main(String[]args){
                                                        Scanner sc=new Scanner(System.in);
                                                        int grade =sc.nextInt();
                                                        System.out.println("grade:");
                                                        if(grade>=70){
                                                            if(grade>=90){
                                                                System.out.println("O grade");
                                                            }
                                                            else if(grade>=80){
                                                                System.out.println("A grade");
                                                            }
                                                            else{
                                                                System.out.println("B grade");
                                                            }
                                                        }
                                                            else if(grade>=50){
                                                                if(grade>=60){
                                                                System.out.println("C grade");
                                                            }
                                                        else
                                                        {
                                                            System.out.println("D grade");
                                                        }
                                                    }
                                                    else{
                                                        System.out.println("Fail");
                                                    }
                                                }
                                            }
                                                */
                                                //switch statement
                                              /*  import java.util.Scanner;
                                                public class test{
                                                    public static void main(String[]args){
                                                        Scanner sc=new Scanner(System.in);
                                                        int val=sc.nextInt();//two lines are important for checking even or odd
                                                        int check=val%2;
                                                        switch(check){
                                                            case 0:
                                                            System.out.println("Even");
                                                        break;
                                                        case 1:
                                                        System.out.println("odd");
                                                        break;
                                                        default:
                                                        System.out.println("Neither even nor odd");
                                                        }
                                                    }
                                                }
                                                */
                                                //another method of writing switch using arrow without using break
                                               /*  import java.util.Scanner;
                                                public class test{
                                                    public static void main(String[]args){
                                                        Scanner sc=new Scanner(System.in);
                                                        int val=sc.nextInt();//two lines are important for checking even or odd
                                                        int check=val%2;
                                                        switch(check){
                                                            case 0->System.out.println("Even");
                                                        case 1-> System.out.println("odd");
                                                        default->System.out.println("Neither even nor odd");
                                                        }
                                                    }
                                                }
                                                    */
                                                    //nested switch
                                                  /*  import java.util.Scanner;
                                                public class test{
                                                    public static void main(String[]args){
                                                        Scanner sc=new Scanner(System.in);
                                                        int val=sc.nextInt();
                                                        int val1=sc.nextInt();
                                                        int check=val%2;
                                                        switch(check){
                                                            case 0:
                                                            switch(val1){
                                                                case 0:
                                                                System.out.println("Even executed with nested switch");
                                                                break;
                                                                case 1:
                                                                System.out.println("val1 in nested switch");
                                                                break;
                                                                default:
                                                                System.out.println("nested switch");
                                                                break;
                                                            }
                                                            System.out.println("Even");
                                                            break;
                                                            case 1:
                                                            System.out.println("val1");
                                                            break;
                                                            default:
                                                            System.out.println("nested switch");
                                                            break;
                                                        }
                                                    }
                                                }*/
                                                //tcs question
                                                /*import java.util.Scanner;
                                                public class test{
                                                    public static void main(String[]args){
                                                        Scanner sc=new Scanner(System.in);
                                                        System.out.println("Enter the number:");
                                                        int val=sc.nextInt();
                                                        int check=val%8;
                                                        switch(check){
                                                            case 0:
                                                            System.out.println("side upper");
                                                            break;
                                                            case 1:
                                                            System.out.println("lower birth");
                                                            break;
                                                            case 2:
                                                            System.out.println("middle birth");
                                                            break;
                                                            case 3:
                                                            System.out.println("upper birth");
                                                            break;
                                                            case 4:
                                                            System.out.println("lower upper");
                                                            break;
                                                            case 5:
                                                            System.out.println("middle upper");
                                                            break;
                                                            case 6:
                                                            System.out.println("upper birth");
                                                            break;
                                                            case 7:
                                                            System.out.println("side lower birth");
                                                            break;
                                                            default:
                                                            System.out.println("none");
                                                        }
                                                    }
                                                }
                                                    */
                                                    //seating arrangement question using switch
                                                 /*   import java.util.Scanner;
                                                public class test{
                                                    public static void main(String[]args){
                                                        Scanner sc=new Scanner(System.in);
                                                        System.out.println("Enter the number:");
                                                        int val=sc.nextInt();
                                                        int check=val%8;
                                                        switch(check){
                                                            case 0:
                                                            System.out.println("side upper");
                                                            break;
                                                            case 1: 
                                                            case 4:
                                                            System.out.println("lower upper");
                                                            break;
                                                            case 2:
                                                            case 5:
                                                            System.out.println("middle upper");
                                                            break;
                                                            case 3:
                                                            case 6:
                                                            System.out.println("upper birth");
                                                            break;
                                                            case 7:
                                                            System.out.println("side lower birth");
                                                            break;
                                                            default:
                                                            System.out.println("none");
                                                        }
                                                    }
                                                }
                                                    */
                                                 /*    import java.util.Scanner;
                                                public class test{
                                                    public static void main(String[]args){
                                                        Scanner sc=new Scanner(System.in);
                                                        int key=sc.nextInt();
                                                        int strength=sc.nextInt();
                                                        System.out.println("strength is");
                                                    
                                                       if(strength>70){
                                                        System.out.println("gate 1 is crossed");
                                                       }
                                                       boolean magicstick = true;
                                                    if(magicstick==true){
                                                        System.out.println("gate 2 is crossed");
                                                    }
                                                    else{
                                                        System.out.println("quited game");
                                                    }

                                                    boolean sword = true;
                                                    boolean shield = true;
                                                    if(sword==true && shield== true){
                                                        if(sword==true){
                                                            System.out.println("sword protection");
                                                        }
                                                        else{
                                                            System.out.println("shield protection");
                                                        }
                                                    }
                                                    else{
                                                        System.out.println("Quit the game");
                                                    }
                                                    int key=sc.nextInt();
                                                    System.out.println("enter no of keys");
                                                    if(key>=0){
                                                        System.out.println("Gate 4 entered");
                                                    }
                                                    switch(key){
                                                        case 0:
                                                        System.out.println("even no of keys");
                                                        case 1:
                                                        System.out.println("odd no of keys");
                                                        default:
                                                        System.out.println("Quit the game");
                                                    }
                                                }
                                            }
                                                */
                                                //for loop for printing N natural number
                                               /* import java.util.Scanner;
                                                public class test{
                                                    public static void main(String[]args){
                                                        Scanner sc=new Scanner(System.in);
                                                        int N=sc.nextInt();
                                                        for(int i=0;i<=N;i++){
                                                            System.out.println(i);
                                                        }
                                                    }
                                                }*/
                                                //while loop for printing unit digit
                                            /*   import java.util.Scanner;
                                                public class test{
                                                    public static void main(String[]args){
                                                        Scanner sc=new Scanner(System.in);
                                                        int i=sc.nextInt();
                                                        while(i>0){
                                                        int n=i%10;
                                                        System.out.println(n);
                                                        n/=10;
                                                        }
                                                    }
                                                }
                                                    */
                                                
                                                //do while for printing N natural number
                                             /*   import java.util.Scanner;
                                                public class test{
                                                    public static void main(String[]args){
                                                        Scanner sc=new Scanner(System.in);
                                                        int N=sc.nextInt();
                                                        do{
                                                            System.out.println(N);
                                                            i++;
                                                        }
                                                        while(i<N);
                                                    }
                                                }
*/
                                                //for each to print {10,20,30,40,50}
                                          
                                            // public class test{
                                           /* public static void main(String[]args){
                                            Scanner sc=new Scanner(System.in);
                                            int n=sc.nextInt();
                                            int []arr=new int[n];
                                            for(int i=0;i<n;i++){
                                                arr[i]=sc.nextInt();
                                            }
                                                        for(int a:arr){
                                                            System.out.println(a);
                                                        }
                                                        sc.close();
                                                    }
                                        }  
                                                    */                      
                                                                                                              
                                                    //fibonacci series
                                                  /*  import java.util.Scanner;
                                                    public class test{
                                                        public static void main(String[]args){
                                                            Scanner sc=new Scanner(System.in);
                                                int n=sc.nextInt();
                                                int a=0,b=1,c;
                                                for(int i=0;i<n;i++){
                                                System.out.println("enter fibonnaci series:"+a);
                                                c=a+b;
                                                a=b;
                                                b=c;
                                                }
                                            } 
                                            }
                                            */
                                            //break statement
                                           
                                             /*   public class test{
                                                    public static void main(String[]args){
                                                        
                                                        for(int i=0;i<=5;i++){
                                                            System.out.println(i);
                                                            if(i==3)
                                                            break;
                                                        }
                                                    }
                                                }
                                                    */
                                                    //continue
                                                  /*   public class test{
                                                        public static void main(String[]args){
                                                            
                                                            for(int i=0;i<=5;i++){
                                                                if(i==3)
                                                                continue;
                                                                System.out.println(i);
                                                            }
                                                        }
                                                    }
                                                        */
                                                        //return
                                                      /*  public class test{
                                                            public int add(int a,int b){
                                                                return a+b;
                                                            }
                                                            public static void main(String[]args){
                                                                test t=new test();
                                                                System.out.println(t.add(5,6));
                                                                System.out.println(t instanceof test);//instance operation
                                                            }
                                                        }
                                                            */
                                                            //to calculate no of ways like staircase we go for fibonacci series
                                                        /*     import java.util.Scanner;
                                                    public class test{
                                                        public static void main(String[]args){
                                                            Scanner sc=new Scanner(System.in);
                                                int n=sc.nextInt();
                                                System.out.println(n);
                                                int a=1,b=1,c;
                                                c=a+b;
                                                for(int i=2;i<=n;i++){
                                                    a=b;
                                                    b=c;
                                                }
                                                System.out.println(c);
                                                sc.close();
                                            }
                                        }
                                            */
                                           //concept based problem
/* 
import java.util.Scanner;
public class test {
    public boolean isLeap(int year) {
        if((year % 4 == 0 )&& (year % 100 != 0) || (year % 400 == 0)){
        return true;
        }else{
        return false;
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int startYear = sc.nextInt();
        int endYear = sc.nextInt();
        
        test t = new test();
        int lp = 0;

        for (int i = startYear; i <= endYear; i++) {
            if (t.isLeap(i)) {
                lp++;
            }
        }

        int totalYears = endYear - startYear + 1;
        int nlp = totalYears - lp;
        int oddDays = (lp * 2) + (nlp * 1);
        int modu = oddDays % 7;

        String[] days = {"sat", "sun", "mon", "tues", "wed", "thurs", "fri"};
        System.out.println(days[modu]);
    }
}
    */
    //Maximum element in a array
  /*  import java.util.Scanner;
     public class test{
public static void main(String[]args){
     Scanner sc=new Scanner(System.in);
     int n=sc.nextInt();
     int[]arr=new int[n];//initialise array
     for(int i=0;i<n;i++){
        arr[i]=sc.nextInt();
     }
     int max=arr[0];
     for (int i = 1; i < n; i++) {
        if (arr[i] > max) {
            max = arr[i];
        }
    }
       System.out.println("max"+max);
}
     }
*/
     //leader array
   /*  import java.util.Scanner;
     public class test{
public static void main(String[]args){
     Scanner sc=new Scanner(System.in);
     int n=sc.nextInt();
     int[]arr=new int[n];//initialise array
     for(int i=0;i<n;i++){
        arr[i]=sc.nextInt();
     }
     int leader =arr[n-1];
     System.out.print(leader);
     for (int i =n-2; i >0; i--) {
        if (arr[i] > leader) {
            leader = arr[i];
        System.out.println(leader);
        }
    }
}
     }
*/
//jagged array
//string
/*public class test{
    public static void main(String[]args){
        String str="priya";
        System.out.println("hello"+str);
        System.out.println(str.length());
    }
}
    */
    //poositive compare value
   /*  public class test{
        public static void main(String[]args){
            String str1="MEC";
            String str2="MCE";
            System.out.println(str1==str2);//false
            System.out.println(str1.equals(str2));//false
            System.out.println(str1.compareTo(str2));//2
        }
    }
        */
//negative compare value
  /*  public class test{
        public static void main(String[]args){
            String str1="MCE";
            String str2="MEC";
            System.out.println(str1==str2);//false
            System.out.println(str1.equals(str2));//false
            System.out.println(str1.compareTo(str2));//-2
        }
    }
        */
        //concate using+
       /* public class test{
            public static void main(String[]args){
                String s1="priya";
                String s2="pravin";
                System.out.println(s1+""+s2);
            }
        }*/
        //concate using concat()
      /*   public class test{
            public static void main(String[]args){
                String s1="priya";
                String s2="pravin";
                System.out.println(s1.concat("").concat(s2));
            }
        }
            */
            //substring
           /* public class test{
               public static void main(String[]args){
                    String s="priya";
                    System.out.println(s.substring(2));
                }
            }
                */
                //tostring
                /*    class student{
                        int id=101;
                        String name="priya";
                        public String tostring(){
                        return id+""+name;
                        }
                    }
                    public class test{
               public static void main(String[]args){
                student s=new student();
                System.out.println(s);
               }
            }
               */
              //string joiner
           /*   import java.util.StringJoiner;
              public class test{
public static void main(String[] args) {
              StringJoiner joiner=new StringJoiner(",");
              joiner.add("priya");
              joiner.add("pravin");
              System.out.println(joiner);
}
}*/
/*
// output is welcome priyaMEC
public class test{
    public static void main(String[] args) {
        String str="priya";
        String str1="MEC";
        System.out.println("welcome"+str+""+str1);
    }
}
    */
    //4
   /* public class test{
        public static void main(String[] args) {
            String s="null";
            System.out.println(s.length());
        }}
            */
            //REGISTRATION FORM 
          /*  import java.util.Scanner;
            public class test{
                public static void main(String[] args) {
                    Scanner sc=new Scanner(System.in);
                    String username=sc.nextLine();
                    String email=sc.nextLine();
                    System.out.println(username);
                    System.out.println(email);
                }
            }
                */
               /*  public class test{
                    public static void main(String[] args) {
                        String s="priya";
                        s.concat(hello)
                        System.out.println(s);
                    }
                }
                    */
                    //why string is immutable helpful in login systems
                   /* public class test{
                        public static void main(String[] args) {
                            String s1="java";
                            String s2="Java";
                            System.out.println(s1.equals(s2));
                        }
                    }
                        */
                        //check two strings are equal
                     /*   import java.util.Scanner;
                        public class test{
                            public static void main(String[] args) {
                                Scanner sc=new Scanner(System.in);
                                String s1=sc.nextLine();
                                String s2=sc.nextLine();  
                                System.out.println(s1.equals(s2));
                            }
                        }
                            */
                            //sort 3 names entered by the user
                            /*   import java.util.*;
                            public class test{
                                public static void main(String[] args) {
                                    Scanner sc=new Scanner(System.in);
                                String []str=new String[3];
                                for(int i=0;i<3;i++){
                                    str[i]=sc.nextLine();
                                }
                                    Arrays.sort(str);
                                   for(String s:str){
                                    System.out.println(s);
                                   }
                                }
                            }*/
                                //==
                               /* import java.util.Scanner;
                            public class test{
                                public static void main(String[] args) {
                                    Scanner sc=new Scanner(System.in);
                                String s1=sc.nextLine();
                                String s2=sc.nextLine();
                                System.out.println(s1==s2);
                                }
                            }
                                */
                                
                           /*     public class test{
                                    public static void main(String[] args) {
                                        int x=25;
                                        int y=10;
                                        String s="priya";
                                        String[]a=new String[3];
                                        for(int i=0;i<3;i++){
                                            a[i]=x+y+s;
                                        }
                                        for(int i=0;i<3;i++){
                                        System.out.print(a[i]);
                                        }
                                    }
                                    }
                                    */
                                    //string index out of bound
                                   /* public class test{
                                        public static void main(String[]args){
                                             String s="priya";
                                             System.out.println(s.substring(4,2));
                                        }
                                    }*/
                                    //method override la two diff class in a same method irruthalume answer return aagum
                                   /* class student{
                                        String a="pravin";
                                        String b="priya";
                                        public String toString(){
                                        return a+b;
                                        }
                                    }
                                     class demo1{
                                         String a="pravin";
                                        String b="priya";
                                       public String toString(){
                                           return b+a;
                                            }
                                     }
                                    public class test{
                               public static void main(String[]args){
                                student s=new student();
                                System.out.println(s);
                                 demo1 d=new demo1();
                                 System.out.println(d);
                               }}
                                 */
                               //normal method before method override
                              /*
                               class demo{
                                int a=10;
                                int b =20;
                                public int add(){
                                return a+b;
                                }
                            }
                               public class test{
                                public static void main(String[] args) {
                                    demo d=new demo();
                                    //System.out.println(d);//ithuku verum address mattum thaan output la varum
                                    System.out.println(d.add());//output 30 nu varum
                                }
                               }
                            */
                            //stringBuffer used for append,insert,reverse a string
                           /*  public class test{
                                public static void main(String[] args) {
                                    StringBuffer sb=new StringBuffer("priya");
                                    sb.append("hello");
                                    System.out.println(sb);
                                    sb.insert(2,3);
                                    System.out.println(sb);
                                    sb.reverse();
                                    System.out.println(sb);

                                }
                            }
                                */
                                //reverse a string
                               /* public class test{
                                    public static void main(String[] args) {
                                        StringBuffer sb=new StringBuffer("hello");
                                        sb.insert(4,"world");
                                        System.out.println(sb);
                                    }
                                }
                                    */
                                    //anagram
                                 /*   import java.util.*;
                                    public class test{
                                        public static void main(String[]args) {
                                            String str1="silent";
                                            String str2="listen";
                                            String []str=new String[2];
                                for(int i=0;i<2;i++){
                                    str[i]=str1;
                                    str2=str1;
                                    str2=str[i];
                                }
                                    Arrays.sort(str);
                                   for(String s:str){
                                    System.out.println(s);
                                        }  
                                    }}
                                        */
                                    //star
                                   /* public class test{
                                        public static void main(String[] args) {
                                            for(int i=0;i<=3;i++){
                                                for(int j=0;j<i;j++){
                                                    System.out.print("*");
                                                }
                                                    System.out.println();
                                                }
                                            }
                                        }
                                    */
                                    //sort 1 string
                               /* 
                                import java.util.*;
                            public class test{
                                public static void main(String[] args) {
                                   String str="placement";
                                   char[]arr=str.toCharArray();//character array
                                    Arrays.sort(arr);
                                   for(char c:arr){
                                    System.out.println(c);
                                   }
                                }
                            }*/
                                
                                //palindrome

                             /*   import java.util.Scanner;
                                public class test{
                                    public static void main(String[] args) {
                                        Scanner sc=new Scanner(System.in);
                                        String s=sc.nextLine();
                                        String rev="";
                                       for(int i=s.length()-1;i>=0;i--){
                                        rev=rev+s.charAt(i);
                                       }
                                       System.out.println(rev);
                                        if(s.equals(rev)){
                                            System.out.println("it is a palindrome");
                                        }
                                        else{
                                        System.out.println("it is not a palindrome");
                                    }
                                }}
                                    */
                                    //remove duplicates
                                   /* import java.util.*;
                            public class test{
                                public static void main(String[] args) {
                                   String s="little";
                                   String dup="";
                                   char[]arr=s.toCharArray();//convert array to char
                                   for(char c:arr){//oru oru character ume print panna from arr in for each//for(int i=0;i<s.length-1;i++)ithu only for loop//
                                    if(dup.indexOf(c)==-1){ //if(dup.indexOf(arr[i]==-1)
                                        dup=dup+c;
                                    }
                                }
                                       System.out.println(dup);
                                    }
                                   }
                                    */
                                    //transpose 
                                   /* import java.util.*;
                                    public class test{
                                        public static void main(String[] args) {
                                            int[][]arr={{1,2,3},{4,5,6}};
                                            for(int i=0;i<arr[0].length;i++){
                                                for(int j=0;j<arr.length;j++){
                                                    System.out.print(arr[j][i]+"");
                                                }
                                                System.out.println();
                                            }
                                        }
                                    }
                                        */
                                     /*   import java.util.*;
                                        public class test{
                                            public static void main(String[] args) {
                                                int[]arr={2,3,4,5};
                                                for(int num:arr){
                                                boolean s=num>1;
                                                for(int i=2;i<=num/2;i++){
                                                    if(num%i==0){
                                                        s=false;
                                                        break;
                                                    }   
                                                }
                                                if(s){
                                                    System.out.println("prime");
                                                }
                                            }
                                        }}
                                            /* 
                                            import java.util.*;
                                            class Access{
                                                
                                                    int x=10;
                                                   public int a=20;
                                                    private int b=30;
                                                    protected int c=40;
                                                    void access(){
                                                    System.out.println(x);
                                                    System.out.println(a);
                                                    System.out.println(b);
                                                    System.out.println(c);
                                                    }
                                                }
                                            
                                            public class test{
                                                public static void main(String[] args) {
                                                   access obj=new access();
                                                    System.out.println(Obj.x);
                                                    System.out.println(obj.a);
                                                    System.out.println(obj.b);
                                                    System.out.println(obj.c);

                                                    obj.access();
                                                    
                                                }
                                            }*/

                                
                                    


                                    




                                
                            








                











                    











     
    


