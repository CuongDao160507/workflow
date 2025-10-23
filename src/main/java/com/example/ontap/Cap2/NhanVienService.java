package com.example.ontap.Cap2;

import java.util.ArrayList;
import java.util.List;

public class NhanVienService {
    List<NhanVien> listNV = new ArrayList<>();

    public boolean addNhanVien(NhanVien nhanVien) {
        if (nhanVien == null) {
            throw new IllegalArgumentException("nhanVien is null");
        }
        if (nhanVien.getLuong() <= 0) {
            throw new IllegalArgumentException("Luong is null");
        }
        if (nhanVien.getLuong() < 0 || nhanVien.getLuong() > 1000) {
            throw new IllegalArgumentException("Luong chi nhan tu 0 den 1000");
        }
        if (nhanVien.getMaNV() == null || nhanVien.getMaNV().trim().isEmpty()) {
            throw new IllegalArgumentException("MaNV is null");
        }
        if (nhanVien.getTenNV() == null || nhanVien.getTenNV().trim().isEmpty()) {
            throw new IllegalArgumentException("TenNV is null");
        }
        if (nhanVien.getTuoi() <= 0) {
            throw new IllegalArgumentException("Tuoi is null");
        }
        if (nhanVien.getPhongBan() == null) {
            throw new IllegalArgumentException("PhongBan is null");
        }
        if (nhanVien.getTenNV().matches("^[a-zA-Z\\s] + $")) throw new IllegalArgumentException("Ten NV khong duoc chua ky tu dac biet va so");
        listNV.add(nhanVien);
        return true;
    }

//    Neu de chi co update
    public boolean addNV(NhanVien nhanVien) {
        listNV.add(nhanVien);
        return true;
    }

//    Update
    public boolean updateNhanVien(String maNV, String tenNV, int tuoi, double luong, String phongBan) {
        if (luong < 0 || luong > 1000) throw new IllegalArgumentException("Luong chi nhan tu 0 den 1000");
        if (luong <= 0) throw new IllegalArgumentException("Luong is null");
        if (tenNV == null || tenNV.trim().isEmpty()) throw new IllegalArgumentException("TenNV is null");
        if (tenNV.matches("^[a-zA-Z\\s] + $")) throw new IllegalArgumentException("Ten NV khong duoc chua ky tu dac biet va so");
        if (tuoi <= 0) throw new IllegalArgumentException("Tuoi is null");
        if (phongBan == null) throw new IllegalArgumentException("PhongBan is null");

        for (NhanVien nv : listNV) {
            if (nv.getMaNV().equals(maNV)) {
                nv.setTenNV(tenNV);
                nv.setTuoi(tuoi);
                nv.setLuong(luong);
                nv.setPhongBan(phongBan);
                return true;
            }
        }
        throw new IllegalArgumentException("Khong tim thay nhan vien voi id:" + maNV);
    }

}
