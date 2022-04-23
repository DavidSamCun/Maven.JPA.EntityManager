package services;

import entities.Cd;

import java.util.ArrayList;
import java.util.List;

public class CdServiceImp implements ObjectService<Cd> {
    List<Cd> cdList;

    public CdServiceImp(){
        this.cdList = new ArrayList<>();
    }

    @Override
    public Cd findById(int id) {
        return null;
    }

    @Override
    public List findall() {
        return null;
    }

    @Override
    public Cd update(Cd cd) {
        return null;
    }

    @Override
    public Cd create(Cd cd) {
        return null;
    }

    @Override
    public void delete(int id) {

    }
}
