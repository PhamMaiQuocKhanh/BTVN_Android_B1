package com.example.myapplication;

public class TinhTienKhanhSan {

    public enum Phong {
        thuong, vip
    }

    public static double tinhtien(Phong phong, float soGio) {
        double gia = (phong == Phong.thuong) ? 300000 : 700000;
        return gia * soGio;
    }
}


