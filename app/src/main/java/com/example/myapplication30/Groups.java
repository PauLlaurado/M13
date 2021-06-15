package com.example.myapplication30;

import java.util.ArrayList;

public class Groups {
    private String idgroup;
    ArrayList<Tira> tiras;

    /**
     * @param idgroup
     * @param tiras
     */
    public Groups(String idgroup, ArrayList<Tira> tiras) {
        this.idgroup = idgroup;
        this.tiras = tiras;
    }

    /**
     * @return
     */
    public String getIdgroup() {
        return idgroup;
    }

    /**
     * @param idgroup
     */
    public void setIdgroup(String idgroup) {
        this.idgroup = idgroup;
    }

    /**
     * @return
     */
    public ArrayList<Tira> getTiras() {
        return tiras;
    }

    /**
     * @param tiras
     */
    public void setTiras(ArrayList<Tira> tiras) {
        this.tiras = tiras;
    }
}