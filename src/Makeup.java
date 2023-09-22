/**
 * @author Leonhard Leung
 * Date: 09/22/2023
 */

public class Makeup {
    private String brand;
    private String product;
    private String type;
    private String shade;
    private String skinType;
    private String finishType;

    public Makeup(String b, String p, String t, String s, String sT, String fT) {
        brand = b;
        product = p;
        type = t;
        shade = s;
        skinType = sT;
        finishType = fT;
    } // end of constructor

    public Makeup(String b, String p) {
        brand = b;
        product = p;
    } // end of constructor

    public String getBrand() {
        return brand;
    }

    public String getProduct() {
        return product;
    }

    public String getType() {
        return type;
    }

    public String getShade() {
        return shade;
    }

    public String getSkinType() {
        return skinType;
    }

    public String getFinishType() {
        return finishType;
    }

    public void setBrand(String b) {
        brand = b;
    }

    public void setProduct(String p) {
        product = p;
    }

    public void setType(String t) {
        type = t;
    }

    public void setShade(String s) {
        shade = s;
    }

    public void setSkinType(String sT) {
        skinType = sT;
    }

    public void setFinishType(String fT) {
        finishType = fT;
    }

    public String toString() {
        return "Brand: " + brand + "\n" +
                "Product: " + product + "\n" +
                "Type: " + type + "\n" +
                "Shade: " + shade + "\n" +
                "Skin Type: " + skinType + "\n" +
                "Finish: " + finishType + "\n";
    } // end of toString method
} // end of Makeup class
