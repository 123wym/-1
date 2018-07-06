package com.djxs.qrcode;

import java.io.IOException;

public class Test {
  public static void main(String args[]) throws IOException{
	  Createqrcode8 a=new Createqrcode8();
	  String str = "BEGIN:VCARD\n"+
		"PHOTO;VALUE=uri:http://image.so.com/zv?ch=beauty#groupid=e265f6f313154ffc0fc6c506fb512584&dataindex=6&itemindex=1\n"+
		"FN;姓名:王亚梅\n"+
		"TITLE:计算机科学与技术专业\r\n"+
		"BDAY:1999-08-19\n"+
		"TEL;TYPE=cell:13483024838\n"+	
		"ADR;HOME:河北省邯郸市曲周县\n"+
		"URL;WORK;;;:https://baike.baidu.com/item/%E6%B2%B3%E5%8C%97%E7%A7%91%E6%8A%80%E5%B8%88%E8%8C%83%E5%AD%A6%E9%99%A2\n"+
		"END:VCARD";
	  a.Cqrcode(20,'Q',str,"d:/a.png",20,"d:/qrcode_1.png","255,0,0","0,0,255,");
	 
  }
}
