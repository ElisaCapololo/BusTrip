package com.elisacapololo.bustrip.ui.trips;

public class Trips {

   private String city_form;
   private String city_destination;
   private String partida;
   private String chegada;
   private String preco;

    public Trips() {}

    public Trips(String city_form, String city_destination, String partida, String chegada, String preco) {
        this.city_form = city_form;
        this.city_destination = city_destination;
        this.partida = partida;
        this.chegada = chegada;
        this.preco = preco;
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

    public String getPartida() {
        return partida;
    }

    public void setPartida(String partida) {
        this.partida = partida;
    }

    public String getChegada() {
        return chegada;
    }

    public void setChegada(String chegada) {
        this.chegada = chegada;
    }

    public String getPreco() {
        return preco;
    }

    public void setPreco(String preco) {
        this.preco = preco;
    }
}
