package controller;

public class FatorialDuploController {

	public FatorialDuploController() {
		super();
	}
	public int fatduplo(int fat) {
		if (fat <= 1) {
			return 1;
		} else {
			return fat * fatduplo(fat - 2);
		}
	}
}
