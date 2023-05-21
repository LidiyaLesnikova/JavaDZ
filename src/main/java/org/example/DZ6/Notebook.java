package org.example.DZ6;

import java.lang.reflect.Type;

public class Notebook {
    String brandNotebook;
    String typeHD;
    Integer volumeHD;
    Integer volumeRAM;
    String nameOS;
    String colorProduct ;
    String countryManufacture;
    Double price;

    public Notebook(String brandNotebook, String typeHD, Integer volumeHD, Integer volumeRAM, String nameOS,
                    String colorProduct, String countryManufacture, Double price) {
        this.brandNotebook = brandNotebook;
        this.typeHD = typeHD;
        this.volumeHD = volumeHD;
        this.volumeRAM = volumeRAM;
        this.nameOS = nameOS;
        this.colorProduct = colorProduct;
        this.countryManufacture = countryManufacture;
        this.price = price;
    }

    @Override
    public String toString() {
        return  '\n'+"Бренд = '" + brandNotebook + '\'' +
                ", жесткий диск = " + typeHD +' '+ volumeHD +"Mb"+
                ", размер RAM = " + volumeRAM +
                ", OS = " + nameOS +
                ", цвет = " + colorProduct +
                ", страна производства = " + countryManufacture +
                ", цена = " + price +"руб.";
    }

    public Object getField(Integer num) {
        Object rez = null;
        switch (num) {
            case 1:
                rez = brandNotebook;
                break;
            case 2:
                rez = typeHD;
                break;
            case 3:
                rez = volumeHD;
                break;
            case 4:
                rez = volumeRAM;
                break;
            case 5:
                rez = nameOS;
                break;
            case 6:
                rez = colorProduct;
                break;
            case 7:
                rez = countryManufacture;
                break;
            case 8:
                rez = price;
                break;
        }
        return rez;
    }
}
