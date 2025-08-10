

/*import java.util.Scanner;

public class demo {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int a=sc.nextInt();
        int b=sc.nextInt();
        int c=sc.nextInt();
        int total=(b*75)+(c*30);
        if(total<=a){
            System.out.println("boat is stable");
        }
        else{
            System.out.println("boat is not stable");
        }
        sc.close();
    }}
        */
      /*  import java.util.*;
        public class demo{
            public static void main(String[] args) {
                Scanner sc=new Scanner(System.in);
                double costprice=sc.nextFloat();
double sellingpriceperbanana=sc.nextFloat();
double totalsellingprice=sellingpriceperbanana*12;
if(totalsellingprice>costprice){
     System.out.println("profit");
}
else if(totalsellingprice<costprice){
     System.out.println("loss");
            }else{
                System.out.println("breakpoint");
            }
            sc.close();
        }
        }
        */
        //single inheritance
       /* class parent{
            int x=10;
            void parentMethod(){
                System.out.println("parent");
            }
        }
        class child extends parent{
            void childMethod(){
                System.out.println("child");
            }
        }
        class demo{
           public static void main(String[] args) {
                child c=new child();
                c.childMethod();
                c.parentMethod();
            }
        }
            */
            //single inheritance example
           /* class library{
                String book="Hitler the war";
                String article="beauty and beast";
                String newspaper ="The Hindu";
                void display(){
                    System.out.println("Libraryclass");
                }
            }
            class bookName extends library {
                void dd(){
                      System.out.println(""+book);
            }
        }
        class article extends library {
                void dd2(){
                      System.out.println(""+article);
            }
        }
        class newspaper extends library {
                void dd3(){
                      System.out.println(""+newspaper);
            }
        }
        class demo{
            public static void main(String[] args) {
                bookName b=new bookName();
b.dd();
article a=new article();
a.dd2();
newspaper n=new newspaper();
n.dd3();
            }
        }
        */
        // multilevel inheritance
       /* class grandparent{
            int x=10;
            void d(){
             System.out.println("grandparent");
            }
        }
        class parent extends grandparent{
            int y=20;
            void d1(){
                System.out.println("parent"+x);
            }
        }
        class child extends parent{
            void d2(){
                System.out.println("child"+y);
            }
        }
        class demo{
            public static void main(String[] args) {
                child c=new child();
                c.d2();
                c.d1();
            }
        }
            */
         //harrypotter example multilevel inheritance
            /*class library{
            String book="HarryPotter";
            void display(){
                System.out.println("libraryclass");
            }
          }  
          class book extends library{
            String paper="magic stick";
            void d(){
            System.out.println(book);
          }
        }
          class paper extends book{
            void d1(){
                System.out.println(paper);
            }
          }
          class demo{
            public static void main(String[] args) {
                paper p=new paper();
                p.d();  
                p.d1();
                p.display();
            }
          }
            */
            //multiple level inheritance
          /*  interface parent1{
                int x=10;
                void parent1method();
            }
            interface parent2{
                int y=20;
                void parent2method();
            }
             class child implements parent1,parent2{
                public void parent1method(){
                System.out.println(x);
            }
            public void parent2method(){
            System.out.println(y);
            }
        }
        public class demo{
            public static void main(String[] args){
                child c=new child();
                c.parent1method();
                c.parent2method();
            }
        }
            */
            //reverse a string
            /*public class demo{
                public static void main(String[] args) {
                    StringBuffer sb=new StringBuffer("Java is a fungame");
                    sb.reverse();
                    System.out.print(sb);
                    }
                }
                    */
                    //philand question

                   /* import java.util.Scanner;
                    public class demo{
                        public static void main(String[] args) {
                            Scanner sc = new Scanner(System.in);
                            int n=sc.nextInt();
                            int count=0;
                            while(n>0){
                                count++;
                            n>>=1;
                            }
                        
                                System.out.println(count);
                        }
                    }
                        */
                      /*  class parent1{
                            int x=10;
                            void parent1method(){
                        }
                            class parent2{
                                int y=20;
                                void parent2method(){
                            }
                            class child extends parent1{
                                void parent1method(){
                                System.out.println(x);
                            }}
                            class child extends parent2{
                                void parent2method(){
                                System.out.println(y);
                            }}
                            public class demo{
                                public static void main(String[] args) {
                                    child c=new child();
                                    c.parent1method();
                                    c.parent2method();
                                }
                            }
                                */
               /* interface parent1{
                 int x=10;
                void parent1method();
            }
            interface parent2{
                int y=20;
                void parent2method();
            }
             class child implements parent1,parent2{
                public void parent1method(){
                System.out.println(x);
            }
            public void parent2method(){
            System.out.println(y);
            }
        }
        public class demo{
            public static void main(String[] args) {
                child c=new child();
                c.parent1method();
                c.parent2method();
            }
        }
            */
            //problem pattern
            /*import java.util.Scanner;
public class demo {
     public static void main(String[] args) {
       Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        sc.nextLine();
         char[][] arr=new char[3][n];
        for(int i=0;i<3;i++){
            String line=sc.next();
             arr[i]=line.toCharArray();
         }
       int j=0;
       while(j<n){
             if(arr[0][j]=='#'&& arr[1][j]=='#'&&arr[2][j]=='#'){
                 System.out.print("#");
                j++;
                 continue;
             }

          if(j+2<n){
            if(arr[0][j]=='*'&&arr[0][j+1]=='-'&&arr[0][j+2]=='*'&&
                 arr[1][j]=='*'&&arr[1][j+1]=='-'&&arr[1][j+2]=='*'&&
                 arr[2][j]=='*'&&arr[2][j+1]=='*'&&arr[2][j+2]=='*'){
                     System.out.print("U");
                     j+=3;
                     continue;
                 }
                 if(arr[0][j]=='*'&&arr[0][j+1]=='*'&&arr[0][j+2]=='*'&&
                 arr[1][j]=='*'&&arr[1][j+1]=='-'&&arr[1][j+2]=='*'&&
                 arr[2][j]=='*'&&arr[2][j+1]=='*'&&arr[2][j+2]=='*'){
                    System.out.print("O");
                     j+=3;
                     continue;
                 }
                 if(arr[0][j]=='*'&&arr[0][j+1]=='*'&&arr[0][j+2]=='*'&&
                 arr[1][j]=='-'&&arr[1][j+1]=='*'&&arr[1][j+2]=='-'&&
                 arr[2][j]=='*'&&arr[2][j+1]=='*'&&arr[2][j+2]=='*'){
                    System.out.print("I");
                    j+=3;
                    continue;
                 }
                 }
             }
             j++;
         }
     }
     */
    
// // *-*#***#***#******
// // *-*#*-*#-*-#******
// // ***#***#***#****-*

// //u#o#I#EA








/*class demo{
    public static void main(String[] args) {
        String str="Placement Ready".toLowerCase();
        int v=0,c=0,s=0,d=0;
        for(char ch:str.toCharArray()){
            if(Character.isLetter(ch)){
                if("aeiou".indexOf(ch)!=-1){
                    v++;
                }
                else{
                    c++;
                }
            }
            else if(Character.isWhitespace(ch)){
                s++;
            }
            else if(Character.isDigit(ch)){
                d++;
            }
        }
        System.out.println(v);
        System.out.println(s);
        System.out.println(c);
        System.out.println(d);
    }
}
    */
    /*public class demo {
    public static void main(String[] args) {
        System.out.println("First class main");
    }
}

class Second {
    public static void main(String[] args) {
        System.out.println("Second class main");
    }
}
*/
/*import java.util.Scanner;

public class Checker {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String input = scanner.nextLine();
        
        String input2 = scanner.nextLine();

        if (!input.matches("[a-zA-Z]+")) {
            System.out.println("Invalid Input.");
            return;
        }

        int vowelCount = 0;
        StringBuilder consonants = new StringBuilder();
        String vowels = "aeiouAEIOU";

        for (char ch : input.toCharArray()) {
            if (vowels.indexOf(ch) != -1) {
                vowelCount++;
            } else {
                consonants.append(ch);
            }
        }

        System.out.println("No of Vowels : " + vowelCount);
        System.out.println("Consonants   : " + consonants.toString());
    }
}
    */
   /* public class linear{
        public static void main(String[] args) {
            int[] arr={10,20,30,40};
            int key =10;
            for(int i=0;i<arr.length;i++){
                arr[i]=key;
                System.out.println(i);
                break;
            }
        }
    }
        */
       /* public class demo{
            public static void main(String[] args) {
                Integer i=128;
                Integer j=128;
                System.out.println(i==j);//false
            }
        }
            */
           /* public class demo{
            public static void main(String[] args) {
            int[] arr = new int[3];//0
System.out.println(arr[2]);}}*/
/*import java.util.*;
public class demo{
            public static void main(String[] args) {
                HashSet<Integer>ar=new HashSet<>();
                ar.add(10);
                ar.add(20);
                ar.add(50);
                ar.add(30);
                ar.add(40);
                System.out.println(ar);
                ar.remove(10);
            }
        }
            */
            /*import java.util.*;
            public class demo{
                public static void main(String[] args){
                    Scanner sc=new Scanner(System.in);
                    int n=sc.nextInt();
                    int count=0;
                    for(int i=1;i<=n;i++){
                        if(n%i==0)
                        count++;
                    }
                    if(count==2)
                    System.out.println("prime");
                    else
                    System.out.println("not a prime");

                }
            }
                */
               /* import java.util.*;
            public class demo{
                public static void main(String[] args){
                    Scanner sc=new Scanner(System.in);
                    int n=sc.nextInt();
                    for(int i=1;i<=n;i++){
                        for(int j=i;j<=n;j++){
                            if(i%2==0)
                                    System.out.print("B");
                            else
                                System.out.print("A");  
                        
                        }
System.out.println(" ");
                    }               
                }   
                    }
                */
            

    