package singraul.hacker.rank;

import java.util.Scanner;
// https://programs.programmingoneonone.com/2021/07/hackerrank-bear-and-steady-gane-problem-solution.html
public class BearAndSteadyGene {
// All test cases passed 
	public static void main(String[] args) {
		 /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        String s = in.next();
        String genes = "ATGC";
        int [] cnt = new int[4];
        int left = 0;
        for(int i=0;i<n;i++){
            int cur = genes.indexOf(s.charAt(i));
            if(cnt[cur] + 1 > n / 4) {left = i-1; break;}
            cnt[cur] ++ ;
        }
        if(left == 0){
            System.out.println(0);
            return;
        }
        int res = n;
        int right = n-1;
        for(int i = left; i >= 0; i--){
            int cur;
            while(right>0){
                cur = genes.indexOf(s.charAt(right));
                if(cnt[cur] + 1 > n/4) break;
                cnt[cur]++;
                right -- ;
            }
            cur = genes.indexOf(s.charAt(i));
            cnt[cur] -- ;
            res = Math.min(res, right-i);
        }
        System.out.println(res);

	}

}
