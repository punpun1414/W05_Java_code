public class W03_01_NetPrice {
    public static void main(String[] args) {
       //สร้างตัวแปรเพื่อเก็บค่าของแต่ละอย่่าง
      short price = 350;
       byte quantity = 10;
      byte percentDiscount = 5;
    
       int totalPrice = price * quantity;
    
      // int discount2 = totalPrice * 5 / 100;
       int discount = totalPrice * percentDiscount / 100;
       
       int netPrice = totalPrice - discount;

       System.out.println("ราคาสินค่ารวม = " + totalPrice + " บาท" );
       System.out.println("ราคาส่วนลด = " + discount + " บาท" );
       System.out.println("ราคาสินค้าสุทธิ = " + netPrice + " บาท" );
      
    }

}