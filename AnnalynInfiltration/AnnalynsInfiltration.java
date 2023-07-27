package br.com.AnnalynInfiltration;

public class AnnalynsInfiltration {
	

	public static boolean canFastAttack(boolean knightIsAwake){
		return !knightIsAwake;
	}
	
	public static boolean canSpy(boolean knightIsAwake,boolean archerIsAwake , boolean prisionerIsAwake ) {
		return knightIsAwake || prisionerIsAwake || archerIsAwake;
	}
	
	public static boolean canSignalPrisioner(boolean archerIsAwake ,boolean prisionerIsAwake) {
		return !archerIsAwake && prisionerIsAwake;
	}
	
	public static boolean canFreePrisioner(boolean knightIsAwake ,boolean archerIsAwake ,boolean prisionerIsAwake ,boolean petDogIsPresent) {
		if(petDogIsPresent) {
			return !knightIsAwake && !archerIsAwake && prisionerIsAwake;
		}
		return knightIsAwake && !prisionerIsAwake && !petDogIsPresent && archerIsAwake;
	}
	
}
