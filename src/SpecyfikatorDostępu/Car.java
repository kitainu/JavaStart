package SpecyfikatorDostępu;

 public class Car {

     private int year;
     private String brand;
     private String model;
     private String color;

//     // konstruktor 1
//     protected Car(int year, String brand, String model, String color){
//         this(year,brand,model);
//         this.color = color;
//     }
     //konstruktor 2
     public Car(int year, String brand, String model, String color){
         this.year=year;
         this.brand = brand;
         this.model = model;
         this.color=color;
     }

     public String getBrand() {
         return brand;
     }
     public void setBrand(String brand){
         this.brand=brand;
     }
     public String getModel(){
         return model;
     }
     public void setModel( String model){
         this.model =model;
     }
     public String getColor(){
         return color;
     }
     public void setColor(String color){
         this.color =color;
     }
     public int getYear(){
         return year;
     }
     public void setYear(int year){
         this.year = year;
     }


     @Override
     public String toString() {
         return "Car{" + "year=" + year + ", brand='" + brand + '\'' + ", model='" + model + '\'' + ", color='" + color + '\'' + '}';
     }
 }
