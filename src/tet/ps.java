/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tet;

/**
 *
 * @author Admin
 */
public class ps {
    private int tren;
    private int duoi;



    public int getTren() {
        return tren;
    }

    public void setTren(int tren) {
        this.tren = tren;
    }

    public int getDuoi() {
        return duoi;
    }

    public void setDuoi(int duoi) {
        this.duoi = duoi;
    }

    @Override
    public String toString() {
        return this.getTren()+"/"+this.getDuoi();
    }    
    public int UCLN(int x, int y){
        int kq = Math.min(x, y);
        while(kq >= 1){
            if(x%kq == 0 && y%kq == 0)
                return kq;
            kq--;
        }
        return kq;
    }       
    public void toiGian(){
        int s = this.UCLN(this.getTren(), this.getDuoi());
        this.setTren(this.getTren()/s);
        this.setDuoi(this.getDuoi()/s);
    }
   
    public void add(ps a, ps b){
        int tu;
        int mau;
        tu = (a.getTren()*b.getDuoi()+a.getDuoi()*b.getTren());
        mau = a.getDuoi()*b.getDuoi();
        ps c= new ps(tu,mau);
        c.toiGian();
        System.out.println(c.toString());
    }
    public void sub(ps a, ps b){
        
    }
    public void mul(ps a, ps b){
        
    }
    public void div(ps a, ps b){
        
    }

    public ps(int tren, int duoi) {
        this.tren = tren;
        this.duoi = duoi;
    }
    public ps(ps a,ps b,String phep){
        switch(phep){
            case"+":
                this.add(a, b);
                break;
            case"-":
                this.sub(a, b);
                break;
            case"*":
                this.mul(a, b);
                break;
            case":":
                this.div(a, b);
                break;
            default:
                break;
        }
    }
}
