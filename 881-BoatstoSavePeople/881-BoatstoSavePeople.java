// Last updated: 9/6/2026, 8:22:15 PM
1class Solution {
2    public int numRescueBoats(int[] people, int limit) {
3        Arrays.sort(people);
4        int i=0;
5        int j=people.length-1;
6
7        int count=0;
8
9        while(i<=j){
10            int light=people[i];
11            int heavy=people[j];
12
13            if(light+heavy<=limit){
14                count++;
15                i++;
16                j--;
17            }else{
18                j--;
19                count++;
20            }
21        }
22
23        return count;
24
25
26    }
27}