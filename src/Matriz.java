
import java.awt.Point;
import java.util.ArrayList;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author JoseDiego
 */
public class Matriz {
    protected int f,c;
    private int [][]matriz;
    
    public Matriz(int[][] m,int f, int c) {
        this.f = f;
        this.c = c;
        matriz = m;
    }
    
    public int suma(int fil,int col){
            if(col<c)
                return matriz[fil][col]+suma(fil,col+1);
            else if(col==c && fil<f-1)
                    return suma(fil+1,0);
                        else return 0;
    }
   
    public ArrayList<Point> busqueda(int val){
        return busqueda(0,val,new ArrayList<Point>());
    }
    public ArrayList<Point> busqueda(int fil,int val,ArrayList<Point> v2){
        ArrayList<Point>v=v2;
        for(int x=0;x<c;x++){
            if(matriz[fil][x]==val){v.add(new Point(fil,x));}
        }
        if(fil<f-1){
            return busqueda(fil+1,val,v);
        }else return v;
    }
   
    public ArrayList<Integer> diagonal(int index){
        if(c != f)
            return null;
        else
            if(index ==1)
            return diagonalNormal(0,new ArrayList<Integer>());
                else
                    return diagonalInvertida(c-1,new ArrayList<Integer>());
    }
    
    private ArrayList<Integer> diagonalNormal(int n, ArrayList<Integer> v2){
        ArrayList<Integer>v=v2;
        if(n==c)return v;
            else{
            v.add(matriz[n][n]);
            return diagonalNormal(n+1,v);
        }    
    }
    
    private ArrayList<Integer> diagonalInvertida(int n, ArrayList<Integer> v2){
        ArrayList<Integer>v=v2;
        if(n==-1)return v;
            else{
            v.add(matriz[n][n]);
            return diagonalInvertida(n-1,v);
        }    
    }
    
    public void valRandom(){
        for(int i = 0;i<f;i++)
            for(int w = 0; w<c;w++)
                matriz[i][w] = (int)(Math.random()*100);
    }
    
}
