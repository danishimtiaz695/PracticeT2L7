import javax.faces.bean.ManagedBean;
import javax.faces.bean.RequestScoped;

@ManagedBean
@RequestScoped
public class CarBean {
    private String carName;
    private String model;
    private String color;
    private String id;
    private String regNo;

    public String getCarName() {
        return carName;
    }

    public void setCarName(String carName) {
        this.carName = carName;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getRegNo() {
        return regNo;
    }

    public void setRegNo(String regNo) {
        this.regNo = regNo;
    }

    public void showCarDetails() {
        System.out.println("Car Name: " + carName);
        System.out.println("Model: " + model);
        System.out.println("Color: " + color);
        System.out.println("ID: " + id);
        System.out.println("Registration Number: " + regNo);
    }
}