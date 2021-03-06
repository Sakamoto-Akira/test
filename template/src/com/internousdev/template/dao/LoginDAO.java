package com.internousdev.template.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

import com.internousdev.template.dto.LoginDTO;
import com.internousdev.template.util.DBConnector;

public class LoginDAO {

/*LoginDTOを最後呼び出しに戻し元に渡す。
 * つまり、LoginDTOを戻り値にしたメッソド作成*/

	public LoginDTO getLoginUserInfo(String loginUserId,String loginPassword){
//DB接続コード
		DBConnector dbConnector = new DBConnector();
		Connection connection = dbConnector.getConnection();

		LoginDTO loginDTO = new LoginDTO();

/*DBから値を検索*/
		String sql = "SELECT * FROM login_user_transaction where login_id = ? AND login_pass = ?";

/*try～catch文・・・エラー時の表示実行処理*/
/*preparedStatement=DBまで運んでくれる箱*/
		try{
			PreparedStatement preparedStatement = connection.prepareStatement(sql);

/*定義したSQL文の1番目の？にActionから送られたid,2番目にpassが入る*/

			preparedStatement.setString(1,loginUserId);
			preparedStatement.setString(2,loginPassword);

/*select文の実行メソッド(暗記)*/
			ResultSet resultSet = preparedStatement.executeQuery();

/*select文でDBから取得した情報をString型変換してDTOクラスに格納
 LoginDTOクラスのsetName,setPasswordを利用*/

			if(resultSet.next()){
				loginDTO.setLoginId(resultSet.getString("login_id"));
				loginDTO.setLoginPassword(resultSet.getString("login_pass"));
				loginDTO.setUserName(resultSet.getString("user_name"));

/*DTOから送られてきた値が入っていれば【true】*/
//【!】否定の論理演算子
				if(!(resultSet.getString("login_id").equals(null))){
					loginDTO.setLoginFlg(true);
				}
			}
		}catch (Exception e){
			e.printStackTrace();
		}

/*dtoに入った値を、呼び出し元であるActionクラスに渡す*/
		return loginDTO;

	}
}
