/*DAOクラスでselectされた値を格納するクラス*/

package com.internousdev.template.dto;

public class LoginDTO {

/*テーブルから取得するデータに対応したフィールド変数宣言*/
	private String loginId;
	private String loginPassword;
	private String userName;
	private boolean loginFlg = false;

/*フィールド変数に対応したgetter&setter定義
 * Actionから呼び出され、フィールド値をActionに渡す*/


	public String getLoginId() {
			return loginId;
	}
	public void setLoginId(String loginId) {
			this.loginId = loginId;
	}

	public String getLoginPassword() {
			return loginPassword;
	}
	public void setLoginPassword(String loginPassword) {
			this.loginPassword = loginPassword;
	}

	public String getUserName() {
			return userName;
	}
	public void setUserName(String userName) {
			this.userName = userName;
	}

	public boolean getLoginFlg() {
			return loginFlg;
	}
	public void setLoginFlg(boolean loginFlg) {
			this.loginFlg = loginFlg;
	}
}
