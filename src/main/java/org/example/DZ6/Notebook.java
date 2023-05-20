package org.example.DZ6;

public class Notebook {
    String brandNotebook;
    Integer volumeHD;
    Integer volumeRAM;
    String nameOS;
    String colorProduct ;
    String countryManufacture;

    public Notebook(String brandNotebook, Integer volumeHD, Integer volumeRAM, String nameOS, String colorProduct, String countryManufacture) {
        this.brandNotebook = brandNotebook;
        this.volumeHD = volumeHD;
        this.volumeRAM = volumeRAM;
        this.nameOS = nameOS;
        this.colorProduct = colorProduct;
        this.countryManufacture = countryManufacture;
    }

//    @Override
//    public String toString() {
//        return  "nameBook='" + nameBook + '\'' +
//                ", author='" + author + '\'' +
//                ", price=" + price +
//                ", yearPublication=" + yearPublication +
//                ", numberPages=" + numberPages + "\n";
//    }
    @java.lang.Override
    public java.lang.String toString() {
        return "Notebook{" +
                "brandNotebook='" + brandNotebook + '\'' +
                ", volumeHD=" + volumeHD +
                ", volumeRAM=" + volumeRAM +
                ", nameOS='" + nameOS + '\'' +
                ", colorProduct='" + colorProduct + '\'' +
                ", countryManufacture='" + countryManufacture + '\'' +
                '}';

    //public Integer getNumberPages() {
        return numberPages;
    }
}
