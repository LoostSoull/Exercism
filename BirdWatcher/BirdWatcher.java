package br.com.BirdWatcher;

public class BirdWatcher {

	static int[] birds = { 2, 5, 0, 7, 4, 1 };

	public static void getLastWeek() {

		for (int v = 0; v < birds.length; v++) {

			System.out.print(birds[v] + " , ");
		}
	}

	public static void getToday() {
		System.out.println(birds[5]);
	}

	public static void incrementTodaysCount() {

		System.out.println(birds[0]);
	}

	public static void getCountForFirstDays() {

		int sum = 0;
		for (int i = 0; i < birds.length; i++) {

			sum += birds[i];
		}
		System.out.println(sum);
	}

	public static void hasDayWithoutBirds() {

		boolean res = true;
		for (int v = 0; v < birds.length; v++) {

			if (birds[v] == 0) {

				res = true;
				System.out.println(res);
			}

		}

	}

	public static void getBusyDays() {
		int n = 0;
		for (int c = 0; c < birds.length; c++) {
			if (birds[c] >= 5) {
				n = n + 1;
			}

		}
		System.out.println(n);
	}

}
