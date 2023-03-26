package Less6;

import java.util.Objects;

public class Notebook {
    private String model;
    private Double size;
    private String cpu;
    private String os;
    private Integer ram;
    private Integer ssd;

    public Notebook(String model, Double size, String cpu, String os, Integer ram, Integer ssd) {
        this.model = model;
        this.size = size;
        this.cpu = cpu;
        this.os = os;
        this.ram = ram;
        this.ssd = ssd;
    }


    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public Double getSize() {
        return size;
    }

    public void setSize(Double size) {
        this.size = size;
    }

    public String getCpu() {
        return cpu;
    }

    public void setCpu(String cpu) {
        this.cpu = cpu;
    }

    public String getOs() {
        return os;
    }

    public void setOs(String os) {
        this.os = os;
    }

    public Integer getRam() {
        return ram;
    }

    public void setRam(Integer ram) {
        this.ram = ram;
    }

    public Integer getSsd() {
        return ssd;
    }

    public void setSsd(Integer ssd) {
        this.ssd = ssd;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Notebook notebook = (Notebook) o;
        return Objects.equals(model, notebook.model) && Objects.equals(size, notebook.size) && Objects.equals(cpu, notebook.cpu) && Objects.equals(os, notebook.os) && Objects.equals(ram, notebook.ram) && Objects.equals(ssd, notebook.ssd);
    }

    @Override
    public int hashCode() {
        return Objects.hash(model, size, cpu, os, ram, ssd);
    }

    @Override
    public String toString() {
        return "Notebook : " +
                "model = '" + model + '\'' +
                ", size = " + size +
                ", cpu = '" + cpu + '\'' +
                ", os ='" + os + '\'' +
                ", ram = " + ram + "Gb" +
                ", ssd = " + ssd + "Gb";

    }
}
