package com.company;

public class AgeException extends Throwable {

    AgeException(int age){
        super(InternalError(age));
    }
}
