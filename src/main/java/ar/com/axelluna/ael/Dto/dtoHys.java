/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ar.com.axelluna.ael.Dto;
import javax.validation.constraints.NotBlank;
/**
 *
 * @author axeleif
 */


public class dtoHys {
    @NotBlank
    private String porcentaje;
    @NotBlank
    private String image;
    @NotBlank
    private boolean showImage;
    @NotBlank
    private int height;
    @NotBlank
    private int width;
    @NotBlank
    private boolean showTitle;
    @NotBlank
    private String title;
    @NotBlank
    private String fontSize;
    
    //Constructores

    public dtoHys() {
    }

    public dtoHys(String porcentaje, String image, boolean showImage, int height, int width, boolean showTitle, String title, String FontSize) {
        this.porcentaje = porcentaje;
        this.image = image;
        this.showImage = showImage;
        this.height = height;
        this.width = width;
        this.showTitle = showTitle;
        this.title = title;
        this.fontSize = fontSize;
    }
    
    //Getters & Setters

    public String getPorcentaje() {
        return porcentaje;
    }

    public void setPorcentaje(String porcentaje) {
        this.porcentaje = porcentaje;
    }

    public String getImage() {
        return image;
    }

    public void setImage(String image) {
        this.image = image;
    }

    public boolean isShowImage() {
        return showImage;
    }

    public void setShowImage(boolean showImage) {
        this.showImage = showImage;
    }

    public int getHeight() {
        return height;
    }

    public void setHeight(int height) {
        this.height = height;
    }

    public int getWidth() {
        return width;
    }

    public void setWidth(int width) {
        this.width = width;
    }

    public boolean isShowTitle() {
        return showTitle;
    }

    public void setShowTitle(boolean showTitle) {
        this.showTitle = showTitle;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getFontSize() {
        return fontSize;
    }

    public void setFontSize(String fontSize) {
        this.fontSize = fontSize;
    }


    
}