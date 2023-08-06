package com.backend.ufc.concurrent;

//package com.amigoscode.customer;
//package com.example.demo;

import java.util.*;

public class extrasol
{
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        int ar[][]={ {89, 90},
                {-10, 20},
                {-50, 0},
                {70, 90},
                {90, 91},
                {90, 95}};
        int v[][]=mergeOverlappingIntervals(ar);
        Arrays.stream(v).forEach(ss->{System.out.print(ss[0]+"-"+ss[1]+" ");});
        System.out.println();
    }
    public static int[][] mergeOverlappingIntervals(int[][] intervals) {
        // Write your code here.
        ArrayList<Integer[]> arl = new ArrayList<>();
        int n=intervals.length;
        intervals=Arrays.stream(intervals).sorted((i1,i2)->{
            if(i1[0]<i2[0]) return -1;
            else if(i1[0]==i2[0]){
                return i1[1]<i2[1] ? -1:i1[1]>i2[1]?1:0;
            }
            else return 1;
        }).toArray(int[][]::new);
        Arrays.stream(intervals).forEach(ss->System.out.print(ss[0]+" "+ss[1]+" ||"));
        System.out.println();
        for(int i=0;i<intervals.length;){
            int ithInterval[]=intervals[i];
            int j=i+1;
            while(j<n&&ithInterval[1]>=intervals[j][0]){
                ithInterval[1]=ithInterval[1]<intervals[j][1]?intervals[j][1]:ithInterval[1];
                ithInterval[0]=intervals[j][0]<ithInterval[0]?intervals[j][0]:ithInterval[0];
                j+=1;
            }
            Integer newArray[]={ithInterval[0],ithInterval[1]};
            arl.add(newArray);
            i=j;
        }
        arl.stream().forEach(e->{System.out.println(e[0]+" "+e[1]);});
        return arl.stream().map(u->Arrays.stream(u).mapToInt(i->i).toArray()).toArray(int[][]::new);
    }
    public static int[][] mergeOverlappingIntervals2(int[][] intervals) {
        // Write your code here.
        int [][] sortedIntervals= intervals.clone();
        Arrays.sort(sortedIntervals,(a,b)->Integer.compare(a[0],b[0]));
        List<int[]> mergedIntervals= new ArrayList<int[]>();
        int [] currentInterval = sortedIntervals[0];
        mergedIntervals.add(currentInterval);
        for(int [] nextInterval :sortedIntervals){
            int currentIntervalEnd=currentInterval[1];
            int nextIntervalStart= nextInterval[0];
            int nextIntervalEnd= nextInterval[1];
            if(currentIntervalEnd>= nextIntervalStart){
                currentInterval[1]= Math.max(currentIntervalEnd,nextIntervalEnd);
            }
            else{
                currentInterval = nextInterval;
                mergedIntervals.add(currentInterval);
            }
        }
        return mergedIntervals.toArray(new int[mergedIntervals.size()][]);
    }
}
