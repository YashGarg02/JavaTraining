/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author yashgarg
 */
public class MOverride {

    public static void main(String[] args) {
        SBI sbi=new SBI();
        sbi.getROI();
        HDFC hdfc=new HDFC();
        hdfc.getROI();
        ICICI icici=new ICICI();
        icici.getROI();
    }
}
    

class RBI{
    public void getROI()
    {
        System.out.println("Interest rate b/w 6-10%");
    }
}

class SBI extends RBI
{

    @Override
    public void getROI() {
        super.getROI(); //will output the method of RBI class also.
        System.out.println("SBI offers 6.5%");
    }
}


class HDFC extends RBI
{

    @Override
    public void getROI() {
        //super.getROI(); //To change body of generated methods, choose Tools | Templates.
        System.out.println("HDFC offers 9.5%");
    }
    
}

class ICICI extends RBI
{

    @Override
    public void getROI() {
       // super.getROI(); //To change body of generated methods, choose Tools | Templates.
        System.out.println("ICICI offers 7%");
    }
}
