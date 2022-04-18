import Hash.Hash;

public class zyzf {
    
    public static void main(String[] args) {
        Hash hash = new Hash(10);
        hash.add("5");
        hash.add("10");
        hash.add("25");
        hash.add("3");
        hash.add("50");
        System.out.println(hash.search("25"));
    }

}
