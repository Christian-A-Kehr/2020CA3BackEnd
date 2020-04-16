/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dtos;

/**
 *
 * @author Christian
 */
public class OurDTO {
    private String firstJoke, firstRef, secondJoke,Secondref;

    public OurDTO(ChuckDTO cDTO, DadDTO dDTO) {
        this.firstJoke = cDTO.getValue();
        this.firstRef = cDTO.getUrl();
        this.secondJoke = dDTO.getJoke();
        this.Secondref = "https://icanhazdadjoke.com/";
    }

    public String getFirstJoke() {
        return firstJoke;
    }

    public void setFirstJoke(String firstJoke) {
        this.firstJoke = firstJoke;
    }

    public String getFirstRef() {
        return firstRef;
    }

    public void setFirstRef(String firstRef) {
        this.firstRef = firstRef;
    }

    public String getSecondJoke() {
        return secondJoke;
    }

    public void setSecondJoke(String secondJoke) {
        this.secondJoke = secondJoke;
    }

    public String getSecondref() {
        return Secondref;
    }

    public void setSecondref(String Secondref) {
        this.Secondref = Secondref;
    }

    @Override
    public String toString() {
        return "OurDTO{" + "firstJoke=" + firstJoke + ", firstRef=" + firstRef + ", secondJoke=" + secondJoke + ", Secondref=" + Secondref + '}';
    }


}