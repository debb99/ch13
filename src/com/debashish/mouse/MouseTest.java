package com.debashish.mouse;

public class MouseTest {
	public static void main(String[] args) {
		Island Game = new Island();

		int[] values = new int[4];
		for (int a : values) {
			a = 0;
		}

		// 1 = ESC
		// 2 = DROWN
		// 3 = STARVED

		for (int i = 0; i < 1000; i++) {
			Island.Status tempStatus = Game.simulate();
			if (tempStatus == Island.Status.ESCAPED) {
				values[1]++;
			}

			if (tempStatus == Island.Status.DROWNED) {
				values[2]++;
			}

			if (tempStatus == Island.Status.STARVED) {
				values[3]++;
			}
		}

		System.out.printf("Escaped: %d (%.1f%%) %nDrowned: %d  (%.1f%%) %nStarved: %d  (%.1f%%) %n", values[1],
				(float) (values[1]) / 10, values[2], (float) (values[2]) / 10, values[3], (float) (values[3]) / 10);
	}
}
