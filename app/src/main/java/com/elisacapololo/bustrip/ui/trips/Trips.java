package com.elisacapololo.bustrip.ui.trips;

public class Trips {

   private String city_form;
   private String city_destination;
   private String hour_partida;
   private String hour_chegada;
   private  String date;
   //private String month;
   private String preco;
   private String paragens;

    public Trips() {}

    public Trips(String city_form, String city_destination, String hour_partida, String hour_chegada, String date, String preco, String paragens) {
        this.city_form = city_form;
        this.city_destination = city_destination;
        this.hour_partida = hour_partida;
        this.hour_chegada = hour_chegada;
        this.date = date;
       // this.month = month;
        this.preco = preco;
        this.paragens = paragens;
    }

    public String getCity_form() {
        return city_form;
    }

    public void setCity_form(String city_form) {
        this.city_form = city_form;
    }

    public String getCity_destination() {
        return city_destination;
    }

    public void setCity_destination(String city_destination) {
        this.city_destination = city_destination;
    }

    public String getHour_partida() {
        return hour_partida;
    }

    public void setHour_partida(String hour_partida) {
        this.hour_partida = hour_partida;
    }

    public String getHour_chegada() {
        return hour_chegada;
    }

    public void setHour_chegada(String hour_chegada) {
        this.hour_chegada = hour_chegada;
    }

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }

  /*  public String getMonth() {
        return month;
    }

    public void setMonth(String month) {
        this.month = month;
    }*/

    public String getPreco() {
        return preco;
    }

    public void setPreco(String preco) {
        this.preco = preco;
    }

    public String getParagens() {
        return paragens;
    }

    public void setParagens(String paragens) {
        this.paragens = paragens;
    }
}
