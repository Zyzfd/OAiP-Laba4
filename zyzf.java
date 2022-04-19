import Hash.Hash_Chain;
import Hash.Hash_Linear;

public class zyzf {
    
    public static void main(String[] args) {
        Hash_Linear hash_lin = new Hash_Linear(10);
        hash_lin.add("5");
        hash_lin.add("10");
        hash_lin.add("25");
        hash_lin.add("3");
        hash_lin.add("50");
        System.out.println(hash_lin.search("25"));

        Hash_Chain hash_ch = new Hash_Chain(10);
        hash_ch.add("5");
        hash_ch.add("10");
        hash_ch.add("25");
        hash_ch.add("3");
        hash_ch.add("50");
        int[] arr = hash_ch.search("25");
        for (int i = 0; i < 2; i++) {
            System.out.printf("%d ",arr[i]);
        }
        System.out.printf("\n");
        
    }

}
