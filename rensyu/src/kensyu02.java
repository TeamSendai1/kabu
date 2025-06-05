public class kensyu02 {

	public static void main(String[] args) {
		double tousigaku = 3;
		double haitou = 0.02;
		final int tuki=18;
		double soutosi = 0;
		double zikotosi = 0;
		double rieki = 0;
		
		for(int i = 0; i < 40; i++) {
			zikotosi += tousigaku*tuki;
			if(i == 0) {
				soutosi += zikotosi+ (zikotosi/10);
			}
			soutosi += (zikotosi + soutosi)*haitou + zikotosi + (zikotosi/10);
			rieki += (soutosi*haitou) + tousigaku/10;
		}
		
		
		System.out.println("総投資額:" + soutosi + "万円");
		System.out.println("総自己投資額:" + zikotosi);
		System.out.println("総利益:" + rieki);
		if(soutosi != zikotosi + rieki) {
			System.out.println("error");
		}
	}
}
