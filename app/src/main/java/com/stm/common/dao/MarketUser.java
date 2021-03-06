package com.stm.common.dao;

/**
 *
 * 상인 정보 엔티티 클래스
 *
 * 시장 정보, 유저 정보
 *
 * @author dongjooKim
 */

public class MarketUser extends Base {
    private Market market;
    private User user;

    public MarketUser() {
        super();
    }

    public MarketUser(long id, String createdAt, String updatedAt) {
        super(id, createdAt, updatedAt);
    }

    public MarketUser(Market market, User user) {
        super();
        this.market = market;
        this.user = user;
    }

    public Market getMarket() {
        return market;
    }

    public void setMarket(Market market) {
        this.market = market;
    }

    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }

    @Override
    public long getId() {
        return super.getId();
    }

    @Override
    public void setId(long id) {
        super.setId(id);
    }

    @Override
    public String getCreatedAt() {
        return super.getCreatedAt();
    }

    @Override
    public void setCreatedAt(String createdAt) {
        super.setCreatedAt(createdAt);
    }

    @Override
    public String getUpdatedAt() {
        return super.getUpdatedAt();
    }

    @Override
    public void setUpdatedAt(String updatedAt) {
        super.setUpdatedAt(updatedAt);
    }

    @Override
    public String toString() {
        return "MarketUser [market=" + market + ", user=" + user + ", getMarket()=" + getMarket() + ", getUser()="
                + getUser() + ", getId()=" + getId() + ", getCreatedAt()=" + getCreatedAt() + ", getUpdatedAt()="
                + getUpdatedAt() + ", hashCode()=" + hashCode() + ", getClass()=" + getClass() + ", toString()="
                + super.toString() + "]";
    }

}