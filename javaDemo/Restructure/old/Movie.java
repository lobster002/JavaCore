package javaDemo.Restructure.old;

/**
 * 影片
 *
 * @author vayi
 * @date 2018/7/30
 * @since 0.0.1
 */
public class Movie {

    public static final int childrens = 2;
    public static final int regular = 0;
    public static final int new_release = 1;

    private String title;
    private int priceCode;

    public Movie(String title, int priceCode) {
        super();
        this.title = title;
        this.priceCode = priceCode;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public int getPriceCode() {
        return priceCode;
    }

    public void setPriceCode(int priceCode) {
        this.priceCode = priceCode;
    }

}
