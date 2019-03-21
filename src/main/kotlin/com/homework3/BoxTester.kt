package com.homework3.kotlin

import java.util.*

fun main(args: Array<String>) {

    val scanner:Scanner = Scanner(System.`in`)

    val box3:Box3 = Box3(23f, 14f, 13f)
    val box5:Box5 = Box5(39.5f, 27.5f, 23f)

    var length:Float=0f
    var width:Float=0f
    var height:Float=0f

    while (true) {
        print("Please enter object's length: ")
        length = scanner.nextFloat()
        print("Please enter object's width: ")
        width = scanner.nextFloat()
        print("Please enter object's height: ")
        height = scanner.nextFloat()

        if (box3.vadidate(length, width, height))
            println("You could use {BOX_3}\n")
        else if (box5.vadidate(length, width, height))
            println("You could use {BOX_5}\n")
        else
            println("There is no suitable box for your object\n")
    }
}



abstract class BOX(val length:Float, val width:Float, val height:Float) {

    abstract fun vadidate( length:Float,  width:Float,  height:Float):Boolean
}

class Box3(length:Float, width:Float, height:Float): BOX(length, width, height) {

    override fun vadidate(length: Float, width: Float, height: Float): Boolean {
        return (length<this.length) && (width<this.width) && (height<this.height)
    }
}

class Box5(length:Float, width:Float, height:Float): BOX(length, width, height) {

    override fun vadidate(length: Float, width: Float, height: Float): Boolean {
        return (length<this.length) && (width<this.width) && (height<this.height)
    }
}