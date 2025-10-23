package com.example.ontap.Cap2;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class NhanVienServiceTest {
    NhanVienService nhanVienService;
    @BeforeEach
    void setUp() {
        nhanVienService = new NhanVienService();
    }

    //Add
//    TuongDuong
    @Test
    public void tuongDuong_testAddTrue() {
        NhanVien nhanVien = new NhanVien("1", "NQH", 18, 100, "CNTT");
        assertEquals(true, nhanVienService.addNhanVien(nhanVien));
    }

    @Test
    public void tuongDuong_testAddFalse() {
        assertThrows(IllegalArgumentException.class, () -> {
            NhanVien nhanVien = new NhanVien("1", "HNK", 18, -1000000, "CNTT");
            assertEquals(true, nhanVienService.addNhanVien(nhanVien));
        });
    }

    //    Bien
    @Test
    public void bienDuoi_testAdd() {
        assertEquals(true, nhanVienService.addNhanVien(new NhanVien("1", "Nguyen Quang Ha", 18, 1.0, "CNTT")));
    }

    @Test
    public void TrenBienDuoi_testAdd() {
        assertEquals(true, nhanVienService.addNhanVien(new NhanVien("1", "Nguyen Quang Ha", 18, 2.0, "CNTT")));
    }

    @Test
    public void duoiBienDuoi_testAdd() {
        assertThrows(IllegalArgumentException.class, () -> {
            assertEquals(true, nhanVienService.addNhanVien(new NhanVien("1", "Nguyen Quang Ha", 18, -1.0, "CNTT")));
        });
    }

    @Test
    public void bienTren_testAdd() {
        assertEquals(true, nhanVienService.addNhanVien(new NhanVien("1", "Nguyen Quang Ha", 18, 1000.0, "CNTT")));
    }

    @Test
    public void duoiBienTren_testAdd() {
        assertEquals(true, nhanVienService.addNhanVien(new NhanVien("1", "Nguyen Quang Ha", 18, 999.0, "CNTT")));
    }

    @Test
    public void trenBienTren_testAdd() {
        assertThrows(IllegalArgumentException.class, () -> {
            assertEquals(true, nhanVienService.addNhanVien(new NhanVien("1", "Nguyen Quang Ha", 18, 1001.0, "CNTT")));
        });
    }

    @Test
    public void null_testAdd() {
        assertThrows(IllegalArgumentException.class, () -> {
            nhanVienService.addNhanVien(null);
        });
    }

    @Test
    public void nullMaNV_testAdd() {
        assertThrows(IllegalArgumentException.class, () -> {
            nhanVienService.addNhanVien(new NhanVien(null, "Nguyen Quang Ha", 18, 1001.0, "CNTT"));
        });
    }

    @Test
    public void nullTenNV_testAdd() {
        assertThrows(IllegalArgumentException.class, () -> {
            nhanVienService.addNhanVien(new NhanVien("1", null, 18, 1001.0, "CNTT"));
        });
    }

    @Test
    public void nullTuoi_testAdd() {
        assertThrows(IllegalArgumentException.class, () -> {
            nhanVienService.addNhanVien(new NhanVien("1", "NQH", 0, 1001.0, "CNTT"));
        });
    }

    @Test
    public void nullLuong_testAdd() {
        assertThrows(IllegalArgumentException.class, () -> {
            nhanVienService.addNhanVien(new NhanVien("1", "NQH", 19, 0, "CNTT"));
        });
    }

    @Test
    public void nullPhongBan_testAdd() {
        assertThrows(IllegalArgumentException.class, () -> {
            nhanVienService.addNhanVien(new NhanVien("1", "NQH", 19, 199, null));
        });
    }

    //Update
    //TuongDuong
    @Test
    public void tuongDuong_testUpdateTrue() {
        NhanVien nhanVien = new NhanVien("1", "NQH", 18, 100, "CNTT");
        nhanVienService.addNhanVien(nhanVien);
        assertEquals(true, nhanVienService.updateNhanVien("1", "DVC", 20, 200, "TKDH"));
    }

    @Test
    public void tuongDuong_testUpdateFalse() {
        assertThrows(IllegalArgumentException.class, () -> {
            nhanVienService.addNhanVien(new NhanVien("1", "NQH", 18, 100, "CNTT"));
            nhanVienService.updateNhanVien("1", "DVC", 20, -200, "TKDH");
        });
    }



//    Bien
    @Test
    public void bienDuoi_testUpdate() {
        NhanVien nhanVien = new NhanVien("1", "NQH", 18, 200, "CNTT");
        nhanVienService.addNhanVien(nhanVien);
        assertEquals(true, nhanVienService.updateNhanVien("1", "DVC", 20, 1, "TKDH"));
    }

    @Test
    public void TrenBienDuoi_testUpdate() {
        NhanVien nhanVien = new NhanVien("1", "NQH", 18, 200, "CNTT");
        nhanVienService.addNhanVien(nhanVien);
        assertEquals(true, nhanVienService.updateNhanVien("1", "DVC", 20, 2, "TKDH"));
    }

    @Test
    public void duoiBienDuoi_testUpdate() {
        assertThrows(IllegalArgumentException.class, () -> {
            nhanVienService.addNhanVien(new NhanVien("1", "NQH", 18, 100, "CNTT"));
            nhanVienService.updateNhanVien("1", "DVC", 20, -1, "TKDH");
        });
    }

    @Test
    public void bienTren_testUpdate() {
        NhanVien nhanVien = new NhanVien("1", "NQH", 18, 200, "CNTT");
        nhanVienService.addNhanVien(nhanVien);
        assertEquals(true, nhanVienService.updateNhanVien("1", "DVC", 20, 1000, "TKDH"));
    }

    @Test
    public void DuoiBienTren_testUpdate() {
        NhanVien nhanVien = new NhanVien("1", "NQH", 18, 200, "CNTT");
        nhanVienService.addNhanVien(nhanVien);
        assertEquals(true, nhanVienService.updateNhanVien("1", "DVC", 20, 999, "TKDH"));
    }

    @Test
    public void TrenBienTren_testUpdate() {
        assertThrows(IllegalArgumentException.class, () -> {
            nhanVienService.addNhanVien(new NhanVien("1", "NQH", 18, 100, "CNTT"));
            nhanVienService.updateNhanVien("1", "DVC", 20, 1001, "TKDH");
        });
    }

    @Test
    public void testNullMaNV_testUpdate() {
        assertThrows(IllegalArgumentException.class, () -> {
            nhanVienService.addNhanVien(new NhanVien("1", "NQH", 18, 100, "CNTT"));
            nhanVienService.updateNhanVien(null, "DVC", 20, 1001, "TKDH");
        });
    }

    @Test
    public void testNullTenNV_testUpdate() {
        assertThrows(IllegalArgumentException.class, () -> {
            nhanVienService.addNhanVien(new NhanVien("1", "NQH", 18, 100, "CNTT"));
            nhanVienService.updateNhanVien("1", null, 20, 1001, "TKDH");
        });
    }

    @Test
    public void testNullTuoi_testUpdate() {
        assertThrows(IllegalArgumentException.class, () -> {
            nhanVienService.addNhanVien(new NhanVien("1", "NQH", 18, 100, "CNTT"));
            nhanVienService.updateNhanVien("1", "DVC", 0, 1001, "TKDH");
        });
    }

    @Test
    public void testNullLuong_testUpdate() {
        assertThrows(IllegalArgumentException.class, () -> {
            nhanVienService.addNhanVien(new NhanVien("1", "NQH", 18, 100, "CNTT"));
            nhanVienService.updateNhanVien("1", "DVC", 20, 0, "TKDH");
        });
    }

    @Test
    public void testNullPhongBan_testUpdate() {
        assertThrows(IllegalArgumentException.class, () -> {
            nhanVienService.addNhanVien(new NhanVien("1", "NQH", 18, 100, "CNTT"));
            nhanVienService.updateNhanVien("1", "DVC", 20, 1001, null);
        });
    }

//    ki tu dac biet va so - add + updat

    @Test
    public void testFailKiTuDacBiet_testUpdate() {
        assertThrows(IllegalArgumentException.class, () -> {
            nhanVienService.addNhanVien(new NhanVien("1", "NQH", 18, 100, "CNTT"));
            nhanVienService.updateNhanVien("1", "!@#$%^&*()_+!123", 20, 1001, "KTDH");
        });
    }


    @AfterEach
    void tearDown() {
        nhanVienService = null;
    }
}