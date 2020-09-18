import java.time.LocalDate;
import java.util.Arrays;
import java.util.List;

public class HandSanitizerBottle {
    private String brand;
    private int volumeInMl, volumeRemaining;
    private float alcoholPercentage;
    private LocalDate expirationDate;
    private double price;

    public HandSanitizerBottle(String brand, int volumeInMl, int volumeRemaining, float alcoholPercentage, LocalDate expirationDate, double price) {
        setBrand(brand);
        setVolumeInMl(volumeInMl);
        setVolumeRemaining(volumeRemaining);
        setAlcoholPercentage(alcoholPercentage);
        setExpirationDate(expirationDate);
        setPrice(price);
    }

    public String getBrand() {
        return brand;
    }

    /**
     * This will validate that the argument matches one of the following brands:
     * 'Utsav's Elixer
     * 'Bikers' Clean Hand'
     * 'Coffee Scent'
     * @param brand is the private variable string
     */
    public void setBrand(String brand) {
        List<String> validBrands = Arrays.asList("Rachit's Elixer","Biker's Clean Hand","Coffee Scent");
        if(validBrands.contains(brand))
        this.brand = brand;
        else
            throw new IllegalArgumentException("valid brands are:"+validBrands);
    }

    public int getVolumeInMl() {
        return volumeInMl;
    }

    public void setVolumeInMl(int volumeInMl) {
        if(volumeInMl>=10 && volumeInMl<=5000)
        this.volumeInMl = volumeInMl;
        else
            throw new IllegalArgumentException("volume must be 10-5000 ml");
    }

    public int getVolumeRemaining() {
        return volumeRemaining;
    }

    public void setVolumeRemaining(int volumeRemaining) {
        if(volumeRemaining<=0 || volumeRemaining>volumeInMl)
            throw new IllegalArgumentException("volume must be >0-"+volumeInMl);
        else
        this.volumeRemaining = volumeRemaining;
    }

    public float getAlcoholPercentage() {
        return alcoholPercentage;
    }

    public void setAlcoholPercentage(float alcoholPercentage) {
        if(alcoholPercentage>=90 && alcoholPercentage<=99)
        this.alcoholPercentage = alcoholPercentage;
        else
            throw new IllegalArgumentException("alcohol% must be 90-99");
    }

    public LocalDate getExpirationDate() {
        return expirationDate;
    }

    public void setExpirationDate(LocalDate expirationDate) {
        if(expirationDate.isAfter(LocalDate.now()))
        this.expirationDate = expirationDate;
        else
            throw new IllegalArgumentException("Expiration date need to be in future");
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        if(price>0 && price<=100)
        this.price = price;
        else
             throw new IllegalArgumentException("price must be 1-100");
    }

    public String toString(){
        return String.format("%s, holds %d ml and costs $%.2f", brand, volumeInMl, price);
    }
}
