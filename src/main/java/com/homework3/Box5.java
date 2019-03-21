package com.homework3;

public class Box5 extends Box{

    public Box5() {
        super(39.5f, 27.5f, 23f);
    }

    @Override
    public boolean validate(float length, float width, float height) {
        return (length < this.length) &&  (width < this.width) && (height < this.height) ;
    }
}
