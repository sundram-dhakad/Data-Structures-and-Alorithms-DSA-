package Heaps;

public class HuffmanMain {
    public static void main(String[] args) throws Exception{
        String str = "abracadabra";

        HuffmanCoder hf = new HuffmanCoder(str);
        String cs = hf.encode(str);
        System.out.println(cs);
        String ds = hf.decode(cs);
        System.out.println(ds);
    }
}
