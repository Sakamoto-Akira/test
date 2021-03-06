package com.internousdev.template.action;

/*Actionクラスのまとめ
 * 1:setter定義により、JSPでユーザーが入力した値がフィールドに格納される
 * 2:execute()メソッド定義
 * 3:条件分岐でSUCCESS/ERRORを決める
 * 4:execute()メソッドの結果を返す */


import java.util.Map;

import org.apache.struts2.interceptor.SessionAware;

import com.internousdev.template.dao.BuyItemDAO;
import com.internousdev.template.dao.LoginDAO;
import com.internousdev.template.dto.BuyItemDTO;
import com.internousdev.template.dto.LoginDTO;
import com.opensymphony.xwork2.ActionSupport;

/*implements SessionAware＝Actionへの拡張機能*/
public class LoginAction extends ActionSupport implements SessionAware{

/*フィールド変数・JSPから受け取る値【必ずJSPでの定義と同じ名前にする】*/
	private String loginUserId;
	private String loginPassword;
	private String result;

//1対1 対応の関係が格納されるもの
	private Map<String,Object> session;

/*メソッド名【execute】戻り値【result】初期値：【ERROR】を代入*/
	public String execute(){
		LoginDAO loginDAO = new LoginDAO();
		LoginDTO loginDTO = new LoginDTO();
		BuyItemDAO buyItemDAO = new BuyItemDAO();

/*初期値は最初に全てエラーにしておく*/
		result = ERROR;

/*JSPから送られてきたname,passを引数としてLoginDAOクラスのselect文を呼び出し
 その後、DAOで取得した結果をLoginDTOに代入*//*LoginDAOクラスへ値を送る*/
		loginDTO = loginDAO.getLoginUserInfo(loginUserId,loginPassword);

		session.put("loginUser",loginDTO);


/*入力値からユーザー情報の検索をする
 * ログイン成功時、次画面で【商品情報】が必要な為、取得する。
 */
/*ユーザーが入力した『ログインIDとパスワード』が
 DTOからもってきた値＝dto.getName(),dto.getPassword()にそれぞれ一致するか確認*/

		if(((LoginDTO)session.get("loginUser")).getLoginFlg()){

/*if文の条件一致で、戻り値【result】を【SUCCESS】に書き換える*/

		    result = SUCCESS;
		    BuyItemDTO buyItemDTO = buyItemDAO.getBuyItemInfo();

/*sessionについて
 * 履歴を残しておく*/
		session.put("login_user_id",loginDTO.getLoginId());
		session.put("id",buyItemDTO.getId());
		session.put("buyItem_name",buyItemDTO.getItemName());
		session.put("buyItem_price",buyItemDTO.getItemPrice());

		return result;

	}
		return result;
}

/*setName,setPassword【setter】の定義により、JSPでユーザーが入力した
 nameとpasswordとidの値がそれぞれのフィールド変数に格納される*/

/*値の保持の為、【getter】 使用*/
	public String getLoginUserId(){
		return loginUserId;
	}
	public void setLoginUserId(String loginUserId){
		this.loginUserId = loginUserId;
	}

	public String getLoginPassword(){
		return loginPassword;
	}
	public void setLoginPassword(String loginPassword){
		this.loginPassword = loginPassword;
	}

	public Map<String,Object>getSession(){
		return session;
	}
	@Override
	public void setSession(Map<String,Object>session){
		this.session = session;
	}
}