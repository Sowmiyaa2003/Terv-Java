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


