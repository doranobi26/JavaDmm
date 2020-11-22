
public class Continue01 {
	public static void main(String[] args) {
        for (int count = 10; count < 26; count++) {
            if (count == 12) {
                continue;
            }
            System.out.println("Continue01 = " + count);
        }
    }

}
