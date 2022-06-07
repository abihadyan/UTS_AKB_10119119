package com.example.uts_akb_10119119.Interface;

//NIM     : 10119119
//NAMA    : MUHAMMAD HADYAN NUR ADABI
//KELAS   : IF-3

public interface Presenter <T extends View>{
    void onAttach(T View);
    void onDetach();
}
