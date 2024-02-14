/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.ui;

import jakarta.inject.Named;
import jakarta.faces.view.ViewScoped;
import java.io.Serializable;

/**
 *
 * @author kamba
 */
@Named(value = "testBean")
@ViewScoped
public class testBean implements Serializable{

    public testBean(){
        keyword = "hogehoge";
    }
    
    public String getHoge(){
        return "Hoge";
    }
    
    private final String keyword;
    public String GetKeyword(){
        return keyword;
    }
}
