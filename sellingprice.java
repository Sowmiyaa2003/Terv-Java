import java.util.*;
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
