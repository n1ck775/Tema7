package T7;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

public class Start {

    public static void main(String[] args) {
        PHONE[] technic = new PHONE[2];//массив техники

        PHONE samsung = new PHONE(7 , "Samsung Galaxy Note 10");
        PHONE apple = new APPLE(6 , "Apple Iphone Xs");

        technic[0] = samsung;
        technic[1] = apple;

        try {
            // Сброс данных объекта staff в файл (сериализация данных)
            ObjectOutputStream out = new ObjectOutputStream(new FileOutputStream("PHONE.dat"));
            out.writeObject(technic);
            out.close();

            // Чтение сериализованных данных из файла в объект (десериализация данных)
            ObjectInputStream in = new ObjectInputStream(new FileInputStream("PHONE.dat"));
            PHONE[] newType = (PHONE[]) in.readObject(); // Новый список
            in.close();
              
            // Вывод на экран массива объектов newStaff
            for (PHONE e : newType) {
                System.out.println(e);
            }

        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
