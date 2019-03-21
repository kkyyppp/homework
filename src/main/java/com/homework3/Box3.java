package com.homework3;

public class Box3 extends Box {

    public Box3() {
        super(23f, 14f, 13f);
    }

    @Override
    public boolean validate(float length, float width, float height) {
        return (length < this.length) &&  (width < this.width) && (height < this.height) ;
    }
}
