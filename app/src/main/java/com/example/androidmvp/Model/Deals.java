package com.example.androidmvp.Model;

public class Deals {
    String internalName;
    String title;
    String metacriticLink;
    String dealID;
    String storeID;
    int gameID;
    Float salePrice;
    Float normalPrice;
    String isOnSale;
    Float savings;
    Float metacriticScore;
    String steamRatingText;
    Float steamRatingPercent;
    String steamRatingCount;
    String steamAppID;
    Double releaseDate;
    Double lastChange;
    Float dealRating;
    String thumb;

    public Deals(String internalName, String title, String metacriticLink, String dealID, String storeID,
                         int gameID, Float salePrice, Float normalPrice, String isOnSale, Float savings,
                         Float metacriticScore, String steamRatingText, Float steamRatingPercent, String steamRatingCount,
                         String steamAppID, Double releaseDate, Double lastChange, Float dealRating, String thumb) {
        this.internalName = internalName;
        this.title = title;
        this.metacriticLink = metacriticLink;
        this.dealID = dealID;
        this.storeID = storeID;
        this.gameID = gameID;
        this.salePrice = salePrice;
        this.normalPrice = normalPrice;
        this.isOnSale = isOnSale;
        this.savings = savings;
        this.metacriticScore = metacriticScore;
        this.steamRatingText = steamRatingText;
        this.steamRatingPercent = steamRatingPercent;
        this.steamRatingCount = steamRatingCount;
        this.steamAppID = steamAppID;
        this.releaseDate = releaseDate;
        this.lastChange = lastChange;
        this.dealRating = dealRating;
        this.thumb = thumb;
    }

    public String getInternalName() {
        return internalName;
    }

    public void setInternalName(String internalName) {
        this.internalName = internalName;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getMetacriticLink() {
        return metacriticLink;
    }

    public void setMetacriticLink(String metacriticLink) {
        this.metacriticLink = metacriticLink;
    }

    public String getDealID() {
        return dealID;
    }

    public void setDealID(String dealID) {
        this.dealID = dealID;
    }

    public String getStoreID() {
        return storeID;
    }

    public void setStoreID(String storeID) {
        this.storeID = storeID;
    }

    public int getGameID() {
        return gameID;
    }

    public void setGameID(int gameID) {
        this.gameID = gameID;
    }

    public Float getSalePrice() {
        return salePrice;
    }

    public void setSalePrice(Float salePrice) {
        this.salePrice = salePrice;
    }

    public Float getNormalPrice() {
        return normalPrice;
    }

    public void setNormalPrice(Float normalPrice) {
        this.normalPrice = normalPrice;
    }

    public String getIsOnSale() {
        return isOnSale;
    }

    public void setIsOnSale(String isOnSale) {
        this.isOnSale = isOnSale;
    }

    public Float getSavings() {
        return savings;
    }

    public void setSavings(Float savings) {
        this.savings = savings;
    }

    public Float getMetacriticScore() {
        return metacriticScore;
    }

    public void setMetacriticScore(Float metacriticScore) {
        this.metacriticScore = metacriticScore;
    }

    public String getSteamRatingText() {
        return steamRatingText;
    }

    public void setSteamRatingText(String steamRatingText) {
        this.steamRatingText = steamRatingText;
    }

    public Float getSteamRatingPercent() {
        return steamRatingPercent;
    }

    public void setSteamRatingPercent(Float steamRatingPercent) {
        this.steamRatingPercent = steamRatingPercent;
    }

    public String getSteamRatingCount() {
        return steamRatingCount;
    }

    public void setSteamRatingCount(String steamRatingCount) {
        this.steamRatingCount = steamRatingCount;
    }

    public String getSteamAppID() {
        return steamAppID;
    }

    public void setSteamAppID(String steamAppID) {
        this.steamAppID = steamAppID;
    }

    public Double getReleaseDate() {
        return releaseDate;
    }

    public void setReleaseDate(Double releaseDate) {
        this.releaseDate = releaseDate;
    }

    public Double getLastChange() {
        return lastChange;
    }

    public void setLastChange(Double lastChange) {
        this.lastChange = lastChange;
    }

    public Float getDealRating() {
        return dealRating;
    }

    public void setDealRating(Float dealRating) {
        this.dealRating = dealRating;
    }

    public String getThumb() {
        return thumb;
    }

    public void setThumb(String thumb) {
        this.thumb = thumb;
    }
}
