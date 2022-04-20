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
        hash_lin.add("30");
        hash_lin.add("6");
        hash_lin.add("8");
        hash_lin.add("гф");
        hash_lin.add("я");
        hash_lin.add("д");
        System.out.println(hash_lin.del("50"));
        System.out.println(hash_lin.del("д"));
        System.out.println(hash_lin.search("25"));
        System.out.println(hash_lin.search("р"));

        Hash_Chain hash_ch = new Hash_Chain(10);
        hash_ch.add("5");
        hash_ch.add("10");
        hash_ch.add("25");
        hash_ch.add("3");
        hash_ch.add("50");
        hash_ch.add("30");
        hash_ch.add("6");
        hash_ch.add("8");
        hash_ch.add("гф");
        hash_ch.add("я");
        hash_ch.add("д");
        int[] arr = hash_ch.search("25");
        for (int i = 0; i < 2; i++) {
            System.out.printf("%d ",arr[i]);
        }
        System.out.printf("\n");
        arr = hash_ch.del("ф");
        for (int i = 0; i < 2; i++) {
            System.out.printf("%d ",arr[i]);
        }
        System.out.printf("\n");
        arr = hash_ch.del("д");
        for (int i = 0; i < 2; i++) {
            System.out.printf("%d ",arr[i]);
        }
        System.out.printf("\n");
        arr = hash_ch.search("д");
    }

}
