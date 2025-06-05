package company;

/**
 * 経理部員クラス
 * @author M.Takahashi
 */
public class AccountingEmployee extends AbsEmployee {
	/******** フィールド ******************************************/
	/**
	 * 担当業務
	 */
	private String workInCharge;

	/******** コンストラクタ **************************************/
	/**
	 * コンストラクタ（フィールド初期化）
	 * @param id フィールド id への設定値
	 * @param name フィールド name への設定値
	 * @param workInCharge フィールド workInCharge への設定値
	 */
	public AccountingEmployee(int id, String name, String workInCharge) {
		super(id, name, "経理部");
		this.workInCharge = workInCharge;
	}

	/******** メソッド ********************************************/
	/**
	 * 情報表示
	 */
	@Override
	public void displayInfo() {
		super.displayBasic();
		System.out.println("担当：" + workInCharge);
	}
}
