/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package proxy_y_adapter;

/**
 *
 * @author famil
 */
public class Proxy_Y_Adapter {

 
    public static void main(String[] args) {
        System.out.println("Programa proxy y adapter");
        Proxy proxy=new Proxy();
        System.out.println(proxy.hacerAlgo());
        System.out.println(proxy.hacerOtraCosa());
    }
    
}
