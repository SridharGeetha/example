// public class Charger {

//     private String brand;
//     private int capacity;

//     public Charger(String brand, int capacity) {
//         this.brand = brand;
//         this.capacity = capacity;
//     }
//     public String getBrand() {
//         return brand;
//     }
//     public void setBrand(String brand) {
//         this.brand = brand;
//     }
//     public int getCapacity() {
//         return capacity;
//     }
//     public void setCapacity(int capacity) {
//         this.capacity = capacity;
//     }
    
// }
//  class  Os {

//     private String name;
//     private int size;

//     public String getName() {
//         return name;
//     }
//     public Os(String name, int size) {
//         this.name = name;
//         this.size = size;
//     }
//     public void setName(String name) {
//         this.name = name;
//     }
//     public int getSize() {
//         return size;
//     }
//     public void setSize(int size) {
//         this.size = size;
//     }

// }
//  class  Mobile {
//     Charger charger;
//     Os os = new Os("IOS",512);

//     void AttachCharge(Charger c){
//         this.charger = c;
//         // System.out.println(c.getBrand());
//         // System.out.println(c.getCapacity());
//     }

    
// }
// class Main{
//     public static void main(String[] args) {
//         Mobile m = new Mobile();
//         Charger c = new Charger("Redmi", 0);
//         m.AttachCharge(c);
//         // System.out.println(m.os.getName());
//         System.out.println(m.charger.getBrand());

//         m = null;
//         System.out.println(c.getBrand());
//     }
// }