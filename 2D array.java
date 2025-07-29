import java.util.Scanner;
public class arr{
        public static void main(String[] args){
                Scanner scan=new Scanner(System.in);
                int[][] a=new int[2][5];
                //stored
                //classroom
                for(int i=0;i<2;i++){
                //students
                for(int j=0;j<5;j++){
                        System.out.println("enter the age");
                        a[i][j]=scan.nextInt();
                }
                }
                //print
                for(int i=0;i<2;i++){
                //students
                for(int j=0;j<5;j++){
                        System.out.println(a[i][j]+" ");
                }
                }
        }
}