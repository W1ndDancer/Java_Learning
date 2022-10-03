package hw6;

import java.util.Objects;

public class Notebook implements Comparable<Notebook>{
    private int id;
    private String brand;
    private String model;
    private int price;
    private String cpu;
    private String video;
    private String Diagonal;
    private String color;
    private int ram;
    private int ssd;

    public Notebook(int id, String brand, String model, int price) {
        this.id = id;
        this.brand = brand;
        this.model = model;
        this.price = price;
    }

    public Notebook(int id, String brand, String model, int price, String cpu, String video, String Diagonal, int ram, int ssd, String color) {
        this.id = id;
        this.brand = brand;
        this.model = model;
        this.price = price;
        this.cpu = cpu;
        this.video = video;
        this.Diagonal = Diagonal;
        this.ram = ram;
        this.ssd = ssd;
        this.color = color;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public String getCpu() {
        return cpu;
    }

    public void setCpu(String cpu) {
        this.cpu = cpu;
    }

    public String getVideo() {
        return video;
    }

    public void setVideo(String video) {
        this.video = video;
    }

    public String getDiagonal() {
        return Diagonal;
    }

    public void setDiagonal(String Diagonal) {
        this.Diagonal = Diagonal;
    }

    public int getRam() {
        return ram;
    }

    public void setRam(int ram) {
        this.ram = ram;
    }

    public int getSsd() {
        return ssd;
    }

    public void setSsd(int ssd) {
        this.ssd = ssd;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    @Override
    public String toString() {
        return "Notebook{" +
                "id=" + id +
                ", brand='" + brand + '\'' +
                ", model='" + model + '\'' +
                ", price=" + price + " $" +
                ", cpu='" + cpu + '\'' +
                ", video='" + video + '\'' +
                ", Diagonal='" + Diagonal + '\'' +
                ", color='" + color + '\'' +
                ", ram=" + ram +
                ", ssd=" + ssd +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Notebook notebook = (Notebook) o;
        return ram == notebook.ram && ssd == notebook.ssd && Objects.equals(cpu, notebook.cpu)
                && Objects.equals(video, notebook.video) && Objects.equals(Diagonal, notebook.Diagonal);
    }

    @Override
    public int hashCode() {
        return Objects.hash(cpu, video, Diagonal, ram, ssd);
    }

    @Override
    public int compareTo(Notebook o) {
        return Integer.compare(this.price,o.price);
    }
}
