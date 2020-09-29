package com.josrangel.interfaces;

import java.util.Random;

public class Animal {

    OnClickAnimal callback;

    interface OnClickAnimal{
        void selecciona(int posicion);
    }

    public Animal(OnClickAnimal callback){
        this.callback = callback;
        this.callback.selecciona(new Random().nextInt());
    }
}
