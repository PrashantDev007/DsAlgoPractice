package codePractice;

import java.util.HashMap;

public class UniqueBinarySearchTrees {

    HashMap<Integer,Integer>hm=new HashMap<>();
    public int numTrees(int n) {
        if(n<=1)return 1;
        int result=0;
        for(int i=0;i<n;i++){
            int v2=1;
            int v1=1;
            v2=(hm.get(n-1-i)!=null)?hm.get(n-1-i):numTrees(n-1-i);

            v1=(hm.get(i)!=null)?hm.get(i):numTrees(i);
            result=result+(v2*v1);
        }
        hm.put(n,result);
        return result;
    }
    public static void main(String[] args) {

    }
}
