import java.util.*;
import java.util.stream.Collectors;

public class Main {


    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int selection;
        ArrayList<Notebook> laptops = new ArrayList<>();
        ArrayList<CellPhone> phones = new ArrayList<>();


        phones.add( new CellPhone("Samsung", 1, 100, "M21", 2300.0, 7.5, 12, 64, 5.4, 4000, 6, "BLUE "));
        phones.add( new CellPhone("Samsung", 1, 101, "A51", 3500.0, 11.0, 5, 128, 5.8, 5000, 8, "BLACK"));
        phones.add( new CellPhone("Lenovo", 2, 102, "K6", 3200.0, 5.5, 4, 128, 6.1, 4800, 8, "BLACK"));
        phones.add( new CellPhone("Lenovo", 2, 103, "VIBE", 2700.0, 7.0, 3, 64, 5.8, 4200, 6, "RED  "));
        phones.add( new CellPhone("Apple", 3, 104, "13", 4300.0, 4.0, 12, 128, 5.2, 4000, 8, "WHITE"));
        phones.add( new CellPhone("Apple", 3, 105, "12", 4000.0, 6.0, 20, 128, 5.1, 3800, 8, "BLACK"));
        phones.add( new CellPhone("Huawei", 4, 106, "P40", 2400.0, 2.5, 6, 64, 5.5, 5500, 8, "BLACK"));
        phones.add( new CellPhone("Huawei", 4, 107, "P30", 3100.0, 3.5, 6, 64, 6.2, 5000, 6, "BLUE "));
        phones.add( new CellPhone("Casper", 5, 108, "VIA", 2600.0, 6.5, 2, 64, 5.2, 4400, 8, "WHITE"));
        phones.add( new CellPhone("Asus  ", 6, 109, "GO", 3000.0, 5.5, 3, 64, 5.5, 4900, 6, "BLACK"));
        phones.add( new CellPhone("HP    ", 7, 110, "X3", 3400.0, 6.0, 20, 128, 5.1, 3800, 8, "BLUE "));
        phones.add( new CellPhone("Xiaomi", 8, 111, "MI3", 2500.0, 7.5, 14, 64, 5.5, 5200, 8, "BLACK"));
        phones.add( new CellPhone("Xiaomi", 8, 112, "RED", 3000.0, 9.5, 12, 128, 6.2, 5400, 8, "RED  "));
        phones.add( new CellPhone("Monster", 9, 113, "A5", 2300.0, 2.5, 4, 64, 5.5, 5000, 6, "BLACK"));

        laptops.add( new Notebook("Samsung", 1, 200, "GALAXY", 7500.0, 7.5, 10, 512, 15.6, 16, "BLACK"));
        laptops.add( new Notebook("Lenovo", 2, 201, "IDEAPAD", 6400.0, 3.5, 4, 512, 14, 6, "WHITE"));
        laptops.add( new Notebook("Apple", 3, 202, "MACBOOK", 8200.0, 4.0, 17, 512, 15.6, 16, "GREY "));
        laptops.add( new Notebook("Huawei", 4, 203, "MATEBOOK", 5900.0, 1.5, 5, 256, 14, 8, "BLACK"));
        laptops.add( new Notebook("Casper", 5, 204, "NIRVANA", 6600.0, 4.5, 6, 512, 15.6, 8, "BLACK"));
        laptops.add( new Notebook("Asus", 6, 205, "VIVO BOOK", 6100.0, 2.5, 3, 512, 15.6, 8, "WHITE"));
        laptops.add( new Notebook("HP", 7, 206, "ENVY BOOK", 6300.0, 7.5, 10, 256, 14, 16, "BLUE "));
        laptops.add( new Notebook("Xiaomi", 8, 207, "MI AIR", 5800.0, 7.5, 15, 512, 14, 8, "BLACK"));
        laptops.add( new Notebook("Monster", 9, 208, "TULPAR", 6700.0, 10.5, 20, 512, 15.6, 16, "GREY "));

        System.out.println("***** WELCOME TO PATIKASTORE *****");


        do {
            System.out.println("1 - Notebook Transactions\n2 - Cellphone Transactions\n3 - List Brands \n0 - Exit");
            System.out.print("\nSELECTION => ");
            selection = scan.nextInt();
            switch (selection){
                case 0:
                    System.out.println("\nHAVE A NICE DAY!");
                    break;
                case 1:
                    System.out.println("\n| BRAND - SERIES \t\t | ID\t\t | PRICE \t\t\t | STORAGE\t | SIZE \t | RAM \t\t | COLOR \t\t | STOCK ");
                    System.out.println("----------------------------------------------------------------------------------------------------------------------");
                    laptops.forEach(laptop -> System.out.println("| "+laptop.toString()));
                    System.out.println("\nDo you want to add(1) or delete(2) product? You can go back with 0");
                    int transaction = scan.nextInt();
                    switch (transaction){
                        case 1:
                            System.out.print("Brand Name = ");
                            String brandName = scan.next();
                            System.out.print("Brand Id = ");
                            int brandId = scan.nextInt();
                            System.out.print("Product id = ");
                            int id = scan.nextInt();
                            System.out.print("Product name = ");
                            String name = scan.next();
                            System.out.print("Product price = ");
                            double price = scan.nextDouble();
                            System.out.print("Product stock = ");
                            int stock = scan.nextInt();
                            System.out.print("Product storage = ");
                            int storage = scan.nextInt();
                            System.out.print("Product size = ");
                            double size = scan.nextDouble();
                            System.out.print("Product ram = ");
                            int ram = scan.nextInt();
                            System.out.print("Product color = ");
                            String color = scan.next();

                            laptops.add( new Notebook(brandName, brandId, id,name, Math.round(price), 5.0, stock, storage, size, ram, color));

                            System.out.println("\n| BRAND - SERIES \t\t | ID\t\t | PRICE \t\t\t | STORAGE\t | SIZE \t | RAM \t\t | COLOR \t\t | STOCK ");
                            System.out.println("----------------------------------------------------------------------------------------------------------------------");
                            laptops.forEach(laptop -> System.out.println("| "+laptop.toString()));

                            break;
                        case 2:
                            System.out.print("Product id => ");
                            int deleteId = scan.nextInt();
                            laptops.remove(deleteId-200);
                            System.out.println("Product id"+deleteId+" deleted successfully!");
                            break;
                        case 0:
                            break;
                        default:
                            System.out.println("⚠️INVALID INPUT ⚠️");
                    }
                    break;
                case 2:
                    System.out.println("\n| BRAND - SERIES \t | ID\t\t | PRICE \t\t\t | MEMORY\t | SIZE \t | BATTERY \t | RAM \t\t | COLOR \t\t | STOCK ");
                    System.out.println("-------------------------------------------------------------------------------------------------------------------------------");
                    phones.forEach(phone -> System.out.println("| "+phone.toString()));
                    System.out.println("\nDo you want to add(1) or delete(2) product? You can go back with 0");
                    int process = scan.nextInt();
                    switch (process){
                        case 1:
                            System.out.print("Brand Name = ");
                            String brandName = scan.next();
                            System.out.print("Brand Id = ");
                            int brandId = scan.nextInt();
                            System.out.print("Product id = ");
                            int id = scan.nextInt();
                            System.out.print("Product name = ");
                            String name = scan.next();
                            System.out.print("Product price = ");
                            double price = scan.nextDouble();
                            System.out.print("Product stock = ");
                            int stock = scan.nextInt();
                            System.out.print("Product memory = ");
                            int memory = scan.nextInt();
                            System.out.print("Product size = ");
                            double size = scan.nextDouble();
                            System.out.print("Product battery = ");
                            int battery = scan.nextInt();
                            System.out.print("Product ram = ");
                            int ram = scan.nextInt();
                            System.out.print("Product color = ");
                            String color = scan.next();

                            phones.add( new CellPhone(brandName, brandId, id,name, Math.round(price), 3.0, stock, memory, size,battery, ram, color));

                            System.out.println("\n| BRAND - SERIES \t | ID\t\t | PRICE \t\t\t | MEMORY\t | SIZE \t | BATTERY \t | RAM \t\t | COLOR \t\t | STOCK ");
                            System.out.println("-------------------------------------------------------------------------------------------------------------------------------");
                            phones.forEach(phone -> System.out.println("| "+phone.toString()));

                            break;
                        case 2:
                            System.out.print("Product id => ");
                            int deleteId = scan.nextInt();
                            phones.remove(deleteId-100);
                            System.out.println("Product id"+deleteId+" deleted successfully!");
                            break;
                        case 0:
                            break;
                        default:
                            System.out.println("⚠️INVALID INPUT ⚠️");
                    }
                    break;
                case 3:
                    System.out.println("\n| OUR BRANDS ");
                    System.out.println("----------------");
                    Collections.sort(laptops, new OrderNameComparator());
                    for (Notebook notebook : laptops) {
                        System.out.println("| "+notebook.getBrandName());
                    }
                    break;
                default:
                    System.out.println("⚠️INVALID INPUT ⚠️\n Please try again..");
                    break;
            }
            System.out.println();
        }while (selection!=0);





    }
}
