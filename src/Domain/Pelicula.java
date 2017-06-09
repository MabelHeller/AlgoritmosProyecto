/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Domain;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Heller
 */
public class Pelicula {

    private int code;
    private String title;
    private int gender;
    private int total;
    private int subtitled;
    private int premier;
    public List<Pelicula> lista;

    public Pelicula(int code, String title, int gender, int total, int subtitled, int premier) {
        this.code = code;
        this.title = title;
        this.gender = gender;
        this.total = total;
        this.subtitled = subtitled;
        this.premier = premier;
    }

    public Pelicula() {
        this.lista = new ArrayList<Pelicula>();
        this.code = code;
        this.title = title;
        this.gender = gender;
        this.total = total;
        this.subtitled = subtitled;
        this.premier = premier;
    }

    public int getCode() {
        return code;
    }

    public List<Pelicula> getLista() {
        return lista;
    }

    public void setLista(List<Pelicula> lista) {
        this.lista = lista;
    }

    public void setCode(int code) {
        this.code = code;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public int getGender() {
        return gender;
    }

    public void setGender(int gender) {
        this.gender = gender;
    }

    public int getTotal() {
        return total;
    }

    public void setTotal(int total) {
        this.total = total;
    }

    public int getSubtitled() {
        return subtitled;
    }

    public void setSubtitled(int subtitled) {
        this.subtitled = subtitled;
    }

    public int getPremier() {
        return premier;
    }

    public void setPremier(int premier) {
        this.premier = premier;
    }

    @Override
    public String toString() {
        return "Pelicula:" + "code=" + code + ", title=" + title + ", gender=" + gender + ", total=" + total + ", subtitled=" + subtitled + ", premier=" + premier;
    }

}
