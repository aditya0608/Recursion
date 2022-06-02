import java.util.ArrayList;
import java.util.HashMap;

public class Permutations {
    static ArrayList<ArrayList<Integer>> ans=new ArrayList<ArrayList<Integer>>();

    static ArrayList<Integer> temp=new ArrayList<Integer>();
    static HashMap<Integer,Integer> map=new HashMap<>();
    static ArrayList<Integer> A=new ArrayList<>();
    public static void main(String[] args) {

        ArrayList<Integer> B;

        A.add(1);
        A.add(2);
        A.add(3);
        B=A;
        Permute(B,0,temp);
        for(ArrayList<Integer> list:ans)
        {
            for(Integer ele:list)
                System.out.print(ele+"  ");
            System.out.println();
        }
    }



    public static void Permute(ArrayList<Integer> B,int idx,ArrayList<Integer> temp)
    {
        if(B.size()==0)
        {
            // System.out.print("Recahed here "+ A.size()+" ");
            ans.add(temp);
            return ;
        }
           for (int i = 0; i < A.size(); i++) {

                temp.add(B.get(i));
                //map.put(A.get(i), i);
                B.remove(0);
                Permute(B, i +1, temp);
                B.add(A.get(i));
                System.out.println("m back  for "+i +" "+B.size());

            }

    }
}
