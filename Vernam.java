import java.lang.Math;
public class Vernum {

    public static void main(String args[]) {

        String text = args[0];
        char[] arText = text.toCharArray();
        String cipher = new String("XYZHG");
        char[] arCipher = cipher.toCharArray();
        char[] encoded = new char[5];
        System.out.println("Encoded " + text + " to be... ");

        for (int i = 0; i < arText.length; i++) {
            encoded[i] =  (char) (arText[i] ^ arCipher[i]);
            System.out.print(encoded[i]);
        }
        System.out.println("\nDecoded to be... ");
        for (int i = 0; i < encoded.length; i++) {
            char temp = (char) (encoded[i] ^ arCipher[i]);
            System.out.print(temp);
        }
     }
}
