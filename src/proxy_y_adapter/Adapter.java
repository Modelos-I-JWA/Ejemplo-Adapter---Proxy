/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package proxy_y_adapter;

/**
 *
 * @author estudiantes
 */
public class Adapter implements ObjetoAbstracto{

    public String hacerAlgo() {
        OtroObjeto obj = new OtroObjeto();
        return obj.HacerOtraCosa();
    }
    
}
