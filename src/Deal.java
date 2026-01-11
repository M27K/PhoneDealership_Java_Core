import java.io.*;
import java.sql.*;
import java.util.*;
// import java.util.io.*;
// import java.util.stream.IntStream;


public class Deal {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        

        smartPhone sm1 = new smartPhone("Samsung", 25000, "Silver");
        smartPhone sm2 = new smartPhone("iphone", 100000, "Orange");
        smartPhone sm3 = new smartPhone("Poco", 27000, "Yellow");
        smartPhone sm4 = new smartPhone("Nokia", 20000, "Gray");

       List<smartPhone> inventery = new ArrayList<>();
       inventery.add(sm1);
       inventery.add(sm2);
       inventery.add(sm3);
       inventery.add(sm4);

        List<smartPhone> list = new ArrayList<>();


        Emplyee em1 = new Emplyee("Mayur", 1);
        Emplyee em2 = new Emplyee("Zaid", 2);
        Emplyee em3 = new Emplyee("Gangya", 3);
        Emplyee em4 = new Emplyee("Pratik", 4);

        List<Emplyee> emp = new ArrayList<>();
        emp.add(em1);
        emp.add(em2);
        emp.add(em3);
        emp.add(em3);

        Map<Integer, Costmer> ctm = new HashMap<>();

        Costmer c1 = new Costmer(101,"A", 50000);
        Costmer c2 = new Costmer(102,"B", 10000);

        ctm.put(c1.id, c1);
        ctm.put(c2.id, c2);


        System.out.println("This Our Inventry for Mobiles");
        // for(int i = 0; i < inventery.size(); i++){
        //     System.err.println(i + "-->" + inventery.get(i));
        // }

//         IntStream
//         .range(0, inventery.size())
//         .forEach((i) -> System.out.println(i + "-->" + inventery.get(i)));
// 
//         System.out.println("Choose index");
//         int select = sc.nextInt();
//         smartPhone sp = inventery.get(select);

        String url = "jdbc:mysql://localhost:3306/SalesData";
        try{
            Connection con = DriverManager.getConnection(url, "root", "Mysql@272");

            Statement st = con.createStatement();
            ResultSet rs = st.executeQuery("select * from Inventry");

            while(rs.next()){
                    System.out.println(
                        rs.getInt("Mnum") + " " +
                        rs.getString("name") + " " +
                        rs.getString("colour")+ " " +
                        rs.getInt("price") + " "
                    );
                }

        }
        catch(SQLException e){
            e.printStackTrace();
        }


        //Costmer Inputs
        System.out.println("Witch Costmer is going to buy Phone \n");
        ctm.values()
        .forEach((i) -> System.out.println(i.id + " " + i.name));

        System.out.println("Enter Costmer ID");
        int cid = sc.nextInt();
        Costmer c = ctm.get(cid);


//         c1.buy(sp);
// 
//         try {
//             em1.sell(sp, c, inventery);
//         } catch (LowBalanceException e) {
//             // TODO Auto-generated catch block
//             System.out.println(e.getMessage());
// 
//             sc = new Scanner(System.in);
//             System.out.println("Are you want to go for EMI \n Yes \n No");
//             String choise = sc.nextLine();
//             switch (choise) {
//                 case "Yes":
//                     c1.cash = 0;
//                     System.out.println(em1.EMI(sp, inventery));
//                     break;
//                 
//                 case "No":
//                     System.out.println("Thank you for Visiting");
//                     break;
// 
//                 default:
//                     break;
//             }
//         }
// 
//         recordSells(sp, c);
//         
// 
//         System.out.println(inventery);


        // cm1.buy(sm2);
        // em1.sell(sm2, cm2);

        // cm1.buy(sm4);
        // em2.sell(sm4, cm1);



    }
// 
//     public static void recordSells(smartPhone sm, Costmer cs){
//         try {
//             BufferedWriter bf = new BufferedWriter(new FileWriter("src/Sales.txt", true));
//             bf.write(sm.ModelName + ", " + sm.Colour + ", " + sm.price + ", " + cs.id);
//             bf.newLine();
// 
//             bf.close();
//         } catch (IOException e) {
//             // TODO Auto-generated catch block
//             e.printStackTrace();
//         }
//     }
}
