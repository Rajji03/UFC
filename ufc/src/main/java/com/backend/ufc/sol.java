package com.backend.ufc;

import java.util.HashMap;
import java.util.Scanner;

public class sol {

    static StringBuilder sbr = new StringBuilder();

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t-- > 0) {
        int n=sc.nextInt();
        long ar[]= new long[n];
        for(int i=0;i<n;i++){
            ar[i]=sc.nextLong();
        }
//        long ar[]={-1, 1 ,0, 0, 0 ,0};

        System.out.println(findSubarray(ar,n));
        }

    }

    public static long findSubarray(long[] ar ,int n)
    {
        //Your code here
        HashMap<Long,Integer> hm = new HashMap<>();
        long currentSum=0l;
        int ans=0;
        int cc=1;
        int calc=0;
        boolean flag=false;
        for(int i=0;i<n;i++){
            long val=ar[i];
            if(hm.containsKey(val+currentSum)||currentSum+val==0){ans+=1;}
            if(val+currentSum==0&&hm.containsKey(0l)){
                ans+=hm.get(0l);
            }
            if(val==0){
                flag=true;
                calc=cc-1+calc;
                ans+=1;
                cc+=1;
            }
            else{
                ans+=(cc>1)?calc:0;
                flag=false;
                cc=1;
            }
            currentSum+=val;
            if(currentSum==0)
                hm.put(currentSum,hm.getOrDefault(currentSum,0)+1);
            else
                hm.put(currentSum,0);

        }
        ans+=(cc>1)?calc:0;
        return ans;
    }


}
















