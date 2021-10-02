package codePractice;

public class Hello {

    public int rob(int[] houses) {

        if(houses.length==1)return houses[0];
        if(houses.length==2)return Math.max(houses[0],houses[1]);

        int max=houses[0];
        for(int i=2;i<houses.length;i++){
            houses[i]=houses[i]+max;
            max=Math.max(max,houses[i-1]);

        }

        return Math.max(houses[houses.length-1],houses[houses.length-2]);
    }

    public static void main(String[] args) {

        System.out.println("Hello world");



    }
}
