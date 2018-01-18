import java.util.Scanner;
public class PrimeNumbers{
    public static void main(String[] args){
        Scanner i_num = new Scanner(System.in);
        Scanner s_num = new Scanner(System.in);

        System.out.println("素数を探す範囲を入力してください。");
        int num = i_num.nextInt();
        int sur = 0;
        int s_cnt = 0;
        int r_cnt = 0;
        int p_cnt = 0;
        int[] result = new int[num];

        for(int i=2;i<=num;i++){
            for(int j=1;j<=i;j++){
                sur=i%j;
                if(sur==0){
                    s_cnt++;
                }
                if(s_cnt==3){
                    break;
                }
            }
            if(s_cnt==2){
                result[r_cnt]=i;
                r_cnt++;
            }
            s_cnt=0;
        }

        for(int i=0;i<result.length;i++){
            if(result[i]!=0){
                p_cnt++;
            }
        }

        System.out.println();
        System.out.println(num+"までの素数の数は"+p_cnt+"つです。");
        System.out.println("一覧を表示しますか？");
        System.out.print("please Yes or No ->");
        String judge = s_num.nextLine();
        if(judge.equals("Yes")||judge.equals("yes")||judge.equals("YES")||judge.equals("y")){
            for(int i=0;i<p_cnt;i++){
                System.out.println((i+1)+"つ目の素数:"+result[i]);
            }
        }else{
            System.out.println("Good Bye!!");
        }
    }
}
