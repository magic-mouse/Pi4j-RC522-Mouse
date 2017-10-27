package com.kvedro.kiosk.bootstrap;

import com.liangyuen.util.RaspRC522;

public class Bootstrap {

    public static void main(String[] args){

        RaspRC522 rc522=new RaspRC522();
        int back_bits[]=new int[1];
        String strUID;
        byte tagid[]=new byte[5];
        int i,status;
        byte blockaddress=8;
        byte sector=15,block=2;

    }

}
