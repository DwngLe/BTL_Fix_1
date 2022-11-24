package com.mycompany.btl;

public class Daily {
    private Main main;
    private Weather[] weather;
    private Clouds clouds;
    private Wind wind;
    private String dt_txt;
//    private Visibility visibility;

//    public Visibility getVisibility() {
//        return visibility;
//    }
//
//    public void setVisibility(Visibility visibility) {
//        this.visibility = visibility;
//    }

    public Daily(Main main, Weather[] weather, Wind wind, String dt_txt) {
        this.main = main;
        this.weather = weather;
//        this.clouds = clouds;
        this.wind = wind;
        this.dt_txt = dt_txt;
    }

    public Clouds getClouds() {
        return clouds;
    }

    public void setClouds(Clouds clouds) {
        this.clouds = clouds;
    }

    public Main getMain() {
        return main;
    }

    public void setMain(Main main) {
        this.main = main;
    }

    public Weather[] getWeather() {
        return weather;
    }

    public void setWeather(Weather[] weather) {
        this.weather = weather;
    }

//    public Clouds getClouds() {
//        return clouds;
//    }
//
//    public void setClouds(Clouds clouds) {
//        this.clouds = clouds;
//    }

    public Wind getWind() {
        return wind;
    }

    public void setWind(Wind wind) {
        this.wind = wind;
    }

    public String getDt_txt() {
        return dt_txt;
    }

    public void setDt_txt(String dt_txt) {
        this.dt_txt = dt_txt;
    }
    
    
}
