package kr.co.song1126.otherapi_test01;

import java.util.ArrayList;

public class TestItems {
//    구분(지역)	관리센터명	센터유형	       연락처	주소	    주소(세)
//    area    Center        Center type   Contact   address     addressDetail
    int num;
    String area;//지역
    String center;//관리센터명
    String centerType;//센터유형
    String contact;//연락처
    String address;//주소
    String addressDetail;// 주소(세부)

    public TestItems(int num, String area, String center, String centerType, String contact, String address, String addressDetail) {
        this.num = num;
        this.area = area;
        this.center = center;
        this.centerType = centerType;
        this.contact = contact;
        this.address = address;
        this.addressDetail = addressDetail;
    }
}
