package org.example;

import jicheng.*;
public class Main {
    public static void main(String[] args) {
        teacher t = new teacher("坤坤",25);
        t.teach();
        Student s = new Student("小明",18,100);

        s.study();

    }
}
