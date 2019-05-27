package com.internousdev.ecsite.dto;

public class BuyItemDTO {

	//テーブルカラムに対応したフィールド変数宣言

	public int id;

	public String itemName;

	public String itemPrice;

	//フィールド変数に対応したGetter%Setterを定義

	public String getItemName(){
		return itemName;
	}

	public void setItemName(String itemName){
		this.itemName = itemName;
	}

	public String getItemPrice(){
		return itemPrice;
	}

	public void setItemPrice(String itemPrice){
		this.itemPrice = itemPrice;
	}

	public int getId(){
		return id;
	}

	public void setId(int id){
		this.id = id;
	}

}
