public class Murmur3Test {
    public static void main(String[] args) {
        String text = "The quick brown fox jumps over the lazy dog";
        int expectedHash1 = 0x78e69e27;
        int actualHash1 = Murmur3.hash32(text.getBytes(), 1);
        if (expectedHash1 != actualHash1) {
            System.out.println("Expected hash value is " + expectedHash1 + " got " +actualHash1);
        } else {
            System.out.println("Test success " + actualHash1);
        }

    }
}
