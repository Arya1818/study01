package review;

public class swap {
	public static void main(String[] arts) {
		int[] ints = new int[5];
//		ints[0] = 1;
//		ints[1] = 2;
//		ints[2] = 3;
//		ints[3] = 4;
//		ints[4] = 5;

		int[] temp = new int[6];

		for (int i = 0; i < ints.length; i++) {
			temp[i] = ints[i];
		}
		temp[5] = 6;

		for (int i = 0; i < temp.length; i++) {
			System.out.println(temp[i]);
		}

	}

}
