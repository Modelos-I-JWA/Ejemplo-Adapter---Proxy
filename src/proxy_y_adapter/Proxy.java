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
public class Proxy implements ObjetoAbstracto{

    @Override
    public String hacerAlgo() {
       ObjetoReal obj=new ObjetoReal();
       return obj.hacerAlgo();
    }
    public String hacerOtraCosa(){
        OtroObjeto otro=new OtroObjeto();
        return otro.adapter();
    }
}
