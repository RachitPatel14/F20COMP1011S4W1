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
     * @param brand
     */
    public void setBrand(String brand) {
        List<String> validBrands = Arrays.asList("Utsav's Elixer","Biker's Clean Hand","Coffee Scent");
        if(brand.matches(String.valueOf(validBrands)))
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
        this.volumeRemaining = volumeRemaining;
    }

    public float getAlcoholPercentage() {
        return alcoholPercentage;
    }

    public void setAlcoholPercentage(float alcoholPercentage) {
        this.alcoholPercentage = alcoholPercentage;
    }

    public LocalDate getExpirationDate() {
        return expirationDate;
    }

    public void setExpirationDate(LocalDate expirationDate) {
        this.expirationDate = expirationDate;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }
}
