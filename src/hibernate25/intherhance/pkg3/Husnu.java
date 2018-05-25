
package hibernate25.intherhance.pkg3;

import javax.persistence.Column;
import javax.persistence.Entity;

@Entity
public class Husnu extends Sarki{
    @Column(name="Sinif_ismi")
    private String className;
    @Column(name="Kolaj_adi")
    private String collage;
    
    public Husnu(){}
    
    
    public Husnu(int id,String name,int age ,String c_lassName,String c_ollage){
        super(id,name,age);
        
        this.className = c_lassName;
        this.collage = c_ollage;
    }

    public String getClassName() {
        return className;
    }

    public void setClassName(String className) {
        this.className = className;
    }

    public String getCollage() {
        return collage;
    }

    public void setCollage(String collage) {
        this.collage = collage;
    }
    
    
    
    
}
