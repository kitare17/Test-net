package model.entity;

import java.text.DecimalFormat;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author quang
 */
public class Cart {

    private List<Items> cart;
    DecimalFormat formatter = new DecimalFormat("#,###,###");

    public Cart() {
        cart = new ArrayList<>();
    }
    
    
    public String addItems(Items item) {
        if (cart.isEmpty()) {
            cart.add(item);
            return "=========>CART : add Thanh Cong<==========";
        } else {
            for (Items items : cart) {
                if (items.equal(item)) {
                    Items hang = cart.get(cart.indexOf(items));
                    hang.setAmmout(hang.getAmmout() + item.getAmmout());
                    return "=========>CART : add Thanh Cong<==========";

                }
            }
            cart.add(item);
            return "=========>CART : add Thanh Cong<==========";
        }
    }

    public double getThanhTien(double phatsinh) {
        double tong = 0;
        for (Items item : cart) {
            tong += item.getPrice();
        }
        return tong + phatsinh;
    }

    public String getThanhTienString(double phatsinh) {
        if (cart.isEmpty()) {
            return "0";
        }
        return formatter.format(getThanhTien(phatsinh));

    }

    public List<Items> getCart() {
        return cart;
    }

//    public void setCart(List<Items> cart) {
//        this.cart = cart;
//    }
    public String increaseAmmount(String id) {
        if (cart.isEmpty()) {
            return "=========>Khong ton tai san pham increaseAmmount(String id) <==========";
        } else {
            for (Items items : cart) {
                if (items.getProduct().getProductId().equals(id)) {
                    Items hang = cart.get(cart.indexOf(items));
                    if (hang.getAmmout() == hang.getProduct().getProductAmount()) {
                        return "=========>CART : Tang Thanh Cong increaseAmmount(String id)<==========";
                    }
                    hang.setAmmout(hang.getAmmout() + 1);
                    return "=========>CART : Tang Thanh Cong increaseAmmount(String id)<==========";

                }
            }
            return "=========>CART : Tang Thanh Cong<==========";
        }
    }

    public String decreaseAmmount(String id) {
        if (cart.isEmpty()) {
            return "=========>Khong ton tai san pham decreaseAmmount(String id) <==========";
        } else {
            for (Items items : cart) {
                if (items.getProduct().getProductId().equals(id)) {
                    Items hang = cart.get(cart.indexOf(items));
                    if (hang.getAmmout() ==1) {
                        return "=========>CART : giam  Thanh Cong decreaseAmmount(String id)<==========";
                    }
                    hang.setAmmout(hang.getAmmout() - 1);
                    return "=========>CART : giam  Thanh Cong decreaseAmmount(String id)<==========";

                }
            }
            return "=========>CART : giam Thanh Cong decreaseAmmount(String id)<==========";
        }
    }
    public String removeItem(String id) {
         if (cart.isEmpty()) {
            return "=========>Khong ton tai san pham decreaseAmmount(String id) <==========";
        } else {
            for (Items items : cart) {
                if (items.getProduct().getProductId().equals(id)) {
                    cart.remove(cart.indexOf(items));
                    return "=========>CART : remove Thanh Cong<==========";

                }
            }
            return "=========>CART : remove Thanh Cong removeItem(String id)<==========";
        }
    }
}
