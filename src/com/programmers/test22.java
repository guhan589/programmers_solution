package com.programmers;

public class test22 {
    /*최소공약수와 최소공배수*/
    public static void main(String[] args){
       /* int n =3;
        int m = 12;*/

        int n =17;
        int m =34;
        int[] result = solution(n,m);
    }
    public static int[] solution(int n , int m){
        int[] answer = new int[2];

        int temp;

        if(m<n) {
            temp = n;
            n = m;
            m = temp;
        }

        if(m%n==0) {
            answer[0] = n;
            answer[1] = m;
        } else {
            for(int i=1; i<n; i++) {
                if(n%i==0 && m%i==0) {
                    answer[0] = i;
                    answer[1] = (n*m)/i;
                }
            }
        }

        return answer;

    }
}
