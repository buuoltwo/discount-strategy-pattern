package com.github.hcsp.polymorphism;

public class OnlyVipDiscountStrategy extends Discount95Strategy {
    @Override
    public int discount(int price, User user) {
        if(user.isVip()) {
            return super.discount(price, user);

        }
        return price;
    }
}
