public class kensyu02 {

	public static void main(String[] args) {
		System.out.println("京セラ持ち株投資会で得られる利益を計算するプログラムです");
		System.out.print("毎月何円積み立てるか入力してください(３万円→3)>");
		//毎月の投資額
		double tousigaku = new java.util.Scanner(System.in).nextDouble();
		System.out.println();
		
		System.out.print("配当利回りを入力してください(1% → 0.01)>");
		//配当利回り
		double haitou = new java.util.Scanner(System.in).nextDouble();
		System.out.println();
		
		System.out.print("何年運用するか入力してください>");
		//運用年数
		int nen = new java.util.Scanner(System.in).nextInt();
		System.out.println();
		
		//一年を何か月にするか
		final int tuki=18;
		//たかだそうしは天才
		//ふじうちかずは
		//総投資額
		double soutosi = 0;
		
		//自分が投資した額
		double zikotosi = 0;
		
		//自分の出していないお金
		double rieki = 0;
		
		//一年の投資額(複利ぬき)
		double nengaku = tuki * (tousigaku + (tousigaku/10));
		
		for(int i = 0; i < nen; i++) {
			zikotosi += tuki * tousigaku;
			if(i == 0) {
				soutosi += nengaku;
				rieki += tousigaku/10;
			}else {
				rieki += ((soutosi + nengaku)*(haitou)) + tousigaku/10;
				soutosi = (soutosi + nengaku)*(1+haitou);
			}
			
		}
		
		
		System.out.println("総投資額:" + soutosi + "万円");
		System.out.println("総自己投資額:" + zikotosi);
		System.out.println("総利益:" + rieki);
		if(soutosi != zikotosi + rieki) {
			System.out.println("error");
		}
	}
}
