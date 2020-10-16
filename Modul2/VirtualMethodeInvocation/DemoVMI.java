package com.AndraR.Modul2.VirtualMethodeInvocation;

import org.w3c.dom.xpath.XPathResult;

public class DemoVMI {
    public static void main(String[] args) {
        Child child = new Child();
        Parent parentChild = new Child();

        child.getData();
        parentChild.getData();
    }
}
