/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ar.com.axelluna.ael.Entity;

/**
 *
 * @author axeleif
 */

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Hys {
    
    //declaramos la entidad
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;
    private String porcentaje;
    private String image;
    private boolean showImage;
    private int height;
    private int width;
    private boolean showTitle;
    private String title;
    private String fontSize;
    
    //Constructores

    public Hys() {
    }

    public Hys(
            String porcentajeHys, 
            String imageHys, 
            boolean showImageHys, 
            int heightHys,
            int widthHys,
            boolean showTitleHys,
            String titleHys,
            String fontSizeHys
    ){
        this.porcentaje = porcentajeHys;
        this.image = imageHys;
        this.showImage = showImageHys;
        this.height = heightHys;
        this.width = widthHys;
        this.showTitle = showTitleHys;
        this.title = titleHys;
        this.fontSize = fontSizeHys;
    }
    
    //Getters and setters

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

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