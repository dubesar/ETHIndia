package com.example.hackathonpune;

import java.util.ArrayList;
import java.util.List;

public class Bytetolistconv {
    public List<Byte> convertBytesToList(byte[] bytes) {
        final List<Byte> list = new ArrayList<>();
        for (byte b : bytes) {
            list.add(b);
        }
        return list;
    }
}